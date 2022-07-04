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
import com.hwtsllc.fixengine2022.fix44.enums.Enum724PosReqType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  724
 *  PosReqType
 *  int
 *  <p></p>
 *  Used to specify the type of position request being made.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Positions
 *  <p>    1 - Trades
 *  <p>    2 - Exercises
 *  <p>    3 - Assignments
 *  <p>    4 - Settlement Activity
 *  <p></p>
 *  <p>    5 - Backout Message
 */
class Tag724EnuPosReqTypeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX724_ENU_POS_REQ_TYPE;
        assertEquals( "724", fixData.toEnumIDString());
        assertEquals( "POS_REQ_TYPE", fixData.toEnumNameString());
        assertEquals( "PosReqType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0724Test() {
        Tag724EnuPosReqType tagData;
        Enum724PosReqType oneElement;

        oneElement = Enum724PosReqType.POSITIONS;
        tagData = new Tag724EnuPosReqType( oneElement );
        assertEquals( "0", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "724", tagData.toEnumIDString());
        assertEquals( "POS_REQ_TYPE", tagData.toEnumNameString());
        assertEquals( "PosReqType", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag724EnuPosReqType(Enum724PosReqType.TRADES);
        assertEquals( "1", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag724EnuPosReqType(Enum724PosReqType.EXERCISES);
        assertEquals( "2", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag724EnuPosReqType(Enum724PosReqType.ASSIGNMENTS);
        assertEquals( "3", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag724EnuPosReqType(Enum724PosReqType.SETTLEMENT_ACTIVITY);
        assertEquals( "4", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag724EnuPosReqType(Enum724PosReqType.BACKOUT_MESSAGE);
        assertEquals( "5", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag724EnuPosReqType tagData;

        // loop around the ENUM and process
        for ( Enum724PosReqType oneEnum : Enum724PosReqType.values()) {
            tagData = new Tag724EnuPosReqType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag724EnuPosReqType tagData;

        // loop around the ENUM and process
        for (Enum724PosReqType oneEnum : Enum724PosReqType.values()) {
            tagData = new Tag724EnuPosReqType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag724EnuPosReqType tagData;

        // loop around the ENUM and process
        for (Enum724PosReqType oneEnum : Enum724PosReqType.values()) {
            tagData = new Tag724EnuPosReqType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag724EnuPosReqType tagData;

        // loop around the ENUM and process
        for (Enum724PosReqType oneEnum : Enum724PosReqType.values()) {
            tagData = new Tag724EnuPosReqType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag724EnuPosReqType tagData;

        // loop around the ENUM and process
        for (Enum724PosReqType oneEnum : Enum724PosReqType.values()) {
            tagData = new Tag724EnuPosReqType(oneEnum);
            assertEquals( "Tag724EnuPosReqType\n" +
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