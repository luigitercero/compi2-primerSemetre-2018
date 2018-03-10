/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interprete.EXP.Funcion;

import com.Interprete.EXP.Date;
import com.Interprete.EXP.DateTime;
import com.Interprete.EXP.EvaluarEXP;
import com.TreeParser.Node;

/**
 *
 * @author luigitercero
 */
public class NoIgual extends ValorBooleano {

    public NoIgual(Node izq, Node der, EvaluarEXP exp) {
        super(izq, der,exp);
    }


    @Override
    protected boolean booleanDouble() {
        boolean a = (boolean) (val1);
        int b = a ? 1 : 0;
        return!( b == (double) (val2));//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean doubleBoolean() {
        boolean a = (boolean) (val2);
        int b = a ? 1 : 0;
        return!( (double) (val1) == b); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean booleanNumber() {
        boolean a = (boolean) (val1);
        int b = a ? 1 : 0;
        return!( b == (long) (val2)); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean numberBoolean() {
        boolean a = (boolean) (val2);
        int b = a ? 1 : 0;
        return!( (long) (val1) == b); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean numberNumber() {
        return!( (long) (val1) == (long) (val2)); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean doubleNumber() {
        return!( (double) (val1) == (long) (val2)); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean numberDouble() {
        return!( (long) (val1) == (double) (val2)); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean doubleDoble() {
        return!( (double) (val1) == (double) (val2)); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean caracterNumber() {
        return!( (char) (val1) == (long) (val2)); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean numberCaracter() {
        return!( (long) (val1) == (char) (val2)); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean caracterCaracter() {
        return!( (char) (val1) == (char) (val2)); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean doubleCarater() {
        return!( (double) (val1) == (char) (val2)); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean caracterDouble() {
        return!( (char) (val1) == (double) (val2)); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean stringString() {
        return!( (val1).toString() .equals((val2).toString())); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean stringFechahora() {
        DateTime fecha = (DateTime) val2;
        return!( val1.toString() .equals(fecha.date)); //To change body of generated methods, choose Tools | Templates.
    }

      protected boolean dateDate() {
          Date fecha2 =(Date) val2; 
          Date fecha1 =(Date) val1;
          return !(fecha1.date.equals(fecha2.date));
        
    }

    protected boolean vDatevDate() {
        DateTime fecha2 =(DateTime) val2; 
          DateTime fecha1 =(DateTime) val1;
          return !(fecha1.date.equals(fecha2.date));//To change body of generated methods, choose Tools | Templates.
    }

    protected boolean stringNumber() {
        return val1.toString().length() != (long) val2; //To change body of generated methods, choose Tools | Templates.
    }

    protected boolean stringDouble() {
        return val1.toString().length() != (double) val2;
    }

    protected boolean numberString() {
       return (long)val1 != val2.toString().length();//To change body of generated methods, choose Tools | Templates.
    }

    protected boolean doubleString() {
        return (double)val1 != val2.toString().length(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    protected boolean fechahoraString() {
        DateTime fecha = (DateTime) val1;
        return!( fecha.date .equals( val2.toString())); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean stringFecha() {
        Date fecha = (Date) val2;
        return!( val1.toString() .equals( fecha.date)); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean fechaString() {
        Date fecha = (Date) val1;
        return!( fecha.date .equals( val2.toString())); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object evaluar() {
        return super.evaluar(); //To change body of generated methods, choose Tools | Templates.
    }



}
