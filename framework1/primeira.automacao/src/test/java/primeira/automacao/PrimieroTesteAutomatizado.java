package primeira.automacao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimieroTesteAutomatizado {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("htpps://www.google.com.br");
		driver.manage().window().maximize();

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPesquisarInovacao() {
		WebElement pesquisar = driver.findElement(By.name("q"));
		pesquisar.sendKeys("Inovação");
		pesquisar.submit();
	}

}
