package co.com.automatizacion.google.exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class EsperaException extends SerenityManagedException {

    public static final String ERROR_EN_ESPERA = "Error mientras se hacia pausa obligada";
    public EsperaException(String message, Throwable testErrorException) {
        super(message, testErrorException);
    }
}
