package com.vb.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.vb.gameworld.GameRender;
import com.vb.gameworld.GameWorld;
import com.vb.zbhelpers.InputHandler;

public class GameScreen implements Screen {

    private GameWorld gameWorld;
    private GameRender gameRender;

    public GameScreen() {
        Gdx.app.log("GameScreen", "attached");

        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float gameWidth = 136;
        float gameHeight = screenHeight / (screenWidth / gameWidth);

        int midPointY = (int) (gameHeight/2);

        gameWorld = new GameWorld(midPointY);
        gameRender = new GameRender(gameWorld);

        Gdx.input.setInputProcessor(new InputHandler(gameWorld.getBird()));
    }

    @Override
    public void show() {
        Gdx.app.log("GameScreen", "show called");
    }

    @Override
    public void render(float delta) {
        gameWorld.update(delta);
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
