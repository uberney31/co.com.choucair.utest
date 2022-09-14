package co.com.choucair.utest.tasks;

import co.com.choucair.utest.model.DataFormRegister;
import co.com.choucair.utest.userinterface.LocatorUtestFirstStep;
import co.com.choucair.utest.userinterface.LocatorUtestSecondStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.utest.userinterface.LocatorUtestSecondStep.*;

public class SecondStep implements Task {
    private List<DataFormRegister> data;
    public SecondStep (List<DataFormRegister>data){
        this.data=data;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TEXT_CITY));
        actor.attemptsTo(Clear.field(TEXT_CITY));
        actor.attemptsTo(Enter.keyValues(data.get(0).getCity()).into(TEXT_CITY));
        actor.attemptsTo(Enter.keyValues(Keys.ARROW_DOWN).into(TEXT_CITY));
        actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(TEXT_CITY));

        actor.attemptsTo(Click.on(ZIP_CODE));
        actor.attemptsTo(Clear.field(ZIP_CODE));
        actor.attemptsTo(Enter.theValue(data.get(0).getZipCode()).into(ZIP_CODE));

        actor.attemptsTo(Click.on(BUTTON_NEXT_THIRD));
    }
    public static SecondStep fillForm(List<DataFormRegister>data){

        return Tasks.instrumented(SecondStep.class,data);
    }
}
