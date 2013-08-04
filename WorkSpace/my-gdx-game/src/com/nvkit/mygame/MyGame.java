package com.nvkit.mygame;

import java.lang.annotation.*;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/** @pdOid 3ff734f0-53a8-4db2-961c-c867b36df330 */
public class MyGame {
   /** @pdOid 2c71a04c-fd89-4690-8d15-8ac347fb4368 */
   private OrthographicCamera camera;
   /** @pdOid a7caa0eb-2990-498a-a749-7285c038b8cc */
   private SpriteBatch batch;
   /** @pdOid ba462ec5-1c6d-4562-853d-e237d499d6e7 */
   private Texture texture;
   /** @pdOid 5c1fe18f-ce89-41e7-9b23-3dfc481d2b2a */
   private Sprite sprite;
   
   /** @pdOid c7348eea-7d79-404e-a422-345412de8f7d */
   @Override
   public void create() {		
   	float w = Gdx.graphics.getWidth();
   	float h = Gdx.graphics.getHeight();
   	
   	camera = new OrthographicCamera(1, h/w);
   	batch = new SpriteBatch();
   	
   	texture = new Texture(Gdx.files.internal("data/libgdx.png"));
   	texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
   	
   	TextureRegion region = new TextureRegion(texture, 0, 0, 512, 275);
   	
   	sprite = new Sprite(region);
   	sprite.setSize(0.9f, 0.9f * sprite.getHeight() / sprite.getWidth());
   	sprite.setOrigin(sprite.getWidth()/2, sprite.getHeight()/2);
   	sprite.setPosition(-sprite.getWidth()/2, -sprite.getHeight()/2);
   }
   
   /** @pdOid 0a0a5ea6-1661-4294-931b-52b4a4cda409 */
   @Override
   public void dispose() {
   	batch.dispose();
   	texture.dispose();
   }
   
   /** @pdOid 82b2e1f7-559c-459f-802b-74d41a58a36d */
   @Override
   public void render() {		
   	Gdx.gl.glClearColor(1, 1, 1, 1);
   	Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
   	
   	batch.setProjectionMatrix(camera.combined);
   	batch.begin();
   	sprite.draw(batch);
   	batch.end();
   }
   
   /** @param width 
    * @param height
    * @pdOid e2494637-f9a8-40c8-bec2-83db9f03d8f6 */
   @Override
   public void resize(int width, int height) {
   }
   
   /** @pdOid 1fbc9cde-5831-4b68-b75c-30c8ca6ea02d */
   @Override
   public void pause() {
   }
   
   /** @pdOid ac0762d7-312e-42ec-ba08-0413deb3cf51 */
   @Override
   public void resume() {
   }

}