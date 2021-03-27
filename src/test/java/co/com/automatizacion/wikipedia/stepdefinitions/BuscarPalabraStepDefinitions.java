package co.com.automatizacion.wikipedia.stepdefinitions;

import co.com.automatizacion.wikipedia.models.PalabrasWikipedia;
import co.com.automatizacion.wikipedia.questions.RespuestaEsIgual;
import co.com.automatizacion.wikipedia.questions.RespuestaNavegador;
import co.com.automatizacion.wikipedia.tasks.AbrirPagina;
import co.com.automatizacion.wikipedia.tasks.IngresarPalabra;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static co.com.automatizacion.wikipedia.questions.RespuestaEsIgual.getPosicion;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuscarPalabraStepDefinitions {

    @Before
    public void prepararEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el navegador de wikipedia esta abierto$")
    public void queElNavegadorDeWikipediaEstaAbierto() {
        theActorCalled("Usuario").wasAbleTo(AbrirPagina.deNavegacion());
    }

    @Cuando("^se ingresa una palabra (.*) en el buscador$")
    public void seIngresaUnaPalabraEnElBuscador(String palabra) {
        theActorInTheSpotlight().attemptsTo(IngresarPalabra.enBuscador(palabra));
    }

    @Entonces("^se retorna informacion sobre la palabra$")
    public void seRetornaInformacionSobreLaPalabra() {
        theActorInTheSpotlight().should(seeThat(RespuestaNavegador.mayorAUno()));
    }

    @Entonces("^se espera que la palabra retorne la cantidad indicada de registros en el buscador$")
    public void seEsperaQueLaPalabraRetorneLaCantidadIndicadaDeRegistrosEnElBuscador(List<PalabrasWikipedia> palabraWikipediaModels)  {
        theActorInTheSpotlight().should(seeThat(RespuestaEsIgual.laCantidadDeRegistros(palabraWikipediaModels.get(getPosicion()))));
    }
}
