package co.com.automatizacion.google.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicial extends PageObject {
    public static Target BUSCADOR_INPUT = Target.the("Cuadro de ingreso de información a buscar").located(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
    public static Target RESULTADO_BUSQUEDA = Target.the("Información de registros arrojados por la consulta").located(By.xpath("//*[@id='result-stats']"));
}
