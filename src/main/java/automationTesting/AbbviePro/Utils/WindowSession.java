package automationTesting.AbbviePro.Utils;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowSession implements AutoCloseable {
	private WebDriver driver;
	private String parentHandle;
	private boolean closeNewWindow;

	public WindowSession(WebDriver driver, boolean closeNewWindow) {
		this.driver = driver;
		this.parentHandle = driver.getWindowHandle();
		this.closeNewWindow = closeNewWindow;
	}

	public WindowSession switchToNewWindow() {
		Set<String> handles = driver.getWindowHandles();

		// Wait for the new window to appear
		int attempts = 0;
		while (handles.size() <= 1 && attempts < 10) {
			try {
				Thread.sleep(500);
				handles = driver.getWindowHandles();
				attempts++;
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				break;
			}
		}

		for (String handle : handles) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				break;
			}
		}
		return this;
	}

	@Override
	public void close() {
		try {
			if (closeNewWindow && !driver.getWindowHandle().equals(parentHandle)) {
				driver.close();
			}
		} catch (Exception e) {
			System.err.println("Error while closing window: " + e.getMessage());
		} finally {
			// Always try to switch back to parent window
			try {
				driver.switchTo().window(parentHandle);
			} catch (Exception e) {
				System.err.println("Error while switching to parent window: " + e.getMessage());
			}
		}
	}
}