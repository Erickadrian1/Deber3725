
package ClaseCubo;

public class Cubo {
    int al;
    int an;
    int p;

  public Cubo(int an, int al, int p){
  this. an = an;
          this.al = al ;
                  this. p =p;
  }
  
  public Cubo(){
      System.out.println("Valor Vacio");
  } 
  
  public int volumen(){
  int volum = this.an * this.al * this.p;
  return volum;
  }
  }
