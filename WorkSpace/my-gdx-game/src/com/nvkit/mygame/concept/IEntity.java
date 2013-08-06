/***********************************************************************
 * Module:  IEntity.java
 * Author:  Welcome
 * Purpose: Defines the Interface IEntity
 ***********************************************************************/

package com.nvkit.mygame.concept;

import java.awt.Point;
import java.util.*;
import com.badlogic.gdx.graphics.g2d.Sprite;

/** @pdOid e84bb2d3-d720-4478-bae9-573c38fca7e6 */
public interface IEntity extends IUpdateAble, IDrawAble {
   /** @pdOid f619d246-4844-4838-ac4a-6c53fd5d7c61 */
   Point getLocation();
   /** @param pt
    * @pdOid 92007009-1cc9-4ec5-8a87-f91d67d38592 */
   void setLocation(Point pt);
   /** @param x 
    * @param y
    * @pdOid 90c0fed2-b924-4f77-9c0e-569b6464c246 */
   void setLocation(float x, float y);
   /** @pdOid 46758d55-4b88-419a-a8ad-540d7da7ef34 */
   float getWidth();
   /** @param w
    * @pdOid caa3af96-2fdf-42c8-a1ca-dae898b3b2c8 */
   void setWidth(float w);
   /** @pdOid c4abfb8f-d63f-4e98-b1f3-658dd2bfb4f4 */
   float getHeight();
   /** @param h
    * @pdOid 6893457d-0eb4-439a-9b49-f2d1b82b5a07 */
   void setHeight(float h);
   /** @param pt
    * @pdOid 751ec390-5795-4020-82f1-de534cee682b */
   void MoveTo(Point pt);
   /** @param x 
    * @param y
    * @pdOid 9b170e53-d7ec-47bb-ba04-5679ebb98e81 */
   void MoveTo(float x, float y);
   /** lat hinh theo truc X va Y
    * 
    * @param X 
    * @param Y
    * @pdOid 99668068-c92f-4cb3-accb-9b765cd1f370 */
   void Flip(boolean X, boolean Y);
   /** @pdOid ad628798-558f-43bf-a008-3c3066a7f53c */
   boolean IsFlipX();
   /** @pdOid 78a8f967-6194-493c-aed8-f907dc552c40 */
   boolean IsFlipY();

}