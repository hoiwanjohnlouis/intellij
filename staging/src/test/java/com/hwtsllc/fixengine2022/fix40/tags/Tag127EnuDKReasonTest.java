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

import com.hwtsllc.fixengine2022.fix40.enums.Enum127DKReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  127
 *  DKReason
 *  char
 *  <p></p>
 *  Reason for execution rejection.
 *  <p></p>
 *  Valid values:
 *  <p>    A - Unknown Symbol
 *  <p>    B - Wrong Side
 *  <p>    C - Quantity Exceeds Order
 *  <p>    D - No Matching Order
 *  <p>    E - Price Exceeds Limit
 *  <p></p>
 *  <p>    F - Calculation Difference
 *  <p>    Z - Other
 */
class Tag127EnuDKReasonTest {
    @Test
    void PrintFIXTagTest() {
        Tag127EnuDKReason tagData;

        // loop around the ENUM and process
        for (Enum127DKReason oneEnum : Enum127DKReason.values()) {
            tagData = new Tag127EnuDKReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIX0127Test() {
        Tag127EnuDKReason tagData;

        // loop around the ENUM and process
        for (Enum127DKReason oneEnum : Enum127DKReason.values()) {
            tagData = new Tag127EnuDKReason(oneEnum);
            assertEquals( "FIX127_ENU_DK_REASON", tagData.toEnumLabelString());
            assertEquals( "DK_REASON", tagData.toEnumNameString() );
            assertEquals( "127", tagData.toEnumIDString());
            assertEquals( "DKReason", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag127EnuDKReason tagData;

        /*
         * A-F, Z DKReason type
         */
        tagData = new Tag127EnuDKReason(Enum127DKReason.UNKNOWN_SYMBOL);
        assertEquals( "A", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag127EnuDKReason(Enum127DKReason.WRONG_SIDE);
        assertEquals( "B", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag127EnuDKReason(Enum127DKReason.QUANTITY_EXCEEDS_ORDER);
        assertEquals( "C", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag127EnuDKReason(Enum127DKReason.NO_MATCHING_ORDER);
        assertEquals( "D", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag127EnuDKReason(Enum127DKReason.PRICE_EXCEEDS_LIMIT);
        assertEquals( "E", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag127EnuDKReason(Enum127DKReason.CALCULATION_DIFFERENCE);
        assertEquals( "F", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag127EnuDKReason(Enum127DKReason.OTHER);
        assertEquals( "Z", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        // loop around the ENUM and process
        for (Enum127DKReason oneEnum : Enum127DKReason.values()) {
            tagData = new Tag127EnuDKReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag127EnuDKReason tagData;

        // loop around the ENUM and process
        for (Enum127DKReason oneEnum : Enum127DKReason.values()) {
            tagData = new Tag127EnuDKReason(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag127EnuDKReason tagData;

        // loop around the ENUM and process
        for (Enum127DKReason oneEnum : Enum127DKReason.values()) {
            tagData = new Tag127EnuDKReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag127EnuDKReason tagData;

        // loop around the ENUM and process
        for (Enum127DKReason oneEnum : Enum127DKReason.values()) {
            tagData = new Tag127EnuDKReason(oneEnum);
            assertEquals( "Tag127EnuDKReason\n" +
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