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

import com.hwtsllc.fixengine2022.fix42.enums.Enum380BusinessRejectReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag380EnuBusinessRejectReasonTest {
    Tag380EnuBusinessRejectReason tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum380BusinessRejectReason oneEnum : Enum380BusinessRejectReason.values()) {
            tagData = new Tag380EnuBusinessRejectReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum380BusinessRejectReason oneEnum : Enum380BusinessRejectReason.values()) {
            tagData = new Tag380EnuBusinessRejectReason(oneEnum);
            assertEquals( "FIX380_ENU_BUSINESS_REJECT_REASON", tagData.toFIXLabelString());
            assertEquals( "380", tagData.toFIXIDString());
            assertEquals( "BUSINESS_REJECT_REASON", tagData.toEnumNameString());
            assertEquals( "BusinessRejectReason", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum380BusinessRejectReason oneEnum : Enum380BusinessRejectReason.values()) {
            tagData = new Tag380EnuBusinessRejectReason(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  380
         *  BusinessRejectReason
         *  int
         *  <p>     0 - Other
         *  <p>     1 - Unknown ID
         *  <p>     2 - Unknown Security
         *  <p>     3 - Unknown Message Type
         *  <p>     4 - Application not available
         */
        tagData = new Tag380EnuBusinessRejectReason(Enum380BusinessRejectReason.OTHER);
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag380EnuBusinessRejectReason(Enum380BusinessRejectReason.UNKNOWN_ID);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag380EnuBusinessRejectReason(Enum380BusinessRejectReason.UNKNOWN_SECURITY);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag380EnuBusinessRejectReason(Enum380BusinessRejectReason.UNKNOWN_MESSAGE_TYPE);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag380EnuBusinessRejectReason(Enum380BusinessRejectReason.APPLICATION_NOT_AVAILABLE);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>     5 - Conditionally required field missing
         *  <p>     6 - Not Authorized
         *  <p>     7 - DeliverTo firm not available at this time
         */
        tagData = new Tag380EnuBusinessRejectReason(Enum380BusinessRejectReason.REQUIRED_FIELD_MISSING);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag380EnuBusinessRejectReason(Enum380BusinessRejectReason.NOT_AUTHORIZED);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag380EnuBusinessRejectReason(Enum380BusinessRejectReason.DELIVERTO_FIRM_NOT_AVAILABLE);
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>     18 - Invalid price increment
         */
        tagData = new Tag380EnuBusinessRejectReason(Enum380BusinessRejectReason.INVALID_PRICE_INCREMENT);
        assertEquals( "18", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum380BusinessRejectReason oneEnum : Enum380BusinessRejectReason.values()) {
            tagData = new Tag380EnuBusinessRejectReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum380BusinessRejectReason oneEnum : Enum380BusinessRejectReason.values()) {
            tagData = new Tag380EnuBusinessRejectReason(oneEnum);
            assertEquals( "Tag380EnuBusinessRejectReason\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
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