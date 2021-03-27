package co.com.automatizacion.wikipedia.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicial extends PageObject {
    public static Target BUSCADOR_INPUT = Target.the("Cuadro de ingreso de información a buscar").located(By.xpath("//*[@id='searchInput']"));
    public static Target RESULTADO_BUSQUEDA = Target.the("Información de registros arrojados por la consulta").located(By.xpath("//*[@id='mw-search-top-table']/div[2]/strong[2]"));
}
