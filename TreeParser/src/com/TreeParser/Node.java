/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.TreeParser;

import java.util.ArrayList;

/**
 *
 * @author luigitercero
 */
public class Node {

    public int posl;
    public int posr;
    public Term term;
    public Token token;
    public ArrayList<Node> childNode;
    private int next = -1;

    public Node(Term term, Token token) {
        this.term = term;
        this.token = token;
        this.childNode = new ArrayList<Node>();
        this.next = -1;
    }

    public int getNezt() {

        return this.next;
    }

    public Node(Term term, int left, int right) {
        this.term = term;
        this.childNode = new ArrayList<Node>();
        this.next = -1;
        this.posl = left;
        this.posr = right;
        this.next = -1;
    }

    public Node(Term term) {
        this.term = term;
        this.childNode = new ArrayList<Node>();
        this.next = -1;
    }

    public Node(Term term, ArrayList<Node> childNode) {
        this.term = term;
        this.token = null;
        this.childNode = childNode;
        this.next = -1;
    }

    public Node(Term term, Token token, String a, String menos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Node nextChlid() {
        next++;

        if (this.childNode.size() > next) {
            return this.childNode.get(next);
        } else {
            next = -1;
            return null;
        }

    }

    public void nextChlidReset() {
        next = -1;

    }

}
