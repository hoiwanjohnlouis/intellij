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
 *  1065
 *  BidSwapPoints
 *  PriceOffset
 *  <p>
 *  The bid FX Swap points for an FX Swap.
 *  <p>
 *  It is the "far bid forward points - near offer forward point".
 *  <p>
 *  Value can be negative.  Expressed in decimal form.
 *  <p>
 *  For example, 61.99 points is expressed and sent as 0.006199
 */
class Tag1065BidSwapPointsTest {
    @Test
    void FIX1065Test() {
        FIX50 fixData = FIX50.FIX1065_BID_SWAP_POINTS;
        assertEquals( "1065", fixData.getID());
        assertEquals( "BID_SWAP_POINTS", fixData.getName());
        assertEquals( "BidSwapPoints", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1065Test() {
        Tag1065BidSwapPoints tagData;

    }
}