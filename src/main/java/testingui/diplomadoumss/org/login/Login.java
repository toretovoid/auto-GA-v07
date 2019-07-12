package testingui.diplomadoumss.org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

public class Login extends BasePage {

    @FindBy(xpath = "//input[@name='email' and @type='email']")
    private WebElement emailTextField;

    public void setEmail(String email){
        emailTextField.sendKeys(email);
    }

    @FindBy(xpath = "//input[@name='password' and @type='password']")
    private WebElement passwordTextField;

    public void setPassword(String password){
        passwordTextField.sendKeys(password);
    }

    @FindBy(css = ".btn-primary.btn-block")
    private WebElement buttonLogin;
    public void setButtonValue(){
        buttonLogin.click();
    }

}
