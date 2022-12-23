package co.com.pragma.questions;

import co.com.pragma.userinterfaces.CalculadoraGoogle;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Resultado implements Question<Boolean> {

    private String resultant;

    public Resultado elValor(String resultado){
        this.resultant = resultado;
        return this;
    }

    public Resultado es(){
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return CalculadoraGoogle.TEXTO_RESULTADO.resolveFor(actor).containsOnlyText(resultant);
    }

    public static  Resultado enResultado(){
        return new Resultado();
    }

}
