/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author regdony.bence
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    static ArrayList<asd> emberek = new ArrayList<>();
    public static void main(String[] args) {
        // TODO code application logic here
        feltolt();
        atlag();
        stat();
    }

    private static void feltolt() {
        File f = new File("konzol.csv");
        try {
            Scanner in = new Scanner(f,"UTF-8");
            in.nextLine();
            String[] adatok;
            while (in.hasNextLine()) {
                adatok=in.nextLine().split(";");
                if (adatok[2].equals("1")) {
                    emberek.add(new asd(adatok[0], Integer.parseInt(adatok[1]), true));
                }
                else{
                    emberek.add(new asd(adatok[0], Integer.parseInt(adatok[1]), false));
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void atlag() {
        double avg=0;
        for (asd emberek1 : emberek) {
            avg+=emberek1.mag;
        }
        avg/=emberek.size();
        //string format
        System.out.printf("Átlag %.2f ",avg);
        // viszatérés
        String s =String.format("Átlag %.2f ",avg);
        // normal
        System.out.println("Átlag: "+avg);
    }

    private static void stat() {
        HashMap<Boolean,Integer> nemek = new HashMap<>();
        for (asd n : emberek) {
            if (!nemek.containsKey(n.nem)) {
                nemek.put(n.nem, 1);
            }
            else{
                nemek.put(n.nem, nemek.get(n.nem)+1);
            }
        }
        System.out.println(nemek);
    }
    
}
