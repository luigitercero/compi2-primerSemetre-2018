/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Navegador.JS;

import Simbol.Metodo.Estructura;
import Simbol.Metodo.Metodo;
import com.Interprete.EXP.EvaluarEXP;
import com.Interprete.EXP.TipoObjeto;
import com.Interprete.Metodo.Imprimir;
import com.Interprete.Observadores.Observadores_Componentes;
import com.Interprete.Observadores.SetElemento;
import com.Iterprete.Control.For;
import com.Iterprete.Control.IF1;
import com.Iterprete.Control.IF2;

import com.Iterprete.Control.Switch;
import com.Iterprete.Control.While;
import com.TreeParser.Node;
import com.TreeParser.ParserTree;

import java.util.ArrayList;
import simbol.tablasimbolos.TablaSimbolo;
import simbol.tablasimbolos.Variable;

/**
 *
 * @author luigitercero
 */
public class Interprete implements observador.Observador {

    public final int LISTA = 3, brea = 2, retu = 1;
    public TablaSimbolo tabla;
    public ArrayList<observador.CSSI> cssi;
    public String consola;
    public EvaluarEXP exp;
    public Metodo metodo;
    public ArrayList<Observadores_Componentes> clickO;
    public ArrayList<Observadores_Componentes> modificarO;
    public ArrayList<Observadores_Componentes> listoO;

    public void agregarComponenteCSSi(ArrayList<observador.CSSI> cssi) {
        this.cssi = cssi;
    }

    public Interprete() {
        tabla = new TablaSimbolo();
        exp = new EvaluarEXP(this);
        clickO = new ArrayList<>();
        modificarO = new ArrayList<>();
        listoO = new ArrayList<>();
        this.consola = "";
    }

    public void iniciar(ParserTree nodo) {
        nodo.root.childNode.forEach(e -> Principal(e));
    }

    public void iniciar(ArrayList<ParserTree> declaracion, Metodo metodo, ParserTree nodo) {
        //To change body of generated methods, choose Tools | Templates.
        declaracion.forEach(e -> declarar(e.root));
        this.metodo = metodo;
        nodo.root.childNode.forEach(e -> Principal(e));
        //update();
    }

    public void Principal(Node nodo) {
        String inst = nodo.term.getName().toLowerCase();
        //System.err.println(inst);
        switch (inst) {

            case "observadorfin":
                Observadores_Componentes b = new Observadores_Componentes(this, nodo, "fin");
                // addObservador(b);//b.agreagarObservador();
                break;
            case "observador":
                Observadores_Componentes r = new Observadores_Componentes(this, nodo);
                //Observadores_Componentes a = new Observadores_Componentes(this,nodo);
                //a.agreagarObservador();
                break;
            case "setelemento":
                new SetElemento(this,nodo);
                break;
            case "metodo":
                break;
            case "declaracion":
                break;

            case "getmetodo":
                com.Interprete.Metodo.Metodo m = new com.Interprete.Metodo.Metodo(this, nodo);
                m.Ejecutar();
                break;
            case "imprimir":
                new Imprimir(nodo, this);
                break;
            case "control":
                control(nodo.childNode.get(0), false);
                break;
            default:
                asignarValor(nodo);
        }
    }

    public int listacuerpo(Node nodo, boolean ciclo) {
        int salida = 0;
        for (Node nodeTree : nodo.childNode) {
            if (salida == 0) {
                salida = cuerpo(nodeTree, ciclo);
            }
        }
        return salida;
    }

    public int cuerpo(Node nodo, boolean ciclo) {
        String inst = nodo.term.getName().toLowerCase();
        switch (inst) {
            case "setelemento":
                new SetElemento(this,nodo);
                return 0;
                
            case "control":
                return control(nodo.childNode.get(0), ciclo);
            case "imprimir":
                new Imprimir(nodo, this);
                return 0;
            case "terminar":
                if (ciclo) {
                    return brea;
                } else {
                    return 0;
                }
            case "declaracion":
                declarar(nodo);
                return 0;
            case "retornar":
                if (nodo.childNode.size() > 0) {
                    Variable r = tabla.getVariable("retorno");
                    r.valor = exp.evaluar(nodo.childNode.get(0));
                }
                return retu;
            case "getmetodo":
                com.Interprete.Metodo.Metodo m = new com.Interprete.Metodo.Metodo(this, nodo);
                m.Ejecutar();
                break;
            default:
                asignarValor(nodo);
        }
        return 0;
    }

    public int control(Node nodo, boolean ciclo) {
        String inst = nodo.term.getName();
        switch (inst) {
            case "if1":
                IF1 si = new IF1(nodo, this);
                return si.ejecutar(nodo, ciclo);
            case "if2":
                IF2 si2 = new IF2(nodo, this);
                return si2.ejecutar(nodo, ciclo);
            case "mientras":
                While w = new While(nodo, this);
                return w.ejecutar(nodo, ciclo);

            case "para":
                For f = new For(nodo, this);
                return f.ejecutar(nodo, ciclo);

            case "switch":
                Switch s = new Switch(nodo, this);
                return s.ejecutar(nodo, ciclo);
        }
        return 0;

    }

    private void declarar(Node e) {
        Node asignacion = e.childNode.get(0);
        if (asignacion.term.name.equalsIgnoreCase("asignacion")) {
            String nombre = asignacion.childNode.get(0).token.valueString;
            tabla.addVariable(nombre, null, -1);
            if (asignacion.childNode.get(1).childNode.size() > 0) {
                asignarValor(asignacion);
            }
        }

        if (asignacion.term.name.equalsIgnoreCase("asignacionll")) {
            String nombre = asignacion.childNode.get(0).token.valueString;

            if (exp.evaluar(asignacion.childNode.get(1)) instanceof Long) {

                Long tam = (long) exp.valor;

                ArrayList spacio = new ArrayList();
                for (int i = 0; i < tam; i++) {
                    spacio.add(new Variable(nombre, -1));
                }
                tabla.addVariable(nombre, spacio, LISTA);
            } else {
                System.err.println("no es posible crear arreglo");
            }

        }

    }

    private void asignarValor(Node val) {
        String tipoAsig = val.term.name;
        String nombre = val.childNode.get(0).token.valueString;
        simbol.tablasimbolos.Variable var = tabla.getVariable(nombre);
        try {
            if (var != null) {
                switch (tipoAsig) {
                    case "asignacion":
                        asignacion(var, val.childNode.get(1));
                        break;
                    case "asignacionll":
                        asignarAarreglo(var, val.childNode.get(1), val.childNode.get(2));
                        break;
                    case "asignacion++":
                        asignarpp(var);
                        break;
                    case "asignacion--":
                        asignarmm(var);
                        break;
                }
            }
        } catch (Exception e) {

            System.err.println(nombre + " error al declarar la variable " + val.childNode.get(0).token.Location.Column + " " + val.childNode.get(0).token.Location.Line);
        }

    }

    private void asignacion(Variable var, Node get) {
        String nombre = var.nombre;
        if (get.term.name.equalsIgnoreCase("asignar")) {
            Node valor = get.childNode.get(0);
            if (valor.term.name.equalsIgnoreCase("asigna")) {//asignacio normal
                Object value = this.exp.evaluar(valor.childNode.get(0));
                var.valor = value;
                TipoObjeto t = new TipoObjeto();
                var.tipo = t.tipoObjecto(value);
            } else if (valor.term.name.equalsIgnoreCase("asignall")) {//asignacion de lista
                ArrayList lista = new ArrayList();
                Node datos = valor.childNode.get(0);
                TipoObjeto t = new TipoObjeto();
                Object valFinal;
                for (Node node : datos.childNode) {
                    valFinal = this.exp.evaluar(node);
                    lista.add(new Variable(var.nombre, valFinal, t.tipoObjecto(valFinal))
                    );
                }
                var.valor = lista;
            }

        } else {

        }
    }

    private void asignarAarreglo(Variable var, Node get, Node value) {
        Long valor = (long) this.exp.evaluar(get);
        int poss = valor.intValue();
        ArrayList val = (ArrayList) var.valor;

        if (value.childNode.get(0).childNode.size() > 0) {
            Object va = this.exp.evaluar(value.childNode.get(0).childNode.get(0));
            Variable variable
                    = (Variable) val.get(poss);

            variable.valor = va;
            TipoObjeto t = new TipoObjeto();
            variable.tipo = t.tipoObjecto(va);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void asignarpp(Variable var) {
        TipoObjeto t = new TipoObjeto();
        if (t.tipoObjecto(var.valor) == 1) {
            var.valor = (long) var.valor + 1;
        }
    }

    private void asignarmm(Variable var) {
        TipoObjeto t = new TipoObjeto();
        if (t.tipoObjecto(var.valor) == 1) {
            var.valor = (long) var.valor - 1;
        }
    }

    @Override
    public void update() {
        for (Observadores_Componentes a : listoO) {

            a.metodo.Ejecutar();

        }
    }

    @Override
    public void update(String id) {
        System.out.println("ejecutar Metodo ahora"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Observar(String id, String tipo) {
        switch (tipo) {
            case "click":
                for (Observadores_Componentes a : clickO) {
                    if (a.getIdObtener().equalsIgnoreCase(id)) {
                        a.metodo.Ejecutar();
                    }
                }
                break;
            case "listo":
                for (Observadores_Componentes a : listoO) {
                    if (a.getIdObtener().equalsIgnoreCase(id)) {
                        a.metodo.Ejecutar();
                    }
                }
                break;
            case "modificado":
                  for (Observadores_Componentes a : modificarO) {
                    if (a.getIdObtener().equalsIgnoreCase(id)) {
                        a.metodo.Ejecutar();
                    }
                }
                break;

        } //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void UpdateMetodo(String metodo) {
        System.out.println("Se ejecuta el Metodo " + metodo); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void UpdateRuta(String ruta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
