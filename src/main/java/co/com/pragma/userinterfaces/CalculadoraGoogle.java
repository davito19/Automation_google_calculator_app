package co.com.pragma.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CalculadoraGoogle extends PageObject {

    public static final Target BOTON_LIMPIAR_OPERACIONES = Target
            .the("boton para limpiar operaciones")
            .located(By.id("com.google.android.calculator:id/clr"));

    public static final Target BOTON_NUMERO_DOS = Target
            .the("Botón del numero 2")
            .located(By.id("com.google.android.calculator:id/digit_2"));

    public static final Target BOTON_SUMA = Target
            .the("Botón para realizar una suma")
            .located(By.id("com.google.android.calculator:id/op_add"));

    public static final Target BOTON_RESULTADO = Target
            .the("Botón para obtener el resultado")
            .located(By.id("com.google.android.calculator:id/eq"));

    public static final Target TEXTO_RESULTADO =  Target
            .the("texto donde se muestra el resultado")
            .located(By.id("com.google.android.calculator:id/result_final"));

}
