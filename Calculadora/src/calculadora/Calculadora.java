/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author redes yo
 * @since 18/02/2021
 * @version version 3.5 18/02/2021
 */


public class Calculadora {
    private int num1;
    private int num2;
    
    
    /** 
     * Constructor calculadora en el que se pasan como parametros dos enteros
     * @param a es un entero
     * @param b es un entero
     * Asigna a nuestros atributos privados los valores pasados
     */
    public Calculadora(int a, int b){
        
        num1=a;
        num2=b;
    }
    
    /**
     * 
     * Este metodo se encarga de sumar los dos numeros
     * @return result devuelve el resultado que es un entero
     */
    
    public int suma(){
        int result=num1+num2;
        return result;
    }
     /**
     * 
     * Este metodo se encarga de restar los dos numeros
     * @return result devuelve el resultado que es un entero
     * @see resta2 resta2 que comprueba que numero es mayor para ordenar y hacer la resta del mayor menos el menor
     */
    
    public int resta(){
        int result;
        if (resta2())   result = num1-num2;
        else            result = num2-num1;
        return result;
    }
      /**
     * 
     * Este metodo se encarga de comprobar que numero es mayor
     * @return devuelve verdadero o falso
     */
    public boolean resta2(){
        if (num1 > num2)    return true;
        else                return false;
    }
    
      /**
     * 
     * Este metodo se encarga de multiplicar los dos numeros
     * @return result devuelve el resultado que es un entero
     */
    public int multiplica(){
        int result=num1*num2;
        return result;
    }
      /**
     * 
     * Este metodo se encarga de dividir los dos numeros
     * @return result devuelve el resultado que es un entero
     */
    public int divide(){
        int result=num1/num2;
        return result;
    }
      /**
     * 
     * Este metodo se encarga de dividr los dos numeros
     * @return null si el divisor es 0
     * @return result devuelve el resultado que es un entero
     */
    public Integer divide2(){
        
        if(num2==0) return null;
        int result=num1/num2;
        return result;
    }
     /**
     * 
     * Este metodo se encarga de sumar los dos numeros
     * @return result devuelve el resultado que es un entero o una excepcion
     * @throws java.lang.ArithmeticException si el divisor es 0
     */
     public int divide0(){
        
        if(num2==0) 
            throw new java.lang.ArithmeticException("División por 0");
        else{
            int result=num1/num2;
            return result;
        }
    }
     
    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calcu = new Calculadora(20, 10);
        System.out.println(calcu.suma());
    }
    */
}
