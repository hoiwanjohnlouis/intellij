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

package com.hwtsllc.fixengine2022.fix50.tags;

/**
 *  962
 *  SideTimeInForce
 *  UTCTimestamp
 *  <p>
 *  Indicates how long the order as specified in the side stays in effect.
 *  <p>
 *  SideTimeInForce allows a two-sided cross order to specify order behavior separately for each side.
 *  Absence of this field indicates that TimeInForce should be referenced.
 *  <p>
 *  SideTimeInForce will override TimeInForce if both are provided.
 */
public class Tag962SideTimeInForce {
}
