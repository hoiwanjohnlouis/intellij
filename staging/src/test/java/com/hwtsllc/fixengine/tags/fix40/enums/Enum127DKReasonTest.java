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
        assertEquals("A", enumType.toFIXIDString());
        assertEquals("UNKNOWN_SYMBOL", enumType.toFIXNameString());
        assertEquals("A - Unknown Symbol", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum127DKReason.WRONG_SIDE;
        assertEquals("B", enumType.toFIXIDString());
        assertEquals("WRONG_SIDE", enumType.toFIXNameString());
        assertEquals("B - Wrong Side", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum127DKReason.QUANTITY_EXCEEDS_ORDER;
        assertEquals("C", enumType.toFIXIDString());
        assertEquals("QUANTITY_EXCEEDS_ORDER", enumType.toFIXNameString());
        assertEquals("C - Quantity Exceeds Order", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum127DKReason.NO_MATCHING_ORDER;
        assertEquals("D", enumType.toFIXIDString());
        assertEquals("NO_MATCHING_ORDER", enumType.toFIXNameString());
        assertEquals("D - No Matching Order", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum127DKReason.PRICE_EXCEEDS_LIMIT;
        assertEquals("E", enumType.toFIXIDString());
        assertEquals("PRICE_EXCEEDS_LIMIT", enumType.toFIXNameString());
        assertEquals("E - Price Exceeds Limit", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum127DKReason.CALCULATION_DIFFERENCE;
        assertEquals("F", enumType.toFIXIDString());
        assertEquals("CALCULATION_DIFFERENCE", enumType.toFIXNameString());
        assertEquals("F - Calculation Difference", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum127DKReason.OTHER;
        assertEquals("Z", enumType.toFIXIDString());
        assertEquals("OTHER", enumType.toFIXNameString());
        assertEquals("Z - Other", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}