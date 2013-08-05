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

import java.util.Comparator;

/** Guarantees that array entries provided by {@link #begin()} between indexes 0 and {@link #size} at the time begin was called
 * will not be modified until {@link #end()} is called. If modification of the SnapshotArray occurs between begin/end, the backing
 * array is copied prior to the modification, ensuring that the backing array that was returned by {@link #begin()} is unaffected.
 * To avoid allocation, an attempt is made to reuse any extra array created as a result of this copy on subsequent copies.
 * <p>
 * It is suggested iteration be done in this specific way:
 * 
 * <pre>
 * SnapshotArray array = new SnapshotArray();
 *  ...
 * Object[] items = array.begin();
 * for (int i = 0, n = array.size; i &lt; n; i++) {
 * 	Object item = items[i];
 * 	 ...
 * }
 * array.end();
 * </pre>
 * 
 * @author Nathan Sweet
 * @pdOid cc6939ad-6cad-4baa-bc87-2e2558964318 */
public class SnapshotArray {
}