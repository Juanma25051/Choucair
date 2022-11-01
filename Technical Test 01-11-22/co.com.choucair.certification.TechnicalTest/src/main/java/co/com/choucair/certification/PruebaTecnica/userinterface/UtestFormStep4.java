 package co.com.choucair.certification.PruebaTecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

 public class UtestFormStep4 {

     public static final Target INPUT_PASSWORD= Target.the("input to write the password").located(By.id("password"));
     public static final Target INPUT_CONFIRM_PASSWORD= Target.the("input to write the password").located(By.id("confirmPassword"));
     public static final Target CHECKBOX_STAY_INFORMED= Target.the("Check to receive information").located(By.xpath("//input[@name=\"newsletterOptIn\"]"));
     public static final Target CHECKBOX_TERMS_OF_USE= Target.the("Check to confirm the terms of use").located(By.xpath("//input[@name=\"termOfUse\"]"));
     public static final Target CHECKBOX_PRIVACY= Target.the("Check to confirm the Privacy Policy").located(By.xpath("//input[@name=\"privacySetting\"]"));
     public static final Target BUTTON_COMPLETE= Target.the("Button complete the registration").located(By.xpath("//a[@id='laddaBtn']"));
 }
