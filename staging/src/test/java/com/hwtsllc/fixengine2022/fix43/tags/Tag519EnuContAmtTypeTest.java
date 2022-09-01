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

import com.hwtsllc.fixengine2022.fix43.enums.Enum519ContAmtType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag519EnuContAmtTypeTest {
    Tag519EnuContAmtType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum519ContAmtType oneEnum : Enum519ContAmtType.values()) {
            tagData = new Tag519EnuContAmtType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum519ContAmtType oneEnum : Enum519ContAmtType.values()) {
            tagData = new Tag519EnuContAmtType(oneEnum);
            assertEquals( "FIX519_ENU_CONT_AMT_TYPE", tagData.toFIXLabelString());
            assertEquals( "519", tagData.toFIXIDString());
            assertEquals( "CONT_AMT_TYPE", tagData.toFIXNameString());
            assertEquals( "ContAmtType", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum519ContAmtType oneEnum : Enum519ContAmtType.values()) {
            tagData = new Tag519EnuContAmtType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  519
         *  ContAmtType
         *  int
         *  <p>    1 - Commission amount (actual)
         *  <p>    2 - Commission percent (actual)
         *  <p>    3 - Initial Charge Amount
         *  <p>    4 - Initial Charge Percent
         *  <p>    5 - Discount Amount
         */
        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.COMMISSION_AMOUNT_ACTUAL );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.COMMISSION_PERCENT_ACTUAL );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.INITIAL_CHARGE_AMOUNT );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.INITIAL_CHARGE_PERCENT );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.DISCOUNT_AMOUNT );
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    6 - Discount Percent
         *  <p>    7 - Dilution Levy Amount
         *  <p>    8 - Dilution Levy Percent
         *  <p>    9 - Exit Charge Amount
         *  <p>    10 - Exit Charge Percent
         */
        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.DISCOUNT_PERCENT );
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.DILUTION_LEVY_AMOUNT );
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.DILUTION_LEVY_PERCENT );
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.EXIT_CHARGE_AMOUNT );
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.EXIT_CHARGE_PERCENT );
        assertEquals( "10", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    11 - Fund-Based Renewal Commission Percent (a.k.a. Trail commission)
         *  <p>    12 - Projected Fund Value
         *          (i.e. for investments intended to realise or exceed a specific future value)
         *  <p>    13 - Fund-Based Renewal Commission Amount (based on Order value)
         *  <p>    14 - Fund-Based Renewal Commission Amount (based on Projected Fund value)
         *  <p>    15 - Net Settlement Amount
         */
        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.RENEWAL_COMMISSION_PERCENT );
        assertEquals( "11", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.PROJECTED_FUND_VALUE );
        assertEquals( "12", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.RENEWAL_COMMISSION_ORDER_VALUE );
        assertEquals( "13", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.RENEWAL_COMMISSION_FUND_VALUE );
        assertEquals( "14", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag519EnuContAmtType( Enum519ContAmtType.NET_SETTLEMENT_AMOUNT );
        assertEquals( "15", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum519ContAmtType oneEnum : Enum519ContAmtType.values()) {
            tagData = new Tag519EnuContAmtType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum519ContAmtType oneEnum : Enum519ContAmtType.values()) {
            tagData = new Tag519EnuContAmtType(oneEnum);
            assertEquals( "Tag519EnuContAmtType\n" +
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