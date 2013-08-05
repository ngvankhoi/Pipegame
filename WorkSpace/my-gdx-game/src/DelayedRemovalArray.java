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

/** Queues any removals done after {@link #begin()} is called to occur once {@link #end()} is called. This can allow code out of
 * your control to remove items without affecting iteration. Between begin and end, most mutator methods will throw
 * IllegalStateException. Only {@link #removeIndex(int)}, {@link #removeValue(Object, boolean)}, and add methods are allowed.
 * <p>
 * Code using this class must not rely on items being removed immediately. Consider using {@link SnapshotArray} if this is a
 * problem..
 * 
 * @author Nathan Sweet
 * @pdOid 0ccc6522-d195-4ea1-b0f4-ada420ba0568 */
public class DelayedRemovalArray {
}