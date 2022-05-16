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
 *  1090
 *  MaxPriceLevels
 *  int
 *  <p>
 *  Allows an order to specify a maximum number of price levels to trade through.
 *  <p>
 *  Only valid for aggressive orders and during continuous (autoexecution) trading sessions.
 *  <p>
 *  Property lost when order is put on book.
 *  A partially filled order is assigned last trade price as limit price.
 *  Non-filled order behaves as ordinary Market or Limit.
 */
class Tag1090MaxPriceLevelsTest {
    @Test
    void FIX1090Test() {
        FIX50 fixData = FIX50.FIX1090_MAX_PRICE_LEVELS;
        assertEquals( "1090", fixData.toFIXIDString());
        assertEquals( "MAX_PRICE_LEVELS", fixData.toFIXNameString());
        assertEquals( "MaxPriceLevels", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1090Test() {
        Tag1090MaxPriceLevels tagData;

    }
}