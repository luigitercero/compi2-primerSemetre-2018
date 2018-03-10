/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interprete.Observadores;

import com.Interprete.EXP.Component;
import com.Navegador.JS.Interprete;
import com.TreeParser.Node;
import observador.CSSI;

/**
 *
 * @author luigitercero
 */
public class SetElemento {

    public SetElemento(Interprete aThis, Node nodo) {
              
        Object valor = aThis.exp.evaluarDato(nodo.childNode.get(0));
        
        if (valor instanceof Component) {
            Component c =(Component) valor;
            String idAbuscar = c.cadena;
            String atributo = nodo.childNode.get(2).token.valueString;
            String nuevoValor = nodo.childNode.get(3).token.valueString;
            buscarComponente(idAbuscar,atributo,nuevoValor,aThis);
             //To change body of generated methods, choose Tools | Templates.
        } else {
            aThis.enviarError("error de semantica: hacer un set elemento  : " +nodo.childNode.get(2).token.Location.Line +1);
           
        }
        
    }

    private void buscarComponente(String idAbuscar, String atributo, String nuevoValor, Interprete aThis) {
        for (CSSI cssi : aThis.cssi) {
            if(cssi.getID().equalsIgnoreCase(idAbuscar)){
                actualizarComponente(atributo,nuevoValor,cssi);
                cssi.repitar();
                aThis.Observar(cssi.getID(), "modificado");
            }
        }
    }

    private void actualizarComponente(String atributo, String valor, CSSI cssi) {
              switch (atributo.toLowerCase()) {
            case "ancho":
                cssi.ActualizarAncho(Integer.parseInt(valor));
                break;
            case "alto":
                cssi.ActualizarAlto(Integer.parseInt(valor));
                break;
            case "alineado":
            case "grupo":
                cssi.ActualizarGrupo(valor);
                break;
            case "id":
                cssi.ActualiarID(valor);

                break;
            case "ruta":
                cssi.ActualizaRuta(valor);

                break;
            case "click":
                cssi.ActualizarClick(valor);
                break;
            case "clic":
                cssi.ActualizarClick(valor);
                break;
            case "valor":
                break;
            default:
                System.err.println("no son parametros validos");
        }
    }
    
    
    
}
