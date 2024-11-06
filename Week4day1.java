package week4day1;

//import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//Target locators     snapshot.
public class Week4day1 {
// Target locators are the elements or any context which can nor be handled like webelements.(Special areas)
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://st-anoud.elmogroup.com/testelmocorp/locale.do?request_locale=en&lang=en&dataSource=001&usertype=Employee&loginModule=002&appModule=02");// leaf groudns to validate the alert 
		
		driver.get("https://www.leafground.com");
		driver.findElement(By.xpath("//ul[@class='layout-menu']/li[2]")).click();
		driver.findElement(By.xpath("//span[text()='window']/..")).click();
		String current = driver.getWindowHandle();
		System.out.println(current);
		
		
//Alert
//		Alert alert = driver.switchTo().alert();// alert is an interface- have an implementation class-> remote alert is the implemantation class of alert interface
//	String text = alert.getText(); // displys the text your naem and click ok
//	//System.out.println(text);
//	alert.sendKeys("puneeth"); // could not able to view the text enter on only the alert.accept only it would display the text:
//	alert.accept();
//	
/* note: 
 * if we wnak to enter or get the text that should be done before to the accept or dismiss the alert.
 * exceptions we will get in an alert.
 * 1st exception : unhandled alert exception.( unhandled alert means ignoring the alert)
 * 2nd exception : no alert present exception.(taking precautions for the unwanted alert)
 */


//Frames
	//driver.switchTo().frame(0);
//click me button
//	driver.findElement(By.id("click")).click(); // when u try to access an element inside framewithout switching the case then we will get no such exceoption element is found.
	
	
	//driver.findElement(by.id)	
	
	
// Windows:
	
		
		
		
		
		
		
//		import org.openqa.selenium.By;
//		import org.openqa.selenium.WebDriver;
//		import org.openqa.selenium.WebElement;
//		import org.openqa.selenium.chrome.ChromeDriver;
//		import java.time.LocalDate;
//		import java.time.format.DateTimeFormatter;
//		import java.time.format.DateTimeParseException;
//
//		public class DateManipulationExample {
//		    public static void main(String[] args) {
//		        // Set up WebDriver (Ensure chromedriver is in your PATH or specify the path here)
//		        WebDriver driver = new ChromeDriver();
//
//		        try {
//		            // Navigate to the webpage
//		            driver.get("https://yourwebsite.com");
//
//		            // Locate the date field and get the value (assume it's in yyyy-MM-dd format)
//		            WebElement xDateField = driver.findElement(By.id("xDateFieldId"));
//		            String xDateString = xDateField.getAttribute("value");
//
//		            // Define the date format (assuming yyyy-MM-dd format for example)
//		            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//
//		            // Parse the date
//		            LocalDate xDate;
//		            try {
//		                xDate = LocalDate.parse(xDateString, formatter);
//		            } catch (DateTimeParseException e) {
//		                e.printStackTrace();
//		                return;
//		            }
//
//		            // Calculate the next date
//		            LocalDate nextDate = xDate.plusDays(1);
//
//		            // Format the next date
//		            String nextDateString = nextDate.format(formatter);
//
//		            // Locate the target date field and set the next date
//		            WebElement yDateField = driver.findElement(By.id("yDateFieldId"));
//		            yDateField.clear(); // Clear existing value if needed
//		            yDateField.sendKeys(nextDateString);
//
//		        } finally {
//		            // Close the browser
//		            driver.quit();
//		        }
//		    }
//		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}