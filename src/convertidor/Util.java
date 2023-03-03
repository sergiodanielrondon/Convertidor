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
    
    public int esPar(int numero){
        if(numero % 2 == 0){
            return 0;
        }else{
            return 1;
        }
    }
    
    public String crearBinario(int valor){
        String lista = "";
        
        while(valor > 0){
            int binario = this.esPar(valor);
            int division = valor / 2;
            valor = division;
            lista = lista + binario;
        }
        String respuesta = new StringBuilder(lista).reverse().toString();
        return respuesta;
    }

}
