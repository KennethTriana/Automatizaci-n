package co.com.AutoLGC.stepsdefinitions;

import co.com.AutoLGC.models.CredencialesVenta;
import co.com.AutoLGC.questions.ValidacionVenta;
import co.com.AutoLGC.tasks.AbrirPagVenta;
import co.com.AutoLGC.tasks.Vender;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class VentaStepDefinitions {
    @Dado("^que el usuario se encuentra en la pagina de usuario del sistema de inventario LGC$")
    public void queElUsuarioSeEncuentraEnLaPaginaDeUsuarioDelSistemaDeInventarioLGC() {
            theActorInTheSpotlight().wasAbleTo(AbrirPagVenta.lapagina());
    }


    @Cuando("^ingrese las credenciales correctas \\(nombre y cantidad\\)$")
    public void IngreseLasCredencialesCorrectasNombreYCantidad(List<CredencialesVenta> credenciales) {
        theActorInTheSpotlight().attemptsTo(Vender.aute(credenciales));
    }

    @Entonces("^se debe verificar que el usuario haya vendido en el sistema de inventario LGC$")
    public void seDebeVerificarQueElUsuarioHayaVendidoEnElSistemaDeInventarioLGC() {
        theActorInTheSpotlight().should(seeThat(ValidacionVenta.validacionVenta()));
    }

}
