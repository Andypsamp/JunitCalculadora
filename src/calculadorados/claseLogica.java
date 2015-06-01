package calculadorados;

/**
 * @version 1.0
 * @author Daniel Seijas
 */
public class claseLogica {
    
    public static float realizaOperacion(Modelo contenedor){
        
        float resultado = 0;
        
        switch(contenedor.getOperacion()){
            case "+": 
                 resultado = contenedor.getNum1()+contenedor.getNum2();
            break;
            case "-": 
                 resultado = contenedor.getNum1()-contenedor.getNum2();
            break;
            case "*": 
                 resultado = contenedor.getNum1()*contenedor.getNum2();
            break;
            case "/": 
                 resultado = contenedor.getNum1()/contenedor.getNum2();
            break;
        }
        contenedor.setResultado(resultado);
        
        return resultado;
    }
    
}
