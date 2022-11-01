 package co.com.choucair.certification.PruebaTecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFormStep3 {

    public static final Target SPAN_BRAND= Target.the("Span mobile device").located(By.xpath("//span[@aria-label=\"Select Brand\"]"));
    public static final Target SELECT_BRAND= Target.the("Select mobile device").located(By.xpath("//input[@placeholder=\"Select Brand\"]"));
    public static final Target SPAN_A_MODEL= Target.the("Span mobile model").located(By.xpath("//span[@aria-label=\"Select a Model\"]"));
    public static final Target SELECT_A_MODEL= Target.the("Select mobile model").located(By.xpath("//input[@placeholder=\"Select a Model\"]"));
    public static final Target SPAN_OS= Target.the("Span mobile OS").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[1]/div[1]"));
    public static final Target SELECT_OS= Target.the("Select OS").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[1]/input[1]"));
    public static final Target BUTTON_NEXT_LAST_STEP= Target.the("Button next to last step").located(By.xpath("//a[@aria-label=\"Next - final step\"]"));
}
