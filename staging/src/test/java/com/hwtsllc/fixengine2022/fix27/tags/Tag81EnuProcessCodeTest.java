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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.fix27.enums.Enum81ProcessCode;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  81
 *  ProcessCode
 *  char
 *  <p></p>
 *  Processing code for sub-account.
 *  <p></p>
 *  Absence of this field in AllocAccount (79), AllocPrice (366),
 *  <p></p>
 *  AllocQty (80), ProcessCode instance indicates regular trade.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Regular
 *  <p>    1 - Soft Dollar
 *  <p>    2 - Step-In
 *  <p>    3 - Step-Out
 *  <p>    4 - Soft-dollar Step-In
 *  <p></p>
 *  <p>    5 - Soft-dollar Step-Out
 *  <p>    6 - Plan Sponsor
 */
class Tag81EnuProcessCodeTest {
    @Test
    void PrintFIXTagTest() {
        Tag81EnuProcessCode tagData;

        // loop around the ENUM and process
        for (Enum81ProcessCode oneEnum : Enum81ProcessCode.values()) {
            tagData = new Tag81EnuProcessCode(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void Tag0081Test() {
        Tag81EnuProcessCode tagData;

        /*
         * 0-6 AllocRejCode types
         */
        tagData = new Tag81EnuProcessCode(Enum81ProcessCode.REGULAR);
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag81EnuProcessCode(Enum81ProcessCode.SOFT_DOLLAR);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag81EnuProcessCode(Enum81ProcessCode.STEP_IN);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag81EnuProcessCode(Enum81ProcessCode.STEP_OUT);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag81EnuProcessCode(Enum81ProcessCode.SOFT_DOLLAR_STEP_IN);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag81EnuProcessCode(Enum81ProcessCode.SOFT_DOLLAR_STEP_OUT);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag81EnuProcessCode(Enum81ProcessCode.PLAN_SPONSOR);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void FIXTest() {
        Tag81EnuProcessCode tagData;

        // loop around the ENUM and process
        for (Enum81ProcessCode oneEnum : Enum81ProcessCode.values()) {
            tagData = new Tag81EnuProcessCode(oneEnum);
            assertEquals( "FIX81_ENU_PROCESS_CODE", tagData.toEnumLabelString());
            assertEquals( "PROCESS_CODE", tagData.toEnumNameString());
            assertEquals( "81", tagData.toEnumIDString());
            assertEquals( "ProcessCode", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag81EnuProcessCode tagData;

        // loop around the ENUM and process
        for (Enum81ProcessCode oneEnum : Enum81ProcessCode.values()) {
            tagData = new Tag81EnuProcessCode(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag81EnuProcessCode tagData;

        // loop around the ENUM and process
        for (Enum81ProcessCode oneEnum : Enum81ProcessCode.values()) {
            tagData = new Tag81EnuProcessCode(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag81EnuProcessCode tagData;

        // loop around the ENUM and process
        for (Enum81ProcessCode oneEnum : Enum81ProcessCode.values()) {
            tagData = new Tag81EnuProcessCode(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag81EnuProcessCode tagData;

        // loop around the ENUM and process
        for (Enum81ProcessCode oneEnum : Enum81ProcessCode.values()) {
            tagData = new Tag81EnuProcessCode(oneEnum);
            assertEquals( "Tag81EnuProcessCode\n" +
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