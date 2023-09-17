import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Users.User1;
import Users.User2;
import Users.User3;
import Pages.Age;
import Pages.Calculators;
import Pages.Home;
import Pages.Retirement;
import Pages.Calculators;
import Pages.Age;
import Pages.Retirement;
import Pages.Employed;
import Pages.Income;
import Pages.Balance;
import Pages.Contribution;
import Pages.Fund;



public class WPRetirementFunds extends WPRetirePage { 

public static void main(String[] args) throws InterruptedException {
		//User1
			System.out.println("pass");
		
			WebDriver driver = new ChromeDriver();
			
		//Navigation
			driver.get(Home.URL);
			driver.findElement(By.partialLinkText("Calculators")).click();
				Thread.sleep(2000);
			driver.findElement(By.xpath(Calculators.Kiwisaver_calculator)).click();
				Thread.sleep(1000);
			driver.findElement(By.className(Calculators.Open_calc)).click();
				Thread.sleep(500);
			driver.findElement(By.id(Age.Age_Label)).sendKeys(User1.age + Keys.ENTER);
			//Retirement Button
				driver.findElement(By.xpath(Retirement.Button)).click();
			//Employed	
				driver.findElement(By.xpath(Employed.Feild)).click();
				driver.findElement(By.xpath(Employed.Employeed)).click();
			//income
				driver.findElement(By.id(Income.Feild)).sendKeys(User1.salary + Keys.ENTER);
				Thread.sleep(1000);
			//starting balance
				driver.findElement(By.id(Balance.Feild)).sendKeys(User1.starting + Keys.ENTER);
				Thread.sleep(1000);
			//Contributions @ 4%
				driver.findElement(By.xpath(Contribution.Feild)).click();
				driver.findElement(By.xpath(Contribution.Percent_4)).click();
			//Fund Type	- defensive
				driver.findElement(By.xpath(Fund.Feild)).click();
				driver.findElement(By.xpath(Fund.Defensive)).click();
					Thread.sleep(5000);

				//User 2
			driver.get(Home.URL);
			driver.findElement(By.partialLinkText("Calculators")).click();
				Thread.sleep(1000);
			driver.findElement(By.xpath(Calculators.Kiwisaver_calculator)).click();
				Thread.sleep(1000);
			driver.findElement(By.className(Calculators.Open_calc)).click();
				Thread.sleep(500);
			driver.findElement(By.id(Age.Age_Label)).sendKeys(User2.age + Keys.ENTER);
		//Retirement Button
			driver.findElement(By.xpath(Retirement.Button)).click();
		//Employed	= Self Employed
			driver.findElement(By.xpath(Employed.Feild)).click();
			driver.findElement(By.xpath(Employed.Self_Employeed)).click();
			//starting balance
			driver.findElement(By.id(Balance.Feild)).sendKeys(User2.starting + Keys.ENTER);
			Thread.sleep(1000);
		//Controbution period
			driver.findElement(By.xpath(Contribution.Frequency_feild)).click();
			driver.findElement(By.xpath(Contribution.Frequency_Fortnightly)).click();
		//Contribution value
			driver.findElement(By.id(Contribution.Text_Feild)).sendKeys(User2.contributionDollar + Keys.ENTER);
			
		//Fund Type	
			driver.findElement(By.xpath(Fund.Feild)).click();
			driver.findElement(By.xpath(Fund.Conservative)).click();
					Thread.sleep(5000);
					
				//User 3
			driver.get(Home.URL);
			driver.findElement(By.partialLinkText("Calculators")).click();
				Thread.sleep(1000);
			driver.findElement(By.xpath(Calculators.Kiwisaver_calculator)).click();
				Thread.sleep(1000);
			driver.findElement(By.className(Calculators.Open_calc)).click();
				Thread.sleep(500);
			driver.findElement(By.id(Age.Age_Label)).sendKeys(User3.age + Keys.ENTER);
		//Retirement Button
			driver.findElement(By.xpath(Retirement.Button)).click();
		//Employed	= Self Employed
			driver.findElement(By.xpath(Employed.Feild)).click();
			driver.findElement(By.xpath(Employed.Self_Employeed)).click();
		//starting balance  
			driver.findElement(By.id("text-QUESTION_KIWISAVER_BALANCE")).sendKeys(User3.starting + Keys.ENTER);
			Thread.sleep(1000);
		//Controbution period
			driver.findElement(By.xpath(Contribution.Frequency_feild)).click();
			driver.findElement(By.xpath(Contribution.Frequency_Anually)).click();
		//Contribution value
			driver.findElement(By.id(Contribution.Text_Feild)).sendKeys(User3.contributionDollar + Keys.ENTER);
			
		//Fund Type	
			driver.findElement(By.xpath(Fund.Feild)).click();
		Thread.sleep(500);
			driver.findElement(By.xpath(Fund.Balanced)).click();
}
}
