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

/** @pdOid 8df52831-6a9b-45be-98ee-c6f09408f8a4 */
public class MyGame implements com.badlogic.gdx.ApplicationListener {
   /** @pdOid 42d03357-24d7-4c4a-bb5a-d4f7353cae85 */
   private OrthographicCamera camera;
   /** @pdOid d1c74564-ca8c-4ae8-8b86-b7bcfd2e2da8 */
   private SpriteBatch batch;
   /** @pdOid ed00e42a-888d-4a01-829b-5ac8f497fe1d */
   private Texture texture;
   /** @pdOid 70c6467f-9ed5-485f-90c9-1b1e5d9d6a6f */
   private Sprite sprite;
   
   /** @pdOid 6b33a5de-c777-409a-94a0-749dd440bc12 */
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
   
   /** @pdOid 2aa17b6b-9643-4765-8d9b-070a1c36723a */
   @Override
   public void dispose() {
   	batch.dispose();
   	texture.dispose();
   }
   
   /** @pdOid f26df68e-d673-4aa2-bb66-d3e098d07001 */
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
    * @pdOid 4329f26c-9f9b-4da4-b564-2861e2391a5a */
   @Override
   public void resize(int width, int height) {
   }
   
   /** @pdOid 2b680d2d-007e-42da-bf1b-35246fbe4b0f */
   @Override
   public void pause() {
   }
   
   /** @pdOid 86baf52d-5e5f-409d-8e22-115eddadfd74 */
   @Override
   public void resume() {
   }

}