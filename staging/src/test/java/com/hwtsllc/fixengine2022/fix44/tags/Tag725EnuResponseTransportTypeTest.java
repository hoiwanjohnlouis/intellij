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

import com.hwtsllc.fixengine2022.fix44.enums.Enum725ResponseTransportType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  725
 *  ResponseTransportType
 *  int
 *  <p></p>
 *  Identifies how the response to the request should be transmitted.
 *  <p></p>
 *  Details specified via ResponseDestination (726).
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Inband - transport the request was sent over (default)
 *  <p>    1 - Out of Band - pre-arranged out-of-band delivery mechanism
 *              (i.e. FTP, HTTP, NDM, etc.) between counterparties
 */
class Tag725EnuResponseTransportTypeTest {
    Tag725EnuResponseTransportType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum725ResponseTransportType oneEnum : Enum725ResponseTransportType.values()) {
            tagData = new Tag725EnuResponseTransportType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum725ResponseTransportType oneEnum : Enum725ResponseTransportType.values()) {
            tagData = new Tag725EnuResponseTransportType(oneEnum);
            assertEquals( "FIX725_ENU_RESPONSE_TRANSPORT_TYPE", tagData.toEnumLabelString());
            assertEquals( "725", tagData.toEnumIDString());
            assertEquals( "RESPONSE_TRANSPORT_TYPE", tagData.toEnumNameString());
            assertEquals( "ResponseTransportType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  <p>    0 - Inband - transport the request was sent over (default)
         *  <p>    1 - Out of Band - pre-arranged out-of-band delivery mechanism
         *              (i.e. FTP, HTTP, NDM, etc.) between counterparties
         */
        tagData = new Tag725EnuResponseTransportType( Enum725ResponseTransportType.INBAND );
        assertEquals( "0", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag725EnuResponseTransportType(Enum725ResponseTransportType.OUT_OF_BAND);
        assertEquals( "1", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( Enum725ResponseTransportType oneEnum : Enum725ResponseTransportType.values()) {
            tagData = new Tag725EnuResponseTransportType(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum725ResponseTransportType oneEnum : Enum725ResponseTransportType.values()) {
            tagData = new Tag725EnuResponseTransportType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( Enum725ResponseTransportType oneEnum : Enum725ResponseTransportType.values()) {
            tagData = new Tag725EnuResponseTransportType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum725ResponseTransportType oneEnum : Enum725ResponseTransportType.values()) {
            tagData = new Tag725EnuResponseTransportType(oneEnum);
            assertEquals( "Tag725EnuResponseTransportType\n" +
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