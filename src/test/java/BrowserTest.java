import org.example.BrowserConfig;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v116.network.Network;
import org.openqa.selenium.devtools.v116.network.model.Request;

import java.util.Optional;


public class BrowserTest extends BrowserConfig {
    public static void main(String[] args) {
        driver.get(baseurl);
        devTools.createSession();
        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
        devTools.addListener(Network.requestWillBeSent(), requestConsumer ->{
            Request request = requestConsumer.getRequest();
            System.out.println(request.getUrl());
        });
        driver.close();
        driver.quit();
    }
}
