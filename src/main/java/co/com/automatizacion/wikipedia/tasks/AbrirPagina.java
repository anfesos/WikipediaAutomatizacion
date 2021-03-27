package co.com.automatizacion.wikipedia.tasks;

import co.com.automatizacion.wikipedia.exceptions.AbrirPaginaException;
import co.com.automatizacion.wikipedia.userinterface.PaginaInicial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirPagina implements Task {

    PaginaInicial google;

    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            actor.wasAbleTo(Open.browserOn(google));
        }catch (Exception e){
            throw new AbrirPaginaException(AbrirPaginaException.ERROR_ABRIENDO_PAGINA,e);
        }
    }

    public static AbrirPagina deNavegacion(){
        return instrumented(AbrirPagina.class);
    }
}
