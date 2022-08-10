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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.MyEnumApplVerID;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1128 (same as 1128, 1030, 1137,)
 *  ApplVerID
 *  String
 *  <p>
 *  Specifies the service pack release being applied at message level.
 *  <p>
 *  Enumerated field with values assigned at time of service pack release
 *  <p></p>
 *  1130
 *  RefApplVerID
 *  String
 *  <p>
 *  Specifies the service pack release being applied to a message at the session level.
 *  <p>
 *  Enumerated field with values assigned at time of service pack release.
 *  <p>
 *  Uses same values as ApplVerID (1128)
 *  <p></p>
 *  1137
 *  DefaultApplVerID
 *  String
 *  <p>
 *  Specifies the service pack release being applied, by default, to message at the session level.
 *  <p>
 *  Enumerated field with values assigned at time of service pack release.
 *  <p>
 *  Uses same values as ApplVerID (1128)
 *  <p></p>
 *  Valid values:
 *  <p>    0 - FIX27
 *  <p>    1 - FIX30
 *  <p>    2 - FIX40
 *  <p>    3 - FIX41
 *  <p>    4 - FIX42
 *
 *  <p>    5 - FIX43
 *  <p>    6 - FIX44
 *  <p>    7 - FIX50
 */
class Tag1128EnuApplVerIDTest {
    Tag1128EnuApplVerID tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumApplVerID oneEnum : MyEnumApplVerID.values()) {
            tagData = new Tag1128EnuApplVerID(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumApplVerID oneEnum : MyEnumApplVerID.values()) {
            tagData = new Tag1128EnuApplVerID(oneEnum);
            assertEquals( "FIX1128_ENU_APPL_VER_ID", tagData.toEnumLabelString());
            assertEquals( "1128", tagData.toEnumIDString());
            assertEquals( "APPL_VER_ID", tagData.toEnumNameString());
            assertEquals( "ApplVerID", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  <p>    0 - FIX27
         *  <p>    1 - FIX30
         *  <p>    2 - FIX40
         *  <p>    3 - FIX41
         *  <p>    4 - FIX42
         */
        tagData = new Tag1128EnuApplVerID( MyEnumApplVerID.FIX27 );
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1128EnuApplVerID( MyEnumApplVerID.FIX30 );
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1128EnuApplVerID( MyEnumApplVerID.FIX40 );
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1128EnuApplVerID( MyEnumApplVerID.FIX41 );
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1128EnuApplVerID( MyEnumApplVerID.FIX42 );
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    5 - FIX43
         *  <p>    6 - FIX44
         *  <p>    7 - FIX50
         */
        tagData = new Tag1128EnuApplVerID( MyEnumApplVerID.FIX43 );
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1128EnuApplVerID( MyEnumApplVerID.FIX44 );
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1128EnuApplVerID( MyEnumApplVerID.FIX50 );
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        // loop around the ENUM and process
        for ( MyEnumApplVerID oneEnum : MyEnumApplVerID.values()) {
            tagData = new Tag1128EnuApplVerID(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumApplVerID oneEnum : MyEnumApplVerID.values()) {
            tagData = new Tag1128EnuApplVerID(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( MyEnumApplVerID oneEnum : MyEnumApplVerID.values()) {
            tagData = new Tag1128EnuApplVerID(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumApplVerID oneEnum : MyEnumApplVerID.values()) {
            tagData = new Tag1128EnuApplVerID(oneEnum);
            assertEquals( "Tag1128EnuApplVerID\n" +
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