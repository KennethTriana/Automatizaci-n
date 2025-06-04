package co.com.CategoriaLGC.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;



import static co.com.CategoriaLGC.userinterface.autenticacion.MENSAJE_LOGIN_3;
import static jxl.biff.FormatRecord.logger;

public class ValidacionInicioSesion3 implements Question<Boolean> {
    public static ValidacionInicioSesion3 validacionInicioSesion3() {
        return new ValidacionInicioSesion3();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String boton = Text.of(MENSAJE_LOGIN_3).viewedBy(actor).asString();
            return "Cerrar sesión".equals(boton);
        } catch (Exception e) {
            logger.info(" No se encontro el texto vuelva a revisar el codigo por algun error");
            return false;
        }
    }
}
