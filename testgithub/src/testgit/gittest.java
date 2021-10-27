package testgit;

public class gittest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		package POM_Classes;

		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.support.FindBy;
		import org.openqa.selenium.support.PageFactory;

		public class Login_Kite {

			@FindBy(xpath = "//input[@id = 'userid']")
		    private WebElement username;
			
			@FindBy(xpath = "//input[@id = 'password']")
			private WebElement password;
			
			@FindBy(xpath = "//button[@type= 'submit']")
			private WebElement login;
			
			
			public Login_Kite(WebDriver driver) {
				
				PageFactory.initElements(driver, this);
				
			}
			
			
			
		}










		
	}

}
