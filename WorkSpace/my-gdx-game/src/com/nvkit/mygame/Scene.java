/***********************************************************************
 * Module:  Scene.java
 * Author:  Welcome
 * Purpose: Defines the Class Scene
 ***********************************************************************/

package com.nvkit.mygame;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.nvkit.mygame.concept.IEngine;
import com.nvkit.mygame.concept.IDrawAble;
import java.lang.annotation.*;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.nvkit.mygame.concept.IEntity;
import java.awt.Point;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import java.util.*;

/** @pdOid ef4f5e65-03ce-48b9-9ddb-3cc1bc09ba2a */
public class Scene extends Entity {
   /** @pdOid 6f959075-7366-4dbc-b7d1-0f847943c845
       @pdRoleInfo migr=yes name=SpriteBatch assc=association5 */
   private SpriteBatch batch;
   /** @pdOid 763b0088-3a40-4f72-bd7e-04bfaf87b120 */
   private Camera camera;
   /** @pdOid 2ca23bb0-f20e-42db-a627-d50732edd280
       @pdRoleInfo migr=yes name=IDrawAble assc=association9 */
   private IDrawAble screen;
   /** @pdOid d1c96f72-024b-49c8-ad38-016591826aa4
       @pdRoleInfo migr=yes name=Layer assc=association11 */
   private Layer background;
   /** @pdOid 79b48c89-372f-45c8-b45e-4a405c33498d
       @pdRoleInfo migr=yes name=Layer assc=association12 */
   private Layer midground;
   /** @pdOid e4952c64-834c-43db-8817-5a390422e596
       @pdRoleInfo migr=yes name=Layer assc=association13 */
   private Layer frontground;
   /** @pdOid 9dba13d8-35cd-4166-ac3f-73909303ac7b */
   private Color backColor = Color.BLUE;
   
   /** @pdRoleInfo migr=no name=IEngine assc=association8 mult=1..1 */
   private IEngine myEngine;
   
   /** @pdOid 89b74a87-a4fc-4aa8-8c87-9b6ec769030e */
   protected void finalize() {
      // TODO: implement
    
   }
   
   /** @pdOid a67e5a24-c307-4a69-8fd1-dc201bedbbff
    * @pdRoleInfo migr=yes name=Sprite assc=association7 */
   void show() {
       // TODO: implement       
        batch.setProjectionMatrix(camera.combined);
     	batch.begin();
     	screen.drawOnSpriteBatch(batch);
     	batch.end();
     	
    }
   
   /** @pdOid f63a4ab1-15bc-4afb-8026-b95c6c6d0d44 */
   public void create() {
   		// TODO: implement
   
   ///////////// test draw able;
   		Entity da = new Entity() {
   			Sprite sprite;
   			{
   				TextureRegion region = new TextureRegion(Resource.texture, 0,
   						0, 512, 275);
   
   				sprite = new Sprite(region);
   				sprite.setSize(0.9f,
   						0.9f * sprite.getHeight() / sprite.getWidth());
   				sprite.setOrigin(sprite.getWidth() / 2, sprite.getHeight() / 2);
   				sprite.setPosition(-sprite.getWidth() / 2,
   						-sprite.getHeight() / 2);
   			}
   
   			@Override
   			public void drawOnSpriteBatch(SpriteBatch batch) {
   				// TODO Auto-generated method stub
   				sprite.draw(batch);
   			}
   		};
   		this.addEntity(da);
   	///////////////////// end test
   	}
   
   /** @param da
    * @pdOid 05a33819-76ac-4ef8-aa86-23d09721144b */
   public void addEntity(Entity da) {
   	// TODO Auto-generated method stub
   	midground.addChildEntities(da);
   }
   
   /** @param newEntity
    * @pdOid 60042b14-fc79-433d-9fe0-041acb1753f4 */
   @Override
   public void addChildEntities(Entity newEntity) {
   	// TODO Auto-generated method stub
   	midground.addChildEntities(newEntity);
   }
   
   /** @pdOid 149c56b0-61bf-46fa-a47c-733ed09c6fc4 */
   public Scene() {
      // TODO: implement
   	camera = new OrthographicCamera(1, (float) Gdx.graphics.getHeight()
   				/ (float) Gdx.graphics.getWidth());
   	batch = new SpriteBatch();
   	screen = new Layer();
   	background =new Layer(){
   		@Override
   		public void drawOnSpriteBatch(SpriteBatch batch) {
   			// TODO Auto-generated method stub   			
   			Gdx.gl.glClearColor(backColor.r, backColor.g, backColor.b, 1);
   			Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
   			super.drawOnSpriteBatch(batch);
   		}
   	};
   	midground =new Layer();
   	frontground=new Layer();
   	((Layer)screen).addLayer(background).addLayer(midground).addLayer(frontground); 
    create();
   }
   
   /** @pdOid 294688ba-09ad-4b90-8eea-11a8dfcde122 */
   @Override
   public void update() {
   	// TODO Auto-generated method stub
   	
   }
   
   /** @param me
    * @pdOid 1bebfcfd-e96b-4f15-8981-77613ce86528 */
   public void setMyEngine(IEngine me) {	   
    myEngine = me;
   }
   
   /** @pdOid 7c8a2451-8293-45c4-a81f-d7eb5acc90e3 */
   public IEngine getMyEngine() {
    return myEngine;
   }
   
   /** @param batch
    * @pdOid 7e5ee606-441b-4ca2-8cdf-059e15a51a42 */
   @Override
   public void drawOnSpriteBatch(SpriteBatch batch) {
   	// TODO Auto-generated method stub
   	
   }
   
   /** @pdOid e38bd403-75d2-41b1-8397-5191858d1083 */
   @Override
   public Point getLocation() {
   	// TODO Auto-generated method stub
   	return null;
   }
   
   /** @param pt
    * @pdOid 32763d17-2092-4f40-a52a-2e441d8033d4 */
   @Override
   public void setLocation(Point pt) {
   	// TODO Auto-generated method stub
   	
   }
   
   /** @param x 
    * @param y
    * @pdOid ea0ebd70-5d19-4a9d-89f6-52183282487b */
   @Override
   public void setLocation(float x, float y) {
   	// TODO Auto-generated method stub
   	
   }
   
   /** @pdOid b0047e2d-1a11-41c9-bbde-ba73f6e416c3 */
   @Override
   public float getWidth() {
   	// TODO Auto-generated method stub
   	return 0;
   }
   
   /** @param w
    * @pdOid abecb22f-2659-411e-9dd1-a57333abaecc */
   @Override
   public void setWidth(float w) {
   	// TODO Auto-generated method stub
   	
   }
   
   /** @pdOid 7d1a7b70-488e-4c66-b713-59e39d89baa6 */
   @Override
   public float getHeight() {
   	// TODO Auto-generated method stub
   	return 0;
   }
   
   /** @param h
    * @pdOid 2e8f86b1-b502-4cd6-b6ac-937647be9fd6 */
   @Override
   public void setHeight(float h) {
   	// TODO Auto-generated method stub
   	
   }
   
   /** @param pt
    * @pdOid a43b92c0-ae32-4a4b-b2c8-56bd158ddeb2 */
   @Override
   public void MoveTo(Point pt) {
   	// TODO Auto-generated method stub
   	
   }
   
   /** @param x 
    * @param y
    * @pdOid d0e5f75c-896d-42ae-91dc-af479b444dde */
   @Override
   public void MoveTo(float x, float y) {
   	// TODO Auto-generated method stub
   	
   }
   
   /** @param X 
    * @param Y
    * @pdOid 429767af-65cc-4c7a-ac7b-808d990d26b0 */
   @Override
   public void Flip(boolean X, boolean Y) {
   	// TODO Auto-generated method stub
   	
   }
   
   /** @pdOid f44028b4-bd08-44cb-8675-481ce5b70928 */
   @Override
   public boolean IsFlipX() {
   	// TODO Auto-generated method stub
   	return false;
   }
   
   /** @pdOid ab033e45-068f-4042-a9ef-e053bbaf66e3 */
   @Override
   public boolean IsFlipY() {
   	// TODO Auto-generated method stub
   	return false;
   }

}