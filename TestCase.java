package junit.aplicativos;
import junit.framework.*;
/**
 *
 * @autor Diogo
 */
 public class CalculadoraTest extends TestCase {
  public CalculadoraTest (String testName) {
    super(testName);
  }
  public static Test suite() {
    testSuite suite = new TestSuite(CalculadoraTest.class);
    return suite;
   }
   /**
    * Test of somar method, of class junit.aplicativos.Calculadora.
    */
   public void testSomar() {
     //TODO add your test code.
   }
   /**
    * Test of subtrair method, of class junit.aplicativos.Calculdora.
    */
    public void testSubtrair() {
      //TODO add your test code.
   }
