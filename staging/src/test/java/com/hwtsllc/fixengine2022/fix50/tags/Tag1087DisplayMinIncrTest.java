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
 *  1087
 *  DisplayMinIncr
 *  Qty
 *  <p>
 *  Defines the minimum increment to be used when calculating a random refresh of DisplayQty.
 *  <p>
 *  A user specifies this when he wants a larger increment than
 *  the standard provided by the market (e.g. the round lot size).
 */
class Tag1087DisplayMinIncrTest {
    @Test
    void FIX1087Test() {
        FIX50 fixData = FIX50.FIX1087_DISPLAY_MIN_INCR;
        assertEquals( "1087", fixData.getID());
        assertEquals( "DISPLAY_MIN_INCR", fixData.getName());
        assertEquals( "display_min_incr", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1087Test() {
        Tag1087DisplayMinIncr tagData;

    }
}