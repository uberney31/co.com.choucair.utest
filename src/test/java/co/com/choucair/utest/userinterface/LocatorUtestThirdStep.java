package co.com.choucair.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocatorUtestThirdStep {
    public static final Target LIST_YOUR_COMPUTER= Target.the("Your computer").located(By.name("osId"));
    public static final Target TEXT_YOUR_COMPUTER= Target.the("Your computer").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));


    public static final Target LIST_VERSION=Target.the("Lista de versiones").located(By.name("osVersionId"));
    public static final Target TEXT_VERSION=Target.the("Aqui elegimos la versiones")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));


    public static final Target LIST_LANGUAGUE=Target.the("lista de lenguajes").located(By.name("osLanguageId"));
    public static final Target TEXT_LANGUAGUE=Target.the("Aqui elegimos el lenguaje")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));


    public static final Target LIST_YOUR_MOVIL_DEVICE=Target.the("List movil").located(By.name("handsetMakerId"));
    public static final Target TEXT_YOUR_MOVIL_DEVICE=Target.the("Your movil")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));


    public static final Target LIST_MODEL=Target.the("List model").located(By.name("handsetModelId"));
    public static final Target TEXT_MODEL=Target.the("Your model")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));


    public static final Target LIST_OPERATING_SYSTEM=Target.the("List de sistema").located(By.name("handsetOSId"));
    public static final Target TEXT_OPERATING_SYSTEM=Target.the("S.O cel")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target BUTTON_FOURTH=Target.the("siguiente paso")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));

}
