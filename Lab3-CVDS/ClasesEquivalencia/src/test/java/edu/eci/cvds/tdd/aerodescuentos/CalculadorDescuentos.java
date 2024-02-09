package edu.eci.cvds.tdd.aerodescuentos;

public class CalculadorDescuentos {
  public static double calculoTarifa(double tarifaBase, int diasAntelacion, int edad) {
    if (diasAntelacion > 20 && edad < 18)
      return tarifaBase * 0.8D; 
    if (diasAntelacion > 20 && edad > 65)
      return tarifaBase * 0.77D; 
    if (diasAntelacion > 20 && edad >= 18 && edad <= 65)
      return tarifaBase * 0.85D; 
    if (diasAntelacion < 20 && edad < 18)
      return tarifaBase * 0.95D; 
    if (diasAntelacion < 20 && edad > 65)
      return tarifaBase * 0.92D; 
    if (diasAntelacion < 20 && edad >= 18 && edad <= 65)
      return tarifaBase; 
    return tarifaBase;
  }
}