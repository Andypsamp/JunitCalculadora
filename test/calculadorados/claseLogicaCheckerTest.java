package calculadorados;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * @version 1.0
 * @author Daniel Seijas
 */
@RunWith(Parameterized.class)
public class claseLogicaCheckerTest {
   private Modelo mod;
   private float resultado;
   
   private claseLogica claseLogica;

   @Before
   public void initialize() {
      claseLogica = new claseLogica();
   }
   
   
   public claseLogicaCheckerTest(Modelo mod, float resultado) {
      this.mod = mod;
      this.resultado = resultado;
   }
   
   @Parameterized.Parameters
   public static Collection claseLogica() {
      return Arrays.asList(new Object[][] {
         { new Modelo(4, 2, 6, "+"), 6},
         { new Modelo(4, 2, 2, "-"), 2},
         { new Modelo(4, 2, 8, "*"), 8},
         { new Modelo(4, 2, 8, "/"), 2}
      });
   }
   
   
   @Test
   public void testclaseLogicaChecker() {
      System.out.println("Parametros testeados : " + mod);
      assertEquals(resultado, calculadorados.claseLogica.realizaOperacion(mod), 2);
   }
    
}
