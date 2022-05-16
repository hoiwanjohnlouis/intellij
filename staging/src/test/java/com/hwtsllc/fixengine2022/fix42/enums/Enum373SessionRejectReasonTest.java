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

package com.hwtsllc.fixengine2022.fix42.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  Tag373
 *  Enu
 *  SessionRejectReason
 *
 *      0-17, 99 msg types
 *      INVALID_TAG_NUMBER( "0", "INVALID_TAG_NUMBER", "0 - Invalid Tag Number" ),
 *      REQUIRED_TAG_MISSING( "1", "REQUIRED_TAG_MISSING", "1 - Required Tag Missing" ),
 *      TAG_NOT_DEFINED_FOR_MESSAGE_TYPE( "2", "TAG_NOT_DEFINED_FOR_MESSAGE_TYPE",
 *                          "2 - Tag not defined for this message type" ),
 *      UNDEFINED_TAG( "3", "UNDEFINED_TAG", "3 - Undefined tag" ),
 *      TAG_SPECIFIED_WITHOUT_A_VALUE( "4", "TAG_SPECIFIED_WITHOUT_A_VALUE",
 *                          "4 - Tag specified without a value" ),
 *      INCORRECT_VALUE_FOR_THIS_TAG( "5", "INCORRECT_VALUE_FOR_THIS_TAG",
 *                          "5 - Value is incorrect (out of range) for this tag" ),
 *      INCORRECT_DATA_FORMAT( "6", "INCORRECT_DATA_FORMAT", "6 - Incorrect data format for value" ),
 *      DECRYPTION_PROBLEM( "7", "DECRYPTION_PROBLEM", "7 - Decryption problem" ),
 *      SIGNATURE_PROBLEM( "8", "SIGNATURE_PROBLEM", "8 - Signature problem" ),
 *      COMPID_PROBLEM( "9", "COMPID_PROBLEM", "9 -  CompID problem" ),
 *      SENDINGTIME_ACCURACY_PROBLEM( "10", "SENDINGTIME_ACCURACY_PROBLEM", "10 - SendingTime Accuracy Problem" ),
 *      INVALID_MSGTYPE( "11", "INVALID_MSGTYPE", "11 - Invalid MsgType" ),
 *      XML_VALIDATION_ERROR( "12", "XML_VALIDATION_ERROR", "12 - XML Validation Error" ),
 *      DUPLICATE_TAG( "13", "DUPLICATE_TAG", "13 - Tag appears more than once" ),
 *      TAG_SPECIFIED_OUT_OF_ORDER( "14", "TAG_SPECIFIED_OUT_OF_ORDER",
 *                          "14 - Tag specified out of required order" ),
 *      REPEATING_GROUP_FIELDS_OUT_OF_ORDER( "15", "REPEATING_GROUP_FIELDS_OUT_OF_ORDER",
 *                          "15 - Repeating group fields out of order" ),
 *      INCORRECT_NUMINGROUP_COUNT( "16", "INCORRECT_NUMINGROUP_COUNT",
 *                          "16 - Incorrect NumInGroup count for repeating group" ),
 *      VALUE_INCLUDES_FIELD_DELIMITER( "17", "VALUE_INCLUDES_FIELD_DELIMITER",
 *                          "17 - Non *Data* value includes field delimiter (<SOH> character)" ),
 *      OTHER( "99", "OTHER", "99 - Other" ),
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
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.REQUIRED_TAG_MISSING;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "REQUIRED_TAG_MISSING", enumType.toFIXNameString());
        assertEquals( "1 - Required Tag Missing", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.TAG_NOT_DEFINED_FOR_MESSAGE_TYPE;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "TAG_NOT_DEFINED_FOR_THIS_MESSAGE_TYPE", enumType.toFIXNameString());
        assertEquals( "2 - Tag not defined for this message type", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.UNDEFINED_TAG;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "UNDEFINED_TAG", enumType.toFIXNameString());
        assertEquals( "3 - Undefined tag", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.TAG_SPECIFIED_WITHOUT_A_VALUE;
        assertEquals( "4", enumType.toFIXIDString());
        assertEquals( "TAG_SPECIFIED_WITHOUT_A_VALUE", enumType.toFIXNameString());
        assertEquals( "4 - Tag specified without a value", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.INCORRECT_VALUE_FOR_TAG;
        assertEquals( "5", enumType.toFIXIDString());
        assertEquals( "INCORRECT_VALUE_FOR_THIS_TAG", enumType.toFIXNameString());
        assertEquals( "5 - Value is incorrect (out of range) for this tag", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.INCORRECT_DATA_FORMAT;
        assertEquals( "6", enumType.toFIXIDString());
        assertEquals( "INCORRECT_DATA_FORMAT", enumType.toFIXNameString());
        assertEquals( "6 - Incorrect data format for value", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.DECRYPTION_PROBLEM;
        assertEquals( "7", enumType.toFIXIDString());
        assertEquals( "DECRYPTION_PROBLEM", enumType.toFIXNameString());
        assertEquals( "7 - Decryption problem", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.SIGNATURE_PROBLEM;
        assertEquals( "8", enumType.toFIXIDString());
        assertEquals( "SIGNATURE_PROBLEM", enumType.toFIXNameString());
        assertEquals( "8 - Signature problem", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.COMPID_PROBLEM;
        assertEquals( "9", enumType.toFIXIDString());
        assertEquals( "COMPID_PROBLEM", enumType.toFIXNameString());
        assertEquals( "9 -  CompID problem", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.SENDINGTIME_ACCURACY_PROBLEM;
        assertEquals( "10", enumType.toFIXIDString());
        assertEquals( "SENDINGTIME_ACCURACY_PROBLEM", enumType.toFIXNameString());
        assertEquals( "10 - SendingTime Accuracy Problem", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.INVALID_MSGTYPE;
        assertEquals( "11", enumType.toFIXIDString());
        assertEquals( "INVALID_MSGTYPE", enumType.toFIXNameString());
        assertEquals( "11 - Invalid MsgType", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.XML_VALIDATION_ERROR;
        assertEquals( "12", enumType.toFIXIDString());
        assertEquals( "XML_VALIDATION_ERROR", enumType.toFIXNameString());
        assertEquals( "12 - XML Validation Error", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.DUPLICATE_TAG;
        assertEquals( "13", enumType.toFIXIDString());
        assertEquals( "DUPLICATE_TAG", enumType.toFIXNameString());
        assertEquals( "13 - Tag appears more than once", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.TAG_SPECIFIED_OUT_OF_ORDER;
        assertEquals( "14", enumType.toFIXIDString());
        assertEquals( "TAG_SPECIFIED_OUT_OF_ORDER", enumType.toFIXNameString());
        assertEquals( "14 - Tag specified out of required order", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.REPEATING_GROUP_FIELDS_OUT_OF_ORDER;
        assertEquals( "15", enumType.toFIXIDString());
        assertEquals( "REPEATING_GROUP_FIELDS_OUT_OF_ORDER", enumType.toFIXNameString());
        assertEquals( "15 - Repeating group fields out of order", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.INCORRECT_NUMINGROUP_COUNT;
        assertEquals( "16", enumType.toFIXIDString());
        assertEquals( "INCORRECT_NUMINGROUP_COUNT", enumType.toFIXNameString());
        assertEquals( "16 - Incorrect NumInGroup count for repeating group", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum373SessionRejectReason.VALUE_INCLUDES_FIELD_DELIMITER;
        assertEquals( "17", enumType.toFIXIDString());
        assertEquals( "VALUE_INCLUDES_FIELD_DELIMITER", enumType.toFIXNameString());
        assertEquals( "17 - Non *Data* value includes field delimiter (<SOH> character)",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
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
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
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