import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Users.User1;
import Users.User2;
import Users.User3;

public class WPRetirementFunds extends WPRetirePage { 

public static void main(String[] args) throws InterruptedException {
		//User1
			System.out.println("pass");
			System.setProperty("webdriver.chrome.driver", "\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(2);
		//Navigation
			driver.get("https://www.westpac.co.nz/");
			driver.findElement(By.partialLinkText("Calculators")).click();
			driver.findElement(By.linkText("Check contributions and future balance")).click();
			driver.findElement(By.className("MuiButton-label")).click();
			driver.findElement(By.id("text-QUESTION_AGE")).sendKeys(User1.age + Keys.ENTER);
			//Retirement Button
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/main/div[4]/div/div/div/button[2]")).click();
			//Employed	
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/main/div[5]/div/div/div/div/div")).click();
				driver.findElement(By.cssSelector("#menu- > div.MuiPaper-root.MuiMenu-paper.MuiPopover-paper.MuiPaper-elevation8.MuiPaper-rounded > ul > li:nth-child(1)")).click();
			//income
				driver.findElement(By.id("text-QUESTION_INCOME")).sendKeys(User1.salary + Keys.ENTER);
			//starting balance
				driver.findElement(By.id("text-QUESTION_KIWISAVER_BALANCE")).sendKeys(User1.starting + Keys.ENTER);
				Thread.sleep(1000);
			//Contributions @ 4%
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/main/div[8]/div/div/div/div")).click();
				driver.findElement(By.cssSelector("#menu- > div.MuiPaper-root.MuiMenu-paper.MuiPopover-paper.MuiPaper-elevation8.MuiPaper-rounded > ul > li:nth-child(3)")).click();
			//Fund Type	
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/main/div[9]/div/div/div/div")).click();
				driver.findElement(By.cssSelector("#menu- > div.MuiPaper-root.MuiMenu-paper.MuiPopover-paper.MuiPaper-elevation8.MuiPaper-rounded > ul > li:nth-child(3)")).click();
					Thread.sleep(5000);

				//User 2
			driver.get("https://www.westpac.co.nz/");
			driver.findElement(By.partialLinkText("Calculators")).click();
			driver.findElement(By.linkText("Check contributions and future balance")).click();
			driver.findElement(By.className("MuiButton-label")).click();
			driver.findElement(By.id("text-QUESTION_AGE")).sendKeys(User2.age + Keys.ENTER);
		//Retirement Button
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/main/div[4]/div/div/div/button[2]")).click();
		//Employed	= Self Employed
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/main/div[5]/div/div/div/div/div")).click(); 
			driver.findElement(By.cssSelector("#menu- > div.MuiPaper-root.MuiMenu-paper.MuiPopover-paper.MuiPaper-elevation8.MuiPaper-rounded > ul > li:nth-child(2)")).click();
		//starting balance
			driver.findElement(By.id("text-QUESTION_KIWISAVER_BALANCE")).sendKeys(User2.starting + Keys.ENTER);
			Thread.sleep(1000);
		//Controbution period
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/main/div[7]/div/div/div/div/div")).click();
			driver.findElement(By.cssSelector("#menu- > div.MuiPaper-root.MuiMenu-paper.MuiPopover-paper.MuiPaper-elevation8.MuiPaper-rounded > ul > li:nth-child(3)")).click();
		//Contribution value
			driver.findElement(By.id("text-QUESTION_VOLUNTARY_CONTRIBUTION_AMOUNT")).sendKeys(User2.contributionDollar + Keys.ENTER);
			
		//Fund Type	
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/main/div[9]/div/div/div/div")).click();
			driver.findElement(By.cssSelector("#menu- > div.MuiPaper-root.MuiMenu-paper.MuiPopover-paper.MuiPaper-elevation8.MuiPaper-rounded > ul > li:nth-child(4)")).click();
			//String Value = driver.findElement(By.cssSelector("body > div.MuiDialog-root.sc-fubCfw.irPtrP > div.MuiDialog-container.MuiDialog-scrollPaper > div > div > div > main > div.sc-gInsOo.BOvOp > div > div > section:nth-child(2) > div > div > div > div.MuiGrid-root.sc-hKKeuH.kXQUbk.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-lg-7 > div > div.MuiPaper-root.MuiPaper-elevation4.MuiPaper-rounded > div > div.MuiBox-root.jss49 > div > div > div > div > svg > g > g.visx-group.visx-glyph > g > text")).getText();
			//String u2Total = Value + u2.SavingGoal;
			//System.out.println(u2Total);
					Thread.sleep(5000);
					
				//User 3
			driver.get("https://www.westpac.co.nz/");
			driver.findElement(By.partialLinkText("Calculators")).click();
			driver.findElement(By.linkText("Check contributions and future balance")).click();
			driver.findElement(By.className("MuiButton-label")).click();
			driver.findElement(By.id("text-QUESTION_AGE")).sendKeys(User3.age + Keys.ENTER);
		//Retirement Button
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/main/div[4]/div/div/div/button[2]")).click();
		//Employed	= Self Employed
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/main/div[5]/div/div/div/div/div")).click(); 
			driver.findElement(By.cssSelector("#menu- > div.MuiPaper-root.MuiMenu-paper.MuiPopover-paper.MuiPaper-elevation8.MuiPaper-rounded > ul > li:nth-child(3)")).click();
		//starting balance  
			driver.findElement(By.id("text-QUESTION_KIWISAVER_BALANCE")).sendKeys(User3.starting + Keys.ENTER);
			Thread.sleep(1000);
		//Controbution period
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/main/div[7]/div/div/div/div/div")).click();
			driver.findElement(By.cssSelector("#menu- > div.MuiPaper-root.MuiMenu-paper.MuiPopover-paper.MuiPaper-elevation8.MuiPaper-rounded > ul > li:nth-child(5)")).click();
		//Contribution value
			driver.findElement(By.id("text-QUESTION_VOLUNTARY_CONTRIBUTION_AMOUNT")).sendKeys(User3.contributionDollar + Keys.ENTER);
			
		//Fund Type	
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/main/div[9]/div/div/div/div")).click();
				Thread.sleep(1000);
			driver.findElement(By.cssSelector("#menu- > div.MuiPaper-root.MuiMenu-paper.MuiPopover-paper.MuiPaper-elevation8.MuiPaper-rounded > ul > li:nth-child(6)")).click();
}
}
