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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum707PosAmtTypeTest {
    /**
     *  707
     *  PosAmtType
     *  Type of Position amount
     *  Valid values:
     *      CASH - Cash Amount (Corporate Event)
     *      CRES - Cash Residual Amount
     *      FMTM - Final Mark-to-Market Amount
     *      IMTM - Incremental Mark-to-Market Amount
     *      PREM - Premium Amount
     *      SMTM - Start-of-Day Mark-to-Market Amount
     *      TVAR - Trade Variation Amount
     *      VADJ - Value Adjusted Amount
     *      SETL - Settlement Value
     */
    @Test
    void EnumTest() {
        Enum707PosAmtType enumType;

        enumType = Enum707PosAmtType.CASH_AMOUNT;
        assertEquals( "CASH", enumType.toFIXIDString());
        assertEquals( "CASH_AMOUNT", enumType.toFIXNameString());
        assertEquals( "CASH - Cash Amount (Corporate Event)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum707PosAmtType.CASH_RESIDUAL_AMOUNT;
        assertEquals( "CRES", enumType.toFIXIDString());
        assertEquals( "CASH_RESIDUAL_AMOUNT", enumType.toFIXNameString());
        assertEquals( "CRES - Cash Residual Amount", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum707PosAmtType.FINAL_MARK_TO_MARKET_AMOUNT;
        assertEquals( "FMTM", enumType.toFIXIDString());
        assertEquals( "FINAL_MARK_TO_MARKET_AMOUNT", enumType.toFIXNameString());
        assertEquals( "FMTM - Final Mark-to-Market Amount", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum707PosAmtType.INCREMENTAL_MARK_TO_MARKET_AMOUNT;
        assertEquals( "IMTM", enumType.toFIXIDString());
        assertEquals( "INCREMENTAL_MARK_TO_MARKET_AMOUNT", enumType.toFIXNameString());
        assertEquals( "IMTM - Incremental Mark-to-Market Amount", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum707PosAmtType.PREMIUM_AMOUNT;
        assertEquals( "PREM", enumType.toFIXIDString());
        assertEquals( "PREMIUM_AMOUNT", enumType.toFIXNameString());
        assertEquals( "PREM - Premium Amount", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum707PosAmtType.START_OF_DAY_MARK_TO_MARKET_AMOUNT;
        assertEquals( "SMTM", enumType.toFIXIDString());
        assertEquals( "START_OF_DAY_MARK_TO_MARKET_AMOUNT", enumType.toFIXNameString());
        assertEquals( "SMTM - Start-of-Day Mark-to-Market Amount", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum707PosAmtType.TRADE_VARIATION_AMOUNT;
        assertEquals( "TVAR", enumType.toFIXIDString());
        assertEquals( "TRADE_VARIATION_AMOUNT", enumType.toFIXNameString());
        assertEquals( "TVAR - Trade Variation Amount", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum707PosAmtType.VALUE_ADJUSTED_AMOUNT;
        assertEquals( "VADJ", enumType.toFIXIDString());
        assertEquals( "VALUE_ADJUSTED_AMOUNT", enumType.toFIXNameString());
        assertEquals( "VADJ - Value Adjusted Amount", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum707PosAmtType.SETTLEMENT_VALUE;
        assertEquals( "SETL", enumType.toFIXIDString());
        assertEquals( "SETTLEMENT_VALUE", enumType.toFIXNameString());
        assertEquals( "SETL - Settlement Value", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}