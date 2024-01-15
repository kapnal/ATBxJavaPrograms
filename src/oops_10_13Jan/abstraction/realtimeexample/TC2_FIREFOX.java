package src.oops_10_13Jan.abstraction.realtimeexample;

public class TC2_FIREFOX extends BaseClass{
    @Override
    String openBrowser() {
        System.out.println("Starting FIREFOX");
        return null;
    }

    @Override
    String closeBrowser() {
        System.out.println("Closing FIREFOX");
        return null;
    }
}
