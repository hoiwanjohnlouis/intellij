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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.fix40.enums.Enum139MiscFeeType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  139
 *  MiscFeeType
 *  String
 *  <p></p>
 *  Indicates type of miscellaneous fee.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Regulatory (e.g. SEC)
 *  <p>    2 - Tax
 *  <p>    3 - Local Commission
 *  <p>    4 - Exchange Fees
 *  <p>    5 - Stamp
 *  <p></p>
 *  <p>    6 - Levy
 *  <p>    7 - Other
 *  <p>    8 - Markup
 *  <p>    9 - Consumption Tax
 *  <p>    10 - Per transaction
 *  <p></p>
 *  <p>    11 - Conversion
 *  <p>    12 - Agent
 *  <p>    13 - Transfer Fee
 *  <p>    14 - Security Lending
 */
class Tag139EnuMiscFeeTypeTest {
    @Test
    void PrintFIXTagTest() {
        Tag139EnuMiscFeeType tagData;

        // loop around the ENUM and process
        for (Enum139MiscFeeType oneEnum : Enum139MiscFeeType.values()) {
            tagData = new Tag139EnuMiscFeeType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXTest() {
        Tag139EnuMiscFeeType tagData;

        // loop around the ENUM and process
        for (Enum139MiscFeeType oneEnum : Enum139MiscFeeType.values()) {
            tagData = new Tag139EnuMiscFeeType(oneEnum);
            assertEquals( "FIX139_ENU_MISC_FEE_TYPE", tagData.toEnumLabelString());
            assertEquals( "MISC_FEE_TYPE", tagData.toEnumNameString());
            assertEquals( "139", tagData.toEnumIDString());
            assertEquals( "MiscFeeType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag139EnuMiscFeeType tagData;

        /*
         * 1-14 MiscFeeType types
         */
        tagData = new Tag139EnuMiscFeeType(Enum139MiscFeeType.REGULATORY);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag139EnuMiscFeeType(Enum139MiscFeeType.TAX);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag139EnuMiscFeeType(Enum139MiscFeeType.LOCAL_COMMISSION);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag139EnuMiscFeeType(Enum139MiscFeeType.EXCHANGE_FEES);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag139EnuMiscFeeType(Enum139MiscFeeType.STAMP);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag139EnuMiscFeeType(Enum139MiscFeeType.LEVY);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag139EnuMiscFeeType(Enum139MiscFeeType.OTHER);
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag139EnuMiscFeeType(Enum139MiscFeeType.MARKUP);
        assertEquals( "8", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag139EnuMiscFeeType(Enum139MiscFeeType.CONSUMPTION_TAX);
        assertEquals( "9", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag139EnuMiscFeeType(Enum139MiscFeeType.PER_TRANSACTION);
        assertEquals( "10", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag139EnuMiscFeeType(Enum139MiscFeeType.CONVERSION);
        assertEquals( "11", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag139EnuMiscFeeType(Enum139MiscFeeType.AGENT);
        assertEquals( "12", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag139EnuMiscFeeType(Enum139MiscFeeType.TRANSFER_FEE);
        assertEquals( "13", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag139EnuMiscFeeType(Enum139MiscFeeType.SECURITY_LENDING);
        assertEquals( "14", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        // loop around the ENUM and process
        for (Enum139MiscFeeType oneEnum : Enum139MiscFeeType.values()) {
            tagData = new Tag139EnuMiscFeeType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag139EnuMiscFeeType tagData;

        // loop around the ENUM and process
        for (Enum139MiscFeeType oneEnum : Enum139MiscFeeType.values()) {
            tagData = new Tag139EnuMiscFeeType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag139EnuMiscFeeType tagData;

        // loop around the ENUM and process
        for (Enum139MiscFeeType oneEnum : Enum139MiscFeeType.values()) {
            tagData = new Tag139EnuMiscFeeType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag139EnuMiscFeeType tagData;

        // loop around the ENUM and process
        for (Enum139MiscFeeType oneEnum : Enum139MiscFeeType.values()) {
            tagData = new Tag139EnuMiscFeeType(oneEnum);
            assertEquals( "Tag139EnuMiscFeeType\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}