package co.com.AutoLGC.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class validaciondatoslogin {
    public static Target INPUT_PERFIL = Target.the("CAMPO DE VALIDACION EXITOSO")
            .located(By.xpath("//*[@id=\"root\"]/div/div/div/h1"));
}