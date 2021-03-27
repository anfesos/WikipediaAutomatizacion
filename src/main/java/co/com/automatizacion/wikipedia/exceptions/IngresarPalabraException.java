package co.com.automatizacion.wikipedia.exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class IngresarPalabraException extends SerenityManagedException {

    public static final String ERROR_INGRESANDO_PALABRA = "Error ingresando palabra en buscador";
    public IngresarPalabraException(String message, Throwable testErrorException) {
        super(message, testErrorException);
    }
}
