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
import java.util.BitSet;

/** A resizable, ordered or unordered boolean array. Avoids the boxing that occurs with ArrayList<Boolean>. It is less memory
 * efficient than {@link BitSet}, except for very small sizes. It more CPU efficient than {@link BitSet}, except for very large
 * sizes or if BitSet functionality such as and, or, xor, etc are needed. If unordered, this class avoids a memory copy when
 * removing elements (the last element is moved to the removed element's position).
 * 
 * @author Nathan Sweet
 * @pdOid a02fe9bd-9451-4d31-8786-fd3898b4db9c */
public class BooleanArray {
}