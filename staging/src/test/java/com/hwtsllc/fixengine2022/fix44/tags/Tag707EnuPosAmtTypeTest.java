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
import com.hwtsllc.fixengine2022.fix44.enums.Enum707PosAmtType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
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
    void FIXTest() {
        FIX44 fixData = FIX44.FIX707_ENU_POS_AMT_TYPE;
        assertEquals( "707", fixData.toEnumIDString());
        assertEquals( "POS_AMT_TYPE", fixData.toEnumNameString());
        assertEquals( "PosAmtType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0707Test() {
        Tag707EnuPosAmtType tagData;
        Enum707PosAmtType oneElement;

        oneElement = Enum707PosAmtType.CASH_AMOUNT;
        tagData = new Tag707EnuPosAmtType( oneElement );
        assertEquals( oneElement.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "707", tagData.toEnumIDString());
        assertEquals( "POS_AMT_TYPE", tagData.toEnumNameString());
        assertEquals( "PosAmtType", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag707EnuPosAmtType(Enum707PosAmtType.CASH_RESIDUAL_AMOUNT);
        assertEquals( Enum707PosAmtType.CASH_RESIDUAL_AMOUNT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag707EnuPosAmtType(Enum707PosAmtType.FINAL_MARK_TO_MARKET_AMOUNT);
        assertEquals( Enum707PosAmtType.FINAL_MARK_TO_MARKET_AMOUNT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag707EnuPosAmtType(Enum707PosAmtType.INCREMENTAL_MARK_TO_MARKET_AMOUNT);
        assertEquals( Enum707PosAmtType.INCREMENTAL_MARK_TO_MARKET_AMOUNT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag707EnuPosAmtType(Enum707PosAmtType.PREMIUM_AMOUNT);
        assertEquals( Enum707PosAmtType.PREMIUM_AMOUNT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag707EnuPosAmtType(Enum707PosAmtType.SETTLEMENT_VALUE);
        assertEquals( Enum707PosAmtType.SETTLEMENT_VALUE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag707EnuPosAmtType(Enum707PosAmtType.START_OF_DAY_MARK_TO_MARKET_AMOUNT);
        assertEquals( Enum707PosAmtType.START_OF_DAY_MARK_TO_MARKET_AMOUNT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag707EnuPosAmtType(Enum707PosAmtType.TRADE_VARIATION_AMOUNT);
        assertEquals( Enum707PosAmtType.TRADE_VARIATION_AMOUNT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag707EnuPosAmtType(Enum707PosAmtType.VALUE_ADJUSTED_AMOUNT);
        assertEquals( Enum707PosAmtType.VALUE_ADJUSTED_AMOUNT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag707EnuPosAmtType tagData;

        // loop around the ENUM and process
        for ( Enum707PosAmtType oneEnum : Enum707PosAmtType.values()) {
            tagData = new Tag707EnuPosAmtType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag707EnuPosAmtType tagData;

        // loop around the ENUM and process
        for (Enum707PosAmtType oneEnum : Enum707PosAmtType.values()) {
            tagData = new Tag707EnuPosAmtType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag707EnuPosAmtType tagData;

        // loop around the ENUM and process
        for (Enum707PosAmtType oneEnum : Enum707PosAmtType.values()) {
            tagData = new Tag707EnuPosAmtType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag707EnuPosAmtType tagData;

        // loop around the ENUM and process
        for (Enum707PosAmtType oneEnum : Enum707PosAmtType.values()) {
            tagData = new Tag707EnuPosAmtType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag707EnuPosAmtType tagData;

        // loop around the ENUM and process
        for (Enum707PosAmtType oneEnum : Enum707PosAmtType.values()) {
            tagData = new Tag707EnuPosAmtType(oneEnum);
            assertEquals( "Tag707EnuPosAmtType\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}