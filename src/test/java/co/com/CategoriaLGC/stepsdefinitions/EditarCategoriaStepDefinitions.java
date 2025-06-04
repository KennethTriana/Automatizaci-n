package co.com.CategoriaLGC.stepsdefinitions;

import co.com.CategoriaLGC.models.CredencialesCategoria;
import co.com.CategoriaLGC.questions.ValidacionEdit;
import co.com.CategoriaLGC.questions.ValidacionEdit2;
import co.com.CategoriaLGC.questions.ValidacionEdit3;
import co.com.CategoriaLGC.tasks.AbrirPagCategoria;
import co.com.CategoriaLGC.tasks.EditarCategoria;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EditarCategoriaStepDefinitions {
    @Dado("^que el usuario se encuentra en la pagina de inicio de sesion del aplicativo.$")
    public void queElUsuarioSeEncuentraEnLaPaginaDeIniciodeSesiondelAplicativo() {
        theActorInTheSpotlight().wasAbleTo(AbrirPagCategoria.lapagina());
    }

    @Cuando("^ingrese credenciales correctas para editar la categoria.$")
    public void ingreseLasCredencialesCorrectasparaEditarlaCategoria(List<CredencialesCategoria> credenciales) {
        theActorInTheSpotlight().attemptsTo(EditarCategoria.aute(credenciales));
    }

    @Entonces("^se debe verificar que el usuario haya editado la categoria en el Sistema de Inventario LGC.$")
    public void seDebeVerificarQueElUsuarioHayaEditadolaCategoriaenelSistemadeInventarioLGC() {
        theActorInTheSpotlight().should(seeThat(ValidacionEdit.validacionEdit()));
    }
}
