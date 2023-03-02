/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidor;

/**
 *
 * @author Admin
 */
public class Util {
    Divisas divisa = new Divisas();
    
    public double convertir(double cantidad, double divisa){
        return cantidad * divisa;
    }
    
    public boolean esNumero(String valor){
        try{
            Double.parseDouble(valor);
            return true;
        }catch (Exception e) {
            return false;
        }
    }
    
    public double formatearDecimales(Double numero, Integer numeroDecimales) {
        return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
    }

}
