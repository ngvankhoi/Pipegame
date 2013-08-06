/***********************************************************************
 * Module:  IEngine.java
 * Author:  Welcome
 * Purpose: Defines the Interface IEngine
 ***********************************************************************/

package com.nvkit.mygame.concept;

import java.util.*;
import com.nvkit.mygame.Scene;

/** @pdOid 1b88fdc5-aad2-4e09-beec-e1e555238087 */
public interface IEngine extends IUpdateAble {
   /** @param sc
    * @pdOid d2866c4d-0575-4925-916d-027d4069e471 */
   void setScene(Scene sc);
   /** @pdOid 02e919ae-fd9e-4416-b1c7-bf88fb8a4749 */
   Scene getScene();

}