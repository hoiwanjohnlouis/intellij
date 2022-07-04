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

package com.hwtsllc.fixengine2022.fix40.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  127
 *  DKReason
 *  char
 *  Reason for execution rejection.
 *  Valid values:
 *      A - Unknown Symbol
 *      B - Wrong Side
 *      C - Quantity Exceeds Order
 *      D - No Matching Order
 *      E - Price Exceeds Limit
 *      F - Calculation Difference
 *      Z - Other
 */
class Enum127DKReasonTest {

    @Test
    void Enum0127Test() {
        Enum127DKReason enumType;

        /*
         * A-F, and Z msg types
         */
        enumType = Enum127DKReason.UNKNOWN_SYMBOL;
        assertEquals("A", enumType.toEnumIDString());
        assertEquals("UNKNOWN_SYMBOL", enumType.toEnumNameString());
        assertEquals("A - Unknown Symbol", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum127DKReason.WRONG_SIDE;
        assertEquals("B", enumType.toEnumIDString());
        assertEquals("WRONG_SIDE", enumType.toEnumNameString());
        assertEquals("B - Wrong Side", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum127DKReason.QUANTITY_EXCEEDS_ORDER;
        assertEquals("C", enumType.toEnumIDString());
        assertEquals("QUANTITY_EXCEEDS_ORDER", enumType.toEnumNameString());
        assertEquals("C - Quantity Exceeds Order", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum127DKReason.NO_MATCHING_ORDER;
        assertEquals("D", enumType.toEnumIDString());
        assertEquals("NO_MATCHING_ORDER", enumType.toEnumNameString());
        assertEquals("D - No Matching Order", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum127DKReason.PRICE_EXCEEDS_LIMIT;
        assertEquals("E", enumType.toEnumIDString());
        assertEquals("PRICE_EXCEEDS_LIMIT", enumType.toEnumNameString());
        assertEquals("E - Price Exceeds Limit", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum127DKReason.CALCULATION_DIFFERENCE;
        assertEquals("F", enumType.toEnumIDString());
        assertEquals("CALCULATION_DIFFERENCE", enumType.toEnumNameString());
        assertEquals("F - Calculation Difference", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum127DKReason.OTHER;
        assertEquals("Z", enumType.toEnumIDString());
        assertEquals("OTHER", enumType.toEnumNameString());
        assertEquals("Z - Other", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}