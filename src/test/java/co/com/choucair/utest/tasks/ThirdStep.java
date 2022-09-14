package co.com.choucair.utest.tasks;

import co.com.choucair.utest.model.DataFormRegister;
import co.com.choucair.utest.userinterface.LocatorUtestThirdStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.utest.userinterface.LocatorUtestThirdStep.*;

public class ThirdStep implements Task {
    private List<DataFormRegister> data;
    public ThirdStep (List<DataFormRegister>data)
    {
        this.data=data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LIST_YOUR_COMPUTER));
        actor.attemptsTo(Enter.theValue(data.get(0).getYourComputer()).into(TEXT_YOUR_COMPUTER));
        actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(TEXT_YOUR_COMPUTER));

        actor.attemptsTo(Click.on(LIST_VERSION));
        actor.attemptsTo(Enter.theValue(data.get(0).getVersion()).into(TEXT_VERSION));
        actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(TEXT_VERSION));

        actor.attemptsTo(Click.on(LIST_LANGUAGUE));
        actor.attemptsTo(Enter.theValue(data.get(0).getLanguage()).into(TEXT_LANGUAGUE));
        actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(TEXT_LANGUAGUE));

        actor.attemptsTo(Click.on(LIST_YOUR_MOVIL_DEVICE));
        actor.attemptsTo(Enter.theValue(data.get(0).getYourMovileDevice()).into(TEXT_YOUR_MOVIL_DEVICE));
        actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(TEXT_YOUR_MOVIL_DEVICE));

        actor.attemptsTo(Click.on(LIST_MODEL));
        actor.attemptsTo(Enter.theValue(data.get(0).getModelDevice()).into(TEXT_MODEL));
        actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(TEXT_MODEL));

        actor.attemptsTo(Click.on(LIST_OPERATING_SYSTEM));
        actor.attemptsTo(Enter.theValue(data.get(0).getOperatingSystem()).into(TEXT_OPERATING_SYSTEM));
        actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(TEXT_OPERATING_SYSTEM));

        actor.attemptsTo((Click.on(BUTTON_FOURTH)));
    }
    public static ThirdStep fillForm(List<DataFormRegister>data){

        return Tasks.instrumented(ThirdStep.class,data);
    }
}
