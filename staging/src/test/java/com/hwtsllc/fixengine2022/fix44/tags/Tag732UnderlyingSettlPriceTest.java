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
 *  732
 *  UnderlyingSettlPrice
 *  Price
 *  Underlying security’s SettlPrice.
 *          See SettlPrice (730) field for description
 */
class Tag732UnderlyingSettlPriceTest {
    @Test
    void FIX0732Test() {
        FIX44 fixData = FIX44.FIX732_UNDERLYING_SETTL_PRICE;
        assertEquals( "732", fixData.getID());
        assertEquals( "UNDERLYING_SETTL_PRICE", fixData.getName());
        assertEquals( "UnderlyingSettlPrice", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0732Test() {
        Tag732UnderlyingSettlPrice tagData;

    }
}