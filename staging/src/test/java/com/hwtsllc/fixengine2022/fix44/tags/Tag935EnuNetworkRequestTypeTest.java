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

import com.hwtsllc.fixengine2022.fix44.enums.Enum935NetworkRequestType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  935
 *  NetworkRequestType
 *  int
 *  <p></p>
 *  Indicates the type and level of details required for a
 *  Network Status Request Message Boolean logic applies
 *  <p></p>
 *  e.g. If you want to subscribe for changes to certain id’s
 *  then UserRequestType = 0 (8+2), Snapshot for certain ID’s = 9 (8+1)
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Snapshot
 *  <p>    2 - Subscribe
 *  <p>    4 - Stop Subscribing
 *  <p>    8 - Level of Detail, then NoCompID's becomes required
 */
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
            assertEquals( "FIX935_ENU_NETWORK_REQUEST_TYPE", tagData.toEnumLabelString());
            assertEquals( "935", tagData.toEnumIDString());
            assertEquals( "NETWORK_REQUEST_TYPE", tagData.toEnumNameString());
            assertEquals( "NetworkRequestType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  <p>    1 - Snapshot
         *  <p>    2 - Subscribe
         *  <p>    4 - Stop Subscribing
         *  <p>    8 - Level of Detail, then NoCompID's becomes required
         */
        tagData = new Tag935EnuNetworkRequestType( Enum935NetworkRequestType.SNAPSHOT );
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag935EnuNetworkRequestType( Enum935NetworkRequestType.SUBSCRIBE );
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag935EnuNetworkRequestType( Enum935NetworkRequestType.STOP_SUBSCRIBING );
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag935EnuNetworkRequestType( Enum935NetworkRequestType.LEVEL_OF_DETAIL );
        assertEquals( "8", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( Enum935NetworkRequestType oneEnum : Enum935NetworkRequestType.values()) {
            tagData = new Tag935EnuNetworkRequestType(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum935NetworkRequestType oneEnum : Enum935NetworkRequestType.values()) {
            tagData = new Tag935EnuNetworkRequestType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
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