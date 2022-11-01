package co.com.choucair.certification.PruebaTecnica.tasks;

import co.com.choucair.certification.PruebaTecnica.model.Person;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.choucair.certification.PruebaTecnica.userinterface.UtestFormStep4.*;


public class FormStep4 implements Task {

    private Person dataPerson;

    public FormStep4(Person dataPerson) {
        this.dataPerson = dataPerson;
    }
    public static FormStep4 WriteData(Person dataPerson){
        return Tasks.instrumented(FormStep4.class,dataPerson);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataPerson.getPassword()).into(INPUT_PASSWORD),
                Enter.theValue(dataPerson.getConfirmPassword()).into(INPUT_CONFIRM_PASSWORD),
                Click.on(CHECKBOX_STAY_INFORMED),
                Click.on(CHECKBOX_TERMS_OF_USE),
                Click.on(CHECKBOX_PRIVACY),
                Click.on(BUTTON_COMPLETE));
    }
}