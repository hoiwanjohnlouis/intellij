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
import com.hwtsllc.fixengine2022.fix42.enums.Enum321SecurityRequestType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  321
 *  SecurityRequestType
 *  int
 *  <p>
 *  Type of Security Definition Request.
 *  <p></p>
 *  Valid values:
 *  <p>    0-3 msg types
 *  <p>    "0 - Request Security identity and specifications"
 *  <p>    "1 - Request Security identity for the specifications provided
 *          (name of the security is not supplied)"
 *  <p>    "2 - Request List Security Types" ),
 *  <p>    "3 - Request List Securities (can be qualified with Symbol, SecurityType,
 *          TradingSessionID, SecurityExchange.
 *          If provided, then only list Securities for the specific type.)"
 */
class Tag321EnuSecurityRequestTypeTest {
    @Test
    void FIX0321Test() {
        FIX42 fixData = FIX42.FIX321_ENU_SECURITY_REQUEST_TYPE;
        assertEquals( "321", fixData.toEnumIDString());
        assertEquals( "SECURITY_REQUEST_TYPE", fixData.toEnumNameString());
        assertEquals( "SecurityRequestType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0321Test() {
        Tag321EnuSecurityRequestType tagData;

        /*
         * 0-3 msg types
         */
        tagData = new Tag321EnuSecurityRequestType(Enum321SecurityRequestType.REQUEST_SECURITY_IDENTITY);
        assertEquals( Enum321SecurityRequestType.REQUEST_SECURITY_IDENTITY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag321EnuSecurityRequestType(Enum321SecurityRequestType.REQUEST_SPECIFIED_SECURITY);
        assertEquals( Enum321SecurityRequestType.REQUEST_SPECIFIED_SECURITY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag321EnuSecurityRequestType(Enum321SecurityRequestType.REQUEST_LIST_SECURITY_TYPES);
        assertEquals( Enum321SecurityRequestType.REQUEST_LIST_SECURITY_TYPES.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag321EnuSecurityRequestType(Enum321SecurityRequestType.REQUEST_LIST_SECURITIES);
        assertEquals( Enum321SecurityRequestType.REQUEST_LIST_SECURITIES.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag321EnuSecurityRequestType tagData;

        // loop around the ENUM and process
        for (Enum321SecurityRequestType oneEnum : Enum321SecurityRequestType.values()) {
            tagData = new Tag321EnuSecurityRequestType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag321EnuSecurityRequestType tagData;

        // loop around the ENUM and process
        for (Enum321SecurityRequestType oneEnum : Enum321SecurityRequestType.values()) {
            tagData = new Tag321EnuSecurityRequestType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag321EnuSecurityRequestType tagData;

        // loop around the ENUM and process
        for (Enum321SecurityRequestType oneEnum : Enum321SecurityRequestType.values()) {
            tagData = new Tag321EnuSecurityRequestType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag321EnuSecurityRequestType tagData;

        // loop around the ENUM and process
        for (Enum321SecurityRequestType oneEnum : Enum321SecurityRequestType.values()) {
            tagData = new Tag321EnuSecurityRequestType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag321EnuSecurityRequestType tagData;

        // loop around the ENUM and process
        for (Enum321SecurityRequestType oneEnum : Enum321SecurityRequestType.values()) {
            tagData = new Tag321EnuSecurityRequestType(oneEnum);
            assertEquals( "Tag321EnuSecurityRequestType\n" +
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