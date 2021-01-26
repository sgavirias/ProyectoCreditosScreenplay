package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.apache.tools.ant.taskdefs.WaitFor;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Wait;


@DefaultUrl("https://servicios.cesde.edu.co/autogestionnegozia")

public class CesdeHomePage extends PageObject {

    public static final Target BOTON_CERRAR_POPUP = Target.the("Botón que cierra popup")
            .located(By.xpath("//*[@id=\"modalBienvenida\"]/div/div/button"));

    public static final Target TXT_IDENTIFICACION = Target.the("Campo para diligenciar el numero de documento")
            .located(By.id("identificacion"));

    public static  final Target LST_TIPO_DOCUMENTO = Target.the("Lista de tipo de documento")
            .located(By.id("tipoIdentificacion"));
}
