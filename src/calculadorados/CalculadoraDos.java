package calculadorados;

/**
 * @version 1.0
 * @author VfromVendetta
 */
public class CalculadoraDos {
    
    public static void main(String[] args) {
        
        Modelo mod =  new Modelo();
        
        Vista.introducir(mod);

        claseLogica.realizaOperacion(mod);
        Vista.imprimir(mod);
        
    }

    
}