package co.com.CategoriaLGC.stepsdefinitions;

import co.com.CategoriaLGC.models.CredencialesCategoria;
import co.com.CategoriaLGC.questions.ValidacionCategoria;
import co.com.CategoriaLGC.questions.ValidacionCategoria2;
import co.com.CategoriaLGC.questions.ValidacionCategoria3;
import co.com.CategoriaLGC.tasks.AbrirPagCategoria;
import co.com.CategoriaLGC.tasks.AgregarCategoria;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CategoriaStepDefinitions {
    @Dado("^que el usuario se encuentra en la pagina de inicio de sesion del Sistema de Inventario LGC.$")
    public void queElUsuarioSeEncuentraEnLaPaginaDeIniciodeSesiondelSistemadeInventarioLGC() {
        theActorInTheSpotlight().wasAbleTo(AbrirPagCategoria.lapagina());
    }

    @Cuando("^ingrese credenciales correctas.$")
    public void ingreseLasCredencialesCorrectasNombreCategoria(List<CredencialesCategoria> credenciales) {
        theActorInTheSpotlight().attemptsTo(AgregarCategoria.aute(credenciales));
    }

    @Entonces("^se debe verificar que el usuario haya creado la categoria en el Sistema de Inventario LGC.$")
    public void seDebeVerificarQueElUsuarioHayaCreadolaCategoriaenelSistemadeInventarioLGC() {
        theActorInTheSpotlight().should(seeThat(ValidacionCategoria.validacionCategoria()));
    }
}
