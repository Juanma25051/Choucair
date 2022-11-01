package co.com.choucair.certification.PruebaTecnica.stepdefinitions;

import co.com.choucair.certification.PruebaTecnica.model.Person;
import co.com.choucair.certification.PruebaTecnica.questions.AnswerRegister;
import co.com.choucair.certification.PruebaTecnica.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;

public class UtestStepDefinition {
   @Before
    public void newScenario(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^enter in the Utest Web site$")
    public void enterInTheYourStoreWebSite()  {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thepage());
    }


    @When("^complete the first form Tell us about yourself$")
    public void completeTheFirstFormTellUsAboutYourself(List<Person> dataPerson)  {
        OnStage.theActorCalled("Juan").wasAbleTo(FormStep1.WriteData(dataPerson.get(0)));
    }

    @When("^complete the second form Add your address$")
    public void completeTheSecondFormAddYourAddress()  {
        OnStage.theActorCalled("Juan").wasAbleTo(FormStep2.validateData());
    }

    @When("^complete the third form Tell us about your devices$")
    public void completeTheThirdFormTellUsAboutYourDevices(List<Person> dataPerson)  {
         OnStage.theActorCalled("Juan").wasAbleTo(FormStep3.WriteData(dataPerson.get(0)));
    }

    @When("^complete the last form The last step$")
    public void completeTheLastFormTheLastStept(List<Person> dataPerson) {
        OnStage.theActorCalled("Juan").wasAbleTo(FormStep4.WriteData(dataPerson.get(0)));
    }

    @Then("^View the tittle for register in the page$")
    public void viewTheTittleForRegisterInThePage(List<Person> dataPerson)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerRegister.tittle(dataPerson.get(0))));
    }
}
