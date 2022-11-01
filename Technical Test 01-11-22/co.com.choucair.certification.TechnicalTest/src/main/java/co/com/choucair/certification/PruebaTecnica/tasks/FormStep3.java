package co.com.choucair.certification.PruebaTecnica.tasks;

import co.com.choucair.certification.PruebaTecnica.model.Person;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import static co.com.choucair.certification.PruebaTecnica.userinterface.UtestFormStep3.*;

public class FormStep3 implements Task {

    private Person dataPerson;

    public FormStep3(Person dataPerson) {
        this.dataPerson = dataPerson;
    }
    public static FormStep3 WriteData(Person dataPerson){
        return Tasks.instrumented(FormStep3.class,dataPerson);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SPAN_BRAND),
                Enter.theValue(dataPerson.getMobile()).into(SELECT_BRAND));
        actor.attemptsTo((Hit.the(Keys.ENTER).into(SELECT_BRAND)));
        actor.attemptsTo(Click.on(SPAN_A_MODEL),
                Enter.theValue(dataPerson.getModel()).into(SELECT_A_MODEL));
        actor.attemptsTo((Hit.the(Keys.ENTER).into(SELECT_A_MODEL)));
        actor.attemptsTo(Click.on(SPAN_OS),
                Enter.theValue(dataPerson.getOperatingSystem()).into(SELECT_OS));
        actor.attemptsTo((Hit.the(Keys.ENTER).into(SELECT_OS)));
        actor.attemptsTo(Click.on(BUTTON_NEXT_LAST_STEP));
    }
}