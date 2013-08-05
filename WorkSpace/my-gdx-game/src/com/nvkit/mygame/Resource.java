/***********************************************************************
 * Module:  Resource.java
 * Author:  Welcome
 * Purpose: Defines the Class Resource
 ***********************************************************************/

package com.nvkit.mygame;

import java.util.*;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;

/** @pdOid f8d27488-1129-428f-bcdb-d333b5e77c46 */
public final class Resource {
   /** @pdOid 9902a7de-a6da-4430-89b5-e5c3af59b793 */
   static Texture texture;
   
   /** @pdOid a0784910-010d-4307-863e-36555f523949 */
   public static int loadResource() {
    texture = new Texture(Gdx.files.internal("data/libgdx.png"));
    texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
      return 0;
   }

}