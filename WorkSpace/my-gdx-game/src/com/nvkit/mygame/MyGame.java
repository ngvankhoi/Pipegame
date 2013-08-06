package com.nvkit.mygame;

import java.lang.annotation.*;
import com.nvkit.mygame.concept.IUpdateAble;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/** @pdOid b59203af-852e-4ba8-822e-fd7efeffe0c3 */
public class MyGame extends Engine implements com.badlogic.gdx.ApplicationListener {
   /** @pdOid d350b513-1198-4470-af25-bb2393cd6c86 */
   @Override
   public void createEngine() {
   		// TODO Auto-generated method stub
   		Resource.loadResource();	
   }
   
   /** @pdOid e8e6b0ea-0a75-4eec-b153-070f453215f7 */
   @Override
   public void dispose() {
   	Resource.texture.dispose();
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