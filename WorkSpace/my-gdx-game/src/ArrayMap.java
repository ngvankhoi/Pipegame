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

import java.util.Iterator;
import java.util.NoSuchElementException;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.ObjectMap.Entry;

/** An ordered or unordered map of objects. This implementation uses arrays to store the keys and values, which means
 * {@link #getKey(Object, boolean) gets} do a comparison for each key in the map. This may be acceptable for small maps and has the
 * benefits that keys and values can be accessed by index, which makes iteration fast. Like {@link Array}, if ordered is false,
 * this class avoids a memory copy when removing elements (the last element is moved to the removed element's position).
 * 
 * @author Nathan Sweet
 * @pdOid 7098eb10-8a3a-4819-bcbb-2264c93311be */
public class ArrayMap {
}