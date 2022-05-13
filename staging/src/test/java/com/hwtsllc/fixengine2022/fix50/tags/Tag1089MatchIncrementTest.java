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
 *  1089
 *  MatchIncrement
 *  Qty
 *  <p>
 *  Allows orders to specify a minimum quantity that applies to every execution
 *  (one execution could be for multiple counter-orders).
 *  <p>
 *  The order may still fill against smaller orders, but the cumulative quantity
 *  of the execution must be in multiples of the MatchIncrement.
 */
class Tag1089MatchIncrementTest {
    @Test
    void FIX1089Test() {
        FIX50 fixData = FIX50.FIX1089_MATCH_INCREMENT;
        assertEquals( "1089", fixData.getID());
        assertEquals( "MATCH_INCREMENT", fixData.getName());
        assertEquals( "MatchIncrement", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1089Test() {
        Tag1089MatchIncrement tagData;

    }
}