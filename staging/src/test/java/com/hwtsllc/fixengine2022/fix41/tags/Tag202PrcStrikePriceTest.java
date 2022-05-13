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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  202
 *  StrikePrice
 *  Price
 *  <p>
 *  Strike Price for an Option.
 */
class Tag202PrcStrikePriceTest {
    @Test
    void FIX0202Test() {
        FIX41 fixData = FIX41.FIX202_PRC_STRIKE_PRICE;
        assertEquals( "202", fixData.getID());
        assertEquals( "STRIKE_PRICE", fixData.getName());
        assertEquals( "StrikePrice", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0202Test() {
        Tag202PrcStrikePrice tagData;

        tagData = new Tag202PrcStrikePrice(new MyPriceType(Tag202PrcStrikePrice.TESTA_PRC_STRIKE_PRICE));
        assertEquals( Tag202PrcStrikePrice.TESTA_PRC_STRIKE_PRICE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag202PrcStrikePrice(new MyPriceType(Tag202PrcStrikePrice.TESTB_PRC_STRIKE_PRICE));
        assertEquals( Tag202PrcStrikePrice.TESTB_PRC_STRIKE_PRICE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}