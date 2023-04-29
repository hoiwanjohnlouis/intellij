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

package com.hwtsllc.fix.tags.fix42;

import com.hwtsllc.fix.enums.fix42.Enum279MDUpdateAction;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag279EnuMDUpdateActionTest {
    Tag279EnuMDUpdateAction tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum279MDUpdateAction oneEnum : Enum279MDUpdateAction.values()) {
            tagData = new Tag279EnuMDUpdateAction(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum279MDUpdateAction oneEnum : Enum279MDUpdateAction.values()) {
            tagData = new Tag279EnuMDUpdateAction(oneEnum);
            assertEquals( "FIX279_ENU_MD_UPDATE_ACTION", tagData.toFIXLabelString());
            assertEquals( "279", tagData.toFIXIDString());
            assertEquals( "MD_UPDATE_ACTION", tagData.toFIXNameString());
            assertEquals( "MDUpdateAction", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum279MDUpdateAction oneEnum : Enum279MDUpdateAction.values()) {
            tagData = new Tag279EnuMDUpdateAction(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  279
         *  MDUpdateAction
         *  char
         *  <p>    0-4 msg types
         *  <p>    NEW( "0", "NEW", "0 - New" ),
         *  <p>    CHANGE( "1", "CHANGE", "1 - Change" ),
         *  <p>    DELETE( "2", "DELETE", "2 - Delete" ),
         *  <p>    DELETE_THRU( "3", "DELETE_THRU", "3 - Delete Thru" ),
         *  <p>    DELETE_FROM( "4", "DELETE_FROM", "4 - Delete From" ),
         */
        tagData = new Tag279EnuMDUpdateAction(Enum279MDUpdateAction.NEW);
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag279EnuMDUpdateAction(Enum279MDUpdateAction.CHANGE);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag279EnuMDUpdateAction(Enum279MDUpdateAction.DELETE);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag279EnuMDUpdateAction(Enum279MDUpdateAction.DELETE_THRU);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag279EnuMDUpdateAction(Enum279MDUpdateAction.DELETE_FROM);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum279MDUpdateAction oneEnum : Enum279MDUpdateAction.values()) {
            tagData = new Tag279EnuMDUpdateAction(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum279MDUpdateAction oneEnum : Enum279MDUpdateAction.values()) {
            tagData = new Tag279EnuMDUpdateAction(oneEnum);
            assertEquals( "Tag279EnuMDUpdateAction\n" +
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