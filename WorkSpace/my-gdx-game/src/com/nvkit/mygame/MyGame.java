package com.nvkit.mygame;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import java.lang.annotation.*;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/** @pdOid b59203af-852e-4ba8-822e-fd7efeffe0c3 */
public class MyGame implements com.badlogic.gdx.ApplicationListener {
   /** @pdOid c6c25745-aec1-4f64-b9f8-80e0fb77602b */
   private OrthographicCamera camera;
   /** @pdOid 860f8387-18ec-411e-9dbf-bcfbda9d1d76
       @pdRoleInfo migr=yes name=SpriteBatch assc=association1 */
   private SpriteBatch batch;
   /** @pdOid aefe280d-c1fd-4c98-bb99-f94400a3eaf4 */
   private Texture texture;
   /** @pdOid d165801a-dc04-417d-99e5-d9be16c1b818
       @pdRoleInfo migr=yes name=Sprite assc=association2 */
   private Sprite sprite;
   
   /** @pdOid 0809be64-28a5-4979-8ae4-92c16106c504 */
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
   
   /** @pdOid e8e6b0ea-0a75-4eec-b153-070f453215f7 */
   @Override
   public void dispose() {
   	batch.dispose();
   	texture.dispose();
   }
   
   /** @pdOid 54a3b3e2-1451-42c0-9f8d-9c024ae7cf56 */
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
    * @pdOid 35c2c4ef-81bf-435f-ad66-f2c1a047b411 */
   @Override
   public void resize(int width, int height) {
   }
   
   /** @pdOid d287b262-0656-49d5-ba4a-ee4a057b8e86 */
   @Override
   public void pause() {
   }
   
   /** @pdOid 0cee90d9-0f73-40b1-a8f7-a6a7c3c14282 */
   @Override
   public void resume() {
   }

}