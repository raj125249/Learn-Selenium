package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginHandler {

	public void loginToApplication(WebDriver driver, String wfTrigger) {
        String username;
        String password;

        // Determine credentials based on the workflow trigger
        switch (wfTrigger) {
            case "WF_TYPE_1": // Replace with actual trigger conditions
                username = "user1";
                password = "pass1";
                break;
            case "WF_TYPE_2":
                username = "user2";
                password = "pass2";
                break;
            default:
                username = "defaultUser";
                password = "defaultPass";
                break;
        }

        // Perform login action
        driver.get("URL_OF_THE_LOGIN_PAGE"); // Replace with your login URL
        driver.findElement(By.id("usernameField")).sendKeys(username); // Replace with actual ID
        driver.findElement(By.id("passwordField")).sendKeys(password); // Replace with actual ID
        driver.findElement(By.id("loginButton")).click(); // Replace with actual ID
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
