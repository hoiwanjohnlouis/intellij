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
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import com.hwtsllc.fixengine2022.fix42.enums.Enum373SessionRejectReason;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag373EnuSessionRejectReasonTest {
    @Test
    void FIX0373Test() {
        FIX42 fixData = FIX42.FIX373_ENU_SESSION_REJECT_REASON;
        assertEquals( "373", fixData.getID());
        assertEquals( "SESSION_REJECT_REASON", fixData.getName());
        assertEquals( "SessionRejectReason", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
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
    @Test
    void Tag0373Test() {
        Tag373EnuSessionRejectReason tagData;

        /**
         * 0-17, 99 msg types
         */
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.INVALID_TAG_NUMBER);
        assertEquals( Enum373SessionRejectReason.INVALID_TAG_NUMBER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.REQUIRED_TAG_MISSING);
        assertEquals( Enum373SessionRejectReason.REQUIRED_TAG_MISSING.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.TAG_NOT_DEFINED_FOR_MESSAGE_TYPE);
        assertEquals( Enum373SessionRejectReason.TAG_NOT_DEFINED_FOR_MESSAGE_TYPE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.UNDEFINED_TAG);
        assertEquals( Enum373SessionRejectReason.UNDEFINED_TAG.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.TAG_SPECIFIED_WITHOUT_A_VALUE);
        assertEquals( Enum373SessionRejectReason.TAG_SPECIFIED_WITHOUT_A_VALUE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.INCORRECT_VALUE_FOR_TAG);
        assertEquals( Enum373SessionRejectReason.INCORRECT_VALUE_FOR_TAG.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.INCORRECT_DATA_FORMAT);
        assertEquals( Enum373SessionRejectReason.INCORRECT_DATA_FORMAT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.DECRYPTION_PROBLEM);
        assertEquals( Enum373SessionRejectReason.DECRYPTION_PROBLEM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.SIGNATURE_PROBLEM);
        assertEquals( Enum373SessionRejectReason.SIGNATURE_PROBLEM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.COMPID_PROBLEM);
        assertEquals( Enum373SessionRejectReason.COMPID_PROBLEM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.SENDINGTIME_ACCURACY_PROBLEM);
        assertEquals( Enum373SessionRejectReason.SENDINGTIME_ACCURACY_PROBLEM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.INVALID_MSGTYPE);
        assertEquals( Enum373SessionRejectReason.INVALID_MSGTYPE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.XML_VALIDATION_ERROR);
        assertEquals( Enum373SessionRejectReason.XML_VALIDATION_ERROR.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.DUPLICATE_TAG);
        assertEquals( Enum373SessionRejectReason.DUPLICATE_TAG.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.TAG_SPECIFIED_OUT_OF_ORDER);
        assertEquals( Enum373SessionRejectReason.TAG_SPECIFIED_OUT_OF_ORDER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.REPEATING_GROUP_FIELDS_OUT_OF_ORDER);
        assertEquals( Enum373SessionRejectReason.REPEATING_GROUP_FIELDS_OUT_OF_ORDER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.INCORRECT_NUMINGROUP_COUNT);
        assertEquals( Enum373SessionRejectReason.INCORRECT_NUMINGROUP_COUNT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.VALUE_INCLUDES_FIELD_DELIMITER);
        assertEquals( Enum373SessionRejectReason.VALUE_INCLUDES_FIELD_DELIMITER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.OTHER);
        assertEquals( Enum373SessionRejectReason.OTHER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}