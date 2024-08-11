package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.Thread;
import org.openqa.selenium.WebDriver;

public class firsttestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		String actualTitle=driver.getTitle();
		String expectedTitle="Just a moment...";
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Test Passes");
		}else {
			System.out.println("Test Failed"  + " actual title is this "+actualTitle);
		}
		
		driver.close();

	}

}
