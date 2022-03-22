package GH2;

interface WebDriver{


    void open();
    void close();
    String getTitle();
}

interface RemoteWebDriver extends WebDriver {
    void navigate();
}

interface TakesScreenshot extends RemoteWebDriver{
    void getScreenshot();
}

class ChromeDriver implements TakesScreenshot {


    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {

    }

    @Override
    public void getScreenshot() {

    }
}






















public class WDInterface {
}
