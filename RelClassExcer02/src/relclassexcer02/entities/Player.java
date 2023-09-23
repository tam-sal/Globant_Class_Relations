/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relclassexcer02.entities;

/**
 *
 * @author blue_
 */
public class Player {
    
    public static int playerCount = 6;
    private int _id;
    private String _name;
    private boolean _waterShot;
    private final WaterGun _wg = new WaterGun();

    public Player() {
    }

    public Player(int id) {
        this._id = id;
        this._name = "Player "+String.valueOf(id);
        this._waterShot = false;
    }
    
    public boolean shootSelf(){
        this._waterShot = _wg.isTrueShot();
        _wg.nextWaterBulletPos();
        return this._waterShot;
    }

    public int getId() {
        return _id;
    }

    public String getName() {
        return _name;
    }

    public boolean isWaterShot() {
        return _waterShot;
    }

    public void setWaterShot(boolean _waterShot) {
        this._waterShot = _waterShot;
    }
    
    

    @Override
    public String toString() {
        return "Player{" + "_id=" + _id + ", _name=" + _name + ", _waterShot=" + _waterShot + '}';
    }
    
    
    
    
    
    
    
    
    
    
}
