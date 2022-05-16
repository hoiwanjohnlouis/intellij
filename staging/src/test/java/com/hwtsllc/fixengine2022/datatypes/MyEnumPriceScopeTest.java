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

package com.hwtsllc.fixengine2022.datatypes;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
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
class MyEnumPriceScopeTest {
    @Test
    void EnumTest() {
        MyEnumPriceScope enumType;

        enumType = MyEnumPriceScope.NONE;
        assertEquals( "0", enumType.toFIXIDString());
        assertEquals( "NONE", enumType.toFIXNameString());
        assertEquals( "0 - None", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumPriceScope.LOCAL;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "LOCAL", enumType.toFIXNameString());
        assertEquals( "1 - Local (Exchange, ECN, ATS)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumPriceScope.NATIONAL;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "NATIONAL", enumType.toFIXNameString());
        assertEquals( "2 - National (Across all national markets)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumPriceScope.GLOBAL;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "GLOBAL", enumType.toFIXNameString());
        assertEquals( "3 - Global (Across all markets)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}