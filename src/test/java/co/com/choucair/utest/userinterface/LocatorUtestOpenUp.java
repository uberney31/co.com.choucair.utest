package co.com.choucair.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocatorUtestOpenUp {

    public static final Target JOIN_TODAY =Target.the("Join Today")
            .located(By.partialLinkText("Join Today"));
}
