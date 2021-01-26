package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.model.Estudiante;
import co.com.proyectobase.screenplay.tasks.Abrir;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class LiquidacionCreditoDefinition {

    @Managed(driver = "chrome")
    private WebDriver hisbrowser;
    private Actor usuario = Actor.named("Usuario");

    @Before
    public void configuracionInicial() {
        usuario.can(BrowseTheWeb.with(hisbrowser));
    }

    @Dado("^El usuario se encuentra en la pagina del CESDE$")
    public void elUsuarioSeEncuentraEnLaPaginaDelCESDE(List <Estudiante> estudiante) {

        usuario.wasAbleTo(Abrir.paginaCesde(estudiante)

        );

    }

    @Cuando("^El usuario se identifica$")
    public void elUsuarioSeIdentifica() {

    }

    @Entonces("^El credito se finaliza correctamente$")
    public void elCreditoSeFinalizaCorrectamente() {
    }
}
