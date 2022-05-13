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

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1028
 *  ManualOrderIndicator
 *  Boolean
 *  <p>
 *  Indicates if the order was initially received manually (as opposed to electronically)
 *  <p></p>
 *  <p> YES( "Y", "YES", "Y - Manually Order" ),
 *  <p> NO( "N", "NO", "N - Electronic Order" ),
 */
class Tag1028BoolManualOrderIndicatorTest {
    @Test
    void FIX1028Test() {
        FIX50 fixData = FIX50.FIX1028_BOOL_MANUAL_ORDER_INDICATOR;
        assertEquals( "1028", fixData.getID());
        assertEquals( "MANUAL_ORDER_INDICATOR", fixData.getName());
        assertEquals( "ManualOrderIndicator", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1028Test() {
        Tag1028BoolManualOrderIndicator tagData;

    }
}