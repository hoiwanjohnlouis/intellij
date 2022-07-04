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

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.fix42.enums.Enum279MDUpdateAction;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  279
 *  MDUpdateAction
 *  char
 *  <p>
 *  Type of Market Data update action.
 *  <p></p>
 *  Valid values:
 *  <p>    0-4 msg types
 *  <p>    NEW( "0", "NEW", "0 - New" ),
 *  <p>    CHANGE( "1", "CHANGE", "1 - Change" ),
 *  <p>    DELETE( "2", "DELETE", "2 - Delete" ),
 *  <p>    DELETE_THRU( "3", "DELETE_THRU", "3 - Delete Thru" ),
 *  <p>    DELETE_FROM( "4", "DELETE_FROM", "4 - Delete From" ),
 */
class Tag279EnuMDUpdateActionTest {
    @Test
    void FIX0279Test() {
        FIX42 fixData = FIX42.FIX279_ENU_MD_UPDATE_ACTION;
        assertEquals( "279", fixData.toEnumIDString());
        assertEquals( "MD_UPDATE_ACTION", fixData.toEnumNameString());
        assertEquals( "MDUpdateAction", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0279Test() {
        Tag279EnuMDUpdateAction tagData;

        /*
         * 0-4 msg types
         */
        tagData = new Tag279EnuMDUpdateAction(Enum279MDUpdateAction.NEW);
        assertEquals( Enum279MDUpdateAction.NEW.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag279EnuMDUpdateAction(Enum279MDUpdateAction.CHANGE);
        assertEquals( Enum279MDUpdateAction.CHANGE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag279EnuMDUpdateAction(Enum279MDUpdateAction.DELETE);
        assertEquals( Enum279MDUpdateAction.DELETE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag279EnuMDUpdateAction(Enum279MDUpdateAction.DELETE_THRU);
        assertEquals( Enum279MDUpdateAction.DELETE_THRU.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag279EnuMDUpdateAction(Enum279MDUpdateAction.DELETE_FROM);
        assertEquals( Enum279MDUpdateAction.DELETE_FROM.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag279EnuMDUpdateAction tagData;

        // loop around the ENUM and process
        for (Enum279MDUpdateAction oneEnum : Enum279MDUpdateAction.values()) {
            tagData = new Tag279EnuMDUpdateAction(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag279EnuMDUpdateAction tagData;

        // loop around the ENUM and process
        for (Enum279MDUpdateAction oneEnum : Enum279MDUpdateAction.values()) {
            tagData = new Tag279EnuMDUpdateAction(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag279EnuMDUpdateAction tagData;

        // loop around the ENUM and process
        for (Enum279MDUpdateAction oneEnum : Enum279MDUpdateAction.values()) {
            tagData = new Tag279EnuMDUpdateAction(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag279EnuMDUpdateAction tagData;

        // loop around the ENUM and process
        for (Enum279MDUpdateAction oneEnum : Enum279MDUpdateAction.values()) {
            tagData = new Tag279EnuMDUpdateAction(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag279EnuMDUpdateAction tagData;

        // loop around the ENUM and process
        for (Enum279MDUpdateAction oneEnum : Enum279MDUpdateAction.values()) {
            tagData = new Tag279EnuMDUpdateAction(oneEnum);
            assertEquals( "Tag279EnuMDUpdateAction\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}