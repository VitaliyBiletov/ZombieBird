package com.vb.gameworld;

import com.badlogic.gdx.Gdx;

import java.awt.Rectangle;

public class GameWorld {

    private Rectangle rectangle = new Rectangle(0,0,17,12);

    public void update() {
        Gdx.app.log("GameWorld", "update");
        rectangle.x++;
        if (rectangle.x > 117)
            rectangle.x = 0;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }
}
