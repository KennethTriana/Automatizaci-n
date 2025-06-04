package co.com.CategoriaLGC.tasks;

import co.com.CategoriaLGC.userinterface.CategoriaLGC;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagCategoria implements Task {

    CategoriaLGC categoriaLGC;

    public static AbrirPagCategoria lapagina() { return Tasks.instrumented(AbrirPagCategoria.class);}

    @Override
    public <T extends Actor> void performAs(T actor){ actor.attemptsTo(Open.browserOn(categoriaLGC));}
}
