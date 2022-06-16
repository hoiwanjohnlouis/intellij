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
import com.hwtsllc.fixengine2022.fix44.enums.Enum665ConfirmStatus;
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
        assertEquals( "724", fixData.toFIXIDString());
        assertEquals( "POS_REQ_TYPE", fixData.toFIXNameString());
        assertEquals( "PosReqType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0724Test() {
        Tag724EnuPosReqType tagData;
        Enum665ConfirmStatus oneElement;

        tagData = new Tag724EnuPosReqType(Enum724PosReqType.POSITIONS);
        assertEquals( "0", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "724", fixData.toFIXIDString());
        assertEquals( "POS_REQ_TYPE", fixData.toFIXNameString());
        assertEquals( "PosReqType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());

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
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
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