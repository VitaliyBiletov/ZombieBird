package com.vb.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class GameRender {

    private GameWorld gameWorld;
    private OrthographicCamera orthographicCamera;

    private ShapeRenderer shapeRenderer;

    public GameRender(GameWorld gameWorld) {
        this.gameWorld = gameWorld;
        orthographicCamera = new OrthographicCamera();
        orthographicCamera.setToOrtho(true,136,204);
    }

    public void render(float delta) {
        Gdx.app.log("GameRender", "render");
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

    }
}
