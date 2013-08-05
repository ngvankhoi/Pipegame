/***********************************************************************
 * Module:  ICell.java
 * Author:  Welcome
 * Purpose: Defines the Interface ICell
 ***********************************************************************/

package com.nvkit.mygame.concept;

import java.awt.Point;
import java.util.*;
import com.badlogic.gdx.graphics.g2d.Sprite;

/** @pdOid e146c5eb-9804-4a7d-b413-4e72ac1e4320 */
public interface ICell extends IEntity {
   /** @pdOid d2c3c2dd-d105-4270-aafe-a85617c6d770 */
   Point getLocation();
   /** @param board
    * @pdOid 7675f80f-4cce-43cf-b175-871f8915cfce */
   Point getPosition(IBoard board);
   /** @param pt2
    * @pdOid f63744aa-2f7e-4e5b-82bd-e1ae3556aad2 */
   void setLocation(Point pt2);
   /** @pdOid e3b2f25d-6ddf-4def-a823-120f35e5bd82 */
   Sprite getSprite();

}