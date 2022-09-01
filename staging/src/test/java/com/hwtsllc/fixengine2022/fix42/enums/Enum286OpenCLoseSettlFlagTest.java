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

package com.hwtsllc.fixengine2022.fix42.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
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
        assertEquals( "0", enumType.toEnumIDString());
        assertEquals( "DAILY_OPEN_OR_CLOSE_OR_SETTLEMENT", enumType.toEnumNameString());
        assertEquals( "0 - Daily Open / Close / Settlement entry", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum286OpenCLoseSettlFlag.SESSION_OPEN_OR_CLOSE_OR_SETTLEMENT;
        assertEquals( "1", enumType.toEnumIDString());
        assertEquals( "SESSION_OPEN_OR_CLOSE_OR_SETTLEMENT", enumType.toEnumNameString());
        assertEquals( "1 - Session Open / Close / Settlement entry", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum286OpenCLoseSettlFlag.DELIVERY_SETTLEMENT;
        assertEquals( "2", enumType.toEnumIDString());
        assertEquals( "DELIVERY_SETTLEMENT", enumType.toEnumNameString());
        assertEquals( "2 - Delivery Settlement entry", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum286OpenCLoseSettlFlag.EXPECTED;
        assertEquals( "3", enumType.toEnumIDString());
        assertEquals( "EXPECTED", enumType.toEnumNameString());
        assertEquals( "3 - Expected entry", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum286OpenCLoseSettlFlag.PREVIOUS_BUSINESS_DAY;
        assertEquals( "4", enumType.toEnumIDString());
        assertEquals( "PREVIOUS_BUSINESS_DAY", enumType.toEnumNameString());
        assertEquals( "4 - Entry from previous business day", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum286OpenCLoseSettlFlag.THEORETICAL_PRICE_VALUE;
        assertEquals( "5", enumType.toEnumIDString());
        assertEquals( "THEORETICAL_PRICE_VALUE", enumType.toEnumNameString());
        assertEquals( "5 - Theoretical Price value", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}