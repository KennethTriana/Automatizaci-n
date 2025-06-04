package co.com.CategoriaLGC.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.CategoriaLGC.userinterface.autenticacion.MENSAJE;
import static jxl.biff.FormatRecord.logger;

public class ValidacionInicioSesion implements Question<Boolean> {
    public static ValidacionInicioSesion validacionInicioSesion() {
        return new ValidacionInicioSesion();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(MENSAJE).viewedBy(actor).asString();
            return "Perfil".equals(texto);
        } catch (Exception e) {
            logger.info(" No se encontro el texto vuelva a revisar el codigo por algun error");
            return false;
        }
    }
}
