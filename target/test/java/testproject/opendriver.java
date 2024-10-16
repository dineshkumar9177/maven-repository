package testproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager; 


public class opendriver {

	private static final boolean ture = false;
	public WebDriver driver;

	@BeforeTest
	public void statmethod()
	{
		WebDriverManager.chromedriver().setup();
		driver=(WebDriver) new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");

	}

	//login in to sauce demo 	
	@Test(priority=1,enabled=true,description="login in to sauce demo") 	
	public void loginSauceDemo() 	
	{ 		
		driver.findElement(By.id("user-name")).sendKeys("standard_user"); 		
		driver.findElement(By.id("password")).sendKeys("secret_sauce"); 		
		driver.findElement(By.id("login-button")).click(); 
	} 
	@Test(priority=2,enabled=true,description="select nmae")
	public void slectname() throws InterruptedException
	{
		Thread.sleep(3000);
		Select dropdown = new Select(driver.findElement(By.className("product_sort_container")));
		dropdown.selectByVisibleText("Price (low to high)");
		
		Thread.sleep(3000);
	}
	

	@Test(priority=3,enabled=true,description="select product")
	public void selectproduct() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("item_3_img_link")).click();
		Thread.sleep(3000);
	}

	@Test(priority=4,enabled=true,description="add cart")
	public void addcart() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		Thread.sleep(3000);
	}

	@Test(priority=5,enabled=true,description="click cart")
	public void cart() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(3000);

		Thread.sleep(3000);
		driver.findElement(By.id("continue-shopping")).click();
		Thread.sleep(3000);

		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		Thread.sleep(3000);

		Thread.sleep(3000);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(3000);

		Thread.sleep(3000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(3000);
	}

	@Test(priority=6,enabled=true,description="add details")
	public void details() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement fristname=driver.findElement(By.id("first-name"));
		fristname.sendKeys("sai");
		fristname.click();
		WebElement lastname=driver.findElement(By.id("last-name"));
		lastname.sendKeys("kumar");
		lastname.click();
		WebElement postal=driver.findElement(By.id("postal-code"));
		postal.sendKeys("530001");
		postal.click();
		Thread.sleep(3000);
	}
	@Test(priority=7,enabled=true,description="finish")
	public void finish() throws InterruptedException {
		Thread.sleep(3000);
		WebElement contiune=driver.findElement(By.id("continue"));
		contiune.click();
		Thread.sleep(3000);

		Thread.sleep(3000);
		WebElement finish=driver.findElement(By.id("finish"));
		finish.click();
		Thread.sleep(3000);
	}
	@Test(priority=8,enabled=true,description="back to home")
	public void home() throws InterruptedException {
		Thread.sleep(3000);
		WebElement backhome=driver.findElement(By.id("back-to-products"));
		backhome.click();
		Thread.sleep(3000);
	}
	
	@Test(priority=9,enabled=true,description="menu")
	public void menu() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement menu=driver.findElement(By.id("react-burger-menu-btn"));
		menu.click();
		Thread.sleep(3000);
	}

	@Test(priority=10,enabled=true,description="logout")
	public void logout() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement logout=driver.findElement(By.id("logout_sidebar_link"));
		logout.click();
		Thread.sleep(3000);
	}
	
	@AfterTest	public void teardown()
	{ 		
		driver.quit(); 
	}  	 	 	




}










