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
 *  519
 *  ContAmtType
 *  int
 *  <p></p>
 *  Type of ContAmtValue (520).
 *  <p>
 *  NOTE That Commission Amount / % in Contract Amounts is the commission actually charged,
 *  rather than the commission instructions given in Fields 2/3.
 *  <p></p>
 *  For UK valid values include:
 *  <p>
 *  Valid values:
 *  <p>    1 - Commission amount (actual)
 *  <p>    2 - Commission percent (actual)
 *  <p>    3 - Initial Charge Amount
 *  <p>    4 - Initial Charge Percent
 *  <p>    5 - Discount Amount
 *  <p></p>
 *  <p>    6 - Discount Percent
 *  <p>    7 - Dilution Levy Amount
 *  <p>    8 - Dilution Levy Percent
 *  <p>    9 - Exit Charge Amount
 *  <p>    10 - Exit Charge Percent
 *  <p></p>
 *  <p>    11 - Fund-Based Renewal Commission Percent (a.k.a. Trail commission)
 *  <p>    12 - Projected Fund Value
 *          (i.e. for investments intended to realise or exceed a specific future value)
 *  <p>    13 - Fund-Based Renewal Commission Amount (based on Order value)
 *  <p>    14 - Fund-Based Renewal Commission Amount (based on Projected Fund value)
 *  <p>    15 - Net Settlement Amount
 */
class Enum519ContMyAmtTypeTest {
    /*
     *  Information is the same for TAGS 519
     */
    @Test
    void Enum0519Test() {
        Enum519ContAmtType enumType;

        /*
         * 1-15 types
         */
        enumType = Enum519ContAmtType.COMMISSION_AMOUNT_ACTUAL;
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("COMMISSION_AMOUNT_ACTUAL", enumType.toEnumNameString());
        assertEquals("1 - Commission amount (actual)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum519ContAmtType.COMMISSION_PERCENT_ACTUAL;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("COMMISSION_PERCENT_ACTUAL", enumType.toEnumNameString());
        assertEquals("2 - Commission percent (actual)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum519ContAmtType.INITIAL_CHARGE_AMOUNT;
        assertEquals("3", enumType.toEnumIDString());
        assertEquals("INITIAL_CHARGE_AMOUNT", enumType.toEnumNameString());
        assertEquals("3 - Initial Charge Amount", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum519ContAmtType.INITIAL_CHARGE_PERCENT;
        assertEquals("4", enumType.toEnumIDString());
        assertEquals("INITIAL_CHARGE_PERCENT", enumType.toEnumNameString());
        assertEquals("4 - Initial Charge Percent", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum519ContAmtType.DISCOUNT_AMOUNT;
        assertEquals("5", enumType.toEnumIDString());
        assertEquals("DISCOUNT_AMOUNT", enumType.toEnumNameString());
        assertEquals("5 - Discount Amount", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum519ContAmtType.DISCOUNT_PERCENT;
        assertEquals("6", enumType.toEnumIDString());
        assertEquals("DISCOUNT_PERCENT", enumType.toEnumNameString());
        assertEquals("6 - Discount Percent", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum519ContAmtType.DILUTION_LEVY_AMOUNT;
        assertEquals("7", enumType.toEnumIDString());
        assertEquals("DILUTION_LEVY_AMOUNT", enumType.toEnumNameString());
        assertEquals("7 - Dilution Levy Amount", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum519ContAmtType.DILUTION_LEVY_PERCENT;
        assertEquals("8", enumType.toEnumIDString());
        assertEquals("DILUTION_LEVY_PERCENT", enumType.toEnumNameString());
        assertEquals("8 - Dilution Levy Percent", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum519ContAmtType.EXIT_CHARGE_AMOUNT;
        assertEquals("9", enumType.toEnumIDString());
        assertEquals("EXIT_CHARGE_AMOUNT", enumType.toEnumNameString());
        assertEquals("9 - Exit Charge Amount", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum519ContAmtType.EXIT_CHARGE_PERCENT;
        assertEquals("10", enumType.toEnumIDString());
        assertEquals("EXIT_CHARGE_PERCENT", enumType.toEnumNameString());
        assertEquals("10 - Exit Charge Percent", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum519ContAmtType.RENEWAL_COMMISSION_PERCENT;
        assertEquals("11", enumType.toEnumIDString());
        assertEquals("RENEWAL_COMMISSION_PERCENT", enumType.toEnumNameString());
        assertEquals("11 - Fund-Based Renewal Commission Percent (a.k.a. Trail commission)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum519ContAmtType.PROJECTED_FUND_VALUE;
        assertEquals("12", enumType.toEnumIDString());
        assertEquals("PROJECTED_FUND_VALUE", enumType.toEnumNameString());
        assertEquals("12 - Projected Fund Value " +
                        "(i.e. for investments intended to realise or exceed a specific future value)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum519ContAmtType.RENEWAL_COMMISSION_ORDER_VALUE;
        assertEquals("13", enumType.toEnumIDString());
        assertEquals("RENEWAL_COMMISSION_ORDER_VALUE", enumType.toEnumNameString());
        assertEquals("13 - Fund-Based Renewal Commission Amount (based on Order value)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum519ContAmtType.RENEWAL_COMMISSION_FUND_VALUE;
        assertEquals("14", enumType.toEnumIDString());
        assertEquals("RENEWAL_COMMISSION_FUND_VALUE", enumType.toEnumNameString());
        assertEquals("14 - Fund-Based Renewal Commission Amount (based on Projected Fund value)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum519ContAmtType.NET_SETTLEMENT_AMOUNT;
        assertEquals("15", enumType.toEnumIDString());
        assertEquals("NET_SETTLEMENT_AMOUNT", enumType.toEnumNameString());
        assertEquals("15 - Net Settlement Amount", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}