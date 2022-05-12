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
 *  961
 *  HostCrossID
 *  String
 *  <p>
 *  Host assigned entity ID that can be used to reference all components of a cross;
 *  sides + strategy + legs.
 *  <p>
 *  Used as the primary key with which to refer to the Cross Order for cancellation and replace.
 *  <p>
 *  The HostCrossID will also be used to link together components of the Cross Order.
 *  <p>
 *  i.e. each individual Execution Report associated with the order will carry
 *  HostCrossID in order to tie back to the original cross order.
 */
public class Tag961HostCrossID {
}
