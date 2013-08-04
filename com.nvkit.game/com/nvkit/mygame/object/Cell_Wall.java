/***********************************************************************
 * Module:  Cell_Wall.java
 * Author:  Welcome
 * Purpose: Defines the Class Cell_Wall
 ***********************************************************************/

package com.nvkit.mygame.object;

import java.util.*;

/** @pdOid 035436fe-e05d-4876-9ddb-298d4b9a0ab0 */
public abstract class Cell_Wall extends Cell {
   /** @pdOid 2e62ea56-7b1e-403a-b5a9-41259091fbb7 */
   public Cell_Wall() {
      // TODO: implement
   }
   
   /** @param sprite
    * @pdOid 66628593-2c66-4e94-8a8c-8f5b66c18c75 */
   public void changeSprite(Sprite sprite) {
      // TODO: implement
   }
   
   /** @pdOid 870b05d8-e62a-4cd0-a625-2504f5d8dbc9 */
   public Cell.CellType getCellType() {
      // TODO: implement
      return null;
   }
   
   /** @param file
    * @pdOid efc709f6-2293-46cd-8b79-56a756d1759b */
   public int saveToFile(File file) {
      // TODO: implement
      return 0;
   }
   
   /** @param file
    * @pdOid bd217b85-3870-41f2-9a75-8f6c0b955dd4 */
   public int readFromFile(File file) {
      // TODO: implement
      return 0;
   }

}