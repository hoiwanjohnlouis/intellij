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

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum373SessionRejectReasonTest {
    @Test
    void Enum0373Test() {
        Enum373SessionRejectReason enumType;

        /**
         *  0-17, 99, msg types
         */


        /**
         *  0-17, msg types
         */
        enumType = Enum373SessionRejectReason.INVALID_TAG_NUMBER;
        assertEquals( "0", enumType.getID());
        assertEquals( "INVALID_TAG_NUMBER", enumType.getName());
        assertEquals( "0 - Invalid Tag Number", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum373SessionRejectReason.REQUIRED_TAG_MISSING;
        assertEquals( "1", enumType.getID());
        assertEquals( "REQUIRED_TAG_MISSING", enumType.getName());
        assertEquals( "1 - Required Tag Missing", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum373SessionRejectReason.TAG_NOT_DEFINED_FOR_THIS_MESSAGE_TYPE;
        assertEquals( "2", enumType.getID());
        assertEquals( "TAG_NOT_DEFINED_FOR_THIS_MESSAGE_TYPE", enumType.getName());
        assertEquals( "2 - Tag not defined for this message type", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum373SessionRejectReason.UNDEFINED_TAG;
        assertEquals( "3", enumType.getID());
        assertEquals( "UNDEFINED_TAG", enumType.getName());
        assertEquals( "3 - Undefined tag", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum373SessionRejectReason.TAG_SPECIFIED_WITHOUT_A_VALUE;
        assertEquals( "4", enumType.getID());
        assertEquals( "TAG_SPECIFIED_WITHOUT_A_VALUE", enumType.getName());
        assertEquals( "4 - Tag specified without a value", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum373SessionRejectReason.INCORRECT_VALUE_FOR_THIS_TAG;
        assertEquals( "5", enumType.getID());
        assertEquals( "INCORRECT_VALUE_FOR_THIS_TAG", enumType.getName());
        assertEquals( "5 - Value is incorrect (out of range) for this tag", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum373SessionRejectReason.INCORRECT_DATA_FORMAT;
        assertEquals( "6", enumType.getID());
        assertEquals( "INCORRECT_DATA_FORMAT", enumType.getName());
        assertEquals( "6 - Incorrect data format for value", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum373SessionRejectReason.DECRYPTION_PROBLEM;
        assertEquals( "7", enumType.getID());
        assertEquals( "DECRYPTION_PROBLEM", enumType.getName());
        assertEquals( "7 - Decryption problem", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum373SessionRejectReason.SIGNATURE_PROBLEM;
        assertEquals( "8", enumType.getID());
        assertEquals( "SIGNATURE_PROBLEM", enumType.getName());
        assertEquals( "8 - Signature problem", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum373SessionRejectReason.COMPID_PROBLEM;
        assertEquals( "9", enumType.getID());
        assertEquals( "COMPID_PROBLEM", enumType.getName());
        assertEquals( "9 -  CompID problem", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum373SessionRejectReason.SENDINGTIME_ACCURACY_PROBLEM;
        assertEquals( "10", enumType.getID());
        assertEquals( "SENDINGTIME_ACCURACY_PROBLEM", enumType.getName());
        assertEquals( "10 - SendingTime Accuracy Problem", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum373SessionRejectReason.INVALID_MSGTYPE;
        assertEquals( "11", enumType.getID());
        assertEquals( "INVALID_MSGTYPE", enumType.getName());
        assertEquals( "11 - Invalid MsgType", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum373SessionRejectReason.XML_VALIDATION_ERROR;
        assertEquals( "12", enumType.getID());
        assertEquals( "XML_VALIDATION_ERROR", enumType.getName());
        assertEquals( "12 - XML Validation Error", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum373SessionRejectReason.DUPLICATE_TAG;
        assertEquals( "13", enumType.getID());
        assertEquals( "DUPLICATE_TAG", enumType.getName());
        assertEquals( "13 - Tag appears more than once", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum373SessionRejectReason.TAG_SPECIFIED_OUT_OF_ORDER;
        assertEquals( "14", enumType.getID());
        assertEquals( "TAG_SPECIFIED_OUT_OF_ORDER", enumType.getName());
        assertEquals( "14 - Tag specified out of required order", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum373SessionRejectReason.REPEATING_GROUP_FIELDS_OUT_OF_ORDER;
        assertEquals( "15", enumType.getID());
        assertEquals( "REPEATING_GROUP_FIELDS_OUT_OF_ORDER", enumType.getName());
        assertEquals( "15 - Repeating group fields out of order", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum373SessionRejectReason.INCORRECT_NUMINGROUP_COUNT;
        assertEquals( "16", enumType.getID());
        assertEquals( "INCORRECT_NUMINGROUP_COUNT", enumType.getName());
        assertEquals( "16 - Incorrect NumInGroup count for repeating group", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum373SessionRejectReason.VALUE_INCLUDES_FIELD_DELIMITER;
        assertEquals( "17", enumType.getID());
        assertEquals( "VALUE_INCLUDES_FIELD_DELIMITER", enumType.getName());
        assertEquals( "17 - Non *Data* value includes field delimiter (<SOH> character)",
                enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());



        /**
         *  99, msg types
         */
        enumType = Enum373SessionRejectReason.OTHER;
        assertEquals( "99", enumType.getID());
        assertEquals( "OTHER", enumType.getName());
        assertEquals( "99 - Other", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}