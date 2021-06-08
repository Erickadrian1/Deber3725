package ClaseCuadrilatero;

public class PruebaCuadrilatero {
  public static void main(String[] args) {
      System.out.println("Programa que calcula el area y perimetro de un rectangulo ");
      Cuadrilatero cp = new Cuadrilatero();
      cp.a=5;
      cp.b=6;
      cp.verDatos();
      System.out.println("El area de la figura es: "+cp.area());
      System.out.println("El perimetro de la figura es: "+cp.perimetro());
  }
}
