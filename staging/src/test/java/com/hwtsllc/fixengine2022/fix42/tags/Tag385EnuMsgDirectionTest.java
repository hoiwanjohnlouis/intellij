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
import com.hwtsllc.fixengine2022.fix42.enums.Enum385MsgDirection;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  385
 *  MsgDirection
 *  char
 *  <p>
 *  Specifies the direction of the messsage.
 *  <p></p>
 *  Valid values:
 *  <p>    R - Receive
 *  <p>    S - Send
 */
class Tag385EnuMsgDirectionTest {
    @Test
    void FIX0385Test() {
        FIX42 fixData = FIX42.FIX385_ENU_MSG_DIRECTION;
        assertEquals( "385", fixData.toEnumIDString());
        assertEquals( "MSG_DIRECTION", fixData.toEnumNameString());
        assertEquals( "MsgDirection", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0385Test() {
        Tag385EnuMsgDirection tagData;

        /*
         * R, and S msg types
         */
        tagData = new Tag385EnuMsgDirection(Enum385MsgDirection.RECEIVE);
        assertEquals( Enum385MsgDirection.RECEIVE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag385EnuMsgDirection(Enum385MsgDirection.SEND);
        assertEquals( Enum385MsgDirection.SEND.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag385EnuMsgDirection tagData;

        // loop around the ENUM and process
        for (Enum385MsgDirection oneEnum : Enum385MsgDirection.values()) {
            tagData = new Tag385EnuMsgDirection(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag385EnuMsgDirection tagData;

        // loop around the ENUM and process
        for (Enum385MsgDirection oneEnum : Enum385MsgDirection.values()) {
            tagData = new Tag385EnuMsgDirection(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag385EnuMsgDirection tagData;

        // loop around the ENUM and process
        for (Enum385MsgDirection oneEnum : Enum385MsgDirection.values()) {
            tagData = new Tag385EnuMsgDirection(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag385EnuMsgDirection tagData;

        // loop around the ENUM and process
        for (Enum385MsgDirection oneEnum : Enum385MsgDirection.values()) {
            tagData = new Tag385EnuMsgDirection(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag385EnuMsgDirection tagData;

        // loop around the ENUM and process
        for (Enum385MsgDirection oneEnum : Enum385MsgDirection.values()) {
            tagData = new Tag385EnuMsgDirection(oneEnum);
            assertEquals( "Tag385EnuMsgDirection\n" +
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