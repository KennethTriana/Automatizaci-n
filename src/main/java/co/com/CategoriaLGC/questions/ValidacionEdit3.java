package co.com.CategoriaLGC.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static co.com.CategoriaLGC.userinterface.categoria2.MENSAJE_CATEGORIA_EDIT_3;
import static jxl.biff.FormatRecord.logger;

public class ValidacionEdit3 implements Question<Boolean> {
    public static ValidacionEdit3 validacionEdit3() {
        return new ValidacionEdit3();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String boton = Text.of(MENSAJE_CATEGORIA_EDIT_3).viewedBy(actor).asString();
            return "Actualizar Categoría".equals(boton);
        } catch (Exception e) {
            logger.info(" No se encontro el texto vuelva a revisar el codigo por algun error");
            return false;
        }
    }
}
