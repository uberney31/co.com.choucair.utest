package co.com.choucair.utest.stepdefinitions;

import co.com.choucair.utest.model.DataFormRegister;
import co.com.choucair.utest.questions.TheTitle;
import co.com.choucair.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class ComunityUtestStepsDefinitions {
    @Managed(driver="chrome")
    private WebDriver navegador;
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^El usuario debe ingresar a utest$")
    public void elUsuarioDebeIngresarAUtest() {
        OnStage.theActorCalled("Uberney").wasAbleTo(OpenUp.thepage());
    }

    @When("^El usuario completa todos los campos$")
    public void elUsuarioCompletaTodosLosCampos(List<DataFormRegister>data) {
        OnStage.theActorInTheSpotlight().attemptsTo(FirstStep.fillForm(data));
        OnStage.theActorInTheSpotlight().attemptsTo(SecondStep.fillForm(data));
        OnStage.theActorInTheSpotlight().attemptsTo(ThirdStep.fillForm(data));
        OnStage.theActorInTheSpotlight().attemptsTo(FourStep.fillForm(data));
    }

    @Then("^El registro fue completo con un nuevo usuario$")
    public void elRegistroFueCompletoConUnNuevoUsuario(List<DataFormRegister>data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheTitle.is(data)));
    }

}
