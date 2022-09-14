package co.com.choucair.utest.tasks;

import co.com.choucair.utest.model.DataFormRegister;
import co.com.choucair.utest.userinterface.LocatorUtestFirstStep;
import co.com.choucair.utest.userinterface.LocatorUtestOpenUp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.choucair.utest.userinterface.LocatorUtestFirstStep.*;

public class FirstStep implements Task {
    private List<DataFormRegister>data;
    public FirstStep (List<DataFormRegister>data){
        this.data=data;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getFirtsName()).into(LocatorUtestFirstStep.FIRTS_NAME));
        actor.attemptsTo(Enter.theValue(data.get(0).getSecondName()).into(LocatorUtestFirstStep.SECOND_NAME));
        actor.attemptsTo(Enter.theValue(data.get(0).getEmail()).into(LocatorUtestFirstStep.EMAIL));


        actor.attemptsTo(Click.on(LIST_MONTH));
        actor.attemptsTo(SelectFromOptions.byVisibleText(data.get(0).getMonthBirthDay()).from(LIST_MONTH));
        actor.attemptsTo(Click.on(LIST_DAY));
        actor.attemptsTo(SelectFromOptions.byVisibleText(data.get(0).getDayBirthDay()).from(LIST_DAY));
        actor.attemptsTo(Click.on(LIST_YEAR));
        actor.attemptsTo(SelectFromOptions.byVisibleText(data.get(0).getYearBirthDay()).from(LIST_YEAR));

        actor.attemptsTo(Click.on(BUTTON_NEXT_STEP));
    }
    public static FirstStep fillForm(List<DataFormRegister>data){
        return Tasks.instrumented(FirstStep.class,data);
    }
}
