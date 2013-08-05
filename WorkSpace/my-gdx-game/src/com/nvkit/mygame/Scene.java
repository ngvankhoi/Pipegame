/***********************************************************************
 * Module:  Scene.java
 * Author:  Welcome
 * Purpose: Defines the Class Scene
 ***********************************************************************/

package com.nvkit.mygame;

import com.nvkit.mygame.concept.UpdateAble;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.nvkit.mygame.concept.IEntity;
import java.lang.annotation.*;
import java.awt.Point;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import java.util.*;

/** @pdOid ef4f5e65-03ce-48b9-9ddb-3cc1bc09ba2a */
public class Scene extends GameEntity implements Interface_Scene {
   /** @pdOid 6f959075-7366-4dbc-b7d1-0f847943c845
       @pdRoleInfo migr=yes name=SpriteBatch assc=association5 */
   private SpriteBatch batch;
   /** @pdOid 763b0088-3a40-4f72-bd7e-04bfaf87b120 */
   private Camera camera;
   
   /** @pdRoleInfo migr=no name=UpdateAble assc=association8 coll=java.util.List impl=java.util.LinkedList mult=0..* */
   private java.util.List<UpdateAble> updateAble;
   
   
   /** @pdGenerated default getter */
   public java.util.List<UpdateAble> getUpdateAble() {
      if (updateAble == null)
         updateAble = new java.util.LinkedList<UpdateAble>();
      return updateAble;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorUpdateAble() {
      if (updateAble == null)
         updateAble = new java.util.LinkedList<UpdateAble>();
      return updateAble.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newUpdateAble */
   public void setUpdateAble(java.util.List<UpdateAble> newUpdateAble) {
      removeAllUpdateAble();
      for (java.util.Iterator iter = newUpdateAble.iterator(); iter.hasNext();)
         addUpdateAble((UpdateAble)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newUpdateAble */
   public void addUpdateAble(UpdateAble newUpdateAble) {
      if (newUpdateAble == null)
         return;
      if (this.updateAble == null)
         this.updateAble = new java.util.LinkedList<UpdateAble>();
      if (!this.updateAble.contains(newUpdateAble))
         this.updateAble.add(newUpdateAble);
   }
   
   /** @pdGenerated default remove
     * @param oldUpdateAble */
   public void removeUpdateAble(UpdateAble oldUpdateAble) {
      if (oldUpdateAble == null)
         return;
      if (this.updateAble != null)
         if (this.updateAble.contains(oldUpdateAble))
            this.updateAble.remove(oldUpdateAble);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllUpdateAble() {
      if (updateAble != null)
         updateAble.clear();
   }
   
   /** @pdOid 89b74a87-a4fc-4aa8-8c87-9b6ec769030e */
   protected void finalize() {
      // TODO: implement
    
   }
   
   /** @pdOid b699ac22-b798-4996-a7ca-12228a91c39e
       @pdRoleInfo migr=yes name=Sprite assc=association7 */
   Sprite sprite;
   
   /** @pdOid a67e5a24-c307-4a69-8fd1-dc201bedbbff */
   void show() {
       // TODO: implement
       // Gdx.gl.glClearColor(1, 1, 1, 1);
    	//Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
        batch.setProjectionMatrix(camera.combined);
     	batch.begin();
     	sprite.draw(batch);
     	batch.end();
     	
    }
   
   /** @param engin
    * @pdOid 113dd96a-4f9a-4d8e-a43c-baa5ad387b12 */
   public void setGameEngine(GameEngine engin) {
      // TODO: implement
   }
   
   /** @pdOid d4562911-bf0f-4934-9bc3-fe01f5fcf739 */
   public GameEngine getGameEngine() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid f63a4ab1-15bc-4afb-8026-b95c6c6d0d44 */
   public void create() {
      // TODO: implement
     camera = new OrthographicCamera(1,(float)Gdx.graphics.getHeight()/(float)Gdx.graphics.getWidth());
     batch = new SpriteBatch();
        
        TextureRegion region = new TextureRegion(Resource.texture, 0, 0, 512, 275);
    	
        sprite = new Sprite(region);
    	sprite.setSize(0.9f, 0.9f * sprite.getHeight() / sprite.getWidth());
    	sprite.setOrigin(sprite.getWidth()/2, sprite.getHeight()/2);
    	sprite.setPosition(-sprite.getWidth()/2, -sprite.getHeight()/2);
   }
   
   /** @param enty
    * @pdOid 9c9b0f1f-dc39-4abf-b752-cff1c7de237e */
   public void addDrawable(IEntity enty) {
      // TODO: implement
    
   }
   
   /** @param dr
    * @pdOid d1134764-a0ee-4ec2-b81c-7c2920293150 */
   public void removeDrawable(IEntity dr) {
      
   }
   
   /** @pdOid 149c56b0-61bf-46fa-a47c-733ed09c6fc4 */
   public Scene() {
      // TODO: implement   
    create();
   }
   
   /** @pdOid 5fb93416-b5e1-4499-9c8e-a96e9ffd5b9e */
   @Override
   public SpriteBatch getSpriteBatch() {
   	// TODO Auto-generated method stub
   	return null;
   }
   
   /** @pdOid f4ba515f-5998-4cc4-a376-36ae5ecfac45 */
   @Override
   public Camera getCamera() {
   	// TODO Auto-generated method stub
   	return null;
   }
   
   /** @param camera
    * @pdOid 0619ad01-1e0f-432c-b398-fff317fe61f9 */
   @Override
   public void setCamera(Camera camera) {
   	// TODO Auto-generated method stub
   	this.camera= camera;
   }
   
   /** @pdOid b034768c-bb0e-49fd-a01f-5a45ea685876 */
   @Override
   public Point getLocation() {
   	// TODO Auto-generated method stub
   	return null;
   }
   
   /** @param pt
    * @pdOid 59cdfb36-8a65-419d-8dde-55e0eda5c472 */
   @Override
   public void setLocation(Point pt) {
   	// TODO Auto-generated method stub
   	
   }
   
   /** @param x 
    * @param y
    * @pdOid c3897e9c-ede0-4d9c-90c5-c50cf9be3225 */
   @Override
   public void setLocation(float x, float y) {
   	// TODO Auto-generated method stub
   	
   }
   
   /** @pdOid f36536aa-aaae-4e98-85c8-41083f7880c9 */
   @Override
   public float getWidth() {
   	// TODO Auto-generated method stub
   	return 0;
   }
   
   /** @param w
    * @pdOid 05729e5e-88e5-4565-ae12-4cc900f21668 */
   @Override
   public void setWidth(float w) {
   	// TODO Auto-generated method stub
   	
   }
   
   /** @pdOid 6ae6426a-122c-4871-8cc3-ca4c5b549a61 */
   @Override
   public float getHeight() {
   	// TODO Auto-generated method stub
   	return 0;
   }
   
   /** @param h
    * @pdOid f393aaed-63ac-45f1-a906-a57671df4cac */
   @Override
   public void setHeight(float h) {
   	// TODO Auto-generated method stub
   	
   }
   
   /** @param pt
    * @pdOid fdc82225-54af-4787-b0ee-5e501a67bf79 */
   @Override
   public void MoveTo(Point pt) {
   	// TODO Auto-generated method stub
   	
   }
   
   /** @param x 
    * @param y
    * @pdOid c55fb994-7d74-44b7-b908-4574d0fd07c4 */
   @Override
   public void MoveTo(float x, float y) {
   	// TODO Auto-generated method stub
   	
   }
   
   /** @param X 
    * @param Y
    * @pdOid 477384df-9c70-4b71-a754-78ddfa23ed8f */
   @Override
   public void Flip(boolean X, boolean Y) {
   	// TODO Auto-generated method stub
   	
   }
   
   /** @pdOid 7b8b569b-58b2-4393-afe3-36578ce3471b */
   @Override
   public boolean IsFlipX() {
   	// TODO Auto-generated method stub
   	return false;
   }
   
   /** @pdOid 322da20c-e536-420f-90c9-fc4dde2f0c77 */
   @Override
   public boolean IsFlipY() {
   	// TODO Auto-generated method stub
   	return false;
   }
   
   /** @pdOid 64df7d99-ab27-4df1-9963-d3eab14abc73 */
   @Override
   public void update() {
   	// TODO Auto-generated method stub
    for(UpdateAble ud : updateAble)
    	ud.update();
   }

}