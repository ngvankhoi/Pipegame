/***********************************************************************
 * Module:  Cell.java
 * Author:  Welcome
 * Purpose: Defines the Class Cell
 ***********************************************************************/

package com.nvkit.mygame.object;

import com.nvkit.mygame.GameResource.CellDataSprite;
import java.util.*;

/** @pdOid 5af83161-b649-4196-b6f1-7690ccb8e625 */
public abstract class Cell implements ISaveable {
   /** @pdOid 6b0431f0-0d14-443c-9095-b08d539a39d5 */
   private Sprite sprite;
   /** @pdOid 95a98b03-d1c7-4645-a9f8-6b9d030f9d9d */
   private Point position;
   /** @pdOid a7f2ca7c-e7f3-48ad-a90b-517e483896fb */
   private int size;
   
   /** @pdRoleInfo migr=no name=GameResource.CellDataSprite assc=association1 mult=1..1 */
   public GameResource.CellDataSprite cellDataSprite;
   
   /** @param sprite
    * @pdOid 81c6c78e-bea0-40bc-b269-453dc9af507a */
   public void changeSprite(Sprite sprite) {
      // TODO: implement
   }
   
   /** @param p
    * @pdOid 8851a406-f471-4216-b300-1d7327164072 */
   public void setPosition(Point p) {
      // TODO: implement
   }
   
   /** @pdOid fc4f6c8d-ae80-4246-95da-aef9d82a82ac */
   public Cell() {
      // TODO: implement
   }
   
   /** @pdOid e2f4810c-6c69-4219-b7c7-24d793bed2c6 */
   public abstract Cell.CellType getCellType();
   /** @param file
    * @pdOid 3b0979a4-a3f2-4462-bec6-65fe35fe68cd */
   public int saveToFile(File file) {
      // TODO: implement
      return 0;
   }
   
   /** @param file
    * @pdOid 500f2344-a52e-48b6-8feb-4d8aabc9f671 */
   public abstract int readFromFile(File file);

   /** @pdOid 86f2550c-3983-4fb2-8553-b1d15bb65635 */
   public interface CellType {
      /** @pdOid 11c89815-8296-4b55-9942-c6937e3a2536 */
      static final int BLANK = 0;
      /** @pdOid abcd04ac-1497-4b7c-b262-58287e0c2f65 */
      static final int WALL = 1;
      /** @pdOid 05e074c5-285c-4807-9a75-852dcdc8f44a */
      static final int PIPE = 2;
   
   }

}