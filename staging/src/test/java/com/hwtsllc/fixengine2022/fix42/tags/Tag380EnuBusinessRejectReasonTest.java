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
import com.hwtsllc.fixengine2022.fix42.enums.Enum380BusinessRejectReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  380
 *  BusinessRejectReason
 *  int
 *  <p>
 *  Code to identify reason for a Business Message Reject message.
 *  <p></p>
 *  Valid values:
 *  <p>     0 - Other
 *  <p>     1 - Unknown ID
 *  <p>     2 - Unknown Security
 *  <p>     3 - Unknown Message Type
 *  <p>     4 - Application not available
 *  <p></p>
 *  <p>     5 - Conditionally required field missing
 *  <p>     6 - Not Authorized
 *  <p>     7 - DeliverTo firm not available at this time
 *  <p>     18 - Invalid price increment
 */
class Tag380EnuBusinessRejectReasonTest {
    @Test
    void FIX0380Test() {
        FIX42 fixData = FIX42.FIX380_ENU_BUSINESS_REJECT_REASON;
        assertEquals( "380", fixData.toEnumIDString());
        assertEquals( "BUSINESS_REJECT_REASON", fixData.toEnumNameString());
        assertEquals( "BusinessRejectReason", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0380Test() {
        Tag380EnuBusinessRejectReason tagData;

        /*
         * 0-7, 18 msg types
         */
        tagData = new Tag380EnuBusinessRejectReason(Enum380BusinessRejectReason.OTHER);
        assertEquals( Enum380BusinessRejectReason.OTHER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag380EnuBusinessRejectReason(Enum380BusinessRejectReason.UNKNOWN_ID);
        assertEquals( Enum380BusinessRejectReason.UNKNOWN_ID.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag380EnuBusinessRejectReason(Enum380BusinessRejectReason.UNKNOWN_SECURITY);
        assertEquals( Enum380BusinessRejectReason.UNKNOWN_SECURITY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag380EnuBusinessRejectReason(Enum380BusinessRejectReason.UNKNOWN_MESSAGE_TYPE);
        assertEquals( Enum380BusinessRejectReason.UNKNOWN_MESSAGE_TYPE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag380EnuBusinessRejectReason(Enum380BusinessRejectReason.APPLICATION_NOT_AVAILABLE);
        assertEquals( Enum380BusinessRejectReason.APPLICATION_NOT_AVAILABLE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag380EnuBusinessRejectReason(Enum380BusinessRejectReason.REQUIRED_FIELD_MISSING);
        assertEquals( Enum380BusinessRejectReason.REQUIRED_FIELD_MISSING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag380EnuBusinessRejectReason(Enum380BusinessRejectReason.NOT_AUTHORIZED);
        assertEquals( Enum380BusinessRejectReason.NOT_AUTHORIZED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag380EnuBusinessRejectReason(Enum380BusinessRejectReason.DELIVERTO_FIRM_NOT_AVAILABLE);
        assertEquals( Enum380BusinessRejectReason.DELIVERTO_FIRM_NOT_AVAILABLE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag380EnuBusinessRejectReason(Enum380BusinessRejectReason.INVALID_PRICE_INCREMENT);
        assertEquals( Enum380BusinessRejectReason.INVALID_PRICE_INCREMENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag380EnuBusinessRejectReason tagData;

        // loop around the ENUM and process
        for (Enum380BusinessRejectReason oneEnum : Enum380BusinessRejectReason.values()) {
            tagData = new Tag380EnuBusinessRejectReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag380EnuBusinessRejectReason tagData;

        // loop around the ENUM and process
        for (Enum380BusinessRejectReason oneEnum : Enum380BusinessRejectReason.values()) {
            tagData = new Tag380EnuBusinessRejectReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag380EnuBusinessRejectReason tagData;

        // loop around the ENUM and process
        for (Enum380BusinessRejectReason oneEnum : Enum380BusinessRejectReason.values()) {
            tagData = new Tag380EnuBusinessRejectReason(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag380EnuBusinessRejectReason tagData;

        // loop around the ENUM and process
        for (Enum380BusinessRejectReason oneEnum : Enum380BusinessRejectReason.values()) {
            tagData = new Tag380EnuBusinessRejectReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag380EnuBusinessRejectReason tagData;

        // loop around the ENUM and process
        for (Enum380BusinessRejectReason oneEnum : Enum380BusinessRejectReason.values()) {
            tagData = new Tag380EnuBusinessRejectReason(oneEnum);
            assertEquals( "Tag380EnuBusinessRejectReason\n" +
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