
import java.nio.channels.GatheringByteChannel;
import java.security.PublicKey;
import java.sql.Driver;
import java.util.Iterator;

import javax.lang.model.element.Element;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;
import org.openqa.selenium.interactions.Action;

import com.google.j2objc.annotations.Property;

import bsh.This;
import net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Anonymous;
import net.bytebuddy.implementation.bind.annotation.BindingPriority;

public class MegantoProject {
	private static final WebElement Tops = null;
	WebDriver driver = null;

	@BeforeTest
	public void beforetest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Prashant Selennium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(2000);
	}

	@Test
	@Ignore
	public void CreateNewAc() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[3]/a")).click();
		Thread.sleep(2000);

		if (driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/customer/account/create/"))

		{
			System.out.println("this logingbutton test pass");

		} else {
			System.out.println("loginbutton test is fail");
		}
		driver.findElement(By.id("firstname")).sendKeys("Birade");
		Thread.sleep(2000);

		driver.findElement(By.id("lastname")).sendKeys("Prashant");
		Thread.sleep(2000);

		driver.findElement(By.id("is_subscribed")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("email_address")).sendKeys("biradeprashant007@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.id("password")).sendKeys("project!@#$123");
		Thread.sleep(2000);
		driver.findElement(By.id("password-confirmation")).sendKeys("project!@#$123");
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/form/div/div[1]/button/span")).click();
		Thread.sleep(2000);
	}

	@Test
	@Ignore
	public void password() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[3]/a")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/form/div/div[1]/button/span")).click();
		Thread.sleep(2000);
		if (driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/customer/account/create/")) {
			System.out.println("Test1 is pass");

		} else {
			System.out.println("Test1 is fail");
		}
	}

	@Test
	@Ignore
	public void loginbutton() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("firstname")).sendKeys("Birade");
		Thread.sleep(2000);

		driver.findElement(By.id("lastname")).sendKeys("Prashant");
		Thread.sleep(2000);

		driver.findElement(By.id("is_subscribed")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("email_address")).sendKeys("biradeprashant007gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.id("password")).sendKeys("project!@#$123");
		Thread.sleep(2000);
		driver.findElement(By.id("password-confirmation")).sendKeys("project!@#$123");
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/form/div/div[1]/button/span")).click();
		Thread.sleep(2000);

		if (driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/customer/account/create/")) {
			System.out.println("\r\n" + "Please enter a valid email address (Ex: johndoe@domain.com).");

		} else {
			System.out.println("loginButtonTest2 is fail");
		}

	}

	@Test
	@Ignore
	public void HomeIconclick() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/a/img")).click();
		Thread.sleep(2000);
	}

	@Test
	@Ignore

	public void signin() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]")).click();
		Thread.sleep(2000);

		driver.findElement(
				By.xpath("/html/body/div[1]/main/div[3]/div/div[2]/div[1]/div[2]/form/fieldset/div[3]/div/input"))
				.sendKeys("project!@#$123");
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"/html/body/div[1]/main/div[3]/div/div[2]/div[1]/div[2]/form/fieldset/div[4]/div[1]/button/span"))
				.click();
		Thread.sleep(2000);

		if (driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/customer/account/")) {
			System.out.println("Sign in Test pass");

		} else {
			System.out.println("sign in test fail");
		}
	}

	@Test
	@Ignore

	public void signout() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/span/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")).click();
		Thread.sleep(10000);

		if (driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/customer/account/logoutSuccess/")) {
			System.out.println("User SignOut Succefull");
		} else {
			System.out.println("User SignOut fail");
		}

	}

	@Test
	@Ignore
	public void RequiredFiled() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/main/div[3]/div/div[2]/div[1]/div[2]/form/fieldset/div[4]/div[1]/button/span"))
				.click();
		Thread.sleep(2000);

		if (driver.getCurrentUrl().equals(
				"https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/")) {
			System.out.println("Test pass");

		} else {
			System.out.println("Test fail");
		}

	}

	@Test
	@Ignore
	public void forgotpassword() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("biradeprashant007@gmail.com");
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[1]/main/div[3]/div/div[2]/div[1]/div[2]/form/fieldset/div[4]/div[2]/a/span"))
				.click();
		Thread.sleep(2000);
		if (driver.getCurrentUrl()
				.equals("https://magento.softwaretestingboard.com/customer/account/forgotpassword/")) {
			System.out.println("Test is pass");
		} else {
			System.out.println("Test is fail");
		}

	}

	@Test
	@Ignore
	public void clickHOme() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/a/img")).click();
		Thread.sleep(2000);
	}

	@Test
	@Ignore
	public void Whatsnewbutton() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/nav/ul/li[1]/a/span")).click();
		Thread.sleep(2000);
		if (driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/what-is-new.html")) {
			System.out.println("Test is pass");

		} else {
			System.out.println("Test is fail");
		}

	}

	@Test
	@Ignore
	public void checkLinkwomaninnew() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/main/div[4]/div[2]/div/div/ul[1]/li[1]/a")).click();
		Thread.sleep(2000);
		if (driver.getCurrentUrl().equals(
				"https://magento.softwaretestingboard.com/women/tops-women/hoodies-and-sweatshirts-women.html")) {
			System.out.println("Test is pass");

		} else {
			System.out.println("Test is fail");
		}
		driver.findElement(By.id("ui-id-3")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Jackets")).click();
		Thread.sleep(2000);
		if (driver.getCurrentUrl()
				.equals("https://magento.softwaretestingboard.com/women/tops-women/jackets-women.html")) {
			System.out.println("Test is pass");

		} else {
			System.out.println("Test is fail");
		}
		driver.findElement(By.id("ui-id-3")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Tees")).click();
		Thread.sleep(2000);
		if (driver.getCurrentUrl()
				.equals("https://magento.softwaretestingboard.com/women/tops-women/tees-women.html")) {
			System.out.println("Test is pass");

		} else {
			System.out.println("Test is fail");
		}
		driver.findElement(By.id("ui-id-3")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Bras & Tanks")).click();
		Thread.sleep(2000);
		if (driver.getCurrentUrl()
				.equals("https://magento.softwaretestingboard.com/women/tops-women/tanks-women.html")) {
			System.out.println("Test is pass");

		} else {
			System.out.println("Test is fail");
		}
		driver.findElement(By.id("ui-id-3")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Pants")).click();
		Thread.sleep(2000);
		if (driver.getCurrentUrl()
				.equals("https://magento.softwaretestingboard.com/women/bottoms-women/pants-women.html")) {
			System.out.println("Test is pass");

		} else {
			System.out.println("Test is fail");
		}
		driver.findElement(By.id("ui-id-3")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Shorts")).click();
		Thread.sleep(2000);
		if (driver.getCurrentUrl()
				.equals("https://magento.softwaretestingboard.com/women/bottoms-women/shorts-women.html")) {
			System.out.println("Test is pass");

		} else {
			System.out.println("Test is fail");
		}
		driver.findElement(By.id("ui-id-3")).click();
		Thread.sleep(2000);

	}

	@Test
	@Ignore
	public void checklinkmaninnew() throws InterruptedException {

		driver.findElement(By.xpath("/html/body/div[1]/main/div[4]/div[2]/div/div/ul[2]/li[1]/a")).click();
		Thread.sleep(2000);
		if (driver.getCurrentUrl()
				.equals("https://magento.softwaretestingboard.com/men/tops-men/hoodies-and-sweatshirts-men.html")) {
			System.out.println("Test is pass");

		} else {
			System.out.println("Test is fail");
		}
		driver.findElement(By.id("ui-id-3")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[1]/main/div[4]/div[2]/div/div/ul[2]/li[2]/a")).click();
		Thread.sleep(2000);
		if (driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/men/tops-men/jackets-men.html")) {
			System.out.println("Test is pass");

		} else {
			System.out.println("Test is fail");
		}
		driver.findElement(By.id("ui-id-3")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[1]/main/div[4]/div[2]/div/div/ul[2]/li[3]/a")).click();
		Thread.sleep(2000);
		if (driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/men/tops-men/tees-men.html")) {
			System.out.println("Test is pass");

		} else {
			System.out.println("Test is fail");
		}
		driver.findElement(By.id("ui-id-3")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[1]/main/div[4]/div[2]/div/div/ul[2]/li[4]/a")).click();
		Thread.sleep(2000);
		if (driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/men/tops-men/tanks-men.html")) {
			System.out.println("Test is pass");

		} else {
			System.out.println("Test is fail");
		}
		driver.findElement(By.id("ui-id-3")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[1]/main/div[4]/div[2]/div/div/ul[2]/li[5]/a")).click();
		Thread.sleep(2000);
		if (driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/men/bottoms-men/pants-men.html")) {
			System.out.println("Test is pass");

		} else {
			System.out.println("Test is fail");
		}
		driver.findElement(By.id("ui-id-3")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("/html/body/div[1]/main/div[4]/div[2]/div/div/ul[2]/li[6]/a")).click();
		Thread.sleep(2000);
		if (driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/men/bottoms-men/shorts-men.html")) {
			System.out.println("Test is pass");

		} else {
			System.out.println("Test is fail");
		}
		driver.findElement(By.id("ui-id-3")).click();
		Thread.sleep(2000);
	}

	@Test
	@Ignore

	public void womanlink() throws InterruptedException {

		driver.findElement(By.linkText("Women")).click();
		Thread.sleep(2000);
		if (driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/women.html")) {
			System.out.println("Test is pass");

		} else {
			System.out.println("Test is fail");
		}

		Actions actions = new Actions(driver);

		WebElement Women = driver.findElement(By.linkText("Women"));
		Action a1 = actions.moveToElement(Women).build();
		a1.perform();
		Thread.sleep(2000);

		Actions actions1 = new Actions(driver);

		WebElement Tops = driver.findElement(By.linkText("Tops"));
		Action a2 = actions1.moveToElement(Tops).build();
		a2.perform();
		Thread.sleep(2000);

		Actions actions2 = new Actions(driver);

		WebElement Jackets = driver.findElement(By.linkText("Jackets"));
		Action a3 = actions2.moveToElement(Jackets).build();
		a3.perform();
		Thread.sleep(2000);

		Actions actions3 = new Actions(driver);

		WebElement Hoodies = driver.findElement(By.linkText("Hoodies & Sweatshirts"));
		Action a4 = actions3.moveToElement(Hoodies).build();
		a4.perform();
		Thread.sleep(2000);

		Actions actions4 = new Actions(driver);

		WebElement Tees = driver.findElement(By.linkText("Tees"));
		Action a5 = actions4.moveToElement(Tees).build();
		a5.perform();
		Thread.sleep(2000);

		Actions actions5 = new Actions(driver);

		WebElement Bras = driver.findElement(By.linkText("Bras & Tanks"));
		Action a6 = actions5.moveToElement(Bras).build();
		a6.perform();
		Thread.sleep(2000);

		Actions actions6 = new Actions(driver);

		WebElement Bottoms = driver.findElement(By.linkText("Bottoms"));
		Action a7 = actions6.moveToElement(Bottoms).build();
		a7.perform();
		Thread.sleep(2000);

		Actions actions7 = new Actions(driver);

		WebElement Pants = driver.findElement(By.linkText("Pants"));
		Action a8 = actions7.moveToElement(Pants).build();
		a8.perform();
		Thread.sleep(2000);

		Actions actions8 = new Actions(driver);

		WebElement Shorts = driver.findElement(By.linkText("Shorts"));
		Action a9 = actions8.moveToElement(Shorts).build();
		a9.perform();
		Thread.sleep(2000);

	}

	@Test
	@Ignore

	public void manlink() throws InterruptedException {
		driver.findElement(By.linkText("Men")).click();
		Thread.sleep(2000);
		if (driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/men.html")) {
			System.out.println("Test is pass");

		} else {
			System.out.println("Test is fail");
		}
		Actions actions = new Actions(driver);

		WebElement Men = driver.findElement(By.linkText("Men"));
		Action a1 = actions.moveToElement(Men).build();
		a1.perform();
		Thread.sleep(2000);

		Actions actions1 = new Actions(driver);

		WebElement Tops = driver.findElement(By.linkText("Tops"));
		Action a2 = actions1.moveToElement(Tops).build();
		a2.perform();
		Thread.sleep(2000);

		Actions actions2 = new Actions(driver);

		WebElement Jackets = driver.findElement(By.linkText("Jackets"));
		Action a3 = actions2.moveToElement(Jackets).build();
		a3.perform();
		Thread.sleep(2000);

		Actions actions3 = new Actions(driver);

		WebElement Hoodies = driver.findElement(By.linkText("Hoodies & Sweatshirts"));
		Action a4 = actions3.moveToElement(Hoodies).build();
		a4.perform();
		Thread.sleep(2000);

		Actions actions4 = new Actions(driver);

		WebElement Tees = driver.findElement(By.linkText("Tees"));
		Action a5 = actions4.moveToElement(Tees).build();
		a5.perform();
		Thread.sleep(2000);

		Actions actions5 = new Actions(driver);

		WebElement Tanks = driver.findElement(By.linkText("Tanks"));
		Action a6 = actions5.moveToElement(Tanks).build();
		a6.perform();
		Thread.sleep(2000);

		Actions actions6 = new Actions(driver);

		WebElement Bottoms = driver.findElement(By.linkText("Bottoms"));
		Action a7 = actions6.moveToElement(Bottoms).build();
		a7.perform();
		Thread.sleep(2000);

		Actions actions7 = new Actions(driver);

		WebElement Pants = driver.findElement(By.linkText("Pants"));
		Action a8 = actions7.moveToElement(Pants).build();
		a8.perform();
		Thread.sleep(2000);

		Actions actions8 = new Actions(driver);

		WebElement Shorts = driver.findElement(By.linkText("Shorts"));
		Action a9 = actions8.moveToElement(Shorts).build();
		a9.perform();
		Thread.sleep(2000);
	}

	@Test
	@Ignore

	public void Gearlink() throws InterruptedException {
		driver.findElement(By.linkText("Gear")).click();
		Thread.sleep(2000);
		if (driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/gear.html")) {
			System.out.println("Test is pass");

		} else {
			System.out.println("Test is fail");
		}
		Actions actions = new Actions(driver);

		WebElement Gear = driver.findElement(By.linkText("Gear"));
		Action a1 = actions.moveToElement(Gear).build();
		a1.perform();
		Thread.sleep(2000);

		Actions actions1 = new Actions(driver);

		WebElement Bags = driver.findElement(By.linkText("Bags"));
		Action a2 = actions1.moveToElement(Bags).build();
		a2.perform();
		Thread.sleep(2000);

		Actions actions2 = new Actions(driver);

		WebElement FitnessEquipment = driver.findElement(By.linkText("Fitness Equipment"));
		Action a3 = actions2.moveToElement(FitnessEquipment).build();
		a3.perform();
		Thread.sleep(2000);

		Actions actions3 = new Actions(driver);

		WebElement Watches = driver.findElement(By.linkText("Watches"));
		Action a4 = actions3.moveToElement(Watches).build();
		a4.perform();
		Thread.sleep(2000);
	}

	@Test
	@Ignore

	public void TrainingTraining() throws InterruptedException {
		driver.findElement(By.linkText("Training")).click();
		Thread.sleep(2000);
		if (driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/training.html")) {
			System.out.println("Test is pass");

		} else {
			System.out.println("Test is fail");
		}
		Actions actions = new Actions(driver);

		WebElement Training = driver.findElement(By.linkText("Training"));
		Action a1 = actions.moveToElement(Training).build();
		a1.perform();
		Thread.sleep(2000);

		Actions actions1 = new Actions(driver);

		WebElement VideoDownload = driver.findElement(By.linkText("Video Download"));
		Action a2 = actions1.moveToElement(VideoDownload).build();
		a2.perform();
		Thread.sleep(2000);
	}

	@Test
	@Ignore
	public void Salelink() throws InterruptedException {
		driver.findElement(By.linkText("Sale")).click();
		Thread.sleep(2000);
		if (driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/sale.html")) {
			System.out.println("Test is pass");

		} else {
			System.out.println("Test is fail");
		}

	}

	@Test
	@Ignore
	public void clickHOme1() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/a/img")).click();
		Thread.sleep(2000);
	}

	@Test
	@Ignore
	public void search() throws InterruptedException {
		driver.findElement(By.id("search")).sendKeys("jackets");
		Thread.sleep(2000);

		driver.findElement(By.id("search_autocomplete")).click();
		Thread.sleep(2000);
	}

	@Test
	@Ignore
	public void MyCart() throws InterruptedException {
		driver.findElement(By.linkText("My Cart")).click();
		Thread.sleep(2000);

		if (driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/")) {
			System.out.println("You have no items in your shopping cart.");

		} else {
			System.out.println("Test is fail");
		}
	}

	@Test
	@Ignore
	public void ShopNewYoga() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div[2]/div[1]/a/span/span[2]")).click();
		Thread.sleep(2000);
		if (driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/collections/yoga-new.html")) {
			System.out.println("Test is pass");

		} else {
			System.out.println("Test is fail");
		}
	}

	@Test
	@Ignore
	public void clickHOme2() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/a/img")).click();
		Thread.sleep(2000);
	}

	@Test
	@Ignore
	public void Checkfooterlink() throws InterruptedException {
		Actions actions = new Actions(driver);

		WebElement Write = driver.findElement(By.linkText("Write for us"));
		Action a1 = actions.moveToElement(Write).build();
		a1.perform();
		Thread.sleep(2000);

		Actions actions1 = new Actions(driver);

		WebElement SearchTerms = driver.findElement(By.linkText("Search Terms"));
		Action a2 = actions1.moveToElement(SearchTerms).build();
		a2.perform();
		Thread.sleep(2000);

		Actions actions2 = new Actions(driver);

		WebElement Privacy = driver.findElement(By.linkText("Privacy and Cookie Policy"));
		Action a3 = actions2.moveToElement(Privacy).build();
		a3.perform();
		Thread.sleep(2000);

		Actions actions3 = new Actions(driver);

		WebElement AdvancedSearch = driver.findElement(By.linkText("Advanced Search"));
		Action a4 = actions3.moveToElement(AdvancedSearch).build();
		a4.perform();
		Thread.sleep(2000);

		Actions actions4 = new Actions(driver);

		WebElement OrdersandReturns = driver.findElement(By.linkText("Orders and Returns"));
		Action a5 = actions4.moveToElement(OrdersandReturns).build();
		a5.perform();
		Thread.sleep(2000);

		Actions actions5 = new Actions(driver);

		WebElement ContactUs = driver.findElement(By.linkText("Contact Us"));
		Action a6 = actions5.moveToElement(ContactUs).build();
		a6.perform();
		Thread.sleep(2000);

	}

	@Test(priority = 0)
	@Ignore

	public void productTest1() throws InterruptedException {

		driver.findElement(By.linkText("Women")).click();
		Thread.sleep(2000);

		driver.findElement(
				By.xpath("/html/body/div[1]/main/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[2]/div/a/span/span/img"))
				.click();
		Thread.sleep(2000);
//
//		driver.findElement(By.id("product-addtocart-button")).click();
//		Thread.sleep(2000);
//		if (driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/breathe-easy-tank.html")) {
//			System.out.println("Test is pass");
//
//		}else {
//			System.out.println("Test is fail");
//		}
		// check size
//		driver.findElement(By.id("option-label-size-143-item-166")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("option-label-size-143-item-167")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("option-label-size-143-item-168")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("option-label-size-143-item-169")).click();
//		Thread.sleep(2000);
		driver.findElement(By.id("option-label-size-143-item-170")).click();
		Thread.sleep(2000);

		// check color

//		driver.findElement(By.id("option-label-color-93-item-57")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("option-label-color-93-item-59")).click();
//		Thread.sleep(2000);
		driver.findElement(By.id("option-label-color-93-item-60")).click();
		Thread.sleep(2000);

		// add qty

		driver.findElement(By.id("qty")).click();
		Thread.sleep(2000);

		// scroll images

//		driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div"))
//				.click();
//		Thread.sleep(2000);

		// add to cart

		driver.findElement(By.id("product-addtocart-button")).click();
		Thread.sleep(2000);

		// add to wish list
//		driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div[5]/div/a[1]")).click();
//		Thread.sleep(2000);

		// sign in

//		driver.findElement(By.id("email")).sendKeys("biradeprashant007@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.id("pass")).sendKeys("project!@#$123");
//		Thread.sleep(2000);
//		driver.findElement(
//				By.xpath("/html/body/div[1]/main/div[3]/div/div[2]/div[1]/div[2]/form/fieldset/div[4]/div[1]/button"))
//				.click();
		Thread.sleep(2000);

	}

	@Ignore
	@Test(priority = 1)
	public void Addtocart() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/a")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"/html/body/div[1]/header/div[2]/div[1]/div/div/div/div[2]/div[4]/ol/li/div/div/div[1]/span/span"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.id("top-cart-btn-checkout")).click();
		Thread.sleep(10000);

		if (driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/checkout/#shipping")) {
			System.out.println("Test is passs");

		} else {
			System.out.println("test is fail");
		}
	}

	@Test
	@Ignore
	public void clickHOme3() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/a/img")).click();
		Thread.sleep(2000);
	}

	@Test
	@Ignore
	public void producttest2() throws InterruptedException {
		driver.findElement(By.id("ui-id-5")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[1]/main/div[4]/div[1]/div[1]/div[1]/div[2]/a[1]/span[1]/span[2]"))
				.click();
		Thread.sleep(2000);

		if (driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/men/bottoms-men/shorts-men.html")) {
			System.out.println("This test is pass");

		} else {
			System.out.println("This Test is fail");
		}
		driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div/div[2]/div/div[10]/div[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div/div[2]/div/div[10]/div[2]/ol/li[1]/a"))
				.click();
		Thread.sleep(2000);

		if (driver.getCurrentUrl()
				.equals("https://magento.softwaretestingboard.com/men/bottoms-men/shorts-men.html?sale=1")) {
			System.out.println("This tes is pass");

		} else {
			System.out.println("This test is fail");
		}

		driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img"))
				.click();
		Thread.sleep(2000);
		// check size
		driver.findElement(By.id("option-label-size-143-item-175")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("option-label-size-143-item-176")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("option-label-size-143-item-177")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("option-label-size-143-item-178")).click();
		Thread.sleep(2000);
		// check color
		driver.findElement(By.id("option-label-color-93-item-49")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("option-label-color-93-item-52")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("option-label-color-93-item-58")).click();
		Thread.sleep(2000);

		// scroll image
		driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div"))
				.click();
		Thread.sleep(2000);
		// Qnty image
		driver.findElement(By.id("qty")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("product-addtocart-button")).click();
		Thread.sleep(2000);

	}

	@Test
	@Ignore
	public void clickHOme4() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/a/img")).click();
		Thread.sleep(2000);
	}

	@Test
	@Ignore
	public void gearproducttest() throws InterruptedException {
		driver.findElement(By.id("ui-id-6")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Watches")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div[2]/div[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("sorter")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div[2]/div[3]/select/option[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div[3]/ol/li[1]/div/div/strong/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("product-addtocart-button")).click();
		Thread.sleep(2000);

	}

	@Test
	@Ignore
	public void clickHOme5() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/a/img")).click();
		Thread.sleep(2000);
	}

	@Test
	public void addtocart() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div[2]/div[3]/div/div/ol/li[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("option-label-size-143-item-168")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("option-label-color-93-item-56")).click();
		Thread.sleep(2000);
//		driver.findElement(By.id("product-addtocart-button")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/a")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"/html/body/div[1]/header/div[2]/div[1]/div/div/div/div[2]/div[4]/ol/li/div/div/div[3]/div[2]/a"))
//				.click();
//		Thread.sleep(4000);

//		 Alert a1=driver.switchTo().alert();
//		 System.out.println("first alert message: "+a1.getText());
//		 a1.accept();
//		
//		driver.findElement(By.xpath("/html/body/div[3]/aside[2]/div[2]/footer/button[2]")).click();
//		Thread.sleep(2000);
//		if (driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/radiant-tee.html#")) {
//			System.out.println("This test is pass");
//		} else {
//			System.out.println("This is test fail");
//		}

		driver.findElement(By.id("product-addtocart-button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("top-cart-btn-checkout")).click();
		Thread.sleep(6000);
		// shiping add.

		driver.findElement(By.id("customer-email")).sendKeys("biradeprashant007@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.id("customer-password")).sendKeys("project!@#$123");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[1]/fieldset/fieldset/div[2]/div[1]/button"))
				.click();
		Thread.sleep(10000);
//		driver.findElement(By.id("IP32FTR")).sendKeys("birade");
//		Thread.sleep(2000);
//		driver.findElement(By.id("MHI1J8T")).sendKeys("prashant");
//		Thread.sleep(2000);
		driver.findElement(By.id("XV7AW8O")).sendKeys("PrshantEmpire.Pvt");
		Thread.sleep(2000);
		driver.findElement(By.id("OCIEYCX")).sendKeys("123 adajan");
		Thread.sleep(2000);
		driver.findElement(By.id("W9SK1PD")).sendKeys("surat");
		Thread.sleep(2000);
		driver.findElement(By.id("BNYM2NE")).sendKeys("surat");
		Thread.sleep(2000);
		driver.findElement(By.id("K1N7JUA")).click();
		driver.findElement(By.xpath(
				"/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[5]/div/select/option[25]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.id("AEIVGEN")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.id("HLJB5ET")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[8]/div/select/option[104]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.id("U9MCL01")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[1]/table/tbody/tr[1]/td[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button"))
				.click();
		Thread.sleep(2000);
		
		if (driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/checkout/cart/#shipping")) {
			System.out.println("This test is pass");
			
		}else {
			System.out.println("This test is fail");
		}
		
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[4]/div/button/span")).click();
		Thread.sleep(2000);
		
		if (driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/checkout/onepage/success/")) {
			System.out.println("Thank you for your purchase!");
		}else {
			System.out.println("This is test");
		}
		
		
		driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/a")).click();
		Thread.sleep(2000);
		if (driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/sales/order/print/order_id/16436/")) {
			System.out.println("This test is pass");
			
		}else {
			System.out.println("This test is fail");
		}
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/a/img")).click();
		Thread.sleep(2000);
	}

	@AfterTest
	public void aftertest() {
		driver.close();

	}

}
