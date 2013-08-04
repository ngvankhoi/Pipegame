/***********************************************************************
 * Module:  Board.java
 * Author:  Welcome
 * Purpose: Defines the Class Board
 ***********************************************************************/

package com.nvkit.mygame.object;

import java.util.*;

/** lớp thể hiện một bản hình chữ nhật, được tạo từ các đối Cell
 * 
 * @pdOid 1f3f83ee-c744-4131-8596-6209990a7253 */
public class Board {
   /** @pdRoleInfo migr=no name=Cell assc=association2 coll=java.util.Collection impl=java.util.HashSet mult=1..* type=Aggregation */
   public java.util.Collection<Cell> cell;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Cell> getCell() {
      if (cell == null)
         cell = new java.util.HashSet<Cell>();
      return cell;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCell() {
      if (cell == null)
         cell = new java.util.HashSet<Cell>();
      return cell.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCell */
   public void setCell(java.util.Collection<Cell> newCell) {
      removeAllCell();
      for (java.util.Iterator iter = newCell.iterator(); iter.hasNext();)
         addCell((Cell)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCell */
   public void addCell(Cell newCell) {
      if (newCell == null)
         return;
      if (this.cell == null)
         this.cell = new java.util.HashSet<Cell>();
      if (!this.cell.contains(newCell))
         this.cell.add(newCell);
   }
   
   /** @pdGenerated default remove
     * @param oldCell */
   public void removeCell(Cell oldCell) {
      if (oldCell == null)
         return;
      if (this.cell != null)
         if (this.cell.contains(oldCell))
            this.cell.remove(oldCell);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCell() {
      if (cell != null)
         cell.clear();
   }

}