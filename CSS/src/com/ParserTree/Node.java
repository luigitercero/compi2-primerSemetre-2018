/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ParserTree;


import java.util.ArrayList;

/**
 *
 * @author luigitercero
 */
public class Node {

    
  
   public Term term;
   public Token token;
    public ArrayList<Node> childNode ;
    
public Node(Term term, Token token) {
   this. term = term;
   this.token = token;
   this.childNode = new  ArrayList<Node>();
   }

public Node(Term term) {
   this. term = term;
   this.childNode = new  ArrayList<Node>();
   }

public Node(Term term,ArrayList<Node> childNode) {
   this. term = term;
   this.token = null;
   this.childNode = childNode ;
    }


    
}
