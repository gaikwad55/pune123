package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	@FindBy(xpath="//div[@id='branding']//a[@id='welcome']")
	private WebElement link;
	
	@FindBy(xpath="//div[@id='welcome-menu']/ul/li[3]//a[text()'Logout']")
	private WebElement logoutlink;
	
	public Homepage(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLink() {
		return link;
	}
	public WebElement getLogoutLink() {
		return logoutlink;
	}
	public void logout() {
		getLink().click();
		getLogoutLink().click();
	}
}
	//added to new branch
	
	
	
	
