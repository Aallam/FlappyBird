package com.aallam.flappybird;

import com.aallam.flappybird.helpers.AssetLoader;
import com.aallam.flappybird.screens.SplashScreen;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

public class FlappyBird extends Game {

  public static final String TITLE = "Flappy Bird";
  public static final float MUSIC_VOLUME = 0.03f; //3%
  public static final float SFX_VOLUME = 0.5f; //50%
  public static final int WIDTH = 480;
  public static final int HEIGHT = 800;
  public static final int SCORE_POSITION = 25;

  @Override public void create() {
    Gdx.gl.glClearColor(0, 0, 0, 1);
    AssetLoader.load();
    setScreen(new SplashScreen(this));
    initMusic();
  }

  private void initMusic() {
    AssetLoader.MUSIC.setVolume(MUSIC_VOLUME);
    AssetLoader.MUSIC.play();
  }

  @Override public void dispose() {
    super.dispose();
    AssetLoader.dispose();
  }
}
