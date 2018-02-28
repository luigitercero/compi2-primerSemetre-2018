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
public class Sumar extends Valor {



    public Sumar(Node izq, Node der, EvaluarEXP aThis) {
     super(izq, der,aThis);
    }

    public Object Sumar() {
        return evaluar();
    }

    @Override
    protected boolean booleanBoolean() {
        return (boolean) val1 || (boolean) val2;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double booleanDouble() {
        boolean a = (boolean) (val1);
        int b = a ? 1 : 0;
        return b + (double) (val2);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double doubleBoolean() {
        boolean a = (boolean) (val2);
        int b = a ? 1 : 0;
        return (double) (val1) + b; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected long booleanNumber() {
        boolean a = (boolean) (val1);
        int b = a ? 1 : 0;
        return b + (long) (val2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected long numberBoolean() {
        boolean a = (boolean) (val2);
        int b = a ? 1 : 0;
        return (long) (val1) + b; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected long numberNumber() {
        return (long) (val1) + (long) (val2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double doubleNumber() {
        return (double) (val1) + (long) (val2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double numberDouble() {
        return (long) (val1) + (double) (val2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double doubleDoble() {
        return (double) (val1) + (double) (val2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected long caracterNumber() {
        return (char) (val1) + (long) (val2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected long numberCaracter() {
        return (long) (val1) + (char) (val2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected long caracterCaracter() {
        return (char) (val1) + (char) (val2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double doubleCarater() {
        return (double) (val1) + (char) (val2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double caracterDouble() {
        return (char) (val1) + (double) (val2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected String stringString() {
        return (val1).toString() + (val2).toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected String stringFechahora() {
        DateTime fecha = (DateTime) val2;
        return val1.toString() + fecha.date; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected String fechahoraString() {
        DateTime fecha = (DateTime) val1;
        return fecha.date + val2.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected String stringFecha() {
        Date fecha = (Date) val2;
        return val1.toString() + fecha.date; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected String fechaString() {
        Date fecha = (Date) val1;
        return fecha.date + val2.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object evaluar() {
        return super.evaluar(); //To change body of generated methods, choose Tools | Templates.
    }

}
