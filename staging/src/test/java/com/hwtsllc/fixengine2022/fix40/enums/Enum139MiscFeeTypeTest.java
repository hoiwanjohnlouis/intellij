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
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("REGULATORY", enumType.toFIXNameString());
        assertEquals("1 - Regulatory (e.g. SEC)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum139MiscFeeType.TAX;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("TAX", enumType.toFIXNameString());
        assertEquals("2 - Tax", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum139MiscFeeType.LOCAL_COMMISSION;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("LOCAL_COMMISSION", enumType.toFIXNameString());
        assertEquals("3 - Local Commission", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum139MiscFeeType.EXCHANGE_FEES;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("EXCHANGE_FEES", enumType.toFIXNameString());
        assertEquals("4 - Exchange Fees", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum139MiscFeeType.STAMP;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("STAMP", enumType.toFIXNameString());
        assertEquals("5 - Stamp", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum139MiscFeeType.LEVY;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("LEVY", enumType.toFIXNameString());
        assertEquals("6 - Levy", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum139MiscFeeType.OTHER;
        assertEquals("7", enumType.toFIXIDString());
        assertEquals("OTHER", enumType.toFIXNameString());
        assertEquals("7 - Other", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum139MiscFeeType.MARKUP;
        assertEquals("8", enumType.toFIXIDString());
        assertEquals("MARKUP", enumType.toFIXNameString());
        assertEquals("8 - Markup", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum139MiscFeeType.CONSUMPTION_TAX;
        assertEquals("9", enumType.toFIXIDString());
        assertEquals("CONSUMPTION_TAX", enumType.toFIXNameString());
        assertEquals("9 - Consumption Tax", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum139MiscFeeType.PER_TRANSACTION;
        assertEquals("10", enumType.toFIXIDString());
        assertEquals("PER_TRANSACTION", enumType.toFIXNameString());
        assertEquals("10 - Per transaction", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum139MiscFeeType.CONVERSION;
        assertEquals("11", enumType.toFIXIDString());
        assertEquals("CONVERSION", enumType.toFIXNameString());
        assertEquals("11 - Conversion", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum139MiscFeeType.AGENT;
        assertEquals("12", enumType.toFIXIDString());
        assertEquals("AGENT", enumType.toFIXNameString());
        assertEquals("12 - Agent", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum139MiscFeeType.TRANSFER_FEE;
        assertEquals("13", enumType.toFIXIDString());
        assertEquals("TRANSFER_FEE", enumType.toFIXNameString());
        assertEquals("13 - Transfer Fee", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum139MiscFeeType.SECURITY_LENDING;
        assertEquals("14", enumType.toFIXIDString());
        assertEquals("SECURITY_LENDING", enumType.toFIXNameString());
        assertEquals("14 - Security Lending", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}