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
 *  139
 *  MiscFeeType
 *  String
 *  Indicates type of miscellaneous fee.
 *  Valid values:
 *      1 - Regulatory (e.g. SEC)
 *      2 - Tax
 *      3 - Local Commission
 *      4 - Exchange Fees
 *      5 - Stamp
 *      6 - Levy
 *      7 - Other
 *      8 - Markup
 *      9 - Consumption Tax
 *      10 - Per transaction
 *      11 - Conversion
 *      12 - Agent
 *      13 - Transfer Fee
 *      14 - Security Lending
 */
class Enum139MiscFeeTypeTest {

    @Test
    void Enum0139Test() {
        Enum139MiscFeeType enumType;

        /*
         * 1-14 msg types
         */
        enumType = Enum139MiscFeeType.REGULATORY;
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("REGULATORY", enumType.toEnumNameString());
        assertEquals("1 - Regulatory (e.g. SEC)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum139MiscFeeType.TAX;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("TAX", enumType.toEnumNameString());
        assertEquals("2 - Tax", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum139MiscFeeType.LOCAL_COMMISSION;
        assertEquals("3", enumType.toEnumIDString());
        assertEquals("LOCAL_COMMISSION", enumType.toEnumNameString());
        assertEquals("3 - Local Commission", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum139MiscFeeType.EXCHANGE_FEES;
        assertEquals("4", enumType.toEnumIDString());
        assertEquals("EXCHANGE_FEES", enumType.toEnumNameString());
        assertEquals("4 - Exchange Fees", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum139MiscFeeType.STAMP;
        assertEquals("5", enumType.toEnumIDString());
        assertEquals("STAMP", enumType.toEnumNameString());
        assertEquals("5 - Stamp", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum139MiscFeeType.LEVY;
        assertEquals("6", enumType.toEnumIDString());
        assertEquals("LEVY", enumType.toEnumNameString());
        assertEquals("6 - Levy", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum139MiscFeeType.OTHER;
        assertEquals("7", enumType.toEnumIDString());
        assertEquals("OTHER", enumType.toEnumNameString());
        assertEquals("7 - Other", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum139MiscFeeType.MARKUP;
        assertEquals("8", enumType.toEnumIDString());
        assertEquals("MARKUP", enumType.toEnumNameString());
        assertEquals("8 - Markup", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum139MiscFeeType.CONSUMPTION_TAX;
        assertEquals("9", enumType.toEnumIDString());
        assertEquals("CONSUMPTION_TAX", enumType.toEnumNameString());
        assertEquals("9 - Consumption Tax", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum139MiscFeeType.PER_TRANSACTION;
        assertEquals("10", enumType.toEnumIDString());
        assertEquals("PER_TRANSACTION", enumType.toEnumNameString());
        assertEquals("10 - Per transaction", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum139MiscFeeType.CONVERSION;
        assertEquals("11", enumType.toEnumIDString());
        assertEquals("CONVERSION", enumType.toEnumNameString());
        assertEquals("11 - Conversion", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum139MiscFeeType.AGENT;
        assertEquals("12", enumType.toEnumIDString());
        assertEquals("AGENT", enumType.toEnumNameString());
        assertEquals("12 - Agent", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum139MiscFeeType.TRANSFER_FEE;
        assertEquals("13", enumType.toEnumIDString());
        assertEquals("TRANSFER_FEE", enumType.toEnumNameString());
        assertEquals("13 - Transfer Fee", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum139MiscFeeType.SECURITY_LENDING;
        assertEquals("14", enumType.toEnumIDString());
        assertEquals("SECURITY_LENDING", enumType.toEnumNameString());
        assertEquals("14 - Security Lending", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}