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


public class TipoObjeto {
    public  final
            int _v_date=100,_v_DateTime=101, _v_vacio = -1 ,_v_List = 5,_v_Caracter =3 , _v_Als =6 , _v_Number = 1, _v_String = 4, _v_Boolean = 0, _v_Double = 2, _v_Void = -1, _Tcontinue = 3, _Tdetener = 2 , _Tretornar = 1;

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
        }
  
        return 0;
    }

}
