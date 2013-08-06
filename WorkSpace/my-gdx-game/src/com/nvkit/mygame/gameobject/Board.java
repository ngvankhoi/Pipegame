/***********************************************************************
 * Module:  Board.java
 * Author:  Welcome
 * Purpose: Defines the Class Board
 ***********************************************************************/

package com.nvkit.mygame.gameobject;

import java.lang.annotation.*;
import java.awt.Point;
import java.util.*;
import com.nvkit.mygame.concept.IBoard;

/** @pdOid 0c7554ec-d8cd-4063-b375-9b0f78ed73d4 */
public abstract class Board extends com.badlogic.gdx.graphics.g2d.SpriteBatch implements com.nvkit.mygame.concept.IBoard {
   /** @pdOid b307023c-d0dd-4263-af6a-0fda04dce6df */
   @Override
   public Point getLocation() {
   	// TODO Auto-generated method stub
   	return null;
   }
   
   /** @param pt
    * @pdOid 5441e348-9a95-4869-8224-88e40ae31a67 */
   @Override
   public void setLocation(Point pt) {
   	// TODO Auto-generated method stub
   	
   }
   
   /** @param x 
    * @param y
    * @pdOid 08b7d928-0b2e-453c-9c5d-25d1c9374dfa */
   @Override
   public void setLocation(float x, float y) {
   	// TODO Auto-generated method stub
   	
   }
   
   /** @pdOid 28e8035c-cc11-4c16-940d-941e589c3a51 */
   @Override
   public float getWidth() {
   	// TODO Auto-generated method stub
   	return 0;
   }
   
   /** @param w
    * @pdOid c6e2ad37-e23d-4780-a86e-94e7441910b7 */
   @Override
   public void setWidth(float w) {
   	// TODO Auto-generated method stub
   	
   }
   
   /** @pdOid 7be74e20-b25b-452a-99fe-061c0600c09c */
   @Override
   public float getHeight() {
   	// TODO Auto-generated method stub
   	return 0;
   }
   
   /** @param h
    * @pdOid 2f61a713-8d6c-46af-a3a8-743525f6d432 */
   @Override
   public void setHeight(float h) {
   	// TODO Auto-generated method stub
   	
   }
   
   /** @param pt
    * @pdOid e06c6cc8-4aa1-493f-b397-a9da9441029a */
   @Override
   public void MoveTo(Point pt) {
   	// TODO Auto-generated method stub
   	
   }
   
   /** @param x 
    * @param y
    * @pdOid f8f816ff-d64d-4079-8a68-a0a0b93d097e */
   @Override
   public void MoveTo(float x, float y) {
   	// TODO Auto-generated method stub
   	
   }
   
   /** @param X 
    * @param Y
    * @pdOid 01326432-7c48-4c38-b065-a2effecf2481 */
   @Override
   public void Flip(boolean X, boolean Y) {
   	// TODO Auto-generated method stub
   	
   }
   
   /** @pdOid 81324dc4-5807-4f6c-87a5-9a7c28bce159 */
   @Override
   public boolean IsFlipX() {
   	// TODO Auto-generated method stub
   	return false;
   }
   
   /** @pdOid 32844eb7-fbe0-42ca-94e2-772ca8b12666 */
   @Override
   public boolean IsFlipY() {
   	// TODO Auto-generated method stub
   	return false;
   }

}