/***********************************************************************
 * Module:  GameResource.java
 * Author:  Welcome
 * Purpose: Defines the Class GameResource
 ***********************************************************************/

package com.nvkit.mygame;

import java.util.*;

/** @pdOid d93a2629-9628-4ae2-acbc-5ef2d2946f28 */
public final class GameResource {
   /** @pdOid 22133f0e-10d7-47a0-a472-946bf271ba41 */
   public class CellDataSprite {
      /** @pdOid 093e09ea-6946-4aca-a261-0c5fab9f51d8 */
      private Textture textture;
      /** @pdOid 0e46cf31-ce90-4b78-8cec-df55d54dac1e */
      private Boolean resourceloaded = false;
      /** @pdOid 82bbb36c-f54f-4668-82e7-ecc1d8292a36 */
      private java.lang.String pathresource;
      
      /** @pdOid ed8a2537-abe8-46b2-8f6c-ee12454dd9e6 */
      protected java.lang.String getResourcePath() {
         // TODO: implement
         return null;
      }
      
      /** @param pathresource
       * @pdOid 1721f5bb-20dc-45be-8cd0-8acd4cf7ee33 */
      protected CellDataSprite(java.lang.String pathresource) {
         // TODO: implement
      }
      
      /** @pdOid 53b4a457-85b2-4679-8222-7167f8b2923f */
      protected void finalize() {
         // TODO: implement
      }
      
      /** @pdOid 290647e0-1c3b-4457-8a74-399add01b656
          @pdRoleInfo migr=yes name=GameResource.CellDataSprite assc=association1 mult=* */
      public static GameResource.CellDataSprite[] BLANKS;
      /** @pdOid aff94ccc-5058-4adc-81cf-566cadd6ad3b
          @pdRoleInfo migr=yes name=GameResource.CellDataSprite assc=association2 mult=* */
      public static GameResource.CellDataSprite[] WALLS;
      /** @pdOid 6f7fbdd2-3004-426f-b850-021a5d965ebe
          @pdRoleInfo migr=yes name=GameResource.CellDataSprite assc=association3 mult=* */
      public static GameResource.CellDataSprite[] PIPES;
      
      /** @pdOid 4a1a49f2-0337-427b-b99a-ae097e732ca9 */
      public Sprite getSprite() {
         // TODO: implement
         return null;
      }
      
      /** @pdOid 10ab70e5-be61-4cf5-8029-14ee9900230e */
      public Textture getTextture() {
         // TODO: implement
         return null;
      }
      
      /** @pdOid 2b234061-aeb6-46ec-a9bc-98127d2e9a46 */
      public java.lang.String getPathresource() {
         return pathresource;
      }
      
      /** @param newPathresource
       * @pdOid 02450934-f943-4a33-a28e-89a0f1d8d8cb */
      public void setPathresource(java.lang.String newPathresource) {
         pathresource = newPathresource;
      }
   
      /** @pdOid a1c5c874-0083-4f9d-8c53-cf1cf5ca6622 */
      public interface CellResourcePath {
         /** @pdOid ee3e49a5-4aab-4157-b662-bf1a9943b368 */
         static final java.lang.String[] BLANKIMAGEPATH = {"PATH/RESOURCE","PATH/RESOURCE"};
         /** @pdOid ac82b52f-8da1-488d-a2ee-d68efa291440 */
         static final java.lang.String[] WALLIMAGEPATHS = {"PATH/RESOURCE","PATH/RESOURCE"};
         /** @pdOid 521b8130-dce7-47b4-b036-1f5966d141f8 */
         static final java.lang.String[] PIPEIMAGEPATH = {""};
      
      }
   
   }

}