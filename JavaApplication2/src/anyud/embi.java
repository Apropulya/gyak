/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anyud;

/**
 *
 * @author regdony.bence
 */
public class embi {
    String nev;
    boolean ideg;

    public embi(String nev, boolean ideg) {
        this.nev = nev;
        this.ideg = ideg;
    }
    
    @Override
    public String toString() {
        return nev;
    }
    
}
