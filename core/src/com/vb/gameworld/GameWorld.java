package com.vb.gameworld;

import com.badlogic.gdx.Gdx;
import com.vb.gameobjects.Bird;

import java.awt.Rectangle;

public class GameWorld {

    private Bird bird;


    public GameWorld(int midPointY) {
        bird = new Bird(33, midPointY - 5, 17, 12);
    }

    public void update(float delta) {
        bird.update(delta);
    }

    public Bird getBird(){
        return this.bird;
    }

}
