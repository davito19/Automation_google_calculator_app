package co.com.pragma.stepdefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.pragma.questions.Resultado.enResultado;
import static co.com.pragma.setup.SetupApp.onThePhone;
import static co.com.pragma.tasks.LimpiarOperaciones.limpiarOperaciones;
import static co.com.pragma.tasks.SumaDosNumeros.sumaDosNumeros;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class SumaStepDefinition {

    private static final Logger LOGGER = LoggerFactory.getLogger(SumaStepDefinition.class);
    Actor david = Actor.named("David");

    @Before
    public void openApp(){
        david.can(BrowseTheWeb.with(onThePhone().getDriver()));
        LOGGER.info("Ya abrí la app");
    }

    @Dado("El usuario se encuentra en al app y no ha realizado operaciones")
    public void elUsuarioSeEncuentraEnAlAppYNoHaRealizadoOperaciones() {
        david.wasAbleTo(
                limpiarOperaciones()
        );
        LOGGER.info("Ya limpie la pantalla de resultados y operaciones");
    }
    @Cuando("el usuario ingresa los datos y la operacion suma a la aplicacion")
    public void elUsuarioIngresaLosDatosYLaOperacionSumaALaAplicacion() {
        david.attemptsTo(
                sumaDosNumeros()
        );
        LOGGER.info("Ya realice la suma");
    }
    @Entonces("el usuario visualiza el resultado de la operacion")
    public void elUsuarioVisualizaElResultadoDeLaOperacion() {
        david.should(
                seeThat(
                        enResultado()
                                .elValor("44")
                                .es()
                        ,equalTo(true)
                )
        );
        LOGGER.info("Ya valide la operacion");
    }

}
