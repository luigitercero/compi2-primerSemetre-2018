/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interprete.EXP;

import com.Interprete.EXP.Funcion.IgualIgual;
import com.Interprete.EXP.Funcion.MenorIgual;
import com.Interprete.EXP.Funcion.*;
import com.Interprete.EXP.Funcion.Restar;
import com.Interprete.EXP.Funcion.Sumar;
import static com.Interprete.EXP._Token.*;
import com.Iterprete.Control.Instruccion;
import com.Navegador.JS.Interprete;
import com.TreeParser.Node;
import java.util.ArrayList;
import simbol.tablasimbolos.TablaSimbolo;
import simbol.tablasimbolos.Variable;

/**
 *
 * @author luigitercero
 */
public class EvaluarEXP extends Instruccion {

    public Object valor;
    private String tipo;

    public EvaluarEXP() {
        this.valor = null;
        this.tipo = "";
    }

    public EvaluarEXP(Interprete interprete) {
        this.valor = null;
        this.tipo = "";
        this.inter = interprete;
    }

    public Object evaluar(Node nodo) {
        int size = nodo.childNode.size();

        switch (size) {
            case 3:
                this.valor = evaluarOperacion(nodo);
                return valor;
            case 2:
                this.valor = evaluarSolito(nodo);
                return valor;
            case 1:
                this.valor = evaluarDato(nodo.childNode.get(0));
                return valor;

            default:
                this.inter.enviarError("Error de semantica: no es posible evaluar operacion");
        }
        return null;
    }

    private Object evaluarOperacion(Node nodo) {
        String operador = nodo.childNode.get(1).term.name;
        try {
            switch (operador) {
                case mas:
                    return evaluarMas(nodo.childNode.get(0), nodo.childNode.get(2));
                case menos:
                    return evaluarMenos(nodo.childNode.get(0), nodo.childNode.get(2));
                case igual:
                    return evaluarIgual(nodo.childNode.get(0), nodo.childNode.get(2));
                case menorIgual:
                    return evaluarMenorIgual(nodo.childNode.get(0), nodo.childNode.get(2));
                case andd:
                    return evaluarAnd(nodo.childNode.get(0), nodo.childNode.get(2));
                case div:
                    return evaluarDividir(nodo.childNode.get(0), nodo.childNode.get(2));
                case mayorIgual:
                    return evaluarMayorIgual(nodo.childNode.get(0), nodo.childNode.get(2));
                case mayorque:
                    return evaluaMayoruque(nodo.childNode.get(0), nodo.childNode.get(2));
                case menorque:
                    return evaluarMenorque(nodo.childNode.get(0), nodo.childNode.get(2));
                case "MOD":
                    return evaluarModular(nodo.childNode.get(0), nodo.childNode.get(2));
                case por:
                    return evaluarMultipliacion(nodo.childNode.get(0), nodo.childNode.get(2));
                case noIgual:
                    return evaluarNoIgual(nodo.childNode.get(0), nodo.childNode.get(2));
                case orr:
                    return evaluarOR(nodo.childNode.get(0), nodo.childNode.get(2));
                case eleva:
                    return evaluaEleva(nodo.childNode.get(0), nodo.childNode.get(2));
            }
        } catch (Exception e) {
            this.inter.enviarError("Error de semantica: error al castear numero");
        }
           this.inter.enviarError("Error de semantica: operador no progrmamado "+ operador);
        
        return null;
    }

    public Object evaluarDato(Node nodo) {
        String termino = nodo.term.getName();
        switch (termino) {
            case numero:
                return evaluarNumero(nodo);
            case decimal:
                return evaluarNumero(nodo);
            case cadena:
                String a = nodo.token.valueString.replaceAll("\"", "");
                return a;
            case falso:
                return false;
            case verdadero:
                return true;
            case date:
                return new Date(nodo.token.valueString.replaceAll("\'", ""));
            case dateTieme:
                return new DateTime(nodo.token.valueString.replaceAll("\'", ""));
            case "ID":
                return inter.tabla.getValVariable(nodo.token.getValueString());
            case "vector":
                Object cv = evaluar(nodo.childNode.get(1));
                if (cv instanceof Long) {
                    Long l = (long) cv;
                    return inter.tabla.getValVariable(nodo.childNode.get(0).token.getValueString(), l.intValue());
                }
                break;
            case "getMetodo":
                com.Interprete.Metodo.Metodo m = new com.Interprete.Metodo.Metodo(inter, nodo);
                return m.Ejecutar();
            case "getComponente":
                
                
                return new Component(nodo.childNode.get(0).token.valueString, nodo.childNode.get(1),inter);
            case "Vectorconteo":
                try {
                    return vectorConteo(nodo);
                } catch (Exception e) {
                    System.err.println("error al querer trabajar con arreglos " + nodo.childNode.get(0).posl + " " + nodo.childNode.get(0).posr);
                }
                break;
            case "arreglo":
                try {
                    return arreglo(nodo);
                } catch (Exception e) {
                    System.err.println("error al querer trabajar con arreglos " + nodo.childNode.get(0).posl + " " + nodo.childNode.get(0).posr);
                }
                break;
            case "VectorAtexto":
                try {
                    return vectoTexto(nodo);
                } catch (Exception e) {
                    System.err.println("error al querer trabajar con arreglos " + nodo.childNode.get(0).posl + " " + nodo.childNode.get(0).posr);
                }
                break;
            case "vectorMetodo":
                try {
                    return vectorMetodo(nodo);
                } catch (Exception e) {
                    System.err.println("error al querer trabajar con arreglos " + nodo.childNode.get(0).posl + " " + nodo.childNode.get(0).posr);

                }
                break;
        }
        this.inter.enviarError("Error de semantica: no es posible evaluar dato "+ termino);
        return null;
    }

    private Object evaluarNumero(Node nodo) {
        if (nodo.token.Tipo == numero) {
            return Long.parseLong(nodo.token.valueString);
        } else {
            return Double.parseDouble(nodo.token.valueString);
        }
    }

    private Object evaluarIgual(Node get, Node get0) {
        IgualIgual igualar = new IgualIgual(get, get0, this);
        return igualar.evaluar(); //To change body of generated methods, choose Tools | Templates.
    }

    private Object evaluarMas(Node izq, Node der) {
        Sumar suma = new Sumar(izq, der, this);
        return suma.evaluar();
    }

    private Object evaluarMenorIgual(Node get, Node get0) {
        MenorIgual v = new MenorIgual(get, get0, this);
//To change body of generated methods, choose Tools | Templates.
        return v.evaluar();
    }

    private Object evaluarMenos(Node get, Node get0) {
        Restar re = new Restar(get, get0, this);
        return re.evaluar();
    }//To change body of generated methods, choose Tools | Templates.

    private long vectorConteo(Node nodo) {
        Object ve = inter.exp.evaluarDato(nodo.childNode.get(0));

        ArrayList vector = (ArrayList) ve;
        return vector.size();

    }

    private Object arreglo(Node datos) {

        ArrayList lista = new ArrayList();

        TipoObjeto t = new TipoObjeto();
        Object valFinal;
        for (Node node : datos.childNode) {
            valFinal = inter.exp.evaluar(node);
            lista.add(new Variable("returnoLista", valFinal, t.tipoObjecto(valFinal))
            );
        }
        return lista;
        //To change body of generated methods, choose Tools | Templates.
    }

    private String vectoTexto(Node nodo) {
        Object ve = inter.exp.evaluarDato(nodo.childNode.get(0));
        ArrayList vector = (ArrayList) ve;
        String salida = "";
        for (Object object : vector) {
            Variable val = (Variable) object;
            salida = salida + val.valor +",";
        }
        return "{"+ salida +"}";
    }

    public Object vectorMetodo(Node nodo) {
        Object val = inter.exp.evaluarDato(nodo.childNode.get(0));
        Object pos = inter.exp.evaluar(nodo.childNode.get(1));
        ArrayList arra = (ArrayList) val;
        Long poss = (long) pos;
        Variable vari = (Variable) arra.get(poss.intValue());
        return vari.valor;
    }

    private Object evaluarOR(Node get, Node get0) {
        Or operador = new Or(get, get0, this);
        return operador.evaluar();
    }

    private Object evaluarNoIgual(Node get, Node get0) {
        NoIgual operador = new NoIgual(get, get0, this);
        return operador.evaluar();
    }

    private Object evaluarMultipliacion(Node get, Node get0) {
        Multiplicar operador = new Multiplicar(get, get0, this);
        return operador.evaluar();
    }

    private Object evaluarModular(Node get, Node get0) {
        Modulo operador = new Modulo(get, get0, this);
        return operador.evaluar();
    }

    private Object evaluarMenorque(Node get, Node get0) {
        MenorQue operador = new MenorQue(get, get0, this);
        return operador.evaluar();
    }

    private Object evaluaMayoruque(Node get, Node get0) {
        MayorQue operador = new MayorQue(get, get0, this);
        return operador.evaluar();
    }

    private Object evaluarMayorIgual(Node get, Node get0) {
        MayorIgual operador = new MayorIgual(get, get0, this);
        return operador.evaluar();
    }

    private Object evaluarDividir(Node get, Node get0) {
        Dividir operador = new Dividir(get, get0, this);
        return operador.evaluar();
    }

    private Object evaluarAnd(Node get, Node get0) {
        And operador = new And(get, get0, this);
        return operador.evaluar();
    }

    private Object evaluaEleva(Node get, Node get0) {
        Eleva operador = new Eleva(get, get0, this);
        return operador.evaluar();
    }

    private Object evaluarSolito(Node nodo) {
        String termino = nodo.term.getName();

        if (nodo.childNode.get(0).term.getName().equals(menos)) {
            Object val1 = inter.exp.evaluar(nodo.childNode.get(1));

            TipoObjeto t = new TipoObjeto();
            int tipo = t.tipoObjecto(val1);
            if (tipo == _v_Double) {
                return (Double) val1 * -1;
            } else if (tipo == _v_Number) {
                return (long) val1 * -1;
            }
        } else if (nodo.childNode.get(0).term.getName().equals("NEL")) {
            return evaluarNOT(nodo);
        }
        return null;

    }

    private Object evaluarNOT(Node nodo) {
          Node der = nodo.childNode.get(1);
        Boolean val;
   
            val = (boolean) (inter.exp.evaluar(der));
            return !val;
        
            
           // errorhtml.agregarError(Semantic, "recibe sola vaolores boooleanos " + evaluarEXP(der).toString() + " no es booleano", nameArchivo, nodo.childNode.get(0));
      

        //ejecutarIMPRIMIRERROR("! solo recibe booleano como parametro");
      
        
    }
}
