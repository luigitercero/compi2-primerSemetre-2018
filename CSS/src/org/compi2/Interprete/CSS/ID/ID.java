/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.compi2.Interprete.CSS.ID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author luigitercero
 */
public class ID extends Grupo {

    public HashMap<String, Grupo> grupo;

    public ID(String ID) {
        super(ID);
        grupo = new HashMap<>();
    }

        public ID(Grupo g) {
        super("grupo");
        grupo = new HashMap<>();
            addGrupo(g);
    }
    
    public boolean addGrupo(Grupo g) {
        Grupo valor = grupo.get(g.ID);

        if (valor == null) {
            grupo.put(g.ID, g);
            return true;
        }
        return false;
    }
    
    public String recorrer(){
        String salida = "{\n";
        for (Propiedad propiedade : propiedades) {
            salida = salida +"\n "+propiedade.Propiedad + ":=" + propiedade.valor;
        }
        for (Map.Entry<String, Grupo> entry : grupo.entrySet()) {
            String key = entry.getKey();
            Grupo value = entry.getValue();
            salida = salida + "\n  " + key + value.recorrer();
        }
        return salida +"\n  }";
    }

}
