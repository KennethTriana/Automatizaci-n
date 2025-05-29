package co.com.AutoLGC.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class venta extends PageObject {
    public static Target BTN_MENU = Target.the("Boton de menu").located(By.xpath("//*[@id=\"root\"]/header/div/button"));
    public static Target BTN_VENTAS = Target.the("Boton ventas").located(By.xpath("/html/body/div[2]/div[3]/div/ul/a[3]"));
    public static Target BTN_PANTALLA = Target.the("Toca pantalla").located(By.xpath("/html/body/div[2]/div[1]"));
    public static Target INPUT_NOMBRE = Target.the(" Ingreso del nombre del producto").located(By.xpath("//*[@id=\"root\"]/div/div/form/div[1]/input"));
    public static Target INPUT_CANTIDAD = Target.the("Ingreso de la cantidad a vender").located(By.xpath("//*[@id=\"root\"]/div/div/form/div[2]/input"));
    public static Target BTN_VENTA = Target.the("Boton para vender").located(By.xpath("//*[@id=\"root\"]/div/div/form/button"));
    public static Target BTN_INVENTARIO = Target.the("Boton inventario").located(By.xpath("/html/body/div[2]/div[3]/div/ul/a[6]/div/span"));

}