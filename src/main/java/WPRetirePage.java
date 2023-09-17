import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WPRetirePage {
	public static void main(String[] args) throws InterruptedException {
			//open Westpack Page
		

		System.out.println("pass");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.westpac.co.nz/");
		driver.findElement(By.partialLinkText("Calculators")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Check contributions and future balance")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("MuiButton-label")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("MuiTypography-body1"));
		String retirementtext = driver.findElement(By.cssSelector("body > div.MuiDialog-root.sc-fubCfw.irPtrP > div.MuiDialog-container.MuiDialog-scrollPaper > div > div > div > aside > div.MuiGrid-root.MuiGrid-container.MuiGrid-align-items-xs-center > div > div > div.MuiGrid-root.sc-hlTvYk.eSGHmZ.MuiGrid-item.MuiGrid-grid-xs-true > p")).getText();
		System.out.println(retirementtext);
		return;
		
	}
}
