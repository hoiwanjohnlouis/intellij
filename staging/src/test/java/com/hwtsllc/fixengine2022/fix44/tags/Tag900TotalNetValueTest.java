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

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  900
 *  TotalNetValue
 *  Amt
 *  TotalNetValue is determined as follows:
 *      At the initial collateral assignment TotalNetValue is the sum of
 *      (UnderlyingStartValue * (1-haircut)).
 *      In a collateral substitution TotalNetValue is the sum of
 *      (UnderlyingCurrentValue * (1-haircut)).
 *      For listed derivatives clearing margin management,
 *      this is the collateral value which equals (Market value * haircut)
 */
class Tag900TotalNetValueTest {
    @Test
    void FIX0900Test() {
        FIX44 fixData = FIX44.FIX900_TOTAL_NET_VALUE;
        assertEquals( "900", fixData.getID());
        assertEquals( "TOTAL_NET_VALUE", fixData.getName());
        assertEquals( "FIX900_TOTAL_NET_VALUE", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0900Test() {
        Tag900TotalNetValue tagData;

    }
}