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

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.IntFloatMap.Entries;
import com.badlogic.gdx.utils.IntFloatMap.Keys;
import com.badlogic.gdx.utils.IntFloatMap.Values;
import java.util.Iterator;
import java.util.NoSuchElementException;

/** An unordered map where the keys and values are ints. This implementation is a cuckoo hash map using 3 hashes, random walking,
 * and a small stash for problematic keys. No allocation is done except when growing the table size. <br>
 * <br>
 * This map performs very fast get, containsKey, and remove (typically O(1), worst case O(log(n))). Put may be a bit slower,
 * depending on hash collisions. Load factors greater than 0.91 greatly increase the chances the map will have to rehash to the
 * next higher POT size.
 * 
 * @author Nathan Sweet
 * @pdOid 7b1fa2a2-6e15-432e-a2ed-6b4ab8299f90 */
public class IntIntMap {
}