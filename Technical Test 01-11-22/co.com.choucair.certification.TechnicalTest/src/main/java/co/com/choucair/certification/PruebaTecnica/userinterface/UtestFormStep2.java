package co.com.choucair.certification.PruebaTecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFormStep2 {

    public static final Target BUTTON_NEXT_DEVICES= Target.the("Input Next Form (location)").located(By.xpath("//a[@aria-label=\"Next step - select your devices\"]"));
}
