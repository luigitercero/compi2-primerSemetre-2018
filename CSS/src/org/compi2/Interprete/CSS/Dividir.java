
package org.compi2.Interprete.CSS;

///

 //
public class Dividir extends Valor {

    public Dividir(Object val1, Object val2) {
        super(val1, val2);
    }

    public Dividir() {
    }

    public Object Dividirr(Object val1, Object val2) {
        return super.OperObject(val1, val2);
    }

    @Override
    protected long numberNumber() {
        return (long) val1 / (long) val2; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double doubleNumber() {
        return (double) val1 / (long) val2; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double numberDouble() {
     double a=   Double.parseDouble("2.00");
        return (long) val1 / (double) val2; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double doubleDoble() {
        return (double) val1 / (double) val2; //To change body of generated methods, choose Tools | Templates.
    }
 
}
