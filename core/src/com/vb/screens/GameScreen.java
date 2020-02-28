package com.vb.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.vb.gameworld.GameRender;
import com.vb.gameworld.GameWorld;

public class GameScreen implements Screen {

    private GameWorld gameWorld;
    private GameRender gameRender;

    public GameScreen() {
        Gdx.app.log("GameScreen", "attached");
        gameWorld = new GameWorld();
        gameRender = new GameRender(gameWorld);
    }

    @Override
    public void show() {
        Gdx.app.log("GameScreen", "show called");
    }

    @Override
    public void render(float delta) {
        gameWorld.update();
        gameRender.render(delta);
    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log("GameScreen", "resizing");
    }

    @Override
    public void pause() {
        Gdx.app.log("GameScreen", "pause called");
    }

    @Override
    public void resume() {
        Gdx.app.log("GameScreen", "resume called");
    }

    @Override
    public void hide() {
        Gdx.app.log("GameScreen", "hide called");
    }

    @Override
    public void dispose() {

    }
}
