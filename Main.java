package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	 public static void main(String[] args) {
	        // Set up WebDriver (ensure the path to your WebDriver executable is correct)
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        WebDriver driver = new ChromeDriver();

	        try {
	            LoginHandler loginHandler = new LoginHandler();
	            WorkflowReferenceExtractor referenceExtractor = new WorkflowReferenceExtractor();

	            // Example workflow trigger
	            String wfTrigger = "WF_TYPE_1"; // or "WF_TYPE_2" based on your scenario
	            
	            // Perform login
	            loginHandler.loginToApplication(driver, wfTrigger);
	            
	            // Capture workflow references
	            referenceExtractor.captureWorkflowReferences(driver);
	            
	        } finally {
	            driver.quit();
	        }
	    }
	
}
