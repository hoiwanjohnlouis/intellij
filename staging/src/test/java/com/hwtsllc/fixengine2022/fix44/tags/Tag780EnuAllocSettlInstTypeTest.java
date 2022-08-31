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

import com.hwtsllc.fixengine2022.fix44.enums.Enum780AllocSettlInstType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag780EnuAllocSettlInstTypeTest {
    Tag780EnuAllocSettlInstType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum780AllocSettlInstType oneEnum : Enum780AllocSettlInstType.values()) {
            tagData = new Tag780EnuAllocSettlInstType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum780AllocSettlInstType oneEnum : Enum780AllocSettlInstType.values()) {
            tagData = new Tag780EnuAllocSettlInstType(oneEnum);
            assertEquals( "FIX780_ENU_ALLOC_SETTL_INST_TYPE", tagData.toEnumLabelString());
            assertEquals( "780", tagData.toEnumIDString());
            assertEquals( "ALLOC_SETTL_INST_TYPE", tagData.toEnumNameString());
            assertEquals( "AllocSettlInstType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum780AllocSettlInstType oneEnum : Enum780AllocSettlInstType.values()) {
            tagData = new Tag780EnuAllocSettlInstType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  780
         *  AllocSettlInstType
         *  int
         *  <p>    0 - Use default instructions
         *  <p>    1 - Derive from parameters provided
         *  <p>    2 - Full details provided
         *  <p>    3 - SSI DB IDs provided
         *  <p>    4 - Phone for instructions
         */
        tagData = new Tag780EnuAllocSettlInstType( Enum780AllocSettlInstType.USE_DEFAULTS );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag780EnuAllocSettlInstType( Enum780AllocSettlInstType.DERIVE_FROM_PARAMETERS );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag780EnuAllocSettlInstType( Enum780AllocSettlInstType.FULL_DETAILS );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag780EnuAllocSettlInstType( Enum780AllocSettlInstType.SSI_DB_ID_PROVIDED );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag780EnuAllocSettlInstType( Enum780AllocSettlInstType.PHONE_FOR_INSTRUCTIONS );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum780AllocSettlInstType oneEnum : Enum780AllocSettlInstType.values()) {
            tagData = new Tag780EnuAllocSettlInstType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum780AllocSettlInstType oneEnum : Enum780AllocSettlInstType.values()) {
            tagData = new Tag780EnuAllocSettlInstType(oneEnum);
            assertEquals( "Tag780EnuAllocSettlInstType\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
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