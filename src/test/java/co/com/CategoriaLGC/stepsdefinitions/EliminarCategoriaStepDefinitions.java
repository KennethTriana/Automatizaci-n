package co.com.CategoriaLGC.stepsdefinitions;

import co.com.CategoriaLGC.models.CredencialesCategoria;
import co.com.CategoriaLGC.questions.ValidacionDelete;
import co.com.CategoriaLGC.questions.ValidacionDelete2;
import co.com.CategoriaLGC.questions.ValidacionDelete3;
import co.com.CategoriaLGC.tasks.AbrirPagCategoria;
import co.com.CategoriaLGC.tasks.EliminarCategoria;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EliminarCategoriaStepDefinitions {
    @Dado("^que el usuario se encuentra en la pagina de inicio de sesion de la aplicacion.$")
    public void queElUsuarioSeEncuentraEnLaPaginaDeIniciodeSesiondelaAplicacion() {
        theActorInTheSpotlight().wasAbleTo(AbrirPagCategoria.lapagina());
    }

    @Cuando("^ingrese credenciales correctas para eliminar la categoria.$")
    public void ingreseLasCredencialesCorrectasparaEliminarlaCategoria(List<CredencialesCategoria> credenciales) {
        theActorInTheSpotlight().attemptsTo(EliminarCategoria.aute(credenciales));
    }

    @Entonces("^se debe verificar que el usuario haya eliminado la categoria en el Sistema de Inventario LGC.$")
    public void seDebeVerificarQueElUsuarioHayaEliminadolaCategoriaenelSistemadeInventarioLGC() {
        theActorInTheSpotlight().should(seeThat(ValidacionDelete.validacionDelete()));
    }
}
