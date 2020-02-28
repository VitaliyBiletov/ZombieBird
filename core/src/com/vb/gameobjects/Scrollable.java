package com.vb.gameobjects;

import com.badlogic.gdx.math.Vector2;

public class Scrollable {
    protected Vector2 position;
    protected Vector2 velocity;
    protected int width;
    protected int height;
    protected boolean isScrollLeft;

    public Scrollable(float x, float y, int width, int height, float scrollSpeed){
        position = new Vector2(x, y);
        velocity = new Vector2(scrollSpeed, 0);
        this.width = width;
        this.height = height;
        isScrollLeft = false;
    }

    public void update(){
        if(position.x + width < 0){
            isScrollLeft = true;
        }
    }

    public void reset(float newX){
        position.x = newX;
        isScrollLeft = false;
    }

    public Vector2 getPosition() {
        return position;
    }

    public Vector2 getVelocity() {
        return velocity;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isScrollLeft() {
        return isScrollLeft;
    }

    public float getTailX(){
        return position.x + width;
    }
}
