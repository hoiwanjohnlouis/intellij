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

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum519ContMyAmtTypeTest {
    /**
     *  Information is the same for TAGS 519
     */
    @Test
    void Enum0519Test() {
        Enum519ContAmtType enumType;

        /*
         * 1-15 types
         */
        enumType = Enum519ContAmtType.COMMISSION_AMOUNT_ACTUAL;
        assertEquals("1", enumType.getID());
        assertEquals("COMMISSION_AMOUNT_ACTUAL", enumType.getName());
        assertEquals("1 - Commission amount (actual)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum519ContAmtType.COMMISSION_PERCENT_ACTUAL;
        assertEquals("2", enumType.getID());
        assertEquals("COMMISSION_PERCENT_ACTUAL", enumType.getName());
        assertEquals("2 - Commission percent (actual)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum519ContAmtType.INITIAL_CHARGE_AMOUNT;
        assertEquals("3", enumType.getID());
        assertEquals("INITIAL_CHARGE_AMOUNT", enumType.getName());
        assertEquals("3 - Initial Charge Amount", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum519ContAmtType.INITIAL_CHARGE_PERCENT;
        assertEquals("4", enumType.getID());
        assertEquals("INITIAL_CHARGE_PERCENT", enumType.getName());
        assertEquals("4 - Initial Charge Percent", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum519ContAmtType.DISCOUNT_AMOUNT;
        assertEquals("5", enumType.getID());
        assertEquals("DISCOUNT_AMOUNT", enumType.getName());
        assertEquals("5 - Discount Amount", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum519ContAmtType.DISCOUNT_PERCENT;
        assertEquals("6", enumType.getID());
        assertEquals("DISCOUNT_PERCENT", enumType.getName());
        assertEquals("6 - Discount Percent", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum519ContAmtType.DILUTION_LEVY_AMOUNT;
        assertEquals("7", enumType.getID());
        assertEquals("DILUTION_LEVY_AMOUNT", enumType.getName());
        assertEquals("7 - Dilution Levy Amount", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum519ContAmtType.DILUTION_LEVY_PERCENT;
        assertEquals("8", enumType.getID());
        assertEquals("DILUTION_LEVY_PERCENT", enumType.getName());
        assertEquals("8 - Dilution Levy Percent", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum519ContAmtType.EXIT_CHARGE_AMOUNT;
        assertEquals("9", enumType.getID());
        assertEquals("EXIT_CHARGE_AMOUNT", enumType.getName());
        assertEquals("9 - Exit Charge Amount", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum519ContAmtType.EXIT_CHARGE_PERCENT;
        assertEquals("10", enumType.getID());
        assertEquals("EXIT_CHARGE_PERCENT", enumType.getName());
        assertEquals("10 - Exit Charge Percent", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum519ContAmtType.RENEWAL_COMMISSION_PERCENT;
        assertEquals("11", enumType.getID());
        assertEquals("RENEWAL_COMMISSION_PERCENT", enumType.getName());
        assertEquals("11 - Fund-Based Renewal Commission Percent (a.k.a. Trail commission)",
                enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum519ContAmtType.PROJECTED_FUND_VALUE;
        assertEquals("12", enumType.getID());
        assertEquals("PROJECTED_FUND_VALUE", enumType.getName());
        assertEquals("12 - Projected Fund Value " +
                        "(i.e. for investments intended to realise or exceed a specific future value)",
                enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum519ContAmtType.RENEWAL_COMMISSION_ORDER_VALUE;
        assertEquals("13", enumType.getID());
        assertEquals("RENEWAL_COMMISSION_ORDER_VALUE", enumType.getName());
        assertEquals("13 - Fund-Based Renewal Commission Amount (based on Order value)",
                enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum519ContAmtType.RENEWAL_COMMISSION_FUND_VALUE;
        assertEquals("14", enumType.getID());
        assertEquals("RENEWAL_COMMISSION_FUND_VALUE", enumType.getName());
        assertEquals("14 - Fund-Based Renewal Commission Amount (based on Projected Fund value)",
                enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum519ContAmtType.NET_SETTLEMENT_AMOUNT;
        assertEquals("15", enumType.getID());
        assertEquals("NET_SETTLEMENT_AMOUNT", enumType.getName());
        assertEquals("15 - Net Settlement Amount", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());
    }
}