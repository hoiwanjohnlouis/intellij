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

package com.hwtsllc.fix.tags.fix44;

import com.hwtsllc.fix.enums.fix44.Enum935NetworkRequestType;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag935EnuNetworkRequestTypeTest {
    Tag935EnuNetworkRequestType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum935NetworkRequestType oneEnum : Enum935NetworkRequestType.values()) {
            tagData = new Tag935EnuNetworkRequestType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum935NetworkRequestType oneEnum : Enum935NetworkRequestType.values()) {
            tagData = new Tag935EnuNetworkRequestType(oneEnum);
            assertEquals( "FIX935_ENU_NETWORK_REQUEST_TYPE", tagData.toFIXLabelString());
            assertEquals( "935", tagData.toFIXIDString());
            assertEquals( "NETWORK_REQUEST_TYPE", tagData.toFIXNameString());
            assertEquals( "NetworkRequestType", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum935NetworkRequestType oneEnum : Enum935NetworkRequestType.values()) {
            tagData = new Tag935EnuNetworkRequestType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  935
         *  NetworkRequestType
         *  int
         *  <p>    1 - Snapshot
         *  <p>    2 - Subscribe
         *  <p>    4 - Stop Subscribing
         *  <p>    8 - Level of Detail, then NoCompID's becomes required
         */
        tagData = new Tag935EnuNetworkRequestType( Enum935NetworkRequestType.SNAPSHOT );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag935EnuNetworkRequestType( Enum935NetworkRequestType.SUBSCRIBE );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag935EnuNetworkRequestType( Enum935NetworkRequestType.STOP_SUBSCRIBING );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag935EnuNetworkRequestType( Enum935NetworkRequestType.LEVEL_OF_DETAIL );
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum935NetworkRequestType oneEnum : Enum935NetworkRequestType.values()) {
            tagData = new Tag935EnuNetworkRequestType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum935NetworkRequestType oneEnum : Enum935NetworkRequestType.values()) {
            tagData = new Tag935EnuNetworkRequestType(oneEnum);
            assertEquals( "Tag935EnuNetworkRequestType\n" +
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