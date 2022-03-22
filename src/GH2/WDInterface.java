package GH2;

interface RemoteWebDriver{
    void navigate();
}
interface TakesScreenshot {
    void getScreenshot();
}

interface WebDriver extends RemoteWebDriver, TakesScreenshot {
    void open();

    void close();

    String getTitle();
}

class ChromeDriver implements WebDriver, RemoteWebDriver, TakesScreenshot {
    @Override
    public void open() {
         System.out.println("Chrome opened");
    }
    @Override
    public void close() {
        System.out.println("Chrome closed");
    }
    @Override
    public String getTitle() {
        String title = "google.com";
        return title;
    }
    @Override
    public void navigate() {
        System.out.println("Navigating to Onet.pl...");
    }
    @Override
    public void getScreenshot() {
        System.out.println("Saving screenshot of the webpage...");
    }
}

class FirefoxDriver implements WebDriver, RemoteWebDriver, TakesScreenshot {
    @Override
    public void open() {
        System.out.println("Firefox opened");
    }
    @Override
    public void close() {
        System.out.println("Firefox closed");
    }
    @Override
    public String getTitle() {
        String title = "Onet.pl";
        return title;
    }
    @Override
    public void navigate() {
        System.out.println("Navigating to Wp.pl...");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Saving screenshot of the webpage...");
    }
}
class SafariDriver implements WebDriver, RemoteWebDriver, TakesScreenshot {
    @Override
    public void open() {
        System.out.println("Safari opened");
    }
    @Override
    public void close() {
        System.out.println("Safari closed");
    }
    @Override
    public String getTitle() {
        String title = "Wp.pl";
        return title;
    }
    @Override
    public void navigate() {
        System.out.println("Navigating to interia.pl...");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Saving screenshot of the webpage...");
    }
}



public class WDInterface {
    public static void main (String[] args){

        WebDriver browserChrome = new ChromeDriver();
        WebDriver browserFirefox = new FirefoxDriver();
        WebDriver browserSafari = new SafariDriver();

        WebDriver[] browsers = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};

        for(WebDriver CFS : browsers){
            CFS.open();
            System.out.println("Title is: " + CFS.getTitle());
            CFS.navigate();
            CFS.getScreenshot();
            CFS.close();
            System.out.println();
        }



    }
}
