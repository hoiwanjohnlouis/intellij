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
 *  1095
 *  PeggedRefPrice
 *  Price
 *  <p>
 *  The value of the reference price that the order is pegged to.
 *  <p>
 *  PeggedRefPrice + PegOffsetValue (211) = PeggedPrice (839)
 *  unless the limit price (44, Price) is breached.
 *  <p>
 *  The values may not be exact due to rounding.
 */
public class Tag1095PeggedRefPrice {
}
