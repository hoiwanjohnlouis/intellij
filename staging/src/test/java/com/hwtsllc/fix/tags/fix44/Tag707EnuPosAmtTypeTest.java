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

package com.hwtsllc.fix.tags.fix44;

import com.hwtsllc.fix.enums.fix44.Enum707PosAmtType;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag707EnuPosAmtTypeTest {
    Tag707EnuPosAmtType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum707PosAmtType oneEnum : Enum707PosAmtType.values()) {
            tagData = new Tag707EnuPosAmtType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum707PosAmtType oneEnum : Enum707PosAmtType.values()) {
            tagData = new Tag707EnuPosAmtType(oneEnum);
            assertEquals( "FIX707_ENU_POS_AMT_TYPE", tagData.toFIXLabelString());
            assertEquals( "707", tagData.toFIXIDString());
            assertEquals( "POS_AMT_TYPE", tagData.toFIXNameString());
            assertEquals( "PosAmtType", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum707PosAmtType oneEnum : Enum707PosAmtType.values()) {
            tagData = new Tag707EnuPosAmtType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  707
         *  PosAmtType
         *  String
         *  <p>    CASH - Cash Amount (Corporate Event)
         *  <p>    CRES - Cash Residual Amount
         *  <p>    FMTM - Final Mark-to-Market Amount
         *  <p>    IMTM - Incremental Mark-to-Market Amount
         *  <p>    PREM - Premium Amount
         */
        tagData = new Tag707EnuPosAmtType( Enum707PosAmtType.CASH_AMOUNT );
        assertEquals( "CASH", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag707EnuPosAmtType(Enum707PosAmtType.CASH_RESIDUAL_AMOUNT);
        assertEquals( "CRES", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag707EnuPosAmtType(Enum707PosAmtType.FINAL_MARK_TO_MARKET_AMOUNT);
        assertEquals( "FMTM", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag707EnuPosAmtType(Enum707PosAmtType.INCREMENTAL_MARK_TO_MARKET_AMOUNT);
        assertEquals( "IMTM", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag707EnuPosAmtType(Enum707PosAmtType.PREMIUM_AMOUNT);
        assertEquals( "PREM", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    SMTM - Start-of-Day Mark-to-Market Amount
         *  <p>    TVAR - Trade Variation Amount
         *  <p>    VADJ - Value Adjusted Amount
         *  <p>    SETL - Settlement Value
         */
        tagData = new Tag707EnuPosAmtType(Enum707PosAmtType.START_OF_DAY_MARK_TO_MARKET_AMOUNT);
        assertEquals( "SMTM", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag707EnuPosAmtType(Enum707PosAmtType.TRADE_VARIATION_AMOUNT);
        assertEquals( "TVAR", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag707EnuPosAmtType(Enum707PosAmtType.VALUE_ADJUSTED_AMOUNT);
        assertEquals( "VADJ", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag707EnuPosAmtType(Enum707PosAmtType.SETTLEMENT_VALUE);
        assertEquals( "SETL", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum707PosAmtType oneEnum : Enum707PosAmtType.values()) {
            tagData = new Tag707EnuPosAmtType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum707PosAmtType oneEnum : Enum707PosAmtType.values()) {
            tagData = new Tag707EnuPosAmtType(oneEnum);
            assertEquals( "Tag707EnuPosAmtType\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}