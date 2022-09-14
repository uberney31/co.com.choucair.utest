package co.com.choucair.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocatorUtestFirstStep {
    public static final Target FIRTS_NAME=Target.the("Firts name").located(By.id("firstName"));
    public static final Target SECOND_NAME=Target.the("Second name").located(By.id("lastName"));
    public static final Target EMAIL=Target.the("EMAIL").located(By.id("email"));
    public static final Target LIST_MONTH=Target.the("MONTH BIRTHDAY").located(By.id("birthMonth"));
    public static final Target LIST_DAY=Target.the("Day BIRTHDAY").located(By.id("birthDay"));
    public static final Target LIST_YEAR=Target.the("Year BIRTHDAY").located(By.id("birthYear"));

    public static final Target BUTTON_NEXT_STEP=Target.the("Button Next")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a/span"));

}
