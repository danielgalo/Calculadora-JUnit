package eedd.ud03.tarea1;

public class Calculadora {

  public static int sumar(int a, int b) {
    return a  + b;
  }
  
  public static int restar(int a, int b) {
    return a - b;
  }
  
  public static int multiplicar(int a, int b) {
    return a * b;
  }
  
  public static int dividir(int a, int b) {
    return a / b;
  }
  
  public static boolean esPositivo(int a) {
    if (a < 0) {
      return false;
    } else {
      return true;
    }
  }
  
  public static boolean esPrimo(int a) {
    for (int i = 2;i < a; i++) {
      if (a % i == 0) {
        return false;
      }    
    }
    return true;
  }
}
