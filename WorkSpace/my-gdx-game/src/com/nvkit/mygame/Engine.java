/***********************************************************************
 * Module:  Engine.java
 * Author:  Welcome
 * Purpose: Defines the Class Engine
 ***********************************************************************/

package com.nvkit.mygame;

import com.nvkit.mygame.concept.IUpdateAble;
import java.lang.annotation.*;
import com.badlogic.gdx.ApplicationListener;
import java.util.*;

/** @pdOid 8d73afaf-e0cd-4e1d-be55-f025af4ae8d7 */
public abstract class Engine implements com.nvkit.mygame.concept.IEngine, com.badlogic.gdx.ApplicationListener {
   /** @pdRoleInfo migr=no name=Scene assc=association10 mult=1..1 */
   private Scene scene;
   
   /** @pdOid 219bb90a-d024-4fcb-a004-21b8f645de11 */
   Engine() {
    	   
   }
   
   /**             coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   /** @pdRoleInfo migr=no name=IUpdateAble assc=association6 coll=java.util.List impl=java.util.LinkedList mult=0..* */
   public java.util.List<IUpdateAble> updateControl;
   
   /** @pdOid f191c596-0127-45d5-addc-3a5bc592351d */
   public void create() {
   createEngine();      
      Scene rootscene = new Scene();
      setScene(rootscene);   
     }
   
   /** @pdOid 05fa605f-d366-4d11-ba1f-8667ee98823d */
   public abstract void createEngine();
   /** @pdOid df406191-7ecf-4582-a84b-fe42e111c5a6 */
   @Override
   public void update() {
      	// TODO Auto-generated method stub
   if(!getUpdateControl().isEmpty())
   	for (IUpdateAble ud : updateControl) {
       		ud.update();
       	}
      getScene().show();
      }
   
   /** @param sc
    * @pdOid 1618ef16-5d9c-4bf0-a352-c0d73f2fea2b */
   @Override
   public void setScene(Scene sc) {
   	// TODO Auto-generated method stub
    	removeUpdateControl(scene);
    	addUpdateControl(sc);
    	this.scene = sc;
    	this.scene.setMyEngine(this);
   }
   
   /** @pdOid 5a086081-6835-47d5-b5bb-5929bb0bd3db */
   @Override
   public Scene getScene() {
   	// TODO Auto-generated method stub
   	return scene;
   }
   
   /** @pdOid 8a33a2cf-b23d-46d7-b14a-5640840843cc */
   @Override
   public void render() {
      	update();   	
   }
   
   
   /** @pdGenerated default getter */
   public java.util.List<IUpdateAble> getUpdateControl() {
      if (updateControl == null)
         updateControl = new java.util.LinkedList<IUpdateAble>();
      return updateControl;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorUpdateControl() {
      if (updateControl == null)
         updateControl = new java.util.LinkedList<IUpdateAble>();
      return updateControl.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newUpdateControl */
   public void setUpdateControl(java.util.List<IUpdateAble> newUpdateControl) {
      removeAllUpdateControl();
      for (java.util.Iterator iter = newUpdateControl.iterator(); iter.hasNext();)
         addUpdateControl((IUpdateAble)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newIUpdateAble */
   public void addUpdateControl(IUpdateAble newIUpdateAble) {
      if (newIUpdateAble == null)
         return;
      if (this.updateControl == null)
         this.updateControl = new java.util.LinkedList<IUpdateAble>();
      if (!this.updateControl.contains(newIUpdateAble))
         this.updateControl.add(newIUpdateAble);
   }
   
   /** @pdGenerated default remove
     * @param oldIUpdateAble */
   public void removeUpdateControl(IUpdateAble oldIUpdateAble) {
      if (oldIUpdateAble == null)
         return;
      if (this.updateControl != null)
         if (this.updateControl.contains(oldIUpdateAble))
            this.updateControl.remove(oldIUpdateAble);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllUpdateControl() {
      if (updateControl != null)
         updateControl.clear();
   }

}