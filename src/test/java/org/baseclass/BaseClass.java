package org.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {                            //local variable--->access only in method level
										         	//instance variable ---> access with in class
	
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver) {
		BaseClass.driver = driver;
	}
	public static WebDriver driver;                             
	public static void browserLaunch(String url) {     
		
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
		
	}        //step1 locator
	public static WebElement findElementId(String id) {         
		                                                     
		WebElement element = driver.findElement(By.id(id)); 
		return element;                                    //return--> return type void---->webelement
	}       //step1 variable
	public void sendValues(WebElement element,String abcd ) {
	element.sendKeys(abcd);
	}
	
	public WebElement findElementName(String name) {
		WebElement element1 = driver.findElement(By.name(name));
		return element1;
	}
	public void sendValues1(WebElement element1,String abc) {
		element1.sendKeys(abc);
		
	}
	
	public WebElement findElementId1(String username) {
		WebElement element2 = driver.findElement(By.xpath(username));
		return element2;
    }
	public void sendValues2(WebElement element2) {
		element2.click();
		
	}
	
	public WebElement firstName1(String name) {
		WebElement element3 = driver.findElement(By.name(name));
		return element3;
     }
	public void insertName(WebElement element3,String name) {
		element3.sendKeys(name);
	}

	
	public WebElement surName(String name) {
		WebElement element4 = driver.findElement(By.name(name));
		return element4;
     }
	public void insertName1(WebElement element4,String name) {
		element4.sendKeys(name);
     }
	
   
	public WebElement contactNumber(String number) {
		WebElement element6 = driver.findElement(By.name(number));
		return element6;
     }
	public void enterNumber(WebElement element6,String number) {
		element6.sendKeys(number);
		
	}
	public WebElement newPass(String pass) {
		WebElement element7 = driver.findElement(By.id(pass));
		return element7;
    }
    public void enterPass(WebElement element7,String passs) {
		element7.sendKeys(passs);
    } 	
    
    
    
    public WebElement findElementId5(String id) {
		WebElement location = driver.findElement(By.id(id));
        return location;
        
        
        
	}
    public void selectMethod(WebElement location,String SL) {
    	Select select = new Select(location);
    	//select.selectByVisibleText(SL);
    	select.selectByValue(SL);
    	
     }	
		

}
