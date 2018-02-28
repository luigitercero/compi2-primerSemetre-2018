/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.compi2.Interprete.CSS;

/**
 *
 * @author luigitercero
 */
public class Multiplicar extends Valor {

    public Multiplicar(Object val1, Object val2) {
        super(val1, val2);
    }

    public Multiplicar() {
    }

    public Object Multiplicarr(Object val1, Object val2) {
        return super.OperObject(val1, val2);
    }

    @Override
    protected long numberNumber() {
        return (long) val1 * (long) val2; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double doubleNumber() {
        return (double) val1 * (long) val2; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double numberDouble() {
        return (long) val1 * (double) val2; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double doubleDoble() {
        return (double) val1 * (double) val2; //To change body of generated methods, choose Tools | Templates.
    }

}
