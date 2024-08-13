/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generico;

/**
 *
 * @author anderson
 */
public class Generico {

    public <G> void impressao(G vetor[]){
        for(G a: vetor) System.out.println(a);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer a[] = {1, 2, 3, 4, 5};
        Double b[] = {0.1, 0.2, 0.3, 0.4, 0.5};
        Character c[] = {'a', 'b', 'c', 'd', 'e'};
        
        Generico j = new Generico();
        
        j.impressao(a);
        j.impressao(b);
        j.impressao(c);
    }
    
}
