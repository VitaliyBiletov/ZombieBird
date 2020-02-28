package com.vb.zombiebird;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.vb.screens.GameScreen;
import com.vb.zbhelpers.AssetLoader;

public class ZBGame extends Game {

	@Override
	public void create() {
		Gdx.app.log("ZBGame", "created");
		AssetLoader.load();
		setScreen(new GameScreen());
	}

	public void dispose(){
		AssetLoader.dispose();
	}
}
