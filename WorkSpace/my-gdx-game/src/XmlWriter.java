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

import java.io.IOException;
import java.io.Writer;

/** @off
 * Builder style API for emitting XML. <pre>
 * StringWriter writer = new StringWriter();
 * XmlBuilder xml = new XmlBuilder(writer);
 * xml.element("meow")
 * 	.attribute("moo", "cow")
 * 	.element("child")
 * 		.attribute("moo", "cow")
 * 		.element("child")
 * 			.attribute("moo", "cow")
 * 			.text("XML is like violence. If it doesn't solve your problem, you're not using enough of it.")
 * 		.pop()
 * 	.pop()
 * .pop();
 * System.out.println(writer);
 * </pre>
 * @on
 * 
 * @author Nathan Sweet
 * 
 * @pdOid 05d258f7-44fe-4525-858b-25147f2ab797 */
public class XmlWriter {
}