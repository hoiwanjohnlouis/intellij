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

import com.hwtsllc.fixengine2022.datatypes.MyEnumPriceScope;
import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1092 (same as 1092, 1108,)
 *  PriceProtectionScope
 *  char
 *  <p>
 *  Defines the type of price protection the customer requires on their order.
 *  <p></p>
 *  1108
 *  TriggerPriceTypeScope
 *  char
 *  <p>
 *  Defines the type of price protection the customer requires on their order.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - None
 *  <p>    1 - Local (Exchange, ECN, ATS)
 *  <p>    2 - National (Across all national markets)
 *  <p>    3 - Global (Across all markets)
 */
class Tag1092EnuPriceProtectionScopeTest {
    @Test
    void FIX1092Test() {
        FIX50 fixData = FIX50.FIX1092_ENU_PRICE_PROTECTION_SCOPE;
        assertEquals( "1092", fixData.getID());
        assertEquals( "PRICE_PROTECTION_SCOPE", fixData.getName());
        assertEquals( "PriceProtectionScope", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1092Test() {
        Tag1092EnuPriceProtectionScope tagData;

        tagData = new Tag1092EnuPriceProtectionScope( MyEnumPriceScope.NONE );
        assertEquals( MyEnumPriceScope.NONE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1092EnuPriceProtectionScope( MyEnumPriceScope.LOCAL );
        assertEquals( MyEnumPriceScope.LOCAL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1092EnuPriceProtectionScope( MyEnumPriceScope.NATIONAL );
        assertEquals( MyEnumPriceScope.NATIONAL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1092EnuPriceProtectionScope( MyEnumPriceScope.GLOBAL );
        assertEquals( MyEnumPriceScope.GLOBAL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}