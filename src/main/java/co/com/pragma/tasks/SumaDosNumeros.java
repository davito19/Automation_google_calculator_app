package co.com.pragma.tasks;

import co.com.pragma.userinterfaces.CalculadoraGoogle;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SumaDosNumeros implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CalculadoraGoogle.BOTON_NUMERO_DOS),
                Click.on(CalculadoraGoogle.BOTON_NUMERO_DOS),
                Click.on(CalculadoraGoogle.BOTON_SUMA),
                Click.on(CalculadoraGoogle.BOTON_NUMERO_DOS),
                Click.on(CalculadoraGoogle.BOTON_NUMERO_DOS),
                Click.on(CalculadoraGoogle.BOTON_RESULTADO)
        );
    }

    public static SumaDosNumeros sumaDosNumeros(){
        return new SumaDosNumeros();
    }
}
