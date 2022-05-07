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
import com.hwtsllc.fixengine2022.fix44.enums.Enum731SettlPriceType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  731 (same as 731, 733)
 *  SettlPriceType
 *  Type of settlement price
 *  Valid values:
 *      1 - Final
 *      2 - Theoretical
 */
class Tag731EnuSettlPriceTypeTest {
    @Test
    void FIX0731Test() {
        FIX44 fixData = FIX44.FIX731_ENU_SETTL_PRICE_TYPE;
        assertEquals( "731", fixData.getID());
        assertEquals( "SETTL_PRICE_TYPE", fixData.getName());
        assertEquals( "SettlPriceType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0731Test() {
        Tag731EnuSettlPriceType tagData;

        tagData = new Tag731EnuSettlPriceType(Enum731SettlPriceType.FINAL);
        assertEquals( "1", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag731EnuSettlPriceType(Enum731SettlPriceType.THEORETICAL);
        assertEquals( "2", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}