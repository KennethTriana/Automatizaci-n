package co.com.CategoriaLGC.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.CategoriaLGC.userinterface.categoria3.MENSAJE_DELETE_3;
import static jxl.biff.FormatRecord.logger;

public class ValidacionDelete3 implements Question<Boolean> {
    public static ValidacionDelete3 validacionDelete3() {
        return new ValidacionDelete3();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String boton = Text.of(MENSAJE_DELETE_3).viewedBy(actor).asString();
            return "Agregar Categoría".equals(boton);
        } catch (Exception e) {
            logger.info(" No se encontro el texto vuelva a revisar el codigo por algun error");
            return false;
        }
    }
}