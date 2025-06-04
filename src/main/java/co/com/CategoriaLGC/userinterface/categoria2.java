package co.com.CategoriaLGC.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class categoria2 extends PageObject {
    public static Target BTN_MENU = Target.the("Boton de menu").located(By.xpath("//*[@id=\"root\"]/header/div/button"));

    public static Target BTN_CATEGORIA = Target.the("Boton de categoria").located(By.xpath("//a[@href='/Categoria' and contains(@class, 'MuiListItem-root')]"));

    public static  Target BTN_PANTALLA = Target.the("Pantalla").located(By.xpath("/html/body/div[2]/div[1]"));

    public static Target BTN_EDITAR = Target.the("Editar categoria").located(By.xpath("//*[@id=\"root\"]/div/div/ul/li/button[1]"));

    public static Target INPUT_NOMBRE = Target.the("Ingreso nombre de la categoria").located(By.xpath("//*[@id=\"root\"]/div/div/form/input"));

    public static Target BTN_ACTUALIZAR_CATEGORIA = Target.the("Botón agregar categoria").located(By.xpath("//*[@id=\"root\"]/div/div/form/button[1]"));

    public static Target MENSAJE_CATEGORIA_EDIT = Target.the("Validar").located(By.xpath("//*[@id=\"root\"]/header/div/h6"));

    public static Target MENSAJE_CATEGORIA_EDIT_2 = Target.the("Campo de validación").located(By.xpath("//*[@id=\"root\"]/div/div/h2"));

    public static Target MENSAJE_CATEGORIA_EDIT_3 = Target.the("Campo de validación").located(By.xpath("//*[@id=\"root\"]/div/div/form/button[1]"));
}
