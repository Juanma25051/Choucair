package co.com.choucair.certification.PruebaTecnica.tasks;

import static co.com.choucair.certification.PruebaTecnica.userinterface.UtestFormStep1.*;
import static co.com.choucair.certification.PruebaTecnica.userinterface.UtestHomePage.*;
import co.com.choucair.certification.PruebaTecnica.model.Person;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class FormStep1 implements Task {

    private Person dataPerson;

    public FormStep1(Person dataPerson) {
        this.dataPerson = dataPerson;
    }
    public static FormStep1 WriteData(Person dataPerson){
        return Tasks.instrumented(FormStep1.class,dataPerson);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_REGISTER),
                Enter.theValue(dataPerson.getFirstName()).into(INPUT_FIRST_NAME),
                Enter.theValue(dataPerson.getLastName()).into(INPUT_LAST_NAME),
                Enter.theValue(dataPerson.getE_mail()).into(INPUT_EMAIL));
        actor.attemptsTo(Click.on(SELECT_MONTH),
                SelectFromOptions.byVisibleText(dataPerson.getMonthBirth()).from(SELECT_MONTH));
        actor.attemptsTo(Click.on(SELECT_DAY),
                SelectFromOptions.byVisibleText(dataPerson.getDayBirth()).from(SELECT_DAY));
        actor.attemptsTo(Click.on(SELECT_YEAR),
                SelectFromOptions.byValue(dataPerson.getYearBirth()).from(SELECT_YEAR),
                Click.on(BUTTON_NEXT_LOCATION));
    }
}
