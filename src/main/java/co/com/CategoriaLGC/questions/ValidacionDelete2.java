package co.com.CategoriaLGC.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.CategoriaLGC.userinterface.categoria3.MENSAJE_DELETE_2;
import static jxl.biff.FormatRecord.logger;

public class ValidacionDelete2 implements Question<Boolean> {
    public static ValidacionDelete2 validacionDelete2() {
        return new ValidacionDelete2();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(MENSAJE_DELETE_2).viewedBy(actor).asString();
            return "Administrar Categorías".equals(texto);
        } catch (Exception e) {
            logger.info(" No se encontro el texto vuelva a revisar el codigo por algun error");
            return false;
        }
    }
}
