package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkflowReferenceExtractor {

	public void captureWorkflowReferences(WebDriver driver) {
        // Locate the element containing the text (update the XPath as needed)
        WebElement element = driver.findElement(By.xpath("XPATH_OF_THE_ELEMENT")); // Replace with actual XPath

        // Get the text from the element
        String text = element.getText();

        // Use regex to extract all users and reference numbers
        Pattern pattern = Pattern.compile("sent to ([\\w\\s]+) for the amount.*?Workflow Reference No (\\d+)", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(text);

        int referenceCount = 1; // Initialize reference number counter
        boolean found = false; // Flag to check if any matches are found

        while (matcher.find()) {
            found = true;
            String user = matcher.group(1).trim();
            String referenceNumber = matcher.group(2);
            
            // Print the output to the console with reference number
            System.out.println("Reference No " + referenceCount + ":");
            System.out.println("User: " + user);
            System.out.println("Workflow Reference No: " + referenceNumber);
            System.out.println(); // Add a blank line for readability
            referenceCount++; // Increment the reference number counter
        }

        if (!found) {
            System.out.println("No user or reference number found.");
        }
    }
	
}
