package week1.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Datatypes {
//
//	public static void main(String[] args) {
//		
//		byte name= 124 ;         //-127 to 128
//		short name1=19999;     //-32673 to +32674
//		int a= 25;       		// up to 9number positive
//		long in= 9768784373l;   // more than 9 numeric characters and should end up with the l or L
//		
//		float fly= 958.21325643654634564563356f;		//small decimal value and end with f
//		double variable = 234.69876876876897;			//long decimal value
//
//		char r='%';           //single character of any type characters
//		
//		boolean isNew= true;       // true or false.
//		
//		String value= "he is raj";		// String S should be caps// value should be entered in b/t "__" 
//		
//// operation +, -, *, /, 
//		
//		int u=76;
//		int b=654;
//		int v=2;
//		
//		System.out.println(a+b-u/a);
//		
//		System.out.println(124);
//		System.out.println(a);
//		System.out.println(name1);
//		System.out.println("he is raj");
//		System.out.println(in);
//		System.out.println(253146789);
//		System.out.println(r);
//		//System.out.println();
//		//System.out.println();
//	}
	
	

	
	    
	    public static void main(String[] args) {
	        // Set the path for your WebDriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver();

	        try {
	            // Navigate to the page containing the text
	            driver.get("URL_OF_YOUR_PAGE"); // Replace with the actual URL

	            // Locate the element containing the text
	            WebElement element = driver.findElement(By.xpath("XPATH_OF_ELEMENT")); // Replace with the actual XPath

	            // Get the text from the element
	            String text = element.getText();

	            // Call the method to extract the workflow reference number
	            String workflowReference = extractWorkflowReference(text);
	            System.out.println("Workflow Reference Number: " + workflowReference); // Output printed in console
	            
	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	    }

	    // Define the extractWorkflowReference method
	    private static String extractWorkflowReference(String text) {
	        // Regex to find the Workflow Reference No followed by a number
	        String regex = "Workflow Reference No (\\d+)";
	        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex);
	        java.util.regex.Matcher matcher = pattern.matcher(text);
	        
	        if (matcher.find()) {
	            return matcher.group(1); // Return the first capturing group (the number)
	        }
	        return "Not found";
	    }
	}
