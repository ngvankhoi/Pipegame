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
   /** @pdOid 844ba0f8-71d6-4183-8c26-5b2f71a7355d
       @pdRoleInfo migr=yes name=IUpdateAble assc=association6 coll=java.util.List impl=java.util.LinkedList mult=0..* */
   public java.util.List<IUpdateAble> updates;
   
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
   if(updates != null)
   	for (IUpdateAble ud : updates) {
       		ud.update();
       	}
      getScene().show();
      }
   
   /** @param sc
    * @pdOid 1618ef16-5d9c-4bf0-a352-c0d73f2fea2b */
   @Override
   public void setScene(Scene sc) {
   	// TODO Auto-generated method stub
    	removeUpdates(scene);
    	addUpdates(sc);
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
   public java.util.List<IUpdateAble> getUpdates() {
      if (updates == null)
         updates = new java.util.LinkedList<IUpdateAble>();
      return updates;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorUpdates() {
      if (updates == null)
         updates = new java.util.LinkedList<IUpdateAble>();
      return updates.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newUpdates */
   public void setUpdates(java.util.List<IUpdateAble> newUpdates) {
      removeAllUpdates();
      for (java.util.Iterator iter = newUpdates.iterator(); iter.hasNext();)
         addUpdates((IUpdateAble)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newIUpdateAble */
   public void addUpdates(IUpdateAble newIUpdateAble) {
      if (newIUpdateAble == null)
         return;
      if (this.updates == null)
         this.updates = new java.util.LinkedList<IUpdateAble>();
      if (!this.updates.contains(newIUpdateAble))
         this.updates.add(newIUpdateAble);
   }
   
   /** @pdGenerated default remove
     * @param oldIUpdateAble */
   public void removeUpdates(IUpdateAble oldIUpdateAble) {
      if (oldIUpdateAble == null)
         return;
      if (this.updates != null)
         if (this.updates.contains(oldIUpdateAble))
            this.updates.remove(oldIUpdateAble);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllUpdates() {
      if (updates != null)
         updates.clear();
   }

}