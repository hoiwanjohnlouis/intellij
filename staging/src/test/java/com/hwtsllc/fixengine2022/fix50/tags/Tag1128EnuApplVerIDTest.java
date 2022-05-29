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

import com.hwtsllc.fixengine2022.datatypes.FIX50;
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
    @Test
    void FIX1128Test() {
        FIX50 fixData = FIX50.FIX1128_ENU_APPL_VER_ID;
        assertEquals( "1128", fixData.toFIXIDString());
        assertEquals( "APPL_VER_ID", fixData.toFIXNameString());
        assertEquals( "ApplVerID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1128Test() {
        Tag1128EnuApplVerID tagData;

        tagData = new Tag1128EnuApplVerID( MyEnumApplVerID.FIX27 );
        assertEquals( MyEnumApplVerID.FIX27.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1128EnuApplVerID( MyEnumApplVerID.FIX30 );
        assertEquals( MyEnumApplVerID.FIX30.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1128EnuApplVerID( MyEnumApplVerID.FIX40 );
        assertEquals( MyEnumApplVerID.FIX40.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1128EnuApplVerID( MyEnumApplVerID.FIX41 );
        assertEquals( MyEnumApplVerID.FIX41.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1128EnuApplVerID( MyEnumApplVerID.FIX42 );
        assertEquals( MyEnumApplVerID.FIX42.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag1128EnuApplVerID( MyEnumApplVerID.FIX43 );
        assertEquals( MyEnumApplVerID.FIX43.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1128EnuApplVerID( MyEnumApplVerID.FIX44 );
        assertEquals( MyEnumApplVerID.FIX44.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1128EnuApplVerID( MyEnumApplVerID.FIX50 );
        assertEquals( MyEnumApplVerID.FIX50.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1128EnuApplVerID tagData;

        // loop around the ENUM and process
        for ( MyEnumApplVerID oneEnum : MyEnumApplVerID.values()) {
            tagData = new Tag1128EnuApplVerID(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag1128EnuApplVerID tagData;

        // loop around the ENUM and process
        for (MyEnumApplVerID oneEnum : MyEnumApplVerID.values()) {
            tagData = new Tag1128EnuApplVerID(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1128EnuApplVerID tagData;

        // loop around the ENUM and process
        for (MyEnumApplVerID oneEnum : MyEnumApplVerID.values()) {
            tagData = new Tag1128EnuApplVerID(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag1128EnuApplVerID tagData;

        // loop around the ENUM and process
        for (MyEnumApplVerID oneEnum : MyEnumApplVerID.values()) {
            tagData = new Tag1128EnuApplVerID(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1128EnuApplVerID tagData;

        // loop around the ENUM and process
        for (MyEnumApplVerID oneEnum : MyEnumApplVerID.values()) {
            tagData = new Tag1128EnuApplVerID(oneEnum);
            assertEquals( "Tag1128EnuApplVerID\n" +
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