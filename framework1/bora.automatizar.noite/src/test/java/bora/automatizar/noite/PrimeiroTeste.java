package bora.automatizar.noite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiroTeste {
	
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
	driver = new ChromeDriver();
	
	driver.get("http://sampleapp.tricentis.com/");
	
	// maximizar o navegador
	driver.manage().window().maximize();

		
		
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEnviarCotacaoTruck() {
		
		driver.findElement(By.id("nav_truck")).click();
		
		driver.findElement(By.id("make")).sendKeys("BMW");

		driver.findElement(By.id("engineperformance")).sendKeys("2.0");
		
		driver.findElement(By.id("dateofmanufacture")).sendKeys("01/12/2018");
	
		driver.findElement(By.id("numberofseats")).sendKeys("5");
		
		driver.findElement(By.id("fuel")).sendKeys("Diesel");
		
		driver.findElement(By.id("payload")).sendKeys("550");
		
		driver.findElement(By.id("totalweight")).sendKeys("100");
		
		driver.findElement(By.id("listprice")).sendKeys("50000");
		
		driver.findElement(By.id("licenseplatenumber")).sendKeys("4567");
		
		driver.findElement(By.id("annualmileage")).sendKeys("12900");
		
		driver.findElement(By.id("nextenterinsurantdata")).click();
		
		driver.findElement(By.id("firstname")).sendKeys("Flavia");
		
		driver.findElement(By.id("lastname")).sendKeys("Reis");
		
		driver.findElement(By.id("birthdate")).sendKeys("09/02/1994");
		
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]/span")).click();
		
		driver.findElement(By.id("streetaddress")).sendKeys("Rua aviva");
		
		driver.findElement(By.id("country")).sendKeys("Brazil");
		
		driver.findElement(By.id("zipcode")).sendKeys("06070298");
		
		driver.findElement(By.id("city")).sendKeys("Osasco");
		
		driver.findElement(By.id("occupation")).sendKeys("Farmer");
		
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]")).click();
		
		driver.findElement(By.id("website")).sendKeys("https://www.google.com.br/");
		
		driver.findElement(By.id("nextenterproductdata")).click();
		
		driver.findElement(By.id("startdate")).sendKeys("04/01/2023");
		
		driver.findElement(By.id("insurancesum")).sendKeys("5.000.000,00");
		
		driver.findElement(By.id("damageinsurance")).sendKeys("Full Coverage");
		
	
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p")).click();
		
		driver.findElement(By.id("nextselectpriceoption")).click();
		
		driver.findElement(By.xpath("//*[@id='insurance-form']/div/section[4]/*[@id='pricePlans']/div[1]/*[@id='priceTable']/tfoot/tr/th/label[4]")).click();
		
		driver.findElement(By.id("nextsendquote")).click();
		
		
		
	}

}
