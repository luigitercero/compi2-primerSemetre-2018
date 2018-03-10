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
public class ValorBooleano {
    
    public Object val1;
    public Object val2;
    public int tipo1;
    public int tipo2;
    private final EvaluarEXP exp;
    protected TipoObjeto tipo;

    public ValorBooleano(Node izq, Node der, EvaluarEXP exp) {
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
        }else if(tipo1 == _v_date && tipo2 == _v_date){
            return dateDate(); 
        }else if (tipo1 == _v_DateTime&& tipo2 == _v_DateTime){
           return vDatevDate();
        }else if(tipo1 == _v_String &&tipo2 == _v_Number){
            return stringNumber();
        }else if(tipo1 == _v_String &&tipo2 ==_v_Double){
            return stringDouble();
        } if(tipo2 == _v_String &&tipo1 == _v_Number){
            return numberString();
        }else if(tipo2 == _v_String &&tipo1 ==_v_Double){
            return doubleString();
        }
        
        
        if (tipo1 == _v_DateTime && tipo2 == _v_String) {
            return fechahoraString();
        } else if (tipo1 == _v_String && tipo2 == _v_DateTime) {
            return stringFechahora();
        }
        if (tipo1 == _v_String && tipo2 == _v_String) {
            return stringString();
        }
        if (tipo1 == _v_Double && tipo2 == _v_Caracter) {
            return doubleCarater();
        }
                if (tipo1 == _v_Caracter && tipo2 == _v_Double) {
            return caracterDouble();
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

        return null;
    }

    protected boolean fechaString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected boolean stringFecha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected boolean fechahoraString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected boolean stringFechahora() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected boolean stringString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected boolean doubleCarater() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected boolean caracterCaracter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected boolean numberCaracter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected boolean caracterNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected boolean doubleDoble() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected boolean numberDouble() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected boolean doubleNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected boolean numberNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected boolean numberBoolean() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected boolean booleanNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected boolean doubleBoolean() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected boolean booleanDouble() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected boolean booleanBoolean() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected boolean caracterDouble() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected boolean dateDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected boolean vDatevDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected boolean stringNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected boolean stringDouble() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected boolean numberString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected boolean doubleString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
