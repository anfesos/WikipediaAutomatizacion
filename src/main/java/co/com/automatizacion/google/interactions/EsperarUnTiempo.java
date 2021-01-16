package co.com.automatizacion.google.interactions;

import co.com.automatizacion.google.exceptions.EsperaException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static co.com.automatizacion.google.exceptions.EsperaException.ERROR_EN_ESPERA;

public class EsperarUnTiempo implements Interaction {

    private int milisegundos;
    public static final int DOSMIL_MILISEGUNDOS = 2000;

    public EsperarUnTiempo(int milisegundos) {
        this.milisegundos = milisegundos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            throw new EsperaException(ERROR_EN_ESPERA,e);
        }
    }

    public static EsperarUnTiempo enMilisegundos(int milisegundos){
        return new EsperarUnTiempo(milisegundos);
    }
}
