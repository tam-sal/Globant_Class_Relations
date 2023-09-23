/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relclassexcer02.entities;

import java.util.ArrayList;

/**
 *
 * @author blue_
 */
public class Play {

    private ArrayList<Player> _players = new ArrayList();
    private WaterGun _wg = new WaterGun();

    public Play() {

    }

    public void fillGameData() {
        for (int i = 1; i <= Player.playerCount; i++) {
            _players.add(new Player(i));
        }
        _wg.loadGun();
        this._players = _players;
        this._wg = _wg;

    }

    public ArrayList<Player> getPlayers() {
        return _players;
    }

    public WaterGun getWaterGun() {
        return _wg;
    }

    public void round() {
        boolean isPlayerShot = false;
        while (!isPlayerShot) {
            for (Player p : _players) {
                isPlayerShot = p.shootSelf();
                if (isPlayerShot) {
                    System.out.println(p.getName() + " has been shot");
                    break;
                } else {
                    System.out.println(p.getName() + " not wet yet");
                }

            }
        }
    }

}
