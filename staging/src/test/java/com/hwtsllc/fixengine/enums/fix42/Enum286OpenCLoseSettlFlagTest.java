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

package com.hwtsllc.fixengine.enums.fix42;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  286
 *  OpenCloseSettleFlag
 *  MultipleCharValue
 *  <p>
 *  Flag that identifies a market data entry. (Prior to FIX 4.3 this field was of type char)
 *  <p></p>
 *  Valid values:
 *  <p>    0-5 msg types
 *  <p>    "0 - Daily Open / Close / Settlement entry"
 *  <p>    "1 - Session Open / Close / Settlement entry"
 *  <p>    "2 - Delivery Settlement entry"
 *  <p>    "3 - Expected entry"
 *  <p>    "4 - Entry from previous business day"
 *  <p>    "5 - Theoretical Price value"
 */
class Enum286OpenCLoseSettlFlagTest {
    @Test
    void Enum0286Test() {
        Enum286OpenCLoseSettlFlag enumType;

        /*
         * 0-5 msg types
         */
        enumType = Enum286OpenCLoseSettlFlag.DAILY_OPEN_OR_CLOSE_OR_SETTLEMENT;
        assertEquals( "0", enumType.toFIXIDString());
        assertEquals( "DAILY_OPEN_OR_CLOSE_OR_SETTLEMENT", enumType.toFIXNameString());
        assertEquals( "0 - Daily Open / Close / Settlement entry", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum286OpenCLoseSettlFlag.SESSION_OPEN_OR_CLOSE_OR_SETTLEMENT;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "SESSION_OPEN_OR_CLOSE_OR_SETTLEMENT", enumType.toFIXNameString());
        assertEquals( "1 - Session Open / Close / Settlement entry", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum286OpenCLoseSettlFlag.DELIVERY_SETTLEMENT;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "DELIVERY_SETTLEMENT", enumType.toFIXNameString());
        assertEquals( "2 - Delivery Settlement entry", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum286OpenCLoseSettlFlag.EXPECTED;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "EXPECTED", enumType.toFIXNameString());
        assertEquals( "3 - Expected entry", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum286OpenCLoseSettlFlag.PREVIOUS_BUSINESS_DAY;
        assertEquals( "4", enumType.toFIXIDString());
        assertEquals( "PREVIOUS_BUSINESS_DAY", enumType.toFIXNameString());
        assertEquals( "4 - Entry from previous business day", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum286OpenCLoseSettlFlag.THEORETICAL_PRICE_VALUE;
        assertEquals( "5", enumType.toFIXIDString());
        assertEquals( "THEORETICAL_PRICE_VALUE", enumType.toFIXNameString());
        assertEquals( "5 - Theoretical Price value", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}