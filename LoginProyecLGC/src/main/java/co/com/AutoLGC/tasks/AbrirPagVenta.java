package co.com.AutoLGC.tasks;

import co.com.AutoLGC.userinterface.VentaLGC;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagVenta implements Task {

    VentaLGC VentaLGC;

    public static AbrirPagVenta lapagina(){ return Tasks.instrumented(AbrirPagVenta.class);}
    @Override
    public <T extends Actor> void performAs(T actor){ actor.attemptsTo(Open.browserOn(VentaLGC));}
}