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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.fix43.enums.Enum519ContAmtType;
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
class Tag519EnuContAmtTypeTest {
    @Test
    void FIX0519Test() {
        FIX43 fixData = FIX43.FIX519_ENU_CONT_AMT_TYPE;
        assertEquals( "519", fixData.toEnumIDString());
        assertEquals( "CONT_AMT_TYPE", fixData.toEnumNameString());
        assertEquals( "ContAmtType", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0519Test() {
        Tag519EnuContAmtType tagData;

        /*
         * 1-15 types
         */
        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.COMMISSION_AMOUNT_ACTUAL );
        assertEquals( Enum519ContAmtType.COMMISSION_AMOUNT_ACTUAL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.COMMISSION_PERCENT_ACTUAL );
        assertEquals( Enum519ContAmtType.COMMISSION_PERCENT_ACTUAL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.INITIAL_CHARGE_AMOUNT );
        assertEquals( Enum519ContAmtType.INITIAL_CHARGE_AMOUNT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.INITIAL_CHARGE_PERCENT );
        assertEquals( Enum519ContAmtType.INITIAL_CHARGE_PERCENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.DISCOUNT_AMOUNT );
        assertEquals( Enum519ContAmtType.DISCOUNT_AMOUNT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.DISCOUNT_PERCENT );
        assertEquals( Enum519ContAmtType.DISCOUNT_PERCENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.DILUTION_LEVY_AMOUNT );
        assertEquals( Enum519ContAmtType.DILUTION_LEVY_AMOUNT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.DILUTION_LEVY_PERCENT );
        assertEquals( Enum519ContAmtType.DILUTION_LEVY_PERCENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.EXIT_CHARGE_AMOUNT );
        assertEquals( Enum519ContAmtType.EXIT_CHARGE_AMOUNT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.EXIT_CHARGE_PERCENT );
        assertEquals( Enum519ContAmtType.EXIT_CHARGE_PERCENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.RENEWAL_COMMISSION_PERCENT );
        assertEquals( Enum519ContAmtType.RENEWAL_COMMISSION_PERCENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.PROJECTED_FUND_VALUE );
        assertEquals( Enum519ContAmtType.PROJECTED_FUND_VALUE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.RENEWAL_COMMISSION_ORDER_VALUE );
        assertEquals( Enum519ContAmtType.RENEWAL_COMMISSION_ORDER_VALUE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.RENEWAL_COMMISSION_FUND_VALUE );
        assertEquals( Enum519ContAmtType.RENEWAL_COMMISSION_FUND_VALUE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.NET_SETTLEMENT_AMOUNT );
        assertEquals( Enum519ContAmtType.NET_SETTLEMENT_AMOUNT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag519EnuContAmtType tagData;

        // loop around the ENUM and process
        for ( Enum519ContAmtType oneEnum : Enum519ContAmtType.values()) {
            tagData = new Tag519EnuContAmtType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag519EnuContAmtType tagData;

        // loop around the ENUM and process
        for (Enum519ContAmtType oneEnum : Enum519ContAmtType.values()) {
            tagData = new Tag519EnuContAmtType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag519EnuContAmtType tagData;

        // loop around the ENUM and process
        for (Enum519ContAmtType oneEnum : Enum519ContAmtType.values()) {
            tagData = new Tag519EnuContAmtType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag519EnuContAmtType tagData;

        // loop around the ENUM and process
        for (Enum519ContAmtType oneEnum : Enum519ContAmtType.values()) {
            tagData = new Tag519EnuContAmtType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag519EnuContAmtType tagData;

        // loop around the ENUM and process
        for (Enum519ContAmtType oneEnum : Enum519ContAmtType.values()) {
            tagData = new Tag519EnuContAmtType(oneEnum);
            assertEquals( "Tag519EnuContAmtType\n" +
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