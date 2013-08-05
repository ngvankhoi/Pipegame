/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.badlogic.gdx;

/** <p>
 * An <code>ApplicationListener</code> is called when the {@link Application} is created, resumed, rendering, paused or destroyed.
 * All methods are called in a thread that has the OpenGL context current. You can thus safely create and manipulate graphics
 * resources.
 * </p>
 * 
 * <p>
 * The <code>ApplicationListener</code> interface follows the standard Android activity life-cycle and is emulated on the desktop
 * accordingly.
 * </p>
 * 
 * 
 * @author mzechner
 * @pdOid b2392cf5-4e66-41c5-bdc8-b188e0851c3a */
public interface ApplicationListener {
   /** Called when the {@link Application} is first created.
    * 
    * @pdOid d4689b96-39b5-42e4-9b5b-cc846548403c */
   void create();
   /** Called when the {@link Application} is resized. This can happen at any point during a non-paused state but will never happen
    * before a call to {@link #create()}.
    * 
    * 
    * @param width the new width in pixels
    * @param height the new height in pixels
    * @pdOid 71584558-2f3e-4887-a40e-fdbc59cb8408 */
   void resize(int width, int height);
   /** Called when the {@link Application} should render itself.
    * 
    * @pdOid 338a65c7-16a5-4184-bbb2-7593ed9589bb */
   void render();
   /** Called when the {@link Application} is paused. An Application is paused before it is destroyed, when a user pressed the Home
    * button on Android or an incoming call happend. On the desktop this will only be called immediately before {@link #dispose()}
    * is called.
    * 
    * @pdOid 5393c0fe-a0b7-4fa4-9784-ac727c86a8dc */
   void pause();
   /** Called when the {@link Application} is resumed from a paused state. On Android this happens when the activity gets focus
    * again. On the desktop this method will never be called.
    * 
    * @pdOid 2e862033-f12f-477f-8bac-ca775eecd4e9 */
   void resume();
   /** Called when the {@link Application} is destroyed. Preceded by a call to {@link #pause()}.
    * 
    * @pdOid fa3a8ab8-d471-4e62-a95c-8f97679b56ed */
   void dispose();

}