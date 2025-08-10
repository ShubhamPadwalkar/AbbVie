package automationTesting.AbbviePro.Utils;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportUtil {
    private static ExtentReports extent;
    private static ExtentSparkReporter sparkReporter;
    private static ThreadLocal<ExtentTest> testThread = new ThreadLocal<>();
    private static Map<String, Long> startTimes = new HashMap<>();

    public static void initReport() {
        String displayReportName = "Report " + new SimpleDateFormat("dd MMMM hh.mm a", Locale.ENGLISH).format(new Date());
        String fileReportName = "Report_" + new SimpleDateFormat("dd_MMMM_hh.mm_a", Locale.ENGLISH).format(new Date());
        String reportPath = "reports/" + fileReportName + ".html";

        new File("reports").mkdirs();

        sparkReporter = new ExtentSparkReporter(reportPath);
        sparkReporter.config().setTheme(Theme.STANDARD);
        sparkReporter.config().setDocumentTitle(displayReportName);
        sparkReporter.config().setReportName(displayReportName);
        sparkReporter.config().setTimeStampFormat("MMM dd, yyyy HH:mm:ss");

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        extent.setSystemInfo("OS", System.getProperty("os.name"));
        extent.setSystemInfo("OS Version", System.getProperty("os.version"));
        extent.setSystemInfo("OS Architecture", System.getProperty("os.arch"));
        extent.setSystemInfo("Java Version", System.getProperty("java.version"));
        extent.setSystemInfo("User", System.getProperty("user.name"));
        extent.setSystemInfo("Test Run Date", new SimpleDateFormat("dd MMM yyyy HH:mm:ss").format(new Date()));
        extent.setSystemInfo("Environment", getEnvironmentName());
        extent.setSystemInfo("Application Version", getAppVersion());
        extent.setSystemInfo("Browser", getBrowserInfo());

        System.out.println("Report created: " + reportPath);
        System.out.println("Report display name: " + displayReportName);
    }

    private static String getEnvironmentName() {
        return System.getProperty("env", "QA");
    }

    private static String getAppVersion() {
        return "1.0.0";
    }

    private static String getBrowserInfo() {
        return "Chrome";
    }

    public static void createTest(String testName) {
        testThread.set(extent.createTest(testName));
    }

    public static void createTest(String testName, String description) {
        testThread.set(extent.createTest(testName, description));
    }

    public static void assignCategory(String category) {
        ExtentTest test = testThread.get();
        if (test != null) {
            test.assignCategory(category);
        }
    }

    public static void assignAuthor(String author) {
        ExtentTest test = testThread.get();
        if (test != null) {
            test.assignAuthor(author);
        }
    }

    public static void logInfo(String message) {
        ExtentTest test = testThread.get();
        if (test != null) {
            test.info(message);
        }
    }

    public static void logPass(String message) {
        ExtentTest test = testThread.get();
        if (test != null) {
            test.pass(message);
        }
    }

    public static void logFail(String message) {
        ExtentTest test = testThread.get();
        if (test != null) {
            test.fail(message);
        }
    }

    public static void logWarning(String message) {
        ExtentTest test = testThread.get();
        if (test != null) {
            test.warning(message);
        }
    }

    public static void logSkip(String message) {
        ExtentTest test = testThread.get();
        if (test != null) {
            test.skip(message);
        }
    }

    public static void logStep(String stepDescription) {
        ExtentTest test = testThread.get();
        if (test != null) {
            test.info(MarkupHelper.createLabel("STEP: " + stepDescription, ExtentColor.INDIGO));
        }
    }

    public static void logTestStart(String description) {
        ExtentTest test = testThread.get();
        if (test != null) {
            test.info(MarkupHelper.createLabel("TEST STARTED: " + description, ExtentColor.BLUE));
        }
    }

    public static void logTestEnd(String result) {
        ExtentTest test = testThread.get();
        if (test != null) {
            test.info(MarkupHelper.createLabel("TEST COMPLETED: " + result, ExtentColor.GREEN));
        }
    }

    public static void attachScreenshot(String screenshotPath) {
        ExtentTest test = testThread.get();
        try {
            if (test != null && screenshotPath != null) {
                File screenshot = new File(screenshotPath);
                if (screenshot.exists()) {
                    test.addScreenCaptureFromPath(screenshot.getAbsolutePath());
                } else {
                    test.warning("Screenshot not found: " + screenshotPath);
                }
            }
        } catch (Exception e) {
            test.warning("Failed to attach screenshot: " + e.getMessage());
        }
    }

    public static void attachAnnotatedScreenshot(String screenshotPath, String annotation) {
        ExtentTest test = testThread.get();
        try {
            if (test != null && screenshotPath != null) {
                File screenshot = new File(screenshotPath);
                if (screenshot.exists()) {
                    test.info(annotation);
                    test.addScreenCaptureFromPath(screenshot.getAbsolutePath());
                } else {
                    test.warning("Screenshot not found: " + screenshotPath);
                }
            }
        } catch (Exception e) {
            test.warning("Failed to attach screenshot: " + e.getMessage());
        }
    }

    public static void logException(Throwable e) {
        ExtentTest test = testThread.get();
        if (test != null) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            String stackTrace = sw.toString();

            test.fail("Exception occurred: " + e.getMessage());
            test.fail(MarkupHelper.createCodeBlock(stackTrace));
        }
    }

    public static void logTable(String[][] data) {
        ExtentTest test = testThread.get();
        if (test != null) {
            test.info(MarkupHelper.createTable(data));
        }
    }

    public static void logJson(String json) {
        ExtentTest test = testThread.get();
        if (test != null) {
            test.info(MarkupHelper.createCodeBlock(json, CodeLanguage.JSON));
        }
    }

    public static void startTimer(String operationName) {
        startTimes.put(operationName, System.currentTimeMillis());
        logInfo("Started timing: " + operationName);
    }

    public static void endTimer(String operationName) {
        if (startTimes.containsKey(operationName)) {
            long startTime = startTimes.get(operationName);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;

            logInfo("Operation: " + operationName + " completed in " + duration + " ms");
            if (duration > 5000) {
                logWarning("Performance concern: Operation took more than 5 seconds");
            }
        }
    }

    public static void flushReport() {
        if (extent != null) {
            extent.flush();
        }
    }
}
