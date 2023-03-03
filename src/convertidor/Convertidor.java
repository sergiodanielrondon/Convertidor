/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertidor;
import formularios.FrmInicio;


/**
 *
 * @author Admin
 */
public class Convertidor {
    
    
    
    public static void main(String[] args) {
        
        FrmInicio frmInicio = new FrmInicio();
        frmInicio.setVisible(true);
        
        Util utilidad = new Util();
        
        int valor = 35;
        String lista = "";
        
        while(valor > 0){
            int respuesta = utilidad.esPar(valor);
            int div = valor / 2;
            valor = div;
            lista = lista + respuesta;
            System.out.println("respuesta " + respuesta + " valor: " + valor + "lista " + lista);
            
        }
        String invert = new StringBuilder(lista).reverse().toString();
        System.out.println("Invertida " + invert);
       
        
        
    }
    
}
