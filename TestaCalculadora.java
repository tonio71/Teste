package junit.aplicativos;
 /**
  *
  * @autor Diogo
  */
  public class TestaCalculadora {
   public static void main (String args[]{
    Calculadora calc = new Calculadora();
    double resultado = cal.somar(10,20);
    if (resultado!=30){
      System.out/printl("Oops! Deu um resultado não esperado: "+resultado);
    }
    else System.out.println("OK! Passou do teste.");
  }
}
