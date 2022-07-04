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

package com.hwtsllc.fixengine2022.fix43.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  465
 *  QuantityType
 *  int
 *  <p></p>
 *  Deprecated in FIX.4.4
 *  <p></p>
 *  Designates the type of quantities (e.g. OrderQty) specified.
 *  <p>
 *  Used for MBS and TIPS Fixed Income security types.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - SHARES
 *  <p>    2 - BONDS
 *  <p>    3 - CURRENTFACE
 *  <p>    4 - ORIGINALFACE
 *  <p>    5 - CURRENCY
 *  <p></p>
 *  <p>    6 - CONTRACTS
 *  <p>    7 - OTHER
 *  <p>    8 - PAR
 */
class Enum465QuantityTypeTest {
    @Test
    void Enum0465Test() {
        Enum465QuantityType enumType;

        /*
         * 1-8 types
         */
        enumType = Enum465QuantityType.SHARES;
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("SHARES", enumType.toEnumNameString());
        assertEquals("1 - SHARES", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum465QuantityType.BONDS;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("BONDS", enumType.toEnumNameString());
        assertEquals("2 - BONDS", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum465QuantityType.CURRENT_FACE;
        assertEquals("3", enumType.toEnumIDString());
        assertEquals("CURRENTFACE", enumType.toEnumNameString());
        assertEquals("3 - CURRENTFACE", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum465QuantityType.ORIGINAL_FACE;
        assertEquals("4", enumType.toEnumIDString());
        assertEquals("ORIGINALFACE", enumType.toEnumNameString());
        assertEquals("4 - ORIGINALFACE", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum465QuantityType.CURRENCY;
        assertEquals("5", enumType.toEnumIDString());
        assertEquals("CURRENCY", enumType.toEnumNameString());
        assertEquals("5 - CURRENCY", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum465QuantityType.CONTRACTS;
        assertEquals("6", enumType.toEnumIDString());
        assertEquals("CONTRACTS", enumType.toEnumNameString());
        assertEquals("6 - CONTRACTS", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum465QuantityType.OTHER;
        assertEquals("7", enumType.toEnumIDString());
        assertEquals("OTHER", enumType.toEnumNameString());
        assertEquals("7 - OTHER", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum465QuantityType.PAR;
        assertEquals("8", enumType.toEnumIDString());
        assertEquals("PAR", enumType.toEnumNameString());
        assertEquals("8 - PAR", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}


