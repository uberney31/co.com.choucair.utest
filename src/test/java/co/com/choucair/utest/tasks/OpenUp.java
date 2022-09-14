package co.com.choucair.utest.tasks;

import co.com.choucair.utest.stepdefinitions.ComunityUtestStepsDefinitions;
import co.com.choucair.utest.userinterface.ComunityUtestPage;
import co.com.choucair.utest.userinterface.LocatorUtestOpenUp;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private ComunityUtestPage comunityUtestPage;
    public static OpenUp thepage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(comunityUtestPage));
        actor.attemptsTo(Click.on(LocatorUtestOpenUp.JOIN_TODAY));
    }
}
