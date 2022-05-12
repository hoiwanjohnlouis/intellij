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
import com.hwtsllc.fixengine2022.fix44.enums.Enum733UnderlyingSettlPriceType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  733 (same as 731, 733)
 *  UnderlyingSettlPriceType
 *  Underlying security’s SettlPriceType.
 *              See SettlPriceType (731) field for description
 *  Valid values:
 *      1 - Final
 *      2 - Theoretical
 */
class Tag733EnuUnderlyingSettlPriceTypeTest {
    @Test
    void FIX0733Test() {
        FIX44 fixData = FIX44.FIX733_ENU_UNDERLYING_SETTL_PRICE_TYPE;
        assertEquals( "733", fixData.getID());
        assertEquals( "UNDERLYING_SETTL_PRICE_TYPE", fixData.getName());
        assertEquals( "UnderlyingSettlPriceType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0733Test() {
        Log733EnuUnderlyingSettlPriceType tagData;

        tagData = new Log733EnuUnderlyingSettlPriceType(Enum733UnderlyingSettlPriceType.FINAL);
        assertEquals( "1", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log733EnuUnderlyingSettlPriceType(Enum733UnderlyingSettlPriceType.THEORETICAL);
        assertEquals( "2", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}