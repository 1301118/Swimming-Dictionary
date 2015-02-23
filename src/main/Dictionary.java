/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author 1303015 Ryan Clarke 23/02/15
 */
public class Dictionary {
    private String definition;

    public Dictionary(String definition) {
        this.definition = definition;
    }

    public String getDefinition() {
        return definition;
    }

    @Override
    public String toString() {
        return "Dictionary{" + "getDefinition=" + definition + '}';
    }
    
    
}
