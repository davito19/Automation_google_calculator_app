package co.com.pragma.tasks;

import co.com.pragma.userinterfaces.CalculadoraGoogle;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class LimpiarOperaciones implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CalculadoraGoogle.BOTON_LIMPIAR_OPERACIONES)
        );
    }

    public static LimpiarOperaciones limpiarOperaciones(){
        return new LimpiarOperaciones();
    }
}
