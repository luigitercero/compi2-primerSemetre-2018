/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interprete.EXP;

import static com.Interprete.EXP._Token.*;

/**
 *
 * @author luigitercero
 */
public class TipoObjeto {
        public int tipoObjecto(Object var) {
        if (var instanceof Integer) {
            return _v_Number;
        }
        if (var instanceof Long) {
            return _v_Number;
        }
        if (var instanceof Double) {
            return _v_Double;
        }
        if (var instanceof String) {
            return _v_String;
        }
        if (var instanceof Boolean) {
            return _v_Boolean;
        }
        if (var instanceof Character) {
            return _v_Caracter;
        }if (var instanceof Date) {
            return _v_date;
        }if (var instanceof DateTime) {
            return _v_DateTime;
        }
  
        return 0;
    }

}
