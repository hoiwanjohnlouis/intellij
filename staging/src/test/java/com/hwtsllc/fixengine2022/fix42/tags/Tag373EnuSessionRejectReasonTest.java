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
import com.hwtsllc.fixengine2022.fix42.enums.Enum373SessionRejectReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  373
 *  SessionRejectReason
 *  int
 *  <p>
 *  Code to identify reason for a session-level Reject message.
 *  <p></p>
 *  Valid values:
 *  <p>     0 - Invalid Tag Number
 *  <p>     1 - Required Tag Missing
 *  <p>     2 - Tag not defined for this message type
 *  <p>     3 - Undefined tag
 *  <p>     4 - Tag specified without a value
 *  <p></p>
 *  <p>     5 - Value is incorrect (out of range) for this tag
 *  <p>     6 - Incorrect data format for value
 *  <p>     7 - Decryption problem
 *  <p>     8 - Signature problem
 *  <p>     9 -  CompID problem
 *  <p></p>
 *  <p>     10 - SendingTime Accuracy Problem
 *  <p>     11 - Invalid MsgType
 *  <p>     12 - XML Validation Error
 *  <p>     13 - Tag appears more than once
 *  <p>     14 - Tag specified out of required order
 *  <p></p>
 *  <p>     15 - Repeating group fields out of order
 *  <p>     16 - Incorrect NumInGroup count for repeating group
 *  <p>     17 - Non "Data" value includes field delimiter (<SOH> character)
 *  <p>     99 - Other
 *  <p>     or any value conforming to the data type Reserved100Plus
 */
class Tag373EnuSessionRejectReasonTest {
    @Test
    void FIX0373Test() {
        FIX42 fixData = FIX42.FIX373_ENU_SESSION_REJECT_REASON;
        assertEquals( "373", fixData.toEnumIDString());
        assertEquals( "SESSION_REJECT_REASON", fixData.toEnumNameString());
        assertEquals( "SessionRejectReason", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0373Test() {
        Tag373EnuSessionRejectReason tagData;

        /*
         * 0-17, 99 msg types
         */
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.INVALID_TAG_NUMBER);
        assertEquals( Enum373SessionRejectReason.INVALID_TAG_NUMBER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.REQUIRED_TAG_MISSING);
        assertEquals( Enum373SessionRejectReason.REQUIRED_TAG_MISSING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.TAG_NOT_DEFINED_FOR_MESSAGE_TYPE);
        assertEquals( Enum373SessionRejectReason.TAG_NOT_DEFINED_FOR_MESSAGE_TYPE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.UNDEFINED_TAG);
        assertEquals( Enum373SessionRejectReason.UNDEFINED_TAG.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.TAG_SPECIFIED_WITHOUT_A_VALUE);
        assertEquals( Enum373SessionRejectReason.TAG_SPECIFIED_WITHOUT_A_VALUE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.INCORRECT_VALUE_FOR_TAG);
        assertEquals( Enum373SessionRejectReason.INCORRECT_VALUE_FOR_TAG.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.INCORRECT_DATA_FORMAT);
        assertEquals( Enum373SessionRejectReason.INCORRECT_DATA_FORMAT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.DECRYPTION_PROBLEM);
        assertEquals( Enum373SessionRejectReason.DECRYPTION_PROBLEM.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.SIGNATURE_PROBLEM);
        assertEquals( Enum373SessionRejectReason.SIGNATURE_PROBLEM.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.COMPID_PROBLEM);
        assertEquals( Enum373SessionRejectReason.COMPID_PROBLEM.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.SENDINGTIME_ACCURACY_PROBLEM);
        assertEquals( Enum373SessionRejectReason.SENDINGTIME_ACCURACY_PROBLEM.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.INVALID_MSGTYPE);
        assertEquals( Enum373SessionRejectReason.INVALID_MSGTYPE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.XML_VALIDATION_ERROR);
        assertEquals( Enum373SessionRejectReason.XML_VALIDATION_ERROR.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.DUPLICATE_TAG);
        assertEquals( Enum373SessionRejectReason.DUPLICATE_TAG.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.TAG_SPECIFIED_OUT_OF_ORDER);
        assertEquals( Enum373SessionRejectReason.TAG_SPECIFIED_OUT_OF_ORDER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.REPEATING_GROUP_FIELDS_OUT_OF_ORDER);
        assertEquals( Enum373SessionRejectReason.REPEATING_GROUP_FIELDS_OUT_OF_ORDER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.INCORRECT_NUMINGROUP_COUNT);
        assertEquals( Enum373SessionRejectReason.INCORRECT_NUMINGROUP_COUNT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.VALUE_INCLUDES_FIELD_DELIMITER);
        assertEquals( Enum373SessionRejectReason.VALUE_INCLUDES_FIELD_DELIMITER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.OTHER);
        assertEquals( Enum373SessionRejectReason.OTHER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag373EnuSessionRejectReason tagData;

        // loop around the ENUM and process
        for (Enum373SessionRejectReason oneEnum : Enum373SessionRejectReason.values()) {
            tagData = new Tag373EnuSessionRejectReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag373EnuSessionRejectReason tagData;

        // loop around the ENUM and process
        for (Enum373SessionRejectReason oneEnum : Enum373SessionRejectReason.values()) {
            tagData = new Tag373EnuSessionRejectReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag373EnuSessionRejectReason tagData;

        // loop around the ENUM and process
        for (Enum373SessionRejectReason oneEnum : Enum373SessionRejectReason.values()) {
            tagData = new Tag373EnuSessionRejectReason(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag373EnuSessionRejectReason tagData;

        // loop around the ENUM and process
        for (Enum373SessionRejectReason oneEnum : Enum373SessionRejectReason.values()) {
            tagData = new Tag373EnuSessionRejectReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag373EnuSessionRejectReason tagData;

        // loop around the ENUM and process
        for (Enum373SessionRejectReason oneEnum : Enum373SessionRejectReason.values()) {
            tagData = new Tag373EnuSessionRejectReason(oneEnum);
            assertEquals( "Tag373EnuSessionRejectReason\n" +
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