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
public class And extends ValorBooleano {

    public And(Node izq, Node der, EvaluarEXP exp) {
        super(izq, der, exp);
    }

     @Override
    protected boolean booleanBoolean() {
        return (boolean) val1 && (boolean) val2;//To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public Object evaluar() {
        return super.evaluar(); //To change body of generated methods, choose Tools | Templates.
    }

}
