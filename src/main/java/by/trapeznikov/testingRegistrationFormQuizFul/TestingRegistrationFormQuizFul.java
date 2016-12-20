package by.trapeznikov.testingRegistrationFormQuizFul;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestingRegistrationFormQuizFul {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = quizfulEnableWebDriver();
		quizfulRegForm(driver);
		System.out.println(testQuizfulEmptyRegFields(driver));
//		System.out.println(testquizfulRightRegFields(driver));
		System.out.println(testQuizfulNonsenseRegFields(driver));
		System.out.println(testQuizfulLoginRussianSymbRegFields(driver));
		System.out.println(testQuizfulLoginSixteenSymbRegFields(driver));
		System.out.println(testQuizfulLoginPunctSymbRegFields(driver));
		System.out.println(testQuizfulLoginTwoSymbRegFields(driver));
		System.out.println(testCorporateTrueRegFields(driver));

	}
	
	private static WebDriver quizfulEnableWebDriver(){
		System.setProperty("webdriver.gecko.driver","c:\\Selenium\\drivers\\geckodriver.exe");
  		WebDriver driver = new FirefoxDriver();
  		driver.get("http://www.quizful.net");
  		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  		return driver;
	}

	private static void quizfulRegForm(WebDriver driver) {
		
		WebElement webElement = null;
		webElement = driver.findElement(By.xpath(".//*[@id='user-panel']/li[3]/a"));
		webElement.click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	
	private static boolean testQuizfulEmptyRegFields(WebDriver driver) throws InterruptedException {
			
		boolean isPresent;
						
		
		WebElement webElement = null;
		
		webElement = driver.findElement(By.id("login"));
		webElement.clear();
		
		webElement = driver.findElement(By.name("registrationForm.password"));
		webElement.clear();
		
		webElement = driver.findElement(By.name("registrationForm.repassword"));
		webElement.clear();
		
		webElement = driver.findElement(By.name("registrationForm.email"));
		webElement.clear();
								
		Thread.sleep(10000);
		
		webElement = driver.findElement(By.name("ok"));
		webElement.click();
		
		
		return isPresent = driver.findElements(By.cssSelector("#message div.content")).size()==0;
		
		
   }
	
	private static boolean testCorporateTrueRegFields(WebDriver driver) throws InterruptedException {
		
		boolean isPresent;
						
		
		WebElement webElement = null;
		
		webElement = driver.findElement(By.id("login"));
		webElement.clear();
		
		webElement = driver.findElement(By.name("registrationForm.password"));
		webElement.clear();
		
		webElement = driver.findElement(By.name("registrationForm.repassword"));
		webElement.clear();
		
		webElement = driver.findElement(By.name("registrationForm.email"));
		webElement.clear();
		
		webElement = driver.findElement(By.id("corporate"));
		webElement.click();
					
		Thread.sleep(10000);
		
		webElement = driver.findElement(By.name("ok"));
		webElement.click();
		
		
		return isPresent = driver.findElements(By.cssSelector("#message div.content")).size()==0;
		
		
   }
		
	private static boolean testquizfulRightRegFields(WebDriver driver) throws InterruptedException {
	   								
		WebElement webElement = null;
		
		webElement = driver.findElement(By.id("login"));
		webElement.sendKeys("Trapez");
		
		webElement = driver.findElement(By.name("registrationForm.password"));
		webElement.sendKeys("Trapeznikov");
		
		webElement = driver.findElement(By.name("registrationForm.repassword"));
		webElement.sendKeys("Trapeznikov");
		
		webElement = driver.findElement(By.name("registrationForm.email"));
		webElement.sendKeys("gogol2007@mail.ru");
		
		webElement = driver.findElement(By.id("corporate"));
		webElement.click();
		
		Thread.sleep(10000);
//		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		webElement = driver.findElement(By.name("ok"));
		webElement.click();
		
		Thread.sleep(2000);
		
		boolean isPresent;
		
		isPresent = driver.findElements(By.cssSelector("#message div.content")).size()>0;
		
		return isPresent;
		
   }
	
	private static boolean testQuizfulNonsenseRegFields(WebDriver driver) throws InterruptedException {
		
		boolean isPresent;
						
		
		WebElement webElement = null;
		
		webElement = driver.findElement(By.id("login"));
		webElement.sendKeys("vsdfsdfsdf");
		
		webElement = driver.findElement(By.name("registrationForm.password"));
		webElement.sendKeys("vsdfsdfsdf");
		
		webElement = driver.findElement(By.name("registrationForm.repassword"));
		webElement.sendKeys("vsdfsdfsdf");
		
		webElement = driver.findElement(By.name("registrationForm.email"));
		webElement.sendKeys("vsdfsdfsdf");
		
		webElement = driver.findElement(By.id("corporate"));
		webElement.click();
					
		Thread.sleep(10000);
		
		webElement = driver.findElement(By.name("ok"));
		webElement.click();
		
		
		return isPresent = driver.findElements(By.cssSelector("#message div.content")).size()==0;
		
		
   }

	private static boolean testQuizfulLoginTwoSymbRegFields(WebDriver driver) throws InterruptedException {
		
		boolean isPresent;
						
		
		WebElement webElement = null;
		
		webElement = driver.findElement(By.id("login"));
		webElement.sendKeys("11");
		
		webElement = driver.findElement(By.name("registrationForm.password"));
		webElement.sendKeys("vsdfsdfsdf");
		
		webElement = driver.findElement(By.name("registrationForm.repassword"));
		webElement.sendKeys("vsdfsdfsdf");
		
		webElement = driver.findElement(By.name("registrationForm.email"));
		webElement.sendKeys("vsdfsdfsdf");
		
		webElement = driver.findElement(By.id("corporate"));
		webElement.click();
					
		Thread.sleep(10000);
		
		webElement = driver.findElement(By.name("ok"));
		webElement.click();
		
		
		return isPresent = driver.findElements(By.cssSelector("#message div.content")).size()==0;
		
		
   }
	
	private static boolean testQuizfulLoginSixteenSymbRegFields(WebDriver driver) throws InterruptedException {
		
		boolean isPresent;
						
		
		WebElement webElement = null;
		
		webElement = driver.findElement(By.id("login"));
		webElement.sendKeys("1234567890123456");
		
		webElement = driver.findElement(By.name("registrationForm.password"));
		webElement.sendKeys("vsdfsdfsdf");
		
		webElement = driver.findElement(By.name("registrationForm.repassword"));
		webElement.sendKeys("vsdfsdfsdf");
		
		webElement = driver.findElement(By.name("registrationForm.email"));
		webElement.sendKeys("vsdfsdfsdf");
		
		webElement = driver.findElement(By.id("corporate"));
		webElement.click();
					
		Thread.sleep(10000);
		
		webElement = driver.findElement(By.name("ok"));
		webElement.click();
		
		
		return isPresent = driver.findElements(By.cssSelector("#message div.content")).size()==0;
		
		
   }

	private static boolean testQuizfulLoginPunctSymbRegFields(WebDriver driver) throws InterruptedException {
	
	boolean isPresent;
					
	
	WebElement webElement = null;
	
	webElement = driver.findElement(By.id("login"));
	webElement.sendKeys("@:+-=");
	
	webElement = driver.findElement(By.name("registrationForm.password"));
	webElement.sendKeys("vsdfsdfsdf");
	
	webElement = driver.findElement(By.name("registrationForm.repassword"));
	webElement.sendKeys("vsdfsdfsdf");
	
	webElement = driver.findElement(By.name("registrationForm.email"));
	webElement.sendKeys("vsdfsdfsdf");
	
	webElement = driver.findElement(By.id("corporate"));
	webElement.click();
				
	Thread.sleep(10000);
	
	webElement = driver.findElement(By.name("ok"));
	webElement.click();
	
	
	return isPresent = driver.findElements(By.cssSelector("#message div.content")).size()==0;
	
	
}

	private static boolean testQuizfulLoginRussianSymbRegFields(WebDriver driver) throws InterruptedException {
	
	boolean isPresent;
					
	
	WebElement webElement = null;
	
	webElement = driver.findElement(By.id("login"));
	webElement.sendKeys("Сергей");
	
	webElement = driver.findElement(By.name("registrationForm.password"));
	webElement.sendKeys("vsdfsdfsdf");
	
	webElement = driver.findElement(By.name("registrationForm.repassword"));
	webElement.sendKeys("vsdfsdfsdf");
	
	webElement = driver.findElement(By.name("registrationForm.email"));
	webElement.sendKeys("vsdfsdfsdf");
	
	webElement = driver.findElement(By.id("corporate"));
	webElement.click();
				
	Thread.sleep(10000);
	
	webElement = driver.findElement(By.name("ok"));
	webElement.click();
	
	
	return isPresent = driver.findElements(By.cssSelector("#message div.content")).size()==0;
	
	
}


}
