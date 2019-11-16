package learnJava2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGChrome {
	
	public static void main(String[] args) {
		WebDriver dr=new ChromeDriver();
		dr.get("http://google.com");
		
	}
	

}
