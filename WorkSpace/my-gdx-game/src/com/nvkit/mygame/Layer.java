/***********************************************************************
 * Module:  Layer.java
 * Author:  Welcome
 * Purpose: Defines the Class Layer
 ***********************************************************************/

package com.nvkit.mygame;

import java.lang.annotation.*;
import java.util.*;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/** @pdOid 32647fd2-7975-4235-aea2-b32625acc104 */
public class Layer extends Entity {
   /** @param batch
    * @pdOid 68e41f25-111b-4aa8-8aca-e4a4debbc875 */
   @Override
   public void drawOnSpriteBatch(SpriteBatch batch) {
   	// TODO Auto-generated method stub
   	if(!getChildEntities().isEmpty())
   		for(int i=0,n=getChildEntities().size();i<n;i++)
   		{
   			getChildEntities().get(i).drawOnSpriteBatch(batch);
   		}
   }
   
   /** @param layer
    * @pdOid d8c60563-26b8-44a6-9fe2-24d84206fbcc */
   public Layer addLayer(Layer layer) {
    addChildEntities(layer);
    return this;
   }

}