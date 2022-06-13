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

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.fix44.enums.Enum944CollAction;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  944
 *  CollAction
 *  int
 *  <p></p>
 *  Action proposed for an Underlying Instrument instance.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Retain
 *  <p>    1 - Add
 *  <p>    2 - Remove
 */
class Tag944EnuCollActionTest {
    @Test
    void FIX0944Test() {
        FIX44 fixData = FIX44.FIX944_ENU_COLL_ACTION;
        assertEquals( "944", fixData.toFIXIDString());
        assertEquals( "COLL_ACTION", fixData.toFIXNameString());
        assertEquals( "CollAction", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0944Test() {
        Tag944EnuCollAction tagData;

        tagData = new Tag944EnuCollAction( Enum944CollAction.RETAIN );
        assertEquals( Enum944CollAction.RETAIN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag944EnuCollAction( Enum944CollAction.ADD );
        assertEquals( Enum944CollAction.ADD.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag944EnuCollAction( Enum944CollAction.REMOVE );
        assertEquals( Enum944CollAction.REMOVE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag944EnuCollAction tagData;

        // loop around the ENUM and process
        for ( Enum944CollAction oneEnum : Enum944CollAction.values()) {
            tagData = new Tag944EnuCollAction(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag944EnuCollAction tagData;

        // loop around the ENUM and process
        for (Enum944CollAction oneEnum : Enum944CollAction.values()) {
            tagData = new Tag944EnuCollAction(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag944EnuCollAction tagData;

        // loop around the ENUM and process
        for (Enum944CollAction oneEnum : Enum944CollAction.values()) {
            tagData = new Tag944EnuCollAction(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag944EnuCollAction tagData;

        // loop around the ENUM and process
        for (Enum944CollAction oneEnum : Enum944CollAction.values()) {
            tagData = new Tag944EnuCollAction(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag944EnuCollAction tagData;

        // loop around the ENUM and process
        for (Enum944CollAction oneEnum : Enum944CollAction.values()) {
            tagData = new Tag944EnuCollAction(oneEnum);
            assertEquals( "Tag944EnuCollAction\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}