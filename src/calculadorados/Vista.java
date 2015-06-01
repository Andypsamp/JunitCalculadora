package calculadorados;

import javax.swing.JOptionPane;

/**
 * @version 1.0
 * @author Daniel Seijas Igleisas
 */
public class Vista {
    
    
    /**
     * Metodo para imprimir el resultado de la opracion
     * @param mod 
     */
    public static void imprimir(Modelo mod){
        JOptionPane.showMessageDialog(null,mod.getResultado() );
    }
    
    
    /**
     * Metodo para introducir Num1, Num2, Operacion
     * @param mod objeto 
     */
    public static void introducir(Modelo mod){
        mod.setNum1(Float.valueOf(JOptionPane.showInputDialog(null, "Introduzca primer numero")));
        mod.setNum2(Float.valueOf(JOptionPane.showInputDialog(null, "Introduzca segundo numero")));
        mod.setOperacion(JOptionPane.showInputDialog(null, "introduzca operacion"));
    }
}
