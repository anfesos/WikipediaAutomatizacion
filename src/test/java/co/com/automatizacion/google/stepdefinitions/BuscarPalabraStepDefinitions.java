package co.com.automatizacion.google.stepdefinitions;

import co.com.automatizacion.google.questions.RespuestaNavegador;
import co.com.automatizacion.google.tasks.AbrirPagina;
import co.com.automatizacion.google.tasks.IngresarPalabra;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuscarPalabraStepDefinitions {

    @Before
    public void prepararEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el navegador de google esta abierto$")
    public void queElNavegadorDeGoogleEstaAbierto() {
        theActorCalled("Usuario").wasAbleTo(AbrirPagina.deNavegacion());
    }

    @Cuando("^se ingresa una palabra (.*) en el buscador$")
    public void seIngresaUnaPalabraEnElBuscador(String palabra) {
        theActorInTheSpotlight().attemptsTo(IngresarPalabra.enBuscador(palabra));
    }

    @Entonces("^se retorna mas un registro de retorno$")
    public void seRetornaMasUnRegistroDeRetorno() {
        theActorInTheSpotlight().should(seeThat(RespuestaNavegador.mayorAUno()));
    }
}
