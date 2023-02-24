package eedd.ud03.tarea1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PruebaCalculadora {
  @BeforeAll
  static void iniciar() {
      System.out.println("Comienzo pruebas calculadora");
  }

  @ParameterizedTest
  @CsvSource({ "2, 3, 5" , "-2, -3, -5"})
  @DisplayName("***Prueba de suma***")
  @Order(1)
  public void TestSuma(int n1, int n2, int resultado) {
    System.out.println("SUMA");
    System.out.println("Probando: " + n1 + " + " + n2 + " = " + resultado);
    assertEquals(Calculadora.sumar(n1, n2), resultado);
    
  }
  
  
  @ParameterizedTest
  @CsvSource({ "3, 3, 0" , "-2, -3, 1"})
  @DisplayName("***Prueba de resta***")
  @Order(2)
  public void TestResta(int n1, int n2, int resultado) {
    System.out.println("RESTA");
    System.out.println("Probando: " + n1 + " - " + n2 + " = " + resultado);
    assertEquals(Calculadora.restar(n1, n2), resultado);
  }
  
  
  @ParameterizedTest
  @CsvSource({ "3, 3, 9" , "-2, -3, 6", "2, 0, 0", "-3, 3, -9"})
  @DisplayName("***Prueba de multiplicación***")
  @Order(3)
  public void TestMultiplicacion(int n1, int n2, int resultado) {
    System.out.println("MULTIPLICACIÓN");
    System.out.println("Probando: " + n1 + " * " + n2 + " = " + resultado);
    assertEquals(Calculadora.multiplicar(n1, n2), resultado);
  }
  
  
  @ParameterizedTest
  @CsvSource({ "3, 3, 1" , "-2, -2, 1", "-3, 3, -1"})
  @DisplayName("***Prueba de división***")
  @Order(4)
  public void TestDivision(int n1, int n2, int resultado) {
    System.out.println("DIVISIÓN");
    System.out.println("Probando: " + n1 + " / " + n2 + " = " + resultado);
    assertEquals(Calculadora.dividir(n1, n2), resultado);
  }
  
  @Test
  public void TestPositivo() {
    boolean resultado = Calculadora.esPositivo(5);
    boolean esperado = true;
    assertEquals(esperado, resultado);
  }
  
  public void TestPositivoFalse() {
    boolean resultado = Calculadora.esPositivo(-5);
    boolean esperado = false;
    assertEquals(esperado, resultado);
  }
  
  @Test
  public void TestPrimo() {
    boolean resultado = Calculadora.esPrimo(2);
    boolean esperado = true;
    assertEquals(esperado, resultado);
  }
  
  @Test
  public void TestPrimoFalse() {
    boolean resultado = Calculadora.esPrimo(4);
    boolean esperado = false;
    assertEquals(esperado, resultado);
  }
  

}
