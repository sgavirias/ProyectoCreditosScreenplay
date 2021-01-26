package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.model.Estudiante;
import co.com.proyectobase.screenplay.userinterface.CesdeHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromElement;
import net.sourceforge.htmlunit.corejs.javascript.ArrowFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static co.com.proyectobase.screenplay.userinterface.CesdeHomePage.LST_TIPO_DOCUMENTO;
import static co.com.proyectobase.screenplay.userinterface.CesdeHomePage.TXT_IDENTIFICACION;


public class Abrir implements Task {

    private CesdeHomePage cesdeHomePage;
    private Estudiante estudiante;


    public Abrir(List <Estudiante> estudiante) {
        this.estudiante = estudiante.get(0);

    }
    WebDriver driver;



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(cesdeHomePage),
                Click.on(cesdeHomePage.BOTON_CERRAR_POPUP),
                Click.on(LST_TIPO_DOCUMENTO)
        );

        //Select select = new Select(driver.findElement(By.className("col-md-2 mb-3")));
        //select.selectByIndex(2);
        //select.selectByValue("1402");
        //select.selectByVisibleText("C.C.");
        /*WebElement listaTipoDoc = driver.findElement(By.id("tipoIdentificacion"));
        //listaTipoDoc.selectByVisibleText("C.C.");
        Select listaDoc = new Select(listaTipoDoc);
        listaDoc.selectByValue("1402");*/

        actor.attemptsTo(
                Enter.theValue(estudiante.getDocNum()).into(TXT_IDENTIFICACION)
                //Click.on(LST_TIPO_DOCUMENTO)
                //Enter.theValue("1402").into(LST_TIPO_DOCUMENTO)

        );



    }
    public static Abrir paginaCesde(List <Estudiante> estudiante) {
        return Tasks.instrumented(Abrir.class,estudiante);
    }

}
