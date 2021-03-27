package co.com.automatizacion.wikipedia.tasks;

import co.com.automatizacion.wikipedia.exceptions.IngresarPalabraException;
import co.com.automatizacion.wikipedia.interactions.EsperarUnTiempo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.automatizacion.wikipedia.exceptions.IngresarPalabraException.ERROR_INGRESANDO_PALABRA;
import static co.com.automatizacion.wikipedia.interactions.EsperarUnTiempo.DOSMIL_MILISEGUNDOS;
import static co.com.automatizacion.wikipedia.userinterface.PaginaInicial.BUSCADOR_INPUT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarPalabra implements Task {

    private String palabra;

    public IngresarPalabra(String palabra){
        this.palabra = palabra;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            actor.attemptsTo(Enter.theValue(palabra + "\n").into(BUSCADOR_INPUT));
            actor.attemptsTo(EsperarUnTiempo.enMilisegundos(DOSMIL_MILISEGUNDOS));
        }catch (Exception e){
            throw new IngresarPalabraException(ERROR_INGRESANDO_PALABRA,e);
        }
    }

    public static IngresarPalabra enBuscador(String palabra){
        return instrumented(IngresarPalabra.class,palabra);
    }
}
