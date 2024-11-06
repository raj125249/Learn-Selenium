package week1.day1;

import org.common.ReadExcelData;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Approvalprocess {
    public static void main(String[] args) {
        // Set the path to your WebDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Define the String value
        String a = "3000"; // Set a as a String
        int value = Integer.parseInt(a);

        // Perform login as the existing user (example)
        String existingUser = "jamiep"; // Existing user
        String existingPassword = fetchDecryptedPassword(existingUser);
        login(driver, existingUser, existingPassword);

        // Check the approval conditions
        if (value == 3000) {
            triggerApproval(driver, "User Level 1", "juans", fetchDecryptedPassword("juans"));
        } 
        if (value > 3000 && value < 5001) {
            triggerApproval(driver, "User Level 2", "kimberly", fetchDecryptedPassword("kimberly"));
        } else {
            System.out.println("No approval needed for this value.");
        }

        // Close the browser
        driver.quit();
    }

    public static void login(WebDriver driver, String username, String password) {
        driver.get("http://your-login-url.com");
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("loginButton")).click();
    }

    public static void logout(WebDriver driver) {
        driver.findElement(By.id("logoutButton")).click(); // Adjust this ID based on your application's logout button
    }

    public static void triggerApproval(WebDriver driver, String userLevel, String approverUsername, String approverPassword) {
        System.out.println("Triggering approval for: " + userLevel);
        
        // Logout the existing user
        logout(driver);

        // Login as the approver
        login(driver, approverUsername, approverPassword);

        // Navigate to the approval page
        driver.get("http://your-approval-url.com");
        // Example approval action
        driver.findElement(By.id("approveButton")).click(); // Adjust this ID based on your application's approve button

        // Logout the approver
        logout(driver);

        // Login back as the original user
        String originalUsername = "jamiep"; // Existing user
        String originalPassword = fetchDecryptedPassword(originalUsername);
        login(driver, originalUsername, originalPassword);
    }

    public static String fetchDecryptedPassword(String username) {
        // Simulate fetching the decrypted password from the database
        switch (username) {
            case "jamiep":
                return "get_DB_Data(ReadExcelData.readExcel('Login', 6, 2), ReadExcelData.readExcel('Login', 6, 4)),Keys.TAB);"; // Replace with actual decrypted password
            case "juans":
                return "decryptedPasswordForJuan"; // Replace with actual decrypted password
            case "kimberly":
                return "decryptedPasswordForKimberly"; // Replace with actual decrypted password
            case "roberta":
                return "decryptedPasswordForRoberta"; // Replace with actual decrypted password
            case "anneliese":
                return "decryptedPasswordForAnneliese"; // Replace with actual decrypted password
            default:
                return "";
        }
    }
}
