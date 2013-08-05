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

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.FloatCounter;
import com.badlogic.gdx.math.WindowedMean;

/** Class to keep track of the time and load (percentage of total time) a specific task takes.
 * Call {@link #start()} just before starting the task and {@link #stop()} right after. You can do this
 * multiple times if required. Every render or update call {@link #tick()} to update the values.
 * The {@link #time} {@link FloatCounter} provides access to the minimum, maximum, average, total and current time
 * the task takes. Likewise for the {@link #load} value, which is the percentage of the total time.
 * 
 * @author xoppa
 * 
 * @pdOid f3182d9a-74f3-4912-9b1d-ebc172403832 */
public class PerformanceCounter {
}