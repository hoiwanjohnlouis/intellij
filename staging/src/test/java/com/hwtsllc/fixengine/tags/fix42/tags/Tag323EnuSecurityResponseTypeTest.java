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

import com.hwtsllc.fixengine2022.fix42.enums.Enum323SecurityResponseType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag323EnuSecurityResponseTypeTest {
    Tag323EnuSecurityResponseType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum323SecurityResponseType oneEnum : Enum323SecurityResponseType.values()) {
            tagData = new Tag323EnuSecurityResponseType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum323SecurityResponseType oneEnum : Enum323SecurityResponseType.values()) {
            tagData = new Tag323EnuSecurityResponseType(oneEnum);
            assertEquals( "FIX323_ENU_SECURITY_RESPONSE_TYPE", tagData.toFIXLabelString());
            assertEquals( "323", tagData.toFIXIDString());
            assertEquals( "SECURITY_RESPONSE_TYPE", tagData.toFIXNameString());
            assertEquals( "SecurityResponseType", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum323SecurityResponseType oneEnum : Enum323SecurityResponseType.values()) {
            tagData = new Tag323EnuSecurityResponseType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  323
         *  SecurityResponseType
         *  int
         *  <p>    1-6 msg types
         *  <p>    "1 - Accept security proposal as-is"
         *  <p>    "2 - Accept security proposal with revisions as indicated in the message"
         *  <p>    "3 - List of security types returned per request"
         *  <p>    "4 - List of securities returned per request"
         *  <p>    "5 - Reject security proposal"
         */
        tagData = new Tag323EnuSecurityResponseType(Enum323SecurityResponseType.ACCEPT_SECURITY_AS_IS);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag323EnuSecurityResponseType(Enum323SecurityResponseType.ACCEPT_SECURITY_REVISIONS);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag323EnuSecurityResponseType(Enum323SecurityResponseType.LIST_OF_SECURITY_TYPES_RETURNED);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag323EnuSecurityResponseType(Enum323SecurityResponseType.LIST_OF_SECURITIES_RETURNED_PER_REQUEST);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag323EnuSecurityResponseType(Enum323SecurityResponseType.REJECT_SECURITY_PROPOSAL);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "6 - Cannot match selection criteria"
         */
        tagData = new Tag323EnuSecurityResponseType(Enum323SecurityResponseType.CANNOT_MATCH_SELECTION);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum323SecurityResponseType oneEnum : Enum323SecurityResponseType.values()) {
            tagData = new Tag323EnuSecurityResponseType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum323SecurityResponseType oneEnum : Enum323SecurityResponseType.values()) {
            tagData = new Tag323EnuSecurityResponseType(oneEnum);
            assertEquals( "Tag323EnuSecurityResponseType\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
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