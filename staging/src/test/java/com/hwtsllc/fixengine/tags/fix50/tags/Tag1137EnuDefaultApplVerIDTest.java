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

package com.hwtsllc.fixengine.tags.fix50.tags;

import com.hwtsllc.fixengine.datatypes.MyEnumApplVerID;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag1137EnuDefaultApplVerIDTest {
    Tag1137EnuDefaultApplVerID tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumApplVerID oneEnum : MyEnumApplVerID.values()) {
            tagData = new Tag1137EnuDefaultApplVerID(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumApplVerID oneEnum : MyEnumApplVerID.values()) {
            tagData = new Tag1137EnuDefaultApplVerID(oneEnum);
            assertEquals( "FIX1137_ENU_DEFAULT_APPL_VER_ID", tagData.toFIXLabelString());
            assertEquals( "1137", tagData.toFIXIDString());
            assertEquals( "DEFAULT_APPL_VER_ID", tagData.toFIXNameString());
            assertEquals( "DefaultApplVerID", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumApplVerID oneEnum : MyEnumApplVerID.values()) {
            tagData = new Tag1137EnuDefaultApplVerID(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  1137 (same as 1128, 1030, 1137,)
         *  DefaultApplVerID
         *  String
         *  <p>    0 - FIX27
         *  <p>    1 - FIX30
         *  <p>    2 - FIX40
         *  <p>    3 - FIX41
         *  <p>    4 - FIX42
         */
        tagData = new Tag1137EnuDefaultApplVerID( MyEnumApplVerID.FIX27 );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1137EnuDefaultApplVerID( MyEnumApplVerID.FIX30 );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1137EnuDefaultApplVerID( MyEnumApplVerID.FIX40 );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1137EnuDefaultApplVerID( MyEnumApplVerID.FIX41 );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1137EnuDefaultApplVerID( MyEnumApplVerID.FIX42 );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    5 - FIX43
         *  <p>    6 - FIX44
         *  <p>    7 - FIX50
         */
        tagData = new Tag1137EnuDefaultApplVerID( MyEnumApplVerID.FIX43 );
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1137EnuDefaultApplVerID( MyEnumApplVerID.FIX44 );
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1137EnuDefaultApplVerID( MyEnumApplVerID.FIX50 );
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( MyEnumApplVerID oneEnum : MyEnumApplVerID.values()) {
            tagData = new Tag1137EnuDefaultApplVerID(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumApplVerID oneEnum : MyEnumApplVerID.values()) {
            tagData = new Tag1137EnuDefaultApplVerID(oneEnum);
            assertEquals( "Tag1137EnuDefaultApplVerID\n" +
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