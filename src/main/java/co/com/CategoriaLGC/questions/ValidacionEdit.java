package co.com.CategoriaLGC.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.CategoriaLGC.userinterface.categoria2.MENSAJE_CATEGORIA_EDIT;
import static jxl.biff.FormatRecord.logger;

public class ValidacionEdit implements Question<Boolean> {
    public static ValidacionEdit validacionEdit() {
        return new ValidacionEdit();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(MENSAJE_CATEGORIA_EDIT).viewedBy(actor).asString();
            return "Sistema de Inventario LGC".equals(texto);
        } catch (Exception e) {
            logger.info(" No se encontro el texto vuelva a revisar el codigo por algun error");
            return false;
        }
    }
}
