package ClaseCuadrilatero;

public class Cuadrilatero {
    int a;
    int b;
public void verDatos(){
System.out.println("Alto:"+this.a);
System.out.println("Base: "+this.b);
}
public int area(){
   int op1 = a*b;
   return op1;
} 
public int perimetro(){
    int op2 = (2)*(a+b);
    return op2;
    
    
}
}
