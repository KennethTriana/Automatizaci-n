package co.com.CategoriaLGC.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.CategoriaLGC.userinterface.categoria.MENSAJE_CATEGORIA_2;
import static jxl.biff.FormatRecord.logger;

public class ValidacionCategoria2 implements Question<Boolean> {
    public static ValidacionCategoria2 validacionCategoria2() {
        return new ValidacionCategoria2();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(MENSAJE_CATEGORIA_2).viewedBy(actor).asString();
            return "Administrar Categorías".equals(texto);
        } catch (Exception e) {
            logger.info(" No se encontro el texto vuelva a revisar el codigo por algun error");
            return false;
        }
    }
}
