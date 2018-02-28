/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.compi2.Interprete.CSS.ID;

import com.ParserTree.Node;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author luigitercero
 */
public class CSS {

    public HashMap<String, ID> css;

    public CSS() {
        css = new HashMap<String, ID>();
    }

    public CSS(ID id) {
        css = new HashMap<String, ID>();
        addID(id);
    }

    public boolean addID(ID id) {

        ID valor = this.css.get(id.ID);
        if (valor == null) {
            this.css.put(id.ID, id);
            return true;
        }
        return false;
    }

    public String recorrer() {
        String recorrer="{\n";
        for (Map.Entry<String, ID> entry : css.entrySet()) {
            String key = entry.getKey();
            ID value = entry.getValue();
            recorrer = recorrer + "\n"+ key + value.recorrer();
        }
        return recorrer+"\n}";
    }

}
