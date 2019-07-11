package testingui.diplomadoumss.org.core;

public class FirstExample {
    public static void main(String[] args) {
        Browser browser = DriverFactory.getInstance().getBrowser("chrome");
        browser.getWebDriver().get("http://www.google.com");
        browser.getWebDriver().quit();
    }
}
