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

package com.hwtsllc.fixengine.tags.fix40;

import com.hwtsllc.fixengine.enums.fix40.Enum139MiscFeeType;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag139EnuMiscFeeTypeTest {
    Tag139EnuMiscFeeType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum139MiscFeeType oneEnum : Enum139MiscFeeType.values()) {
            tagData = new Tag139EnuMiscFeeType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum139MiscFeeType oneEnum : Enum139MiscFeeType.values()) {
            tagData = new Tag139EnuMiscFeeType(oneEnum);
            assertEquals( "FIX139_ENU_MISC_FEE_TYPE", tagData.toFIXLabelString());
            assertEquals( "MISC_FEE_TYPE", tagData.toFIXNameString());
            assertEquals( "139", tagData.toFIXIDString());
            assertEquals( "MiscFeeType", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum139MiscFeeType oneEnum : Enum139MiscFeeType.values()) {
            tagData = new Tag139EnuMiscFeeType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  139
         *  MiscFeeType
         *  String
         *  <p>    1 - Regulatory (e.g. SEC)
         *  <p>    2 - Tax
         *  <p>    3 - Local Commission
         *  <p>    4 - Exchange Fees
         *  <p>    5 - Stamp
         */
        tagData = new Tag139EnuMiscFeeType(Enum139MiscFeeType.REGULATORY);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag139EnuMiscFeeType(Enum139MiscFeeType.TAX);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag139EnuMiscFeeType(Enum139MiscFeeType.LOCAL_COMMISSION);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag139EnuMiscFeeType(Enum139MiscFeeType.EXCHANGE_FEES);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag139EnuMiscFeeType(Enum139MiscFeeType.STAMP);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    6 - Levy
         *  <p>    7 - Other
         *  <p>    8 - Markup
         *  <p>    9 - Consumption Tax
         *  <p>    10 - Per transaction
         */
        tagData = new Tag139EnuMiscFeeType(Enum139MiscFeeType.LEVY);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag139EnuMiscFeeType(Enum139MiscFeeType.OTHER);
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag139EnuMiscFeeType(Enum139MiscFeeType.MARKUP);
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag139EnuMiscFeeType(Enum139MiscFeeType.CONSUMPTION_TAX);
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag139EnuMiscFeeType(Enum139MiscFeeType.PER_TRANSACTION);
        assertEquals( "10", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    11 - Conversion
         *  <p>    12 - Agent
         *  <p>    13 - Transfer Fee
         *  <p>    14 - Security Lending
         */
        tagData = new Tag139EnuMiscFeeType(Enum139MiscFeeType.CONVERSION);
        assertEquals( "11", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag139EnuMiscFeeType(Enum139MiscFeeType.AGENT);
        assertEquals( "12", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag139EnuMiscFeeType(Enum139MiscFeeType.TRANSFER_FEE);
        assertEquals( "13", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag139EnuMiscFeeType(Enum139MiscFeeType.SECURITY_LENDING);
        assertEquals( "14", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum139MiscFeeType oneEnum : Enum139MiscFeeType.values()) {
            tagData = new Tag139EnuMiscFeeType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum139MiscFeeType oneEnum : Enum139MiscFeeType.values()) {
            tagData = new Tag139EnuMiscFeeType(oneEnum);
            assertEquals( "Tag139EnuMiscFeeType\n" +
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