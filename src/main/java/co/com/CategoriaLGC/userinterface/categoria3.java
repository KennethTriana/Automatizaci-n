package co.com.CategoriaLGC.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class categoria3 extends PageObject {
    public static Target BTN_MENU = Target.the("Boton de menu").located(By.xpath("//*[@id=\"root\"]/header/div/button"));

    public static Target BTN_CATEGORIA = Target.the("Boton de categoria").located(By.xpath("//a[@href='/Categoria' and contains(@class, 'MuiListItem-root')]"));

    public static  Target BTN_PANTALLA = Target.the("Pantalla").located(By.xpath("/html/body/div[2]/div[1]"));

    public static Target BTN_ELIMINAR = Target.the("Eliminar categoria").located(By.xpath("//*[@id=\"root\"]/div/div/ul/li/button[2]"));

    public static Target MENSAJE_DELETE = Target.the("Validacion exitosa").located(By.xpath("//*[@id=\"root\"]/header/div/h6"));

    public static Target MENSAJE_DELETE_2 = Target.the("Campo de validación").located(By.xpath("//*[@id=\"root\"]/div/div/h2"));

    public static Target MENSAJE_DELETE_3 = Target.the("Campo de validación").located(By.xpath("//*[@id=\"root\"]/div/div/form/button"));


}