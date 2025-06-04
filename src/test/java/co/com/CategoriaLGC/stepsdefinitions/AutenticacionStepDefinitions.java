package co.com.CategoriaLGC.stepsdefinitions;

import co.com.CategoriaLGC.models.CredencialesInicioSesion;
import co.com.CategoriaLGC.questions.ValidacionInicioSesion;
import co.com.CategoriaLGC.questions.ValidacionInicioSesion2;
import co.com.CategoriaLGC.questions.ValidacionInicioSesion3;
import co.com.CategoriaLGC.tasks.AbrirPagina;
import co.com.CategoriaLGC.tasks.Autenticarse;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticacionStepDefinitions {

    @Dado("^que el usuario se encuentra en la pagina de inicio de sesion.$")
    public void queElUsuarioSeEncuentraEnLaPaginaDeinicioSesion() {
        theActorInTheSpotlight().wasAbleTo(AbrirPagina.lapagina());
    }

    @Cuando("^ingrese las credenciales corretamente \\(correo y contrasena\\).$")
    public void ingreseLasCredencialesCorrectamenteCorreoyContrasena(List<CredencialesInicioSesion> credenciales) {
        theActorInTheSpotlight().attemptsTo(Autenticarse.aute(credenciales));
    }

    @Entonces("^se debe verificar que el usuario haya sido autenticado correctamente.$")
    public void seDebeVerificarQueElUsuarioHayaSidoAutenticadoCorrectamente() {
        theActorInTheSpotlight().should(seeThat(ValidacionInicioSesion.validacionInicioSesion()));
    }
}