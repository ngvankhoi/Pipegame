/***********************************************************************
 * Module:  DrawAble.java
 * Author:  Welcome
 * Purpose: Defines the Class DrawAble
 ***********************************************************************/

package com.nvkit.mygame;

import java.lang.annotation.*;
import java.util.*;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/** @pdOid 633f6c2f-d809-46bd-8c37-36d2044ad81e */
public abstract class DrawAble implements com.nvkit.mygame.concept.IDrawAble {
   /** @pdRoleInfo migr=no name=DrawAble assc=association7 coll=java.util.List impl=java.util.LinkedList mult=0..* */
   public java.util.List<DrawAble> drawObject;
   
   /** @pdOid 344f9f85-e6ec-4f76-8a81-9c2acca625f0 */
   public DrawAble() {
   // TODO Auto-generated constructor stub
      
     }
   
   /** @param batch
    * @pdOid 386b999a-a458-4814-b4c9-c73f89f74c4c */
   @Override
   public abstract void drawOnSpriteBatch(SpriteBatch batch);
   
   
   /** @pdGenerated default getter */
   public java.util.List<DrawAble> getDrawObject() {
      if (drawObject == null)
         drawObject = new java.util.LinkedList<DrawAble>();
      return drawObject;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorDrawObject() {
      if (drawObject == null)
         drawObject = new java.util.LinkedList<DrawAble>();
      return drawObject.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newDrawObject */
   public void setDrawObject(java.util.List<DrawAble> newDrawObject) {
      removeAllDrawObject();
      for (java.util.Iterator iter = newDrawObject.iterator(); iter.hasNext();)
         addDrawObject((DrawAble)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newDrawAble */
   public void addDrawObject(DrawAble newDrawAble) {
      if (newDrawAble == null)
         return;
      if (this.drawObject == null)
         this.drawObject = new java.util.LinkedList<DrawAble>();
      if (!this.drawObject.contains(newDrawAble))
         this.drawObject.add(newDrawAble);
   }
   
   /** @pdGenerated default remove
     * @param oldDrawAble */
   public void removeDrawObject(DrawAble oldDrawAble) {
      if (oldDrawAble == null)
         return;
      if (this.drawObject != null)
         if (this.drawObject.contains(oldDrawAble))
            this.drawObject.remove(oldDrawAble);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllDrawObject() {
      if (drawObject != null)
         drawObject.clear();
   }

}