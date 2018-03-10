
package com.Interprete.EXP.Funcion;

import com.Interprete.EXP.Date;
import com.Interprete.EXP.DateTime;
import com.Interprete.EXP.EvaluarEXP;
import com.TreeParser.Node;

public class Eleva extends Valor {

    public Eleva(Node izq, Node der, EvaluarEXP exp) {
        super(izq, der, exp);
    }

    public Object Elevar() {
        return evaluar();
    }

    @Override
    protected double booleanDouble() {
        boolean a = (boolean) (val1);
        int b = a ? 1 : 0;
        return Math.pow(b, (double) (val2));

    }

    @Override
    protected double doubleBoolean() {
        boolean a = (boolean) (val2);
        int b = a ? 1 : 0;
        return Math.pow((double) (val1), b);
    }

    @Override
    protected long booleanNumber() {
        boolean a = (boolean) (val1);
        int b = a ? 1 : 0;
        Double salida = Math.pow(b,(long) (val2));
        return salida.longValue();
        
        //return b , (long) (val2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected long numberBoolean() {
        boolean a = (boolean) (val2);
        int b = a ? 1 : 0;
        Double salida = Math.pow((long) (val1),b);
        return salida.longValue();
        //return (long) (val1) , b; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected long numberNumber() {
        Double salida = Math.pow((long) (val1) , (long) (val2)); //To change body of generated methods, choose Tools | Templates.
        return salida.longValue();
    }

    @Override
    protected double doubleNumber() {
        return  Math.pow((double) (val1) , (long) (val2)); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double numberDouble() {
        return  Math.pow((long) (val1) , (double) (val2)); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double doubleDoble() {
        return  Math.pow((double) (val1) , (double) (val2)); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected long caracterNumber() {
        Double salida =
        Math.pow((char) (val1) , (long) (val2)); //To change body of generated methods, choose Tools | Templates.
        return salida.longValue();
    }

    @Override
    protected long numberCaracter() {
        Double salida =
        Math.pow((long) (val1) , (char) (val2)); //To change body of generated methods, choose Tools | Templates.
        return salida.longValue();
    }

    @Override
    protected long caracterCaracter() {
        return (long) Math.pow((char) (val1) , (char) (val2)); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double doubleCarater() {
        return  Math.pow((double) (val1) , (char) (val2)); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double caracterDouble() {
        return  Math.pow((char) (val1) , (double) (val2)); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object evaluar() {
        return super.evaluar(); //To change body of generated methods, choose Tools | Templates.
    }

}
