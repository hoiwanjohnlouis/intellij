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

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum519ContAmtTypeTest {
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
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("1,COMMISSION_AMOUNT_ACTUAL,1 - Commission amount (actual)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum519ContAmtType.COMMISSION_PERCENT_ACTUAL;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("2,COMMISSION_PERCENT_ACTUAL,2 - Commission percent (actual)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum519ContAmtType.INITIAL_CHARGE_AMOUNT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("3,INITIAL_CHARGE_AMOUNT,3 - Initial Charge Amount", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum519ContAmtType.INITIAL_CHARGE_PERCENT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("4,INITIAL_CHARGE_PERCENT,4 - Initial Charge Percent", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum519ContAmtType.DISCOUNT_AMOUNT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("5,DISCOUNT_AMOUNT,5 - Discount Amount", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum519ContAmtType.DISCOUNT_PERCENT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("6,DISCOUNT_PERCENT,6 - Discount Percent", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum519ContAmtType.DILUTION_LEVY_AMOUNT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("7,DILUTION_LEVY_AMOUNT,7 - Dilution Levy Amount", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum519ContAmtType.DILUTION_LEVY_PERCENT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("8,DILUTION_LEVY_PERCENT,8 - Dilution Levy Percent", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum519ContAmtType.EXIT_CHARGE_AMOUNT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("9,EXIT_CHARGE_AMOUNT,9 - Exit Charge Amount", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum519ContAmtType.EXIT_CHARGE_PERCENT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("10,EXIT_CHARGE_PERCENT,10 - Exit Charge Percent", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum519ContAmtType.RENEWAL_COMMISSION_PERCENT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("11,RENEWAL_COMMISSION_PERCENT,11 - Fund-Based Renewal Commission Percent (a.k.a. Trail commission)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum519ContAmtType.PROJECTED_FUND_VALUE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("12,PROJECTED_FUND_VALUE,12 - Projected Fund Value (i.e. for investments intended to realise or exceed a specific future value)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum519ContAmtType.RENEWAL_COMMISSION_ORDER_VALUE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("13,RENEWAL_COMMISSION_ORDER_VALUE,13 - Fund-Based Renewal Commission Amount (based on Order value)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum519ContAmtType.RENEWAL_COMMISSION_FUND_VALUE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("14,RENEWAL_COMMISSION_FUND_VALUE,14 - Fund-Based Renewal Commission Amount (based on Projected Fund value)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum519ContAmtType.NET_SETTLEMENT_AMOUNT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("15,NET_SETTLEMENT_AMOUNT,15 - Net Settlement Amount", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
}