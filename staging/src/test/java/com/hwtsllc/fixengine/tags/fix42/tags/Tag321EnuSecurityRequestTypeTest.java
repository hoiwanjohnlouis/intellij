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

import com.hwtsllc.fixengine2022.fix42.enums.Enum321SecurityRequestType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag321EnuSecurityRequestTypeTest {
    Tag321EnuSecurityRequestType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum321SecurityRequestType oneEnum : Enum321SecurityRequestType.values()) {
            tagData = new Tag321EnuSecurityRequestType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum321SecurityRequestType oneEnum : Enum321SecurityRequestType.values()) {
            tagData = new Tag321EnuSecurityRequestType(oneEnum);
            assertEquals( "FIX321_ENU_SECURITY_REQUEST_TYPE", tagData.toFIXLabelString());
            assertEquals( "321", tagData.toFIXIDString());
            assertEquals( "SECURITY_REQUEST_TYPE", tagData.toFIXNameString());
            assertEquals( "SecurityRequestType", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum321SecurityRequestType oneEnum : Enum321SecurityRequestType.values()) {
            tagData = new Tag321EnuSecurityRequestType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  321
         *  SecurityRequestType
         *  int
         *  <p>    0-3 msg types
         *  <p>    "0 - Request Security identity and specifications"
         *  <p>    "1 - Request Security identity for the specifications provided
         *          (name of the security is not supplied)"
         *  <p>    "2 - Request List Security Types" ),
         *  <p>    "3 - Request List Securities (can be qualified with Symbol, SecurityType,
         *          TradingSessionID, SecurityExchange.
         *          If provided, then only list Securities for the specific type.)"
         */
        tagData = new Tag321EnuSecurityRequestType(Enum321SecurityRequestType.REQUEST_SECURITY_IDENTITY);
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag321EnuSecurityRequestType(Enum321SecurityRequestType.REQUEST_SPECIFIED_SECURITY);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag321EnuSecurityRequestType(Enum321SecurityRequestType.REQUEST_LIST_SECURITY_TYPES);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag321EnuSecurityRequestType(Enum321SecurityRequestType.REQUEST_LIST_SECURITIES);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum321SecurityRequestType oneEnum : Enum321SecurityRequestType.values()) {
            tagData = new Tag321EnuSecurityRequestType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum321SecurityRequestType oneEnum : Enum321SecurityRequestType.values()) {
            tagData = new Tag321EnuSecurityRequestType(oneEnum);
            assertEquals( "Tag321EnuSecurityRequestType\n" +
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