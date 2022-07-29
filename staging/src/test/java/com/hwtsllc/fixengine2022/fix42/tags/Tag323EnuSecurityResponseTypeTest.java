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

/**
 *  323
 *  SecurityResponseType
 *  int
 *  <p>
 *  Type of Security Definition message response.
 *  <p></p>
 *  Valid values:
 *  <p>    1-6 msg types
 *  <p>    "1 - Accept security proposal as-is"
 *  <p>    "2 - Accept security proposal with revisions as indicated in the message"
 *  <p>    "3 - List of security types returned per request"
 *  <p>    "4 - List of securities returned per request"
 *  <p>    "5 - Reject security proposal"
 *  <p></p>
 *  <p>    "6 - Cannot match selection criteria"
 */
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
            assertEquals( "FIX323_ENU_SECURITY_RESPONSE_TYPE", tagData.toEnumLabelString());
            assertEquals( "323", tagData.toEnumIDString());
            assertEquals( "SECURITY_RESPONSE_TYPE", tagData.toEnumNameString());
            assertEquals( "SecurityResponseType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         * 1-6 msg types
         */
        tagData = new Tag323EnuSecurityResponseType(Enum323SecurityResponseType.ACCEPT_SECURITY_AS_IS);
        assertEquals( Enum323SecurityResponseType.ACCEPT_SECURITY_AS_IS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag323EnuSecurityResponseType(Enum323SecurityResponseType.ACCEPT_SECURITY_REVISIONS);
        assertEquals( Enum323SecurityResponseType.ACCEPT_SECURITY_REVISIONS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag323EnuSecurityResponseType(Enum323SecurityResponseType.LIST_OF_SECURITY_TYPES_RETURNED);
        assertEquals( Enum323SecurityResponseType.LIST_OF_SECURITY_TYPES_RETURNED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag323EnuSecurityResponseType(Enum323SecurityResponseType.LIST_OF_SECURITIES_RETURNED_PER_REQUEST);
        assertEquals( Enum323SecurityResponseType.LIST_OF_SECURITIES_RETURNED_PER_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag323EnuSecurityResponseType(Enum323SecurityResponseType.REJECT_SECURITY_PROPOSAL);
        assertEquals( Enum323SecurityResponseType.REJECT_SECURITY_PROPOSAL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag323EnuSecurityResponseType(Enum323SecurityResponseType.CANNOT_MATCH_SELECTION);
        assertEquals( Enum323SecurityResponseType.CANNOT_MATCH_SELECTION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( Enum323SecurityResponseType oneEnum : Enum323SecurityResponseType.values()) {
            tagData = new Tag323EnuSecurityResponseType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum323SecurityResponseType oneEnum : Enum323SecurityResponseType.values()) {
            tagData = new Tag323EnuSecurityResponseType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
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
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}