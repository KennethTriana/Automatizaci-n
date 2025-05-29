package co.com.AutoLGC.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class autenticacion extends PageObject {
    public static Target INPUT_USUARIO = Target.the(" Ingreso del Usuario").located(By.xpath("//*[@id=\"root\"]/div/div/form/div[1]/input"));
    public static Target INPUT_CLAVE = Target.the("Ingreso del password").located(By.xpath("//*[@id=\"root\"]/div/div/form/div[2]/input"));
    public static Target BTN_INICIOSESION = Target.the("Boton inicio sesion").located(By.xpath("//*[@id=\"root\"]/div/div/form/button"));

}