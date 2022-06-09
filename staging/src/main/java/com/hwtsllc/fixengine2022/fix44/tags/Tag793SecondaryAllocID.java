/*
 * Copyright (c) 2022.  HW Tech Services, LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.hwtsllc.fixengine2022.fix44.tags;

/**
 *  793
 *  SecondaryAllocID
 *  String
 *  <p></p>
 *  Secondary allocation identifier.
 *  <p></p>
 *  Unlike the AllocID (70),
 *  this can be shared across a number of allocation instruction
 *  or allocation report messages, thereby making it possible to
 *  pass an identifier for an original allocation message on multiple messages
 *  <p></p>
 *  (e.g. from one party to a second to a third, across cancel and replace messages etc.).
 */
public class Tag793SecondaryAllocID {
}
