/***********************************************************************
 * Module:  Cell_Pipe.java
 * Author:  Welcome
 * Purpose: Defines the Class Cell_Pipe
 ***********************************************************************/

package com.nvkit.mygame.object;

import java.util.*;

/** @pdOid 769226ad-4199-47fd-a81d-36bbdc6e8687 */
public abstract class Cell_Pipe extends Cell {
   /** @pdOid 5874370b-438d-4555-a5b7-313d1823fc68 */
   private boolean canhtren;
   /** @pdOid 0bd22ffa-7839-42e2-94b6-c29e53e1282e */
   private boolean canhduoi;
   /** @pdOid 2cad68c0-ca4a-40aa-ad14-a73d2cbcf5ef */
   private boolean canhphai;
   /** @pdOid 5d3dbed7-4809-4f41-9c24-b7975f0e748e */
   private boolean canhtrai;
   
   /** @pdOid 553344a8-2a0c-411d-a987-0001c79ec6b1 */
   public Cell.CellType getCellType() {
      // TODO: implement
      return null;
   }
   
   /** @param file
    * @pdOid 058472a6-c7e1-4ad5-bd21-de471d26c7de */
   public int saveToFile(File file) {
      // TODO: implement
      return 0;
   }
   
   /** @param file
    * @pdOid a2747ebb-84b3-4b87-8d37-0cf99238e472 */
   public int readFromFile(File file) {
      // TODO: implement
      return 0;
   }

}