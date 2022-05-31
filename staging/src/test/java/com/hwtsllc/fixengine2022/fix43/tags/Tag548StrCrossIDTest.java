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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  548
 *  CrossID
 *  String
 *  <p>
 *  Identifier for a cross order.
 *  <p>
 *  Must be unique during a given trading day.
 *  <p>
 *  Recommend that firms use the order date as part of the CrossID for Good Till Cancel (GT) orders.
 */
class Tag548StrCrossIDTest {
    @Test
    void FIX0548Test() {
        FIX43 fixData = FIX43.FIX548_STR_CROSS_ID;
        assertEquals( "548", fixData.toFIXIDString());
        assertEquals( "CROSS_ID", fixData.toFIXNameString());
        assertEquals( "CrossID", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0548Test() {
        Tag548StrCrossID tagData;

    }
}