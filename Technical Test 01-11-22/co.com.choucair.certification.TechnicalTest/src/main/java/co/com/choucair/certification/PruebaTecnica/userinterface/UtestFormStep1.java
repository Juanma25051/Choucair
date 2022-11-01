package co.com.choucair.certification.PruebaTecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFormStep1 {
    public static final Target INPUT_FIRST_NAME= Target.the("Input for write the first name").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME= Target.the("Input for write the last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL= Target.the("Input for write the Email").located(By.id("email"));
    public static final Target SELECT_MONTH= Target.the("Select the month of birth").located(By.id("birthMonth"));
    public static final Target SELECT_DAY= Target.the("Select the day of birth").located(By.id("birthDay"));
    public static final Target SELECT_YEAR= Target.the("Select the year of birth").located(By.id("birthYear"));
    public static final Target BUTTON_NEXT_LOCATION= Target.the("Input Next Form (location)").located(By.xpath("//a[@aria-label=\"Next step - define your location\"]"));
}
