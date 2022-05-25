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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix42.enums.Enum373SessionRejectReason;
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
        assertEquals( "373", fixData.toFIXIDString());
        assertEquals( "SESSION_REJECT_REASON", fixData.toFIXNameString());
        assertEquals( "SessionRejectReason", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0373Test() {
        Tag373EnuSessionRejectReason tagData;

        /*
         * 0-17, 99 msg types
         */
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.INVALID_TAG_NUMBER);
        assertEquals( Enum373SessionRejectReason.INVALID_TAG_NUMBER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.REQUIRED_TAG_MISSING);
        assertEquals( Enum373SessionRejectReason.REQUIRED_TAG_MISSING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.TAG_NOT_DEFINED_FOR_MESSAGE_TYPE);
        assertEquals( Enum373SessionRejectReason.TAG_NOT_DEFINED_FOR_MESSAGE_TYPE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.UNDEFINED_TAG);
        assertEquals( Enum373SessionRejectReason.UNDEFINED_TAG.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.TAG_SPECIFIED_WITHOUT_A_VALUE);
        assertEquals( Enum373SessionRejectReason.TAG_SPECIFIED_WITHOUT_A_VALUE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.INCORRECT_VALUE_FOR_TAG);
        assertEquals( Enum373SessionRejectReason.INCORRECT_VALUE_FOR_TAG.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.INCORRECT_DATA_FORMAT);
        assertEquals( Enum373SessionRejectReason.INCORRECT_DATA_FORMAT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.DECRYPTION_PROBLEM);
        assertEquals( Enum373SessionRejectReason.DECRYPTION_PROBLEM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.SIGNATURE_PROBLEM);
        assertEquals( Enum373SessionRejectReason.SIGNATURE_PROBLEM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.COMPID_PROBLEM);
        assertEquals( Enum373SessionRejectReason.COMPID_PROBLEM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.SENDINGTIME_ACCURACY_PROBLEM);
        assertEquals( Enum373SessionRejectReason.SENDINGTIME_ACCURACY_PROBLEM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.INVALID_MSGTYPE);
        assertEquals( Enum373SessionRejectReason.INVALID_MSGTYPE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.XML_VALIDATION_ERROR);
        assertEquals( Enum373SessionRejectReason.XML_VALIDATION_ERROR.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.DUPLICATE_TAG);
        assertEquals( Enum373SessionRejectReason.DUPLICATE_TAG.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.TAG_SPECIFIED_OUT_OF_ORDER);
        assertEquals( Enum373SessionRejectReason.TAG_SPECIFIED_OUT_OF_ORDER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.REPEATING_GROUP_FIELDS_OUT_OF_ORDER);
        assertEquals( Enum373SessionRejectReason.REPEATING_GROUP_FIELDS_OUT_OF_ORDER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.INCORRECT_NUMINGROUP_COUNT);
        assertEquals( Enum373SessionRejectReason.INCORRECT_NUMINGROUP_COUNT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.VALUE_INCLUDES_FIELD_DELIMITER);
        assertEquals( Enum373SessionRejectReason.VALUE_INCLUDES_FIELD_DELIMITER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag373EnuSessionRejectReason(Enum373SessionRejectReason.OTHER);
        assertEquals( Enum373SessionRejectReason.OTHER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}