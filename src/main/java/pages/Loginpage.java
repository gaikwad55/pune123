package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(id="txtUsername")
	private WebElement usernameTextBox;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement passTextBox;
	
	@FindBy(id="btnLogin")
	private WebElement loginButton;
	
	public Loginpage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}

	public boolean isButtonPresent() {
		
		boolean stateOfbutton=loginButton.isDisplayed();
		
		return stateOfbutton;
	}
	
	public void login(String user,String pass) {
		
		usernameTextBox.sendKeys(user);
		passTextBox.sendKeys(pass);
		loginButton.click();
	}
	
}


	
	
	


