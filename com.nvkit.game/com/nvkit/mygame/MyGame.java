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
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/** @pdOid 6cf59f4b-3d0f-47b0-bda1-a7db16156b1b */
public class MyGame implements com.badlogic.gdx.ApplicationListener {
   /** @pdOid f1fbaa59-37c5-477e-9821-1954dfcd3040 */
   private OrthographicCamera cameram;
   /** @pdOid f5ff86ed-a421-4cec-bfb3-819114aa2675 */
   private Texture texture;
   /** @pdOid 1fd2e8f0-a299-4774-88ce-34da6c7a30c3 */
   private Sprite sprite;
   
   /** @pdOid d94c06e2-0d06-4b26-b753-ecfb1310a05f */
   @Override
   public void create() {		
   		float w = Gdx.graphics.getWidth();
   		float h = Gdx.graphics.getHeight();
   		
   		camera = new OrthographicCamera(1, h/w);
   		batch = new SpriteBatch();
   		
   //		texture = new Texture(Gdx.files.internal("data/libgdx.png"));
   //		texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
   		TextureAtlas atlas = new TextureAtlas(Gdx.files.internal("datadesk/image/celltexture.txt"));
   		TextureRegion region =atlas.findRegion("blank2");// new TextureRegion(texture, 0, 0, 512, 275);
   		
   		sprite = new Sprite(region);
   		sprite.setSize(0.1f, 0.1f);
   		sprite.setOrigin(sprite.getWidth()/2, sprite.getHeight()/2);
   		sprite.setPosition(-sprite.getWidth()/2, -sprite.getHeight()/2);
   	}
   
   /** @pdOid 8fc6f64c-c6a8-4542-9b6f-3b92bc6a66e6 */
   @Override
   public void dispose() {
   	batch.dispose();
   	texture.dispose();
   }
   
   /** @pdOid ef1d62d0-c916-439a-9138-a25e971ad790 */
   @Override
   public void render() {		
   	Gdx.gl.glClearColor(1, 1, 0, 1);
   	Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
   	
   	batch.setProjectionMatrix(camera.projection);
   	batch.begin();
   	sprite.draw(batch);
   	batch.end();
   }
   
   /** @param width 
    * @param height
    * @pdOid d4fa2585-6f3a-4d6e-ad05-8441eceb9440 */
   @Override
   public void resize(int width, int height) {
   }
   
   /** @pdOid 2b2fb99b-4547-4984-83d3-a37bcb3ff269 */
   @Override
   public void pause() {
   }
   
   /** @pdOid e1e9d89c-7da6-45fe-bee5-e5f2a73c28ca */
   @Override
   public void resume() {
   }

}