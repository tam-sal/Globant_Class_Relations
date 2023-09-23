/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relclassexcer03.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author blue_
 */
public class Card {

    public static int cardCount = 40;
    private final Random _rand = new Random();
    private int _cardNum;
    private String _cardFig;

    private int generateNum() {
        do {
            _cardNum = _rand.nextInt(12) + 1;
        } while (_cardNum == 8 || _cardNum == 9);
        return _cardNum;
    }
    
    private String generateFig(){
        ArrayList<String> figs = new ArrayList<>(Arrays.asList("sword", "stick", "gold", "cup"));
        return figs.get(_rand.nextInt(figs.size()));
    }

    public Card() {
        this._cardNum = generateNum();
        this._cardFig = generateFig();
    }

    public int getCardNum() {
        return _cardNum;
    }

    public String getCardFig() {
        return _cardFig;
    }

    public void setCardNum(int _cardNum) {
        this._cardNum = _cardNum;
    }

    public void setCardFig(String _cardFig) {
        this._cardFig = _cardFig;
    }

    @Override
    public String toString() {
        return "Card{" + "_cardNum=" + _cardNum + ", _cardFig=" + _cardFig + '}';
    }
    
    

}
