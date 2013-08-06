/***********************************************************************
 * Module:  IDrawAble.java
 * Author:  Welcome
 * Purpose: Defines the Interface IDrawAble
 ***********************************************************************/

package com.nvkit.mygame.concept;

import java.util.*;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/** @pdOid 2db6ce49-c029-4a16-88a4-1d8a51b9dfa0 */
public interface IDrawAble {
   /** @param batch
    * @pdOid 9c252d7d-1d7c-42f9-a8e3-a8f0fe02e894 */
   void drawOnSpriteBatch(SpriteBatch batch);

}