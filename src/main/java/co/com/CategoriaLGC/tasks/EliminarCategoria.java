package co.com.CategoriaLGC.tasks;

import co.com.CategoriaLGC.models.CredencialesCategoria;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.CategoriaLGC.userinterface.categoria3.*;

public class EliminarCategoria implements Task {

    private List<CredencialesCategoria> credenciales;

    public EliminarCategoria(List<CredencialesCategoria> credenciales) { this.credenciales = credenciales; }

    public static EliminarCategoria aute(List<CredencialesCategoria> credenciales){
        return Instrumented.instanceOf(EliminarCategoria.class).withProperties(credenciales);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_MENU),
                Click.on(BTN_CATEGORIA),
                Click.on(BTN_PANTALLA),
                Click.on(BTN_ELIMINAR)
        );
    }
}
