package co.com.automatizacion.wikipedia.questions;

import co.com.automatizacion.wikipedia.models.PalabrasWikipedia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.automatizacion.wikipedia.userinterface.PaginaInicial.RESULTADO_BUSQUEDA;

public class RespuestaEsIgual implements Question<Boolean> {

    private PalabrasWikipedia palabrasWikipedia;
    private static int posicion = 0;

    public RespuestaEsIgual(PalabrasWikipedia palabrasWikipedia) {
        this.palabrasWikipedia = palabrasWikipedia;
        posicion++;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        RESULTADO_BUSQUEDA.resolveFor(actor).waitUntilVisible();
        String resultado = RESULTADO_BUSQUEDA.resolveFor(actor).getText();
        return Integer.parseInt(resultado.replace(" ","")) >= palabrasWikipedia.getCantidad();
    }

    public static int getPosicion() {
        return posicion;
    }

    public static RespuestaEsIgual laCantidadDeRegistros(PalabrasWikipedia palabrasWikipedia){
        return new RespuestaEsIgual(palabrasWikipedia);
    }
}
