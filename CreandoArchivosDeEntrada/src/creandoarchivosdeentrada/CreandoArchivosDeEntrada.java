/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creandoarchivosdeentrada;

/**
 *
 * @author luigitercero
 */
public class CreandoArchivosDeEntrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* String tipo[] = {"numerico1","buleano1","texto1","fecha1"};
        String Operador[]= {"+","-","*","/","^","%"};
        
        for (String o : Operador) {
            System.out.println("");
            for (String d : tipo) {
                for (String d2 : tipo) {
                    System.out.println("imprimir ( " + d + " " + o +" "+d2+" );");
                }
            }
        }*/
       
       int a[] = {1,2,3,4};
       int b[] = {1,2,3,4};
       int c[] = sumar(a,b);
        for (int i : c) {
            System.out.println(i);
        }
       
        System.out.println(1+2*5-8+9/6 < 1*6+3-8/2 && 1+9*6<4 && 1==1/95 ||  0 !=3  );
    }
    
        public static int [] sumar (int [] a, int [] b){
        int longitud;
 
        if ( b.length > a.length ) longitud = b.length;
        else longitud = a.length;
 
        int [] r = new int [longitud + 1];
        for (int i = 0; i < r.length; i++) r[i] = 0;
 
        for (int i = 0; i < r.length - 1; i++){
            int suma = r[i];
 
            if (i < a.length) suma += a[i];
            if (i < b.length) suma += b[i];
 
            r[i] = (suma % 10);
            r[i + 1] += suma / 10;    
        }
 
        return r;
    }
    
}
