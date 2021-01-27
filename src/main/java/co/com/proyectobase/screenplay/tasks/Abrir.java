package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.exceptions.DatosAcademicosNoValidos;
import co.com.proyectobase.screenplay.model.Estudiante;
import co.com.proyectobase.screenplay.questions.DatosAcademicos;
import co.com.proyectobase.screenplay.userinterface.CesdeHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.proyectobase.screenplay.exceptions.DatosAcademicosNoValidos.MENSAJE_DATOS_ACADEMICOS_INVALIDOS;
import static co.com.proyectobase.screenplay.userinterface.CesdeHomePage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class Abrir implements Task {

    private CesdeHomePage cesdeHomePage;
    private Estudiante estudiante;


    public Abrir(List <Estudiante> estudiante) {
        this.estudiante = estudiante.get(0);

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(cesdeHomePage),
                Click.on(cesdeHomePage.BOTON_CERRAR_POPUP),
                SelectFromOptions.byValue("1402").from(LST_TIPO_DOCUMENTO),
                Enter.theValue(estudiante.getDocNum()).into(TXT_IDENTIFICACION),
                Click.on(BTN_VALIDAR)
        );

        actor.should( seeThat(DatosAcademicos.segundoFormulario())
                .orComplainWith(DatosAcademicosNoValidos.class, MENSAJE_DATOS_ACADEMICOS_INVALIDOS));


        //Select select = new Select(driver.findElement(By.className("col-md-2 mb-3")));
        //select.selectByIndex(2);
        //select.selectByValue("1402");
        //select.selectByVisibleText("C.C.");
        /*WebElement listaTipoDoc = driver.findElement(By.id("tipoIdentificacion"));
        //listaTipoDoc.selectByVisibleText("C.C.");
        Select listaDoc = new Select(listaTipoDoc);
        listaDoc.selectByValue("1402");*/


    }
    public static Abrir paginaCesde(List <Estudiante> estudiante) {
        return Tasks.instrumented(Abrir.class,estudiante);
    }

}
