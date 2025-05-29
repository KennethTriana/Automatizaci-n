package co.com.AutoLGC.questions;

import co.com.AutoLGC.userinterface.validaciondatoslogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static jxl.biff.FormatRecord.logger;

public class ValidacionPerfil implements Question<Boolean> {

    public static ValidacionPerfil validacionPerfil() {
        return new ValidacionPerfil();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(validaciondatoslogin.INPUT_PERFIL).viewedBy(actor).asString();
            return "Perfil".equals(texto);
        } catch (Exception e) {
            logger.info("No se encontró el texto o hubo otro error", e);
            return false;
        }
    }
}