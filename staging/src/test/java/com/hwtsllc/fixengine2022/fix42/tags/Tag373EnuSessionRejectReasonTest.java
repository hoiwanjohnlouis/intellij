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

import com.hwtsllc.fixengine2022.fix42.enums.Enum373SessionRejectReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag373EnuSessionRejectReasonTest {
    Tag373EnuSessionRejectReason tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum373SessionRejectReason oneEnum : Enum373SessionRejectReason.values()) {
            tagData = new Tag373EnuSessionRejectReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum373SessionRejectReason oneEnum : Enum373SessionRejectReason.values()) {
            tagData = new Tag373EnuSessionRejectReason(oneEnum);
            assertEquals( "FIX373_ENU_SESSION_REJECT_REASON", tagData.toFIXLabelString());
            assertEquals( "373", tagData.toFIXIDString());
            assertEquals( "SESSION_REJECT_REASON", tagData.toFIXNameString());
            assertEquals( "SessionRejectReason", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum373SessionRejectReason oneEnum : Enum373SessionRejectReason.values()) {
            tagData = new Tag373EnuSessionRejectReason(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  373
         *  SessionRejectReason
         *  int
         *  <p>     0 - Invalid Tag Number
         *  <p>     1 - Required Tag Missing
         *  <p>     2 - Tag not defined for this message type
         *  <p>     3 - Undefined tag
         *  <p>     4 - Tag specified without a value
         */
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.INVALID_TAG_NUMBER);
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.REQUIRED_TAG_MISSING);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.TAG_NOT_DEFINED_FOR_MESSAGE_TYPE);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.UNDEFINED_TAG);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.TAG_SPECIFIED_WITHOUT_A_VALUE);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>     5 - Value is incorrect (out of range) for this tag
         *  <p>     6 - Incorrect data format for value
         *  <p>     7 - Decryption problem
         *  <p>     8 - Signature problem
         *  <p>     9 -  CompID problem
         */
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.INCORRECT_VALUE_FOR_TAG);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.INCORRECT_DATA_FORMAT);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.DECRYPTION_PROBLEM);
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.SIGNATURE_PROBLEM);
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.COMPID_PROBLEM);
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>     10 - SendingTime Accuracy Problem
         *  <p>     11 - Invalid MsgType
         *  <p>     12 - XML Validation Error
         *  <p>     13 - Tag appears more than once
         *  <p>     14 - Tag specified out of required order
         */
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.SENDINGTIME_ACCURACY_PROBLEM);
        assertEquals( "10", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.INVALID_MSGTYPE);
        assertEquals( "11", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.XML_VALIDATION_ERROR);
        assertEquals( "12", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.DUPLICATE_TAG);
        assertEquals( "13", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.TAG_SPECIFIED_OUT_OF_ORDER);
        assertEquals( "14", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>     15 - Repeating group fields out of order
         *  <p>     16 - Incorrect NumInGroup count for repeating group
         *  <p>     17 - Non "Data" value includes field delimiter (<SOH> character)
         */
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.REPEATING_GROUP_FIELDS_OUT_OF_ORDER);
        assertEquals( "15", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.INCORRECT_NUMINGROUP_COUNT);
        assertEquals( "16", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.VALUE_INCLUDES_FIELD_DELIMITER);
        assertEquals( "17", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>     99 - Other
         *  <p>     or any value conforming to the data type Reserved100Plus
         */
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.OTHER);
        assertEquals( "99", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum373SessionRejectReason oneEnum : Enum373SessionRejectReason.values()) {
            tagData = new Tag373EnuSessionRejectReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum373SessionRejectReason oneEnum : Enum373SessionRejectReason.values()) {
            tagData = new Tag373EnuSessionRejectReason(oneEnum);
            assertEquals( "Tag373EnuSessionRejectReason\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
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