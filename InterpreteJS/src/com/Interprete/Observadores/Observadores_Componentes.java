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
public class Observadores_Componentes {

    private String idObtener;
    private String tipoObservador;
    public com.Interprete.Metodo.Metodo metodo;

    public Observadores_Componentes() {
        this.idObtener = "";
    }

    public void Observadoruniversal(Interprete aThis, Node nodo) {
        this.idObtener = "";
        String puntoAccion = nodo.childNode.get(0).token.getValueString();// ID PUNTO
        Object nombreComponente = aThis.exp.evaluar(nodo.childNode.get(1));// LISTO cliqueado , modificado
        String esMetodo = nodo.childNode.get(2).term.name;// get Metodo || funcion anonima
        try {
            this.tipoObservador = nombreComponente.toString();
            this.idObtener = "fin";
            try {
                if (esMetodo.equalsIgnoreCase("exp")) {
                    metodo = new com.Interprete.Metodo.Metodo(aThis, nodo.childNode.get(2).childNode.get(0));
                } else if (esMetodo.equalsIgnoreCase("cuerpo")) {
                    metodo = new com.Interprete.Metodo.Metodo(aThis);
                    metodo.addCuerpo(nodo.childNode.get(2));
                }
            } catch (Exception e) {
                aThis.enviarError("error de semantica: no es posible encontrar el mentodo que se va a ejecutar  : " 
                        + " " + (nodo.childNode.get(0).token.Location.Line+1) );

            }
            addObservador(aThis, this); //To change body of generated methods, choose Tools | Templates.

        } catch (Exception e) {
            
            aThis.enviarError("error de semantica: no se pudo crear un observador : " 
                        + " " + (nodo.childNode.get(0).token.Location.Line+1) );
            
        }
    }

    public String getIdObtener() {
        return idObtener;
    }

    public Observadores_Componentes(Interprete aThis, Node nodo, String tipo) {
        //this.i = aThis;
        this.idObtener = "fin";
        this.tipoObservador = nodo.childNode.get(1).token.getValueString();
        if (nodo.childNode.get(2).term.getName().equals("cuerpo")) {
            metodo = new com.Interprete.Metodo.Metodo(aThis);
            metodo.addCuerpo(nodo.childNode.get(2));
        } else {
            metodo = new com.Interprete.Metodo.Metodo(aThis, nodo.childNode.get(2));
        }
        addObservador(aThis, this);
    }

    private void addObservador(Interprete aThis, Observadores_Componentes esto) {
        if (aThis != null && esto != null) {
            switch (this.tipoObservador.toLowerCase()) {
                case "click":
                    aThis.clickO.add(esto);
                    break;
                case "clic":
                    aThis.clickO.add(esto);
                    break;
                case "clik":
                    aThis.clickO.add(esto);
                    break;
                case "listo":
                    aThis.listoO.add(this);
                    break;
                case "modificado":
                    aThis.modificarO.add(esto);
                    break;
                case "cliqueado":
                    aThis.clickO.add(esto);
                    break;
                default:
                     aThis.enviarError("error de semantica: no es un parametro de observador :" +this.tipoObservador);
                        
            }
        }
    }

    public String getTipoObservacion() {
        return tipoObservador;
    }

    public void elementoID(Interprete inter, Node nodo) {
        Object variable = inter.tabla.getValVariable(nodo.childNode.get(0).token.valueString);
        String puntoAccion = nodo.childNode.get(1).token.getValueString();// ID PUNTO
        try {
           agregarAtributoUObservador(variable, puntoAccion, nodo, inter); 
        } catch (Exception e) {
             inter.enviarError("error de semantica: no es posible manipular un objeto :" + puntoAccion + (nodo.childNode.get(1).token.Location.Line +1));
        }
        
    }

    private void agregarAtributoUObservador(Object variable, String puntoAccion, Node nodo, Interprete inter) {

      
            if (puntoAccion.equalsIgnoreCase("setElemento")) {
                Object atributo = inter.exp.evaluar(nodo.childNode.get(2));
                Object valor = inter.exp.evaluar(nodo.childNode.get(3));
                setElemento((Component) variable, atributo.toString(), valor.toString(), inter);

            } else if (puntoAccion.equalsIgnoreCase("Observador")) {
                Object atributo = inter.exp.evaluar(nodo.childNode.get(2));//esto indica si esta listo modificado o cliqueado
                Node cuerpoMetodo = nodo.childNode.get(3);
                agregarObservador((Component) variable, atributo.toString(), cuerpoMetodo, inter);
            }
       
    }

    private void buscarComponente(String idAbuscar, String atributo, String nuevoValor, Interprete aThis) {
        for (CSSI cssi : aThis.cssi) {
            if (cssi.getID().equalsIgnoreCase(idAbuscar)) {
                actualizarComponente(atributo, nuevoValor, cssi,aThis );
                cssi.repitar();
                aThis.Observar(cssi.getID(), "modificado");
            }
        }
    }

    private void actualizarComponente(String atributo, String valor, CSSI cssi,Interprete aThis) {
        switch (atributo.toLowerCase()) {
            case "ancho":
                cssi.ActualizarAncho(Integer.parseInt(valor));
                break;
            case "alto":
                cssi.ActualizarAlto(Integer.parseInt(valor));
                break;
            case "alineado":
                break;
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
                
               aThis.enviarError("error de semantica: actualizar valor :" +atributo.toLowerCase() +valor );
        }
    }
   
    private void setElemento(Component component, String atributo, String valor, Interprete inter) {
        buscarComponente(component.cadena, atributo, valor, inter);
    }

    private void agregarObservador(Component component, String observador, Node cuerpoMetodo, Interprete aThis) {
        String esMetodo = cuerpoMetodo.term.getName();
        try {
            this.tipoObservador = observador;
            this.idObtener = component.cadena;
            try {
                if (esMetodo.equalsIgnoreCase("exp")) {
                    metodo = new com.Interprete.Metodo.Metodo(aThis, cuerpoMetodo.childNode.get(0));
                } else if (esMetodo.equalsIgnoreCase("cuerpo")) {
                    metodo = new com.Interprete.Metodo.Metodo(aThis);
                    metodo.addCuerpo(cuerpoMetodo);
                }
            } catch (Exception e) {
                  aThis.enviarError("error de semantica: no es posible encontrar el mentodo que se va a ejecutar  : " 
                        + " " + esMetodo );
            }
            addObservador(aThis, this); //To change body of generated methods, choose Tools | Templates.

        } catch (Exception e) {
            aThis.enviarError("error de semantica: no es posible crear Observaodor  : " 
                        + " " + esMetodo );
        }
    }

    public void elementoFuncion(Interprete inter, Node nodo) {
        Object variable = inter.exp.evaluarDato(nodo.childNode.get(0));
        String puntoAccion = nodo.childNode.get(1).token.getValueString();// ID PUNTO
        
         try {
           agregarAtributoUObservador(variable, puntoAccion, nodo, inter); 
        } catch (Exception e) {
             inter.enviarError("error de semantica: no es pisible manipular un objeto :" + puntoAccion + (nodo.childNode.get(1).token.Location.Line +1));
        }
        //To change body of generated methods, choose Tools | Templates.
    }

    public void elementoIDVector(Interprete inter, Node nodo) {
        Object variable = inter.exp.evaluarDato(nodo.childNode.get(0));
        String puntoAccion = nodo.childNode.get(1).token.getValueString();// ID PUNTO
          try {
           agregarAtributoUObservador(variable, puntoAccion, nodo, inter); 
        } catch (Exception e) {
             inter.enviarError("error de semantica: no es pisible manipular un objeto :" + puntoAccion + (nodo.childNode.get(1).token.Location.Line +1));
        }
    }

    public void elementoMetodoVector(Interprete inter, Node nodo) {
        Object variable = inter.exp.vectorMetodo(nodo.childNode.get(0));
        String puntoAccion = nodo.childNode.get(1).token.getValueString();// ID PUNTO
          try {
           agregarAtributoUObservador(variable, puntoAccion, nodo, inter); 
        } catch (Exception e) {
             inter.enviarError("error de semantica: no es pisible manipular un objeto :" + puntoAccion + (nodo.childNode.get(1).token.Location.Line +1));
        }
        //To change body of generated methods, choose Tools | Templates.
    }

    public void documentoObtener(Interprete inter, Node nodo) {
        //To change body of generated methods, choose Tools | Templates.
        Object variable = inter.exp.evaluarDato(nodo.childNode.get(0));
        String puntoAccion = nodo.childNode.get(1).token.getValueString();// ID PUNTO
          try {
           agregarAtributoUObservador(variable, puntoAccion, nodo, inter); 
        } catch (Exception e) {
             inter.enviarError("error de semantica: no es pisible manipular un objeto :" + puntoAccion + (nodo.childNode.get(1).token.Location.Line +1));
        }
    }

}
