/***********************************************************************
 * Module:  Entity.java
 * Author:  Welcome
 * Purpose: Defines the Class Entity
 ***********************************************************************/

package com.nvkit.mygame;

import java.lang.annotation.*;
import com.nvkit.mygame.concept.IUpdateAble;
import java.awt.Point;
import java.util.*;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/** @pdOid 3895dd86-dedd-4e08-9630-0ec49be7c390 */
public abstract class Entity implements com.nvkit.mygame.concept.IEntity, com.nvkit.mygame.concept.IDrawAble {
   /** @pdOid 807eda43-6e51-4e2f-a2e9-ef6baad5645a
       @pdRoleInfo migr=yes name=Entity assc=association14 coll=java.util.List impl=java.util.LinkedList mult=0..* */
   private java.util.List<Entity> childEntities;
   /** @pdOid 1e9d5bf0-a508-4859-8454-e75918b6de27 */
   private java.util.List<Runnable> runtime;
   
   protected boolean isFlipy=false,isFlipx= false;
   protected Point location;
   protected float width,height;
//   private SpriteBatch SB;
   /** @pdGenerated default getter */
   public java.util.List<Entity> getChildEntities() {
      if (childEntities == null)
         childEntities = new java.util.LinkedList<Entity>();
      return childEntities;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorChildEntities() {
      if (childEntities == null)
         childEntities = new java.util.LinkedList<Entity>();
      return childEntities.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newChildEntities */
   public void setChildEntities(java.util.List<Entity> newChildEntities) {
      removeAllChildEntities();
      for (java.util.Iterator iter = newChildEntities.iterator(); iter.hasNext();)
         addChildEntities((Entity)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEntity */
   public void addChildEntities(Entity newEntity) {
      if (newEntity == null)
         return;
      if (this.childEntities == null)
         this.childEntities = new java.util.LinkedList<Entity>();
      if (!this.childEntities.contains(newEntity))
         this.childEntities.add(newEntity);
   }
   
   /** @pdGenerated default remove
     * @param oldEntity */
   public void removeChildEntities(Entity oldEntity) {
      if (oldEntity == null)
         return;
      if (this.childEntities != null)
         if (this.childEntities.contains(oldEntity))
            this.childEntities.remove(oldEntity);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllChildEntities() {
      if (childEntities != null)
         childEntities.clear();
   }
   
   /** @param run
    * @pdOid 18d077d3-47fd-44eb-8cf8-e0fb49678e8c */
   public void regiterRun(Runnable run) {
    if(run==null)
     return;
    if(runtime==null)
     runtime = new LinkedList<Runnable>();
    runtime.add(run);
   }
   
   /** @param run
    * @pdOid 11e85775-82d4-40d6-8bb8-4349fa46e566 */
   public void unRegiterRun(Runnable run) {
    if(run== null)
     return;
    if(runtime == null)
     return;
    if(runtime.contains(run))
     runtime.remove(run);
   }
   
   /** @pdOid 3ca5d1c5-df77-42aa-a42b-e1710bb90782 */
   public void unRegiterAllRun() {
    if(runtime == null)
     return;
    runtime.clear();
   }
   
   /** @pdOid 23d54e83-45d0-4d9f-a8cb-f0827d8658d4 */
   @Override
   public void update() {
   	// TODO Auto-generated method stub
   	if (runtime != null) {
   		for (Runnable r : runtime)
   			r.run();
   	}
   	if (childEntities != null) {
   		for (Entity en : childEntities)
   			en.update();
   	}
   }
   
   /** @pdOid 96a19fb9-5b71-4c27-a0f3-b29ac8c3d538 */
   @Override
   public Point getLocation() {
   	// TODO Auto-generated method stub
   	return null;
   }
   
   /** @param pt
    * @pdOid 27a14142-9554-49e0-a8d7-61cb3711af7b */
   @Override
   public void setLocation(Point pt) {
   	// TODO Auto-generated method stub
   	
   }
   
   /** @param x 
    * @param y
    * @pdOid 575b6414-aca8-43ef-a6a8-c9c282674795 */
   @Override
   public void setLocation(float x, float y) {
   	// TODO Auto-generated method stub
   	
   }
   
   /** @pdOid 7aaf987b-1f82-4bc0-9261-9e81ea1f1081 */
   @Override
   public float getWidth() {
   	// TODO Auto-generated method stub
   	return 0;
   }
   
   /** @param w
    * @pdOid b0322703-129f-414c-b3d2-cbb19dd1ff34 */
   @Override
   public void setWidth(float w) {
   	// TODO Auto-generated method stub
   	
   }
   
   /** @pdOid 565f2343-2f18-4fe2-b5da-f160123ef668 */
   @Override
   public float getHeight() {
   	// TODO Auto-generated method stub
   	return 0;
   }
   
   /** @param h
    * @pdOid 48c3e3b7-cc5f-4b3b-b250-831e87ba4d42 */
   @Override
   public void setHeight(float h) {
   	// TODO Auto-generated method stub
   	
   }
   
   /** @param pt
    * @pdOid 96ee3627-9af2-4e70-8bfd-d9a733f4528b */
   @Override
   public void MoveTo(Point pt) {
   	// TODO Auto-generated method stub
   	
   }
   
   /** @param x 
    * @param y
    * @pdOid b7f5f4a6-12b5-472e-94d4-db3f8ef8495d */
   @Override
   public void MoveTo(float x, float y) {
   	// TODO Auto-generated method stub
   	
   }
   
   /** @param X 
    * @param Y
    * @pdOid 1c6af57a-b1dc-4dda-9f1a-5341937b09f6 */
   @Override
   public void Flip(boolean X, boolean Y) {
   	// TODO Auto-generated method stub
   	isFlipx=X;
   	isFlipy=Y;
   }
   
   /** @pdOid fe9c1709-cc75-4583-95ff-9d3e97ee804b */
   @Override
   public boolean IsFlipX() {
   	// TODO Auto-generated method stub
   	return isFlipx;
   }
   
   /** @pdOid 970ece50-a76c-489f-8593-d629910b844b */
   @Override
   public boolean IsFlipY() {
   	// TODO Auto-generated method stub
   	return isFlipy;
   }
   
   /** @param batch
    * @pdOid 6ec8d60c-c600-4508-84c9-d9b6081f3e45 */
   @Override
   public abstract void drawOnSpriteBatch(SpriteBatch batch);

}