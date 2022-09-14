package co.com.choucair.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocatorUtestFourStep {
    public static final Target TEXT_PASSWORD=Target.the("password").located(By.id("password"));
    public static final Target TEXT_CONFIRMATION_PASSWORD=Target.the("password").located(By.id("confirmPassword"));


    public static final Target TERMS_USER = Target.the("TERMS OF USER").located(By.id("termOfUse"));
    public static final Target PRIVACITY= Target.the("PRIVACITY")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));



    public static final Target BUTTON_END=Target.the("BUTTON END REGISTER").located(By.id("laddaBtn"));
}
