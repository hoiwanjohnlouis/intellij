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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum286OpenCLoseSettlFlagTest {
    /**
     *  286
     *  OpenCloseSettleFlag
     *
     *      0-5 msg types
     *      DAILY_OPEN_OR_CLOSE_OR_SETTLEMENT( "0", "DAILY_OPEN_OR_CLOSE_OR_SETTLEMENT",
     *                  "0 - Daily Open / Close / Settlement entry" ),
     *      SESSION_OPEN_OR_CLOSE_OR_SETTLEMENT( "1", "SESSION_OPEN_OR_CLOSE_OR_SETTLEMENT",
     *                  "1 - Session Open / Close / Settlement entry" ),
     *      DELIVERY_SETTLEMENT( "2", "DELIVERY_SETTLEMENT", "2 - Delivery Settlement entry" ),
     *      EXPECTED( "3", "EXPECTED", "3 - Expected entry" ),
     *      PREVIOUS_BUSINESS_DAY( "4", "PREVIOUS_BUSINESS_DAY", "4 - Entry from previous business day" ),
     *      THEORETICAL_PRICE_VALUE( "5", "THEORETICAL_PRICE_VALUE", "5 - Theoretical Price value" ),
     */
    @Test
    void Enum0286Test() {
        Enum286OpenCLoseSettlFlag enumType;

        /**
         * 0-5 msg types
         */
        enumType = Enum286OpenCLoseSettlFlag.DAILY_OPEN_OR_CLOSE_OR_SETTLEMENT;
        assertEquals( "0", enumType.getID());
        assertEquals( "DAILY_OPEN_OR_CLOSE_OR_SETTLEMENT", enumType.getName());
        assertEquals( "0 - Daily Open / Close / Settlement entry", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum286OpenCLoseSettlFlag.SESSION_OPEN_OR_CLOSE_OR_SETTLEMENT;
        assertEquals( "1", enumType.getID());
        assertEquals( "SESSION_OPEN_OR_CLOSE_OR_SETTLEMENT", enumType.getName());
        assertEquals( "1 - Session Open / Close / Settlement entry", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum286OpenCLoseSettlFlag.DELIVERY_SETTLEMENT;
        assertEquals( "2", enumType.getID());
        assertEquals( "DELIVERY_SETTLEMENT", enumType.getName());
        assertEquals( "2 - Delivery Settlement entry", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum286OpenCLoseSettlFlag.EXPECTED;
        assertEquals( "3", enumType.getID());
        assertEquals( "EXPECTED", enumType.getName());
        assertEquals( "3 - Expected entry", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum286OpenCLoseSettlFlag.PREVIOUS_BUSINESS_DAY;
        assertEquals( "4", enumType.getID());
        assertEquals( "PREVIOUS_BUSINESS_DAY", enumType.getName());
        assertEquals( "4 - Entry from previous business day", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum286OpenCLoseSettlFlag.THEORETICAL_PRICE_VALUE;
        assertEquals( "5", enumType.getID());
        assertEquals( "THEORETICAL_PRICE_VALUE", enumType.getName());
        assertEquals( "5 - Theoretical Price value", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}