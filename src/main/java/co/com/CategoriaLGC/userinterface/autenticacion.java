package co.com.CategoriaLGC.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class autenticacion extends PageObject {
    public static Target INPUT_INICIO_SESION = Target.the("Ingreso Email Inicio Sesion").located(By.xpath("//*[@id=\"root\"]/div/div/form/div[1]/input"));
    public static Target INPUT_CONTRASEÑA = Target.the("Ingreso Contraseña Inicio Sesion").located(By.xpath("//*[@id=\"root\"]/div/div/form/div[2]/input"));
    public static Target BTN_SUBMIT_INICIAR_SESION = Target.the("Botón De Ingreso Inicio Sesion").located(By.xpath("//*[@id=\"root\"]/div/div/form/button"));
    public static Target MENSAJE = Target.the("Campo de validación").located(By.xpath("//*[@id=\"root\"]/div/div/div/h1"));
    public static Target MENSAJE_LOGIN = Target.the("Campo de validación").located(By.xpath("//*[@id=\"root\"]/header/div/h6"));
    public static Target MENSAJE_LOGIN_3 = Target.the("Campo de validación").located(By.xpath("//*[@id=\"root\"]/div/div/nav/button"));
}
