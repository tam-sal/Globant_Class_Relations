/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relclassexcer02.entities;

import java.util.Random;

/**
 *
 * @author blue_
 */
public class WaterGun {

    private final Random _rand = new Random();
    private int _actualPos = _rand.nextInt(5) + 1;
    private int _waterPos = _rand.nextInt(5) + 1;

    public WaterGun() {

    }
    
    public void loadGun(){
        this._actualPos = _actualPos;
        this._waterPos = _waterPos;
    }


    public int getActualPos() {
        return this._actualPos;
    }

    public int getWaterPos() {
        return this._waterPos;
    }

    public boolean isTrueShot() {
        return this._actualPos == this._waterPos;
    }

    public void nextWaterBulletPos() {
        if (this._actualPos == 5) {
            this._actualPos = 1;
        } else {
            this._actualPos += 1;
        }
    }

    @Override
    public String toString() {
        return "WaterGun{" + "_actualPos=" + _actualPos + ", _waterPos=" + _waterPos + '}';
    }

}
