package co.com.choucair.certification.PruebaTecnica.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.choucair.certification.PruebaTecnica.userinterface.UtestFormStep2.*;

public class FormStep2  implements Task {

    public static FormStep2 validateData(){
        return Tasks.instrumented(FormStep2.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_NEXT_DEVICES));
    }
}
