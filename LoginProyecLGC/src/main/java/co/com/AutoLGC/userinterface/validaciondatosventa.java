package co.com.AutoLGC.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class validaciondatosventa {
    public static Target INPUT_VENTA = Target.the("CAMPO DE VALIDACION EXITOSO")
            .located(By.xpath("//*[@id=\"root\"]/div/div/div/h1"));
}