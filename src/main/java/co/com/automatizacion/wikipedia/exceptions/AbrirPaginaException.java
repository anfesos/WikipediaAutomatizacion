package co.com.automatizacion.wikipedia.exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class AbrirPaginaException extends SerenityManagedException {

    public static final String ERROR_ABRIENDO_PAGINA = "Error al abrir la página web";
    public AbrirPaginaException(String message, Throwable testErrorException) {
        super(message, testErrorException);
    }
}
