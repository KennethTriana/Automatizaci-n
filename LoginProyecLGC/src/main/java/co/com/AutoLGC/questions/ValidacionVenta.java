package co.com.AutoLGC.questions;

import co.com.AutoLGC.userinterface.validaciondatosventa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static jxl.biff.FormatRecord.logger;

public class ValidacionVenta implements Question<Boolean> {

    public static ValidacionVenta validacionVenta() {
        return new ValidacionVenta();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(validaciondatosventa.INPUT_VENTA).viewedBy(actor).asString();
            return "Lista de Productos".equals(texto);
        } catch (Exception e) {
            logger.info("No se encontró el texto o hubo otro error", e);
            return false;
        }
    }
}