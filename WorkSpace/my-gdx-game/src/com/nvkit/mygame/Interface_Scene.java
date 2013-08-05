/***********************************************************************
 * Module:  Interface_Scene.java
 * Author:  Welcome
 * Purpose: Defines the Interface Interface_Scene
 ***********************************************************************/

package com.nvkit.mygame;

import com.nvkit.mygame.concept.IEntity;
import java.lang.annotation.*;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import java.awt.Point;
import java.util.*;

/** @pdOid 1bb7c62a-0f7c-4541-9b63-0c4d85675ca8 */
public interface Interface_Scene {
   /** @param engin
    * @pdOid c0242080-d47e-442d-b2af-7a143e1c56cd */
   void setGameEngine(GameEngine engin);
   /** @pdOid 4596169a-9117-4a72-80e8-421766de1cff */
   GameEngine getGameEngine();
   /** @pdOid f8580055-0c69-4351-8d57-447766f63f25 */
   void create();
   /** @param enty
    * @pdOid 25572aa8-8266-4a30-ae31-b4902ff8f743 */
   void addDrawable(IEntity enty);
   /** @param dr
    * @pdOid a5e53480-5227-4d37-b14c-c378912c201f */
   void removeDrawable(IEntity dr);
   /** @pdOid 19f9d450-e178-43b1-807a-a3c9bec647bb */
   @Override
   SpriteBatch getSpriteBatch();
   /** @pdOid 96282fb6-ea70-4b11-a942-a6d3c3c67f12 */
   @Override
   Camera getCamera();
   /** @param camera
    * @pdOid 9ace80ad-d4b8-4a17-b76b-5599a4c57d71 */
   @Override
   void setCamera(Camera camera);
   /** @pdOid 767a5fe7-2710-4162-be91-42ce72a992cf */
   @Override
   Point getLocation();
   /** @param pt
    * @pdOid fc911811-47d1-403d-b983-aae2a49c39b0 */
   @Override
   void setLocation(Point pt);
   /** @param x 
    * @param y
    * @pdOid b35de464-0060-43aa-a231-d3cc0cf719e4 */
   @Override
   void setLocation(float x, float y);
   /** @pdOid 533f6e2d-3810-41ab-9382-3a1f99010b68 */
   @Override
   float getWidth();
   /** @param w
    * @pdOid 65c4ff5a-25db-43c8-9306-e9e48c764469 */
   @Override
   void setWidth(float w);
   /** @pdOid 67b795e6-6545-4450-aaa1-12dee7854c2e */
   @Override
   float getHeight();
   /** @param h
    * @pdOid bdba1bfc-e554-41d9-b472-f91ac28a7d4b */
   @Override
   void setHeight(float h);
   /** @param pt
    * @pdOid 8e901dc3-b8c6-4b4a-a268-225b7532cead */
   @Override
   void MoveTo(Point pt);
   /** @param x 
    * @param y
    * @pdOid 98812775-dec5-4a58-a33d-304e83c68395 */
   @Override
   void MoveTo(float x, float y);
   /** @param X 
    * @param Y
    * @pdOid d8359047-65d4-4621-a6c4-d2cc4c376ea5 */
   @Override
   void Flip(boolean X, boolean Y);
   /** @pdOid 9dbbaac7-4c18-4bd6-ab7f-6e398cda536e */
   @Override
   boolean IsFlipX();
   /** @pdOid 47609210-9b41-41d8-be4a-854da7dead20 */
   @Override
   boolean IsFlipY();
   /** @pdOid e140dc92-d127-4b83-8198-66fac0ff3015 */
   @Override
   void update();

}