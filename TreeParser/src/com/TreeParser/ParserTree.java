/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.TreeParser;

import java.util.ArrayList;
//import java_cup.runtime.Symbol;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author luigitercero
 */
public class ParserTree {

    public Node root;
    //public ArrayList<Symbol> ParserMessages;
    public ParserTree(Node nodo) {
        root = nodo;
    }

    public ParserTree(String nodo) {
        root = new Node (new Term(nodo));
    }
    public ParserTree(String nodo,int left,int right) {
        root = new Node (new Term(nodo),left,right);
    }
    
    public void addChild(Node pa, Node child) {
        pa.childNode.add(child);

    }
    

    public void addChildren(Node pa, ArrayList<Node> childNode) {
        pa.childNode = childNode;

    }

    public void addChildren(Node... child) {
        for (int i = 0; i < child.length; i++) {
            this.root.childNode.add(child[i]);
        }
    }
    
    
    public void addChildren(ParserTree... child) {
        for (int i = 0; i < child.length; i++) {
            this.root.childNode.add(child[i].root);
        }
    }
    
    
    int contador =0;
    public void Arbol_listar_enlazar(Node nodo, int num){
        
            if (nodo != null)
            {
                System.out.println(nodo.term.getName());
                int tam = nodo.childNode.size();
                int actual;
                for (int i = 0; i < tam; i++)
                {
                    contador = contador + 1;
                    actual = contador;
                    Arbol_listar_enlazar(nodo.childNode.get(i), contador);
                    
                }
            }    
    }
    
    public String recorrerArbol(){
    String salida = "";
        salida += root.term.name+ "\n";
    for (Node node : root.childNode) {
          salida += recorrerArbol(node,"");
     }
    
    return salida;
    }
    
    
    private String recorrerArbol(Node nodo,String tab){
        String salida ="";
        tab += " ";
        salida += tab +nodo.term.name+ "\n";
        for (Node node : nodo.childNode) {
          salida+= recorrerArbol(node,tab);
     }
        return salida;
    }

}
