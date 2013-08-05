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
public class MyGame implements com.badlogic.gdx.ApplicationListener, GameEngine {
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
   
   /** @pdRoleInfo migr=no name=Scene assc=association4 */
   Scene scene;
   
   /** @pdOid 0809be64-28a5-4979-8ae4-92c16106c504 */
   @Override
   public void create() {		
   
   	Resource.loadResource();
   	scene = new Scene();   
   }
   
   /** @pdOid e8e6b0ea-0a75-4eec-b153-070f453215f7 */
   @Override
   public void dispose() {
   	Resource.texture.dispose();
   }
   
   /** @pdOid 54a3b3e2-1451-42c0-9f8d-9c024ae7cf56 */
   @Override
   public void render() {		
   //  	Gdx.gl.glClearColor(1, 1, 1, 1);
     //	Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
     	scene.show();
     
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
   
   /** @pdOid 2a00a043-8d8d-4cf5-aa42-456c220129b7 */
   public void setScene() {
      // TODO: implement
   }
   
   /** @pdOid f15272f2-3025-41ca-825a-618e7a0ae390 */
   public Scene getCurrentScene() {
      // TODO: implement
      return null;
   }

}