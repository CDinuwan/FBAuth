package loginpage;

import HomePage.FBHome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    public WebDriver driver;
    private By usernameField=By.id("email");
    private By passwordField=By.id("pass");
    private By loginButton=By.name("login");


    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void setUsernameField(String username){
        driver.findElement(usernameField).sendKeys(username);
    }
    public void setPasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public FBHome clickLoginButton(){
        driver.findElement(loginButton).click();
        return new FBHome(driver);
    }
}
