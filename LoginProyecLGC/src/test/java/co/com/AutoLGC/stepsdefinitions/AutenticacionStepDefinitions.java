package co.com.AutoLGC.stepsdefinitions;

import co.com.AutoLGC.models.CredencialesInicioSesion;
import co.com.AutoLGC.questions.ValidacionPerfil;
import co.com.AutoLGC.tasks.AbrirPagina;
import co.com.AutoLGC.tasks.Autenticarse;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticacionStepDefinitions {
    @Dado("^que el usuario se encuentra en la pagina de inicio de sesion del sistema de inventario LGC$")
    public void queElUsuarioSeEncuentraEnLaPaginaDeInicioDeSesionDelSistemaDeInventarioLGC() {
            theActorInTheSpotlight().wasAbleTo(AbrirPagina.lapagina());
    }


    @Cuando("^ingrese las credenciales correctas \\(usuario y contrasena\\)$")
    public void ingreseLasCredencialesCorrectasUsuarioYContrasena(List<CredencialesInicioSesion> credenciales) {
        theActorInTheSpotlight().attemptsTo(Autenticarse.aute(credenciales));
    }

    @Entonces("^se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina de usuario del sistema de inventario LGC$")
    public void seDebeVerificarQueElUsuarioHayaSidoAutenticadoCorrectamenteYRedirigidoASuPaginaDeUsuarioDelSistemaDeInventarioLGC() {
        theActorInTheSpotlight().should(seeThat(ValidacionPerfil.validacionPerfil()));
    }

}
