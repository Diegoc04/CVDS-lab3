package edu.eci.cvds.tdd;
import edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {
	 @Test
    public void tarifaBase100Antelacion25Edad30() {
        double tarifaBase = 100;
        int diasAntelacion = 25;
        int edad = 30;
        double tarifaCalculada = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        Assert.assertEquals(85.0, tarifaCalculada, 0.01);
    }
	
	@Test
    public void tarifaBase0Antelacion10Edad50() {
        double tarifaBase = 0;
        int diasAntelacion = 10;
        int edad = 50;
        double tarifaCalculada = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        Assert.assertEquals(0.0, tarifaCalculada, 0.01);
    }

    @Test
    public void tarifaBaseNegativa() {
        double tarifaBase = -50;
        int diasAntelacion = 15;
        int edad = 40;
        double tarifaCalculada = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        Assert.assertEquals(-50.0, tarifaCalculada, 0.01);
    }

    @Test
    public void tarifaBase200Antelacion30Edad25() {
        double tarifaBase = 200;
        int diasAntelacion = 30;
        int edad = 25;
        double tarifaCalculada = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
    }

    @Test
    public void antelacionNegativa() {
        double tarifaBase = 150;
        int diasAntelacion = -5;
        int edad = 35;
        double tarifaCalculada = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        Assert.assertEquals(150.0, tarifaCalculada, 0.01);
    }

    @Test
    public void tarifaBase300Antelacion20Edad18() {
        double tarifaBase = 300;
        int diasAntelacion = 20;
        int edad = 18;
        double tarifaCalculada = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        Assert.assertEquals(300.0, tarifaCalculada, 0.01);
    }

    @Test
    public void edadNegativa() {
        double tarifaBase = 180;
        int diasAntelacion = 15;
        int edad = -10;
        double tarifaCalculada = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
    }

    @Test
		public void edadMayorQue120LanzaExcepcion() {
		double tarifaBase = 250;
		int diasAntelacion = 25;
		int edad = 130;
		double tarifaCalculada = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
	}
	
}