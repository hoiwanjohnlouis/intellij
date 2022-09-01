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

class Tag160EnuSettlInstModeTest {
    Tag160EnuSettlInstMode tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum160SettlInstMode oneEnum : Enum160SettlInstMode.values()) {
            tagData = new Tag160EnuSettlInstMode(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum160SettlInstMode oneEnum : Enum160SettlInstMode.values()) {
            tagData = new Tag160EnuSettlInstMode(oneEnum);
            assertEquals( "FIX160_ENU_SETTL_INST_MODE", tagData.toFIXLabelString());
            assertEquals( "160", tagData.toFIXIDString());
            assertEquals( "SETTL_INST_MODE", tagData.toEnumNameString());
            assertEquals( "SettlInstMode", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum160SettlInstMode oneEnum : Enum160SettlInstMode.values()) {
            tagData = new Tag160EnuSettlInstMode(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  160
         *  SettlInstMode
         *  char
         *  <p>    0 - Default (Replaced)
         *  <p>    1 - Standing Instructions Provided
         *  <p>    2 - Specific Allocation Account Overriding (Replaced)
         *  <p>    3 - Specific Allocation Account Standing (Replaced)
         *  <p>    4 - Specific Order for a single account (for CIV)
         */
        tagData = new Tag160EnuSettlInstMode(Enum160SettlInstMode.DEFAULT);
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag160EnuSettlInstMode(Enum160SettlInstMode.STANDING_INSTRUCTIONS_PROVIDED);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag160EnuSettlInstMode(Enum160SettlInstMode.SPECIFIC_ALLOCATION_ACCOUNT_OVERRIDING);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag160EnuSettlInstMode(Enum160SettlInstMode.SPECIFIC_ALLOCATION_ACCOUNT_STANDING);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag160EnuSettlInstMode(Enum160SettlInstMode.SPECIFIC_ORDER_SINGLE_ACCOUNT);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    5 - Request reject
         */
        tagData = new Tag160EnuSettlInstMode(Enum160SettlInstMode.REQUEST_REJECT);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum160SettlInstMode oneEnum : Enum160SettlInstMode.values()) {
            tagData = new Tag160EnuSettlInstMode(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum160SettlInstMode oneEnum : Enum160SettlInstMode.values()) {
            tagData = new Tag160EnuSettlInstMode(oneEnum);
            assertEquals( "Tag160EnuSettlInstMode\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
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