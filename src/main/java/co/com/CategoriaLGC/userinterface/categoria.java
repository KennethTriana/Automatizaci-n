package co.com.CategoriaLGC.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class categoria extends PageObject {
    public static Target BTN_MENU = Target.the("Boton de menu").located(By.xpath("//*[@id=\"root\"]/header/div/button"));

    public static Target BTN_CATEGORIA = Target.the("Boton de categoria").located(By.xpath("//a[@href='/Categoria' and contains(@class, 'MuiListItem-root')]"));

    public static  Target BTN_PANTALLA = Target.the("Pantalla").located(By.xpath("/html/body/div[2]/div[1]"));

    public static Target INPUT_NOMBRE = Target.the("Ingreso nombre de la categoria").located(By.xpath("//*[@id=\"root\"]/div/div/form/input"));

    public static Target BTN_AGREGAR_CATEGORIA = Target.the("Botón agregar categoria").located(By.xpath("//*[@id=\"root\"]/div/div/form/button"));

    public static Target MENSAJE_CATEGORIA = Target.the("Campo de validación").located(By.xpath("//*[@id=\"root\"]/header/div/h6"));

    public static Target MENSAJE_CATEGORIA_2 = Target.the("Campo de validación").located(By.xpath("//*[@id=\"root\"]/div/div/h2"));

    public static Target MENSAJE_CATEGORIA_3 = Target.the("Campo de validación").located(By.xpath("//*[@id=\"root\"]/div/div/form/button"));


}


