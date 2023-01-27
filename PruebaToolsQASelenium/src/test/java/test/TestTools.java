package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTools {
	//VARIABLES
	private WebDriver driver;
	private static final String TIPO_DRIVER = "webdriver.chrome.driver";
	private static final String PATH_DRIVER = "./src/test/resources/webDriver/chromedriver.exe";
	private String URL = "https://demoqa.com/webtables";
	
	@BeforeClass 
	public static void setUpBeforeClass()
	{
		System.out.println("INICIO DE TEST");
		System.setProperty(TIPO_DRIVER, PATH_DRIVER);
	}
	
	@Before 
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get(URL);
	}
	
	@Test
	public void testSourch01()
	{
	
		WebElement txtSourch = driver.findElement(By.xpath("//button[@type='Add']")).click();
		
		//ESPERO UN MOMENTO QUE RESPONDA
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@Test
	public void testSourch02()
	{

		WebElement txtSourch = driver.findElement(By.className("Edit"));
		
		//ESPERO UN MOMENTO QUE RESPONDA
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//VALIDAR SI SE EDITA
		
	}
	
	@Test
	public void testSourch03()
	{

		WebElement txtSourch = driver.findElement(By.className("Delete"));
		
		//ESPERO UN MOMENTO QUE RESPONDA
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//VALIDAR SI SE ELIMINA
		
	}
		
	@After 
	public void tearDown()
	{
		driver.quit();
	}
	
	@AfterClass
	public static void teardDownAfterClass()
	{
		System.out.println("FINALIZA LOS TEST");
	}
	
}
