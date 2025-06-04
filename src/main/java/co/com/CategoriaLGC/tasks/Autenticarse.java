package co.com.CategoriaLGC.tasks;

import co.com.CategoriaLGC.models.CredencialesInicioSesion;
import co.com.CategoriaLGC.userinterface.autenticacion;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.CategoriaLGC.userinterface.autenticacion.*;

public class Autenticarse implements Task {

    private List<CredencialesInicioSesion> credenciales;


    public  Autenticarse(List<CredencialesInicioSesion> credenciales){
        this.credenciales = credenciales;
    }

    public static Autenticarse aute(List<CredencialesInicioSesion> credenciales){
        return Instrumented.instanceOf(Autenticarse.class).withProperties(credenciales);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_INICIO_SESION),
                Enter.theValue(credenciales.get(0).getEmail()).into(INPUT_INICIO_SESION),
                Click.on(INPUT_CONTRASEÑA),
                Enter.theValue(credenciales.get(0).getContrasena()).into(INPUT_CONTRASEÑA),
                Click.on(autenticacion.BTN_SUBMIT_INICIAR_SESION)
        );
    }
}
