/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interprete.EXP.Funcion;

import com.Interprete.EXP.EvaluarEXP;
import com.Interprete.EXP.TipoObjeto;
import static com.Interprete.EXP._Token.*;
import com.TreeParser.Node;

/**
 *
 * @author luigitercero
 */
public class Valor{

    public Object val1;
    public Object val2;
    public int tipo1;
    public int tipo2;
  
    protected TipoObjeto tipo;
    private final EvaluarEXP exp;

    public Valor(Node izq, Node der,EvaluarEXP exp) {
        this.exp = exp;
        tipo = new TipoObjeto();
        this.val1 = exp.evaluar(izq);
        this.val2 = exp.evaluar(der);
        this.tipo1 = tipo.tipoObjecto(val1);
        this.tipo2 = tipo.tipoObjecto(val2);
    }

    public Object evaluar() {
        if (tipo1 == _v_date && tipo2 == _v_String) {
            return fechaString();
        } else if (tipo1 == _v_String && tipo2 == _v_date) {
            return stringFecha();
        }
        if (tipo1 == _v_DateTime && tipo2 == _v_String) {
            return fechahoraString();
        } else if (tipo1 == _v_String && tipo2 == _v_DateTime) {
            return stringFechahora();
        }
        if (tipo1 == _v_String || tipo2 == _v_String) {
            return stringString();
        }
        if (tipo1 == _v_Double && tipo2 == _v_Caracter) {
            return doubleCarater();
        }
        if (tipo1 == _v_Caracter && tipo2 == _v_Caracter) {
            return caracterCaracter();
        }
        if (tipo1 == _v_Number && tipo2 == _v_Caracter) {
            return numberCaracter();
        }
        if (tipo1 == _v_Caracter && tipo2 == _v_Number) {
            return caracterNumber();
        }
        if (tipo1 == _v_Double && tipo2 == _v_Double) {
            return doubleDoble();
        } else if (tipo1 == _v_Number && tipo2 == _v_Double) {
            return numberDouble();
        } else if (tipo1 == _v_Double && tipo2 == _v_Number) {
            return doubleNumber();
        } else if (tipo1 == _v_Number && tipo2 == _v_Number) {
            return numberNumber();
        } else if (tipo1 == _v_Number && tipo2 == _v_Boolean) {
            return numberBoolean();
        } else if (tipo1 == _v_Boolean && tipo2 == _v_Number) {
            return booleanNumber();
        } else if (tipo1 == _v_Double && tipo2 == _v_Boolean) {
            return doubleBoolean();
        } else if (tipo1 == _v_Boolean && tipo2 == _v_Double) {
            return booleanDouble();
        } else if (tipo1 == _v_Boolean && tipo2 == _v_Boolean) {
            return booleanBoolean();
        }
        System.err.println("error al querer castear operadores ");
        return null;
    }

    protected String fechaString() {
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    protected String stringFecha() {
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    protected String fechahoraString() {
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    protected String stringFechahora() {
        return null;
    }

    protected String stringString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected double doubleCarater() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected double caracterDouble() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected long caracterCaracter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected long numberCaracter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected long caracterNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected double doubleDoble() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected double numberDouble() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected double doubleNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected long numberNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected long numberBoolean() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected long booleanNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected double doubleBoolean() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected double booleanDouble() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected boolean booleanBoolean() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
