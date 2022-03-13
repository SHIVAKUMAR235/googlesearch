package main;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1432 
{

	public static void main(String[] args) throws Exception
	{
		RemoteWebDriver driver;
	 WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//launch site
	 driver.get("https://login.yahoo.com/account/create?lang=en-US&src=ym&done=https%3A%2F%2Fmail.yahoo.com%2F%3Fguce_referrer%3DaHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8%26guce_referrer_sig%3DAQAAAAUI_Uf8Y5VdJQMfoSGtAo60mqfqsdyUXPxriYV29Lclgp6x6ZVVqYrHX5xX17T-uISEw8oJOlBJR-pKd6aLL9HlIw3vI7jniPmAqUvrLKsNtagCvAuly9V1Uvggcvh6csnbT3uEkEwMcEys8BeafiVHUY3-kMyG_cfjlzQRFJfb&specId=yidReg");
     Thread.sleep(5000);
     driver.findElement(By.name("firstName")).sendKeys("Shiva");
     
  
	}

}
