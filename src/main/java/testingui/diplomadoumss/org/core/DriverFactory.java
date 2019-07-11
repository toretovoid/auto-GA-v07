package testingui.diplomadoumss.org.core;

/**
 * Implement the Factory Pattern Design about the selection of WebDriver
 * @author Marcelo Garay
 */
public class DriverFactory {
    private static DriverFactory ourInstance = new DriverFactory();

    public static DriverFactory getInstance() {
        return ourInstance;
    }

    private DriverFactory() {
    }

    public Browser getBrowser(String name){
        if(name.equalsIgnoreCase("CHROME")){
            return new Chrome();
        }
        if(name.equalsIgnoreCase("FIREFOX")){
            return new Firefox();
        }else{
            return new Chrome();
        }
    }
}
