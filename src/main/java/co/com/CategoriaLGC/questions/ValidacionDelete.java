package co.com.CategoriaLGC.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.CategoriaLGC.userinterface.categoria3.MENSAJE_DELETE;
import static jxl.biff.FormatRecord.logger;

public class ValidacionDelete implements Question<Boolean> {
    public static ValidacionDelete validacionDelete() {
        return new ValidacionDelete();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(MENSAJE_DELETE).viewedBy(actor).asString();
            return "Sistema de Inventario LGC".equals(texto);
        } catch (Exception e) {
            logger.info(" No se encontro el texto vuelva a revisar el codigo por algun error");
            return false;
        }
    }
}
