package co.com.choucair.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocatorUtestSecondStep {

    public static final Target TEXT_CITY=Target.the("text city").located(By.id("city"));
    public static final Target ZIP_CODE =Target.the("POSTAL ZIP").located(By.id("zip"));
   public static final Target BUTTON_NEXT_THIRD=Target.the("Button Next")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));
}
