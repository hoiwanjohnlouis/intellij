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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.fix41.enums.Enum160SettlInstMode;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  160
 *  SettlInstMode
 *  char
 *  <p></p>
 *  Indicates mode used for Settlement Instructions message.
 *  <p></p>
 *  *** SOME VALUES HAVE BEEN REPLACED - See "Replaced Features and Supported Approach" ***
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Default (Replaced)
 *  <p>    1 - Standing Instructions Provided
 *  <p>    2 - Specific Allocation Account Overriding (Replaced)
 *  <p>    3 - Specific Allocation Account Standing (Replaced)
 *  <p>    4 - Specific Order for a single account (for CIV)
 *  <p></p>
 *  <p>    5 - Request reject
 */
class Tag160EnuSettlInstModeTest {
    @Test
    void PrintFIXTagTest() {
        Tag160EnuSettlInstMode tagData;

        // loop around the ENUM and process
        for (Enum160SettlInstMode oneEnum : Enum160SettlInstMode.values()) {
            tagData = new Tag160EnuSettlInstMode(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXTest() {
        Tag160EnuSettlInstMode tagData;

        // loop around the ENUM and process
        for (Enum160SettlInstMode oneEnum : Enum160SettlInstMode.values()) {
            tagData = new Tag160EnuSettlInstMode(oneEnum);
            assertEquals( "FIX160_ENU_SETTL_INST_MODE", tagData.toEnumLabelString());
            assertEquals( "160", tagData.toEnumIDString());
            assertEquals( "SETTL_INST_MODE", tagData.toEnumNameString());
            assertEquals( "SettlInstMode", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag160EnuSettlInstMode tagData;

        tagData = new Tag160EnuSettlInstMode(Enum160SettlInstMode.DEFAULT);
        assertEquals( Enum160SettlInstMode.DEFAULT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag160EnuSettlInstMode(Enum160SettlInstMode.STANDING_INSTRUCTIONS_PROVIDED);
        assertEquals( Enum160SettlInstMode.STANDING_INSTRUCTIONS_PROVIDED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag160EnuSettlInstMode(Enum160SettlInstMode.SPECIFIC_ALLOCATION_ACCOUNT_OVERRIDING);
        assertEquals( Enum160SettlInstMode.SPECIFIC_ALLOCATION_ACCOUNT_OVERRIDING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag160EnuSettlInstMode(Enum160SettlInstMode.SPECIFIC_ALLOCATION_ACCOUNT_STANDING);
        assertEquals( Enum160SettlInstMode.SPECIFIC_ALLOCATION_ACCOUNT_STANDING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag160EnuSettlInstMode(Enum160SettlInstMode.SPECIFIC_ORDER_SINGLE_ACCOUNT);
        assertEquals( Enum160SettlInstMode.SPECIFIC_ORDER_SINGLE_ACCOUNT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag160EnuSettlInstMode(Enum160SettlInstMode.REQUEST_REJECT);
        assertEquals( Enum160SettlInstMode.REQUEST_REJECT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for (Enum160SettlInstMode oneEnum : Enum160SettlInstMode.values()) {
            tagData = new Tag160EnuSettlInstMode(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag160EnuSettlInstMode tagData;

        // loop around the ENUM and process
        for (Enum160SettlInstMode oneEnum : Enum160SettlInstMode.values()) {
            tagData = new Tag160EnuSettlInstMode(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag160EnuSettlInstMode tagData;

        // loop around the ENUM and process
        for (Enum160SettlInstMode oneEnum : Enum160SettlInstMode.values()) {
            tagData = new Tag160EnuSettlInstMode(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag160EnuSettlInstMode tagData;

        // loop around the ENUM and process
        for (Enum160SettlInstMode oneEnum : Enum160SettlInstMode.values()) {
            tagData = new Tag160EnuSettlInstMode(oneEnum);
            assertEquals( "Tag160EnuSettlInstMode\n" +
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