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

package com.hwtsllc.fixengine.tags.fix42.enums;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
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
class Enum373SessionRejectReasonTest {
    @Test
    void Enum0373Test() {
        Enum373SessionRejectReason enumType;

        /*
         *  0-17, 99, msg types
         */


        /*
         *  0-17, msg types
         */
        enumType = Enum373SessionRejectReason.INVALID_TAG_NUMBER;
        assertEquals( "0", enumType.toFIXIDString());
        assertEquals( "INVALID_TAG_NUMBER", enumType.toFIXNameString());
        assertEquals( "0 - Invalid Tag Number", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.REQUIRED_TAG_MISSING;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "REQUIRED_TAG_MISSING", enumType.toFIXNameString());
        assertEquals( "1 - Required Tag Missing", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.TAG_NOT_DEFINED_FOR_MESSAGE_TYPE;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "TAG_NOT_DEFINED_FOR_THIS_MESSAGE_TYPE", enumType.toFIXNameString());
        assertEquals( "2 - Tag not defined for this message type", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.UNDEFINED_TAG;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "UNDEFINED_TAG", enumType.toFIXNameString());
        assertEquals( "3 - Undefined tag", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.TAG_SPECIFIED_WITHOUT_A_VALUE;
        assertEquals( "4", enumType.toFIXIDString());
        assertEquals( "TAG_SPECIFIED_WITHOUT_A_VALUE", enumType.toFIXNameString());
        assertEquals( "4 - Tag specified without a value", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.INCORRECT_VALUE_FOR_TAG;
        assertEquals( "5", enumType.toFIXIDString());
        assertEquals( "INCORRECT_VALUE_FOR_THIS_TAG", enumType.toFIXNameString());
        assertEquals( "5 - Value is incorrect (out of range) for this tag", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.INCORRECT_DATA_FORMAT;
        assertEquals( "6", enumType.toFIXIDString());
        assertEquals( "INCORRECT_DATA_FORMAT", enumType.toFIXNameString());
        assertEquals( "6 - Incorrect data format for value", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.DECRYPTION_PROBLEM;
        assertEquals( "7", enumType.toFIXIDString());
        assertEquals( "DECRYPTION_PROBLEM", enumType.toFIXNameString());
        assertEquals( "7 - Decryption problem", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.SIGNATURE_PROBLEM;
        assertEquals( "8", enumType.toFIXIDString());
        assertEquals( "SIGNATURE_PROBLEM", enumType.toFIXNameString());
        assertEquals( "8 - Signature problem", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.COMPID_PROBLEM;
        assertEquals( "9", enumType.toFIXIDString());
        assertEquals( "COMPID_PROBLEM", enumType.toFIXNameString());
        assertEquals( "9 -  CompID problem", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.SENDINGTIME_ACCURACY_PROBLEM;
        assertEquals( "10", enumType.toFIXIDString());
        assertEquals( "SENDINGTIME_ACCURACY_PROBLEM", enumType.toFIXNameString());
        assertEquals( "10 - SendingTime Accuracy Problem", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.INVALID_MSGTYPE;
        assertEquals( "11", enumType.toFIXIDString());
        assertEquals( "INVALID_MSGTYPE", enumType.toFIXNameString());
        assertEquals( "11 - Invalid MsgType", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.XML_VALIDATION_ERROR;
        assertEquals( "12", enumType.toFIXIDString());
        assertEquals( "XML_VALIDATION_ERROR", enumType.toFIXNameString());
        assertEquals( "12 - XML Validation Error", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.DUPLICATE_TAG;
        assertEquals( "13", enumType.toFIXIDString());
        assertEquals( "DUPLICATE_TAG", enumType.toFIXNameString());
        assertEquals( "13 - Tag appears more than once", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.TAG_SPECIFIED_OUT_OF_ORDER;
        assertEquals( "14", enumType.toFIXIDString());
        assertEquals( "TAG_SPECIFIED_OUT_OF_ORDER", enumType.toFIXNameString());
        assertEquals( "14 - Tag specified out of required order", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.REPEATING_GROUP_FIELDS_OUT_OF_ORDER;
        assertEquals( "15", enumType.toFIXIDString());
        assertEquals( "REPEATING_GROUP_FIELDS_OUT_OF_ORDER", enumType.toFIXNameString());
        assertEquals( "15 - Repeating group fields out of order", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.INCORRECT_NUMINGROUP_COUNT;
        assertEquals( "16", enumType.toFIXIDString());
        assertEquals( "INCORRECT_NUMINGROUP_COUNT", enumType.toFIXNameString());
        assertEquals( "16 - Incorrect NumInGroup count for repeating group", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.VALUE_INCLUDES_FIELD_DELIMITER;
        assertEquals( "17", enumType.toFIXIDString());
        assertEquals( "VALUE_INCLUDES_FIELD_DELIMITER", enumType.toFIXNameString());
        assertEquals( "17 - Non *Data* value includes field delimiter (<SOH> character)",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());



        /*
         *  99, msg types
         */
        enumType = Enum373SessionRejectReason.OTHER;
        assertEquals( "99", enumType.toFIXIDString());
        assertEquals( "OTHER", enumType.toFIXNameString());
        assertEquals( "99 - Other", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}