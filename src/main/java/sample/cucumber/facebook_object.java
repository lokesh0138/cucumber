package sample.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class facebook_object {
	public WebDriver driver;

	By user=By.id("email");
	By password=By.id("pass");
	By message=By.xpath("//div[@class='_9ay7']");
	By submit=By.id("loginbutton");
	public facebook_object(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement user()
	{
		return driver.findElement(user);
	}
	
	public WebElement pass()
	{
		return driver.findElement(password);
	}
	public WebElement message()
	{
		return driver.findElement(message);
	}
	public WebElement submit()
	{
		return driver.findElement(submit);
	}

}
