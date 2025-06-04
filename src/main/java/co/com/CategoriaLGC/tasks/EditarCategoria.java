package co.com.CategoriaLGC.tasks;

import co.com.CategoriaLGC.models.CredencialesCategoria;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.CategoriaLGC.userinterface.categoria2.*;

public class EditarCategoria implements Task {

    private List<CredencialesCategoria> credenciales;

    public EditarCategoria(List<CredencialesCategoria> credenciales) { this.credenciales = credenciales; }

    public static EditarCategoria aute(List<CredencialesCategoria> credenciales){
        return Instrumented.instanceOf(EditarCategoria.class).withProperties(credenciales);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_MENU),
                Click.on(BTN_CATEGORIA),
                Click.on(BTN_PANTALLA),
                Click.on(BTN_EDITAR),
                Click.on(INPUT_NOMBRE),
                Enter.theValue(credenciales.get(0).getNombreCategoria()).into(INPUT_NOMBRE),
                Click.on(BTN_ACTUALIZAR_CATEGORIA)
        );
    }
}
