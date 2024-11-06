package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

//public static void main(String[] args) {
//
//	System.out.println("hello world");
//
//	int a=10;
//	long value=1000;
//	double value1=10.3423534534534534;
//	String name="project";
//
//	System.out.println(a);
//	System.out.println("1000");
//	System.out.println("projects");
//	System.out.println("the string "+name+" is: "+value1+" and " +a);
//	
//	
//	int si = a;
//	
//	if (si <5000) {
//		System.out.println("verification pass");
//	}
	
//public class SettlementWorkflow {

	    private WebDriver driver;

	    public void SettlementWorkflow() {
	        // Set the path for your WebDriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        this.driver = new ChromeDriver();
	    }

	    public void openPage(String url) {
	        driver.get(url);
	    }

	    public String getSettlementText(String xpath) {
	        WebElement element = driver.findElement(By.xpath(xpath));
	        return element.getText();
	    }

	    public String extractWorkflowReference(String text) {
	        String regex = "Workflow Reference No (\\d+)";
	        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex);
	        java.util.regex.Matcher matcher = pattern.matcher(text);
	        
	        if (matcher.find()) {
	            return matcher.group(1); // Return the number
	        }
	        return "Not found";
	    }

	    public void printWorkflowReference(String text) {
	        String workflowReference = extractWorkflowReference(text);
	        System.out.println("Workflow Reference Number: " + workflowReference);
	    }

	    public void closeBrowser() {
	        driver.quit();
	    }

	    public static void main(String[] args) {
	        SettlementWorkflow workflow = new SettlementWorkflow();
	        
	        try {
	            // Replace with the actual URL and XPath
	            workflow.openPage("URL_OF_YOUR_PAGE");
	            String text = workflow.getSettlementText("XPATH_OF_ELEMENT");
	            workflow.printWorkflowReference(text);
	        } finally {
	            workflow.closeBrowser();
	        }
	    }
}