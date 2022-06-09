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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix44.enums.Enum707PosAmtType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  707
 *  PosAmtType
 *  String
 *  <p></p>
 *  Type of Position amount
 *  <p></p>
 *  Valid values:
 *  <p>    CASH - Cash Amount (Corporate Event)
 *  <p>    CRES - Cash Residual Amount
 *  <p>    FMTM - Final Mark-to-Market Amount
 *  <p>    IMTM - Incremental Mark-to-Market Amount
 *  <p>    PREM - Premium Amount
 *  <p></p>
 *  <p>    SMTM - Start-of-Day Mark-to-Market Amount
 *  <p>    TVAR - Trade Variation Amount
 *  <p>    VADJ - Value Adjusted Amount
 *  <p>    SETL - Settlement Value
 */
class Tag707EnuPosAmtTypeTest {
    @Test
    void FIX0707Test() {
        FIX44 fixData = FIX44.FIX707_ENU_POS_AMT_TYPE;
        assertEquals( "707", fixData.toFIXIDString());
        assertEquals( "POS_AMT_TYPE", fixData.toFIXNameString());
        assertEquals( "PosAmtType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0707Test() {
        Tag707EnuPosAmtType tagData;

        tagData = new Tag707EnuPosAmtType(Enum707PosAmtType.CASH_AMOUNT);
        assertEquals( Enum707PosAmtType.CASH_AMOUNT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag707EnuPosAmtType(Enum707PosAmtType.CASH_RESIDUAL_AMOUNT);
        assertEquals( Enum707PosAmtType.CASH_RESIDUAL_AMOUNT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag707EnuPosAmtType(Enum707PosAmtType.FINAL_MARK_TO_MARKET_AMOUNT);
        assertEquals( Enum707PosAmtType.FINAL_MARK_TO_MARKET_AMOUNT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag707EnuPosAmtType(Enum707PosAmtType.INCREMENTAL_MARK_TO_MARKET_AMOUNT);
        assertEquals( Enum707PosAmtType.INCREMENTAL_MARK_TO_MARKET_AMOUNT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag707EnuPosAmtType(Enum707PosAmtType.PREMIUM_AMOUNT);
        assertEquals( Enum707PosAmtType.PREMIUM_AMOUNT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag707EnuPosAmtType(Enum707PosAmtType.SETTLEMENT_VALUE);
        assertEquals( Enum707PosAmtType.SETTLEMENT_VALUE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag707EnuPosAmtType(Enum707PosAmtType.START_OF_DAY_MARK_TO_MARKET_AMOUNT);
        assertEquals( Enum707PosAmtType.START_OF_DAY_MARK_TO_MARKET_AMOUNT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag707EnuPosAmtType(Enum707PosAmtType.TRADE_VARIATION_AMOUNT);
        assertEquals( Enum707PosAmtType.TRADE_VARIATION_AMOUNT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag707EnuPosAmtType(Enum707PosAmtType.VALUE_ADJUSTED_AMOUNT);
        assertEquals( Enum707PosAmtType.VALUE_ADJUSTED_AMOUNT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}