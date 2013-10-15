package lgames;

import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenEquation;
import aurelienribon.tweenengine.TweenEquations;
import aurelienribon.tweenengine.TweenManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class SplashScreen implements Screen{
	private Texture splashTexture;
	private Sprite splashSprite;
	private SpriteBatch batch;
	private Pong game;
	private TweenManager manager;
	
	public SplashScreen(Pong game) {
		this.game = game;
	}
	
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		manager.update(delta);
		
		batch.begin();
		splashSprite.draw(batch);
		batch.end();
	}

	public void resize(int width, int height) {
		
	}

	
	public void show() {
		splashTexture= new Texture("nintendologo.jpg");
		
		splashSprite = new Sprite(splashTexture);
		splashSprite.setPosition(150, 110);
		splashSprite.setColor(1, 1, 1, 0);
		batch = new SpriteBatch();
		
		Tween.registerAccessor(Sprite.class, new SpriteTween());
		manager = new TweenManager();
		Tween.to(splashSprite, SpriteTween.ALPHA, 3f).target(1).ease(TweenEquations.easeInQuad).start(manager);
		
	}

	public void hide() {
		
	}

	public void pause() {
		
	}

	public void resume() {
		
	}

	public void dispose() {
		
	}

	

}
	