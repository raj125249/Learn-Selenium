package week1.day1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExtractMultipleInfo {
    public static void main(String[] args) {
        // Set up WebDriver (ensure the path to your WebDriver executable is correct)
        
        try {
            // Navigate to the page containing the text
            //driver.get("URL_OF_THE_PAGE"); // Replace with the actual URL

            // Locate the element containing the text (update the XPath as needed)
            WebElement element = driver.findElement(By.xpath("XPATH_OF_THE_ELEMENT")); // Replace with the actual XPath

            // Get the text from the element
            String text = element.getText();
            
            String ref = 20;
            
            int ref1 = Integer.parseInt(ref);

            // Use regex to extract all users and reference numbers
            Pattern pattern = Pattern.compile("sent to ([\\w\\s]+) for the amount.*Workflow Reference No (\\d+)");
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                String user = matcher.group(1).trim();
                String referenceNumber = matcher.group(2);
                
                // Print the output to the console
                System.out.println("User: " + user);
                System.out.println("Reference No: " + referenceNumber);
            }
        } finally {
            // Close the browser
            driver.quit();
            
            
            
          
        }
    }
}
