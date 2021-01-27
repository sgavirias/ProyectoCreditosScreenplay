package co.com.proyectobase.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static co.com.proyectobase.screenplay.userinterface.CesdeHomePage.BTN_VALIDAR;
//import static co.com.proyectobase.screenplay.userinterface.CesdeHomePage.LBL_DATOS_ACADEMICOS;
import static co.com.proyectobase.screenplay.util.Constantes.MENSAJE_DATOS_ACADEMICOS;



//public static <T> Consequence<T> seeThat(Question<Boolean> actual) {}


public class DatosAcademicos implements Question<Boolean> {

    WebDriver driver = SerenityWebdriverManager.inThisTestThread().getCurrentDriver();


    @Override
    //public String answeredBy(Actor actor) {
    //return BrowseTheWeb.as(actor).find(By.className("panel-heading bg-fucsia")).getText();
    //}

    public Boolean answeredBy(Actor actor) {

        String label = driver.findElement(By.xpath("//*[@id=\"pnlDatos\"]/div[1]/div[1]")).getText();

        if (label.equals(MENSAJE_DATOS_ACADEMICOS)) {

            return true;
        } else {
            return false;
        }
    }

    /*public static Question<String> value() {
        return new DatosAcademicos();
    }*/
    public static DatosAcademicos segundoFormulario() {
        return new DatosAcademicos();

    }
}


