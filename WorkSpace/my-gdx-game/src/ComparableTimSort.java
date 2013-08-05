/*
 * Copyright (C) 2008 The Android Open Source Project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

/** This is a near duplicate of {@link TimSort}, modified for use with arrays of objects that implement {@link Comparable}, instead
 * of using explicit comparators.
 * 
 * <p>
 * If you are using an optimizing VM, you may find that ComparableTimSort offers no performance benefit over TimSort in
 * conjunction with a comparator that simply returns {@code ((Comparable)first).compareTo(Second)}. If this is the case, you are
 * better off deleting ComparableTimSort to eliminate the code duplication. (See Arrays.java for details.)
 * 
 * @pdOid b6352f5b-a311-4dc6-bbf3-d65e93c63391 */
class ComparableTimSort {
}