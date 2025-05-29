package co.com.AutoLGC.tasks;

import co.com.AutoLGC.models.CredencialesVenta;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.AutoLGC.userinterface.venta.*;


public class Vender implements Task {

    private List<CredencialesVenta> credenciales;


    public Vender(List<CredencialesVenta> credenciales){
        this.credenciales = credenciales;
    }

    public static Vender aute(List<CredencialesVenta> credenciales){
        return Instrumented.instanceOf(Vender.class).withProperties(credenciales);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_MENU),
                Click.on(BTN_VENTAS),
                Click.on(BTN_PANTALLA),
                Click.on(INPUT_NOMBRE),
                Enter.theValue(credenciales.get(0).getNombre()).into(INPUT_NOMBRE),
                Click.on(INPUT_CANTIDAD),
                Enter.theValue(credenciales.get(0).getCantidad()).into(INPUT_CANTIDAD),
                Click.on(BTN_VENTA),
                Click.on(BTN_MENU),
                Click.on(BTN_INVENTARIO),
                Click.on(BTN_PANTALLA)
        );
    }
}