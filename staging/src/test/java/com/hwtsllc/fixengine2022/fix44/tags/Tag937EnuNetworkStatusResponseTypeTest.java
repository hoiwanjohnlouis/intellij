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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.fix44.enums.Enum937NetworkStatusResponseType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  937
 *  NetworkStatusResponseType
 *  int
 *  <p></p>
 *  Indicates the type of Network Response Message.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Full
 *  <p>    2 - Incremental Update
 */
class Tag937EnuNetworkStatusResponseTypeTest {
    @Test
    void FIX0937Test() {
        FIX44 fixData = FIX44.FIX937_ENU_NETWORK_STATUS_RESPONSE_TYPE;
        assertEquals( "937", fixData.toFIXIDString());
        assertEquals( "NETWORK_STATUS_RESPONSE_TYPE", fixData.toFIXNameString());
        assertEquals( "NetworkStatusResponseType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0937Test() {
        Tag937EnuNetworkStatusResponseType tagData;

        tagData = new Tag937EnuNetworkStatusResponseType( Enum937NetworkStatusResponseType.FULL );
        assertEquals( Enum937NetworkStatusResponseType.FULL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag937EnuNetworkStatusResponseType( Enum937NetworkStatusResponseType.INCREMENTAL );
        assertEquals( Enum937NetworkStatusResponseType.INCREMENTAL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag937EnuNetworkStatusResponseType tagData;

        // loop around the ENUM and process
        for ( Enum937NetworkStatusResponseType oneEnum : Enum937NetworkStatusResponseType.values()) {
            tagData = new Tag937EnuNetworkStatusResponseType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag937EnuNetworkStatusResponseType tagData;

        // loop around the ENUM and process
        for (Enum937NetworkStatusResponseType oneEnum : Enum937NetworkStatusResponseType.values()) {
            tagData = new Tag937EnuNetworkStatusResponseType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag937EnuNetworkStatusResponseType tagData;

        // loop around the ENUM and process
        for (Enum937NetworkStatusResponseType oneEnum : Enum937NetworkStatusResponseType.values()) {
            tagData = new Tag937EnuNetworkStatusResponseType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag937EnuNetworkStatusResponseType tagData;

        // loop around the ENUM and process
        for (Enum937NetworkStatusResponseType oneEnum : Enum937NetworkStatusResponseType.values()) {
            tagData = new Tag937EnuNetworkStatusResponseType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag937EnuNetworkStatusResponseType tagData;

        // loop around the ENUM and process
        for (Enum937NetworkStatusResponseType oneEnum : Enum937NetworkStatusResponseType.values()) {
            tagData = new Tag937EnuNetworkStatusResponseType(oneEnum);
            assertEquals( "Tag937EnuNetworkStatusResponseType\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}