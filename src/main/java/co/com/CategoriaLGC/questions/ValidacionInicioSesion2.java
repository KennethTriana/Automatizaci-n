package co.com.CategoriaLGC.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.CategoriaLGC.userinterface.autenticacion.MENSAJE_LOGIN;
import static jxl.biff.FormatRecord.logger;

public class ValidacionInicioSesion2 implements Question<Boolean> {
    public static ValidacionInicioSesion2 validacionInicioSesion2() {
        return new ValidacionInicioSesion2();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(MENSAJE_LOGIN).viewedBy(actor).asString();
            return "Sistema de Inventario LGC".equals(texto);
        } catch (Exception e) {
            logger.info(" No se encontro el texto vuelva a revisar el codigo por algun error");
            return false;
        }
    }
}