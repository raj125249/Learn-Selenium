package week4day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WF {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		WebDriver driver = new ChromeDriver();

		try {
			driver.get("your_application_url");

			// Step 1: User1 submits an estimate of 1000rs
			submitEstimate(driver, "user1", "password1", 1000);
			confirmEstimate(driver, "supervisor1", "password_supervisor1");

			// Step 2: User1 submits an estimate of 3500rs
			submitEstimate(driver, "user1", "password1", 3500);
			confirmEstimate(driver, "supervisor2", "password_supervisor2");

		} finally {
			driver.quit(); // Close the browser
		}
	}

	public static void submitEstimate(WebDriver driver, String username, String password, int amount) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Log in as user
		login(driver, username, password);

		// Locate and fill the estimate input field
		WebElement estimateInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("estimateInput"))); // Adjust
																												// locator
		estimateInput.clear();
		estimateInput.sendKeys(String.valueOf(amount));

		// Submit the estimate (Assuming there is a submit button)
		WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("submitButton"))); // Adjust
																												// locator
		submitButton.click();

		// Log out after submitting
		logout(driver);
	}

	public static void confirmEstimate(WebDriver driver, String supervisor, String supervisorPassword) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Log in as supervisor
		login(driver, supervisor, supervisorPassword);

		// Navigate to the supervisor confirmation page (adjust as necessary)
		driver.get("your_supervisor_confirmation_url"); // Adjust URL

		// Confirm the estimate (Assuming there is a confirm button)
		WebElement confirmButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("confirmButton"))); // Adjust
																												// locator
		confirmButton.click();

		// Optionally, you can verify confirmation
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmationMessage"))); // Adjust locator
		System.out.println("Estimate confirmed by " + supervisor);

		// Log out after confirmation
		logout(driver);
	}

	public static void login(WebDriver driver, String username, String password) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Locate and fill the username and password fields
		WebElement usernameInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))); // Adjust
																											// locator
		usernameInput.clear();
		usernameInput.sendKeys(username);

		WebElement passwordInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("password"))); // Adjust
																											// locator
		passwordInput.clear();
		passwordInput.sendKeys(password);

		// Click the login button
		WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("loginButton"))); // Adjust
																											// locator
		loginButton.click();
	}

	public static void logout(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Locate and click the logout button (adjust locator)
		WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutButton"))); // Adjust
																												// locator
		logoutButton.click();

		// end
	}
}