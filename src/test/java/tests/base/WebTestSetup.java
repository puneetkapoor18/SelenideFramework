package tests.base;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.selenide.config.FrameworkConfig;
import org.selenide.config.factory.ConfigFactory;

import static com.codeborne.selenide.Selenide.open;


public class WebTestSetup extends TestSetup{
    private static final FrameworkConfig CONFIG = ConfigFactory.config();
    private static final String URL = CONFIG.webURL();

    @BeforeEach
    void setup(){
        Configuration.headless = false;
        open(URL);
    }
}
