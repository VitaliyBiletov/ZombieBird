package com.vb.gameobjects;

import com.badlogic.gdx.math.Vector2;

public class Bird {
    private Vector2 position;
    private Vector2 velocity;
    private Vector2 acceleration;

    private float rotation;
    private int width;
    private int height;


    public Bird(float x, float y, int width, int height) {
        this.width = width;
        this.height = height;
        this.position = new Vector2(x,y);
        this.velocity = new Vector2(0,0);
        this.acceleration = new Vector2(0,460);
    }

    public void update(float delta){
        velocity.add(acceleration.cpy().scl(delta));

        if (velocity.y > 200){
            velocity.y = 200;
        }

        position.add(velocity.cpy().scl(delta));

        if (velocity.y < 0){
            rotation -= 600 * delta;

            if (rotation < -25){
                rotation = -25;
            }
        }

        if (isFalling()) {
            rotation += 480 * delta;
            if (rotation > 90) {
                rotation = 90;
            }
        }
    }

    public void onClick(){
        velocity.y = -140;
    }

    public float getX(){
        return this.position.x;
    }

    public float getY(){
        return this.position.y;
    }

    public float getWidth(){
        return this.width;
    }

    public float getHeight(){
        return this.height;
    }

    public float getRotation(){
        return this.rotation;
    }

    public boolean isFalling(){
        return velocity.y > 100;
    }

    public boolean shouldntFlap(){
        return velocity.y > 70;
    }
}
