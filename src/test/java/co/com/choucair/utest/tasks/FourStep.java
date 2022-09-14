package co.com.choucair.utest.tasks;

import co.com.choucair.utest.model.DataFormRegister;
import co.com.choucair.utest.userinterface.LocatorUtestFourStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.utest.userinterface.LocatorUtestFourStep.*;

public class FourStep implements Task {
    private List<DataFormRegister> data;
    public FourStep (List<DataFormRegister>data)
    {
        this.data=data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Enter.theValue(data.get(0).getPassword()).into(LocatorUtestFourStep.TEXT_PASSWORD));
    actor.attemptsTo(Enter.theValue(data.get(0).getPassword()).into(LocatorUtestFourStep.TEXT_CONFIRMATION_PASSWORD));

    actor.attemptsTo(Click.on(TERMS_USER));
    actor.attemptsTo(Click.on(PRIVACITY));

    actor.attemptsTo(Click.on(BUTTON_END));


    }
    public static FourStep fillForm(List<DataFormRegister>data){

        return Tasks.instrumented(FourStep.class,data);
    }
}
