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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.fix42.enums.Enum430NetGrossInd;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  430
 *  NetGrossInd
 *  int
 *  <p>
 *  Code to represent whether value is net (inclusive of tax) or gross.
 *  <p></p>
 *  Valid values:
 *  <p>    1-2 msg types
 *  <p>    1 - Net
 *  <p>    2 - Gross
 */
class Tag430EnuNetGrossIndTest {
    Tag430EnuNetGrossInd tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum430NetGrossInd oneEnum : Enum430NetGrossInd.values()) {
            tagData = new Tag430EnuNetGrossInd(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum430NetGrossInd oneEnum : Enum430NetGrossInd.values()) {
            tagData = new Tag430EnuNetGrossInd(oneEnum);
            assertEquals( "FIX430_ENU_NET_GROSS_IND", tagData.toEnumLabelString());
            assertEquals( "430", tagData.toEnumIDString());
            assertEquals( "NET_GROSS_IND", tagData.toEnumNameString());
            assertEquals( "NetGrossInd", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         * 1-2 msg types
         */
        tagData = new Tag430EnuNetGrossInd(Enum430NetGrossInd.NET);
        assertEquals( Enum430NetGrossInd.NET.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag430EnuNetGrossInd(Enum430NetGrossInd.GROSS);
        assertEquals( Enum430NetGrossInd.GROSS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( Enum430NetGrossInd oneEnum : Enum430NetGrossInd.values()) {
            tagData = new Tag430EnuNetGrossInd(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum430NetGrossInd oneEnum : Enum430NetGrossInd.values()) {
            tagData = new Tag430EnuNetGrossInd(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( Enum430NetGrossInd oneEnum : Enum430NetGrossInd.values()) {
            tagData = new Tag430EnuNetGrossInd(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum430NetGrossInd oneEnum : Enum430NetGrossInd.values()) {
            tagData = new Tag430EnuNetGrossInd(oneEnum);
            assertEquals( "Tag430EnuNetGrossInd\n" +
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