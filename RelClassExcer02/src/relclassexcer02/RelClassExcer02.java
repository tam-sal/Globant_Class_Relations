/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relclassexcer02;

import relclassexcer02.entities.*;

/**
 *
 * @author blue_
 */
public class RelClassExcer02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Play p = new Play();
        p.fillGameData();
        System.out.println(p.getPlayers().toString());
        System.out.println(p.getWaterGun());
        p.round();
    }

}
