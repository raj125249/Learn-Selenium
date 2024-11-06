package seleniumBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By; 				//existing chromedriver class to be imported from the mavendependices.
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchapplication {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();

			driver. manage(). window().maximize();
			
			driver.get("https://st-anoud.elmogroup.com/testelmocorp/");
// to find of links in the page
			List<WebElement> links = driver.findElements(By.tagName("a"));
			//driver.findElement(By.className()).sendKeys("mobiles", Keys.ENTER);
			
	// to find the count//size of links.
			int size = links.size();
		System.out.println("The link in the web login page "+size);
		
	// to find the particular link 
		WebElement element = links.get(3);			// get() method, Ctrl+2,l
		String url = element.getText();				// to get the text of url to display then get.text() method to be used.
		System.out.println(element);
		
	// to print all the URL's via for loop using index
//		for (int i = 0; i < links.size(); i++) {
//			String alllinks = links.get(i).getText();
//			System.out.println(alllinks);	}
		
		//To put all the data in a list then create a list first 
		List<String> alllinks = new ArrayList<>();
		System.out.println(alllinks);
		
		//  print via for each loop
	for (WebElement each : links) {
		String text = each.getText();
		alllinks.add(text);		// alllinks above in list syntax
			}	
	Collections.sort(alllinks);		// to sort in order
	System.out.println(alllinks);
	}	
}