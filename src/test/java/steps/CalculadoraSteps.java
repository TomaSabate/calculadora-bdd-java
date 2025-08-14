package steps;

import calculadora.Calculadora;
import io.cucumber.java.es.*;
import static org.junit.Assert.*;

public class CalculadoraSteps {

    Calculadora calc;
    int resultado;

    @Dado("que la calculadora está encendida")
    public void que_la_calculadora_esta_encendida() {
        calc = new Calculadora();
    }

    @Cuando("ingreso {int} y {int} y selecciono suma")
    public void ingreso_y_selecciono_suma(Integer a, Integer b) {
        resultado = calc.sumar(a, b);
    }

    @Cuando("ingreso {int} y {int} y selecciono resta")
    public void ingreso_y_selecciono_resta(Integer a, Integer b) {
        resultado = calc.restar(a, b);
    }

    @Cuando("ingreso {int} y {int} y selecciono multiplicación")
    public void ingreso_y_selecciono_multiplicacion(Integer a, Integer b) {
        resultado = calc.multiplicar(a, b);
    }

    @Cuando("ingreso {int} y {int} y selecciono división")
    public void ingreso_y_selecciono_division(Integer a, Integer b) {
        resultado = calc.dividir(a, b);
    }

    @Entonces("el resultado debe ser {int}")
    public void el_resultado_debe_ser(Integer esperado) {
        assertEquals((int) esperado, resultado);
    }
}
