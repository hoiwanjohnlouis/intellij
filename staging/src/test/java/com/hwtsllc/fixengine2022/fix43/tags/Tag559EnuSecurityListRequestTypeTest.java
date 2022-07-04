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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.fix43.enums.Enum559SecurityListRequestType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  559
 *  SecurityListRequestType
 *  int
 *  <p></p>
 *  Identifies the type/criteria of Security List Request
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Symbol
 *  <p>    1 - SecurityType and/or CFICode
 *  <p>    2 - Product
 *  <p>    3 - TradingSessionID
 *  <p>    4 - All Securities
 */
class Tag559EnuSecurityListRequestTypeTest {
    @Test
    void FIX0559Test() {
        FIX43 fixData = FIX43.FIX559_ENU_SECURITY_LIST_REQUEST_TYPE;
        assertEquals( "559", fixData.toEnumIDString());
        assertEquals( "SECURITY_LIST_REQUEST_TYPE", fixData.toEnumNameString());
        assertEquals( "SecurityListRequestType", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0559Test() {
        Tag559EnuSecurityListRequestType tagData;

        /*
         *  0-4 types
         */
        tagData = new Tag559EnuSecurityListRequestType( Enum559SecurityListRequestType.SYMBOL );
        assertEquals( Enum559SecurityListRequestType.SYMBOL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag559EnuSecurityListRequestType( Enum559SecurityListRequestType.SECURITY_TYPE );
        assertEquals( Enum559SecurityListRequestType.SECURITY_TYPE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag559EnuSecurityListRequestType( Enum559SecurityListRequestType.PRODUCT );
        assertEquals( Enum559SecurityListRequestType.PRODUCT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag559EnuSecurityListRequestType( Enum559SecurityListRequestType.TRADING_SESSION_ID );
        assertEquals( Enum559SecurityListRequestType.TRADING_SESSION_ID.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag559EnuSecurityListRequestType( Enum559SecurityListRequestType.ALL_SECURITIES );
        assertEquals( Enum559SecurityListRequestType.ALL_SECURITIES.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag559EnuSecurityListRequestType tagData;

        // loop around the ENUM and process
        for ( Enum559SecurityListRequestType oneEnum : Enum559SecurityListRequestType.values()) {
            tagData = new Tag559EnuSecurityListRequestType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag559EnuSecurityListRequestType tagData;

        // loop around the ENUM and process
        for (Enum559SecurityListRequestType oneEnum : Enum559SecurityListRequestType.values()) {
            tagData = new Tag559EnuSecurityListRequestType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag559EnuSecurityListRequestType tagData;

        // loop around the ENUM and process
        for (Enum559SecurityListRequestType oneEnum : Enum559SecurityListRequestType.values()) {
            tagData = new Tag559EnuSecurityListRequestType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag559EnuSecurityListRequestType tagData;

        // loop around the ENUM and process
        for (Enum559SecurityListRequestType oneEnum : Enum559SecurityListRequestType.values()) {
            tagData = new Tag559EnuSecurityListRequestType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag559EnuSecurityListRequestType tagData;

        // loop around the ENUM and process
        for (Enum559SecurityListRequestType oneEnum : Enum559SecurityListRequestType.values()) {
            tagData = new Tag559EnuSecurityListRequestType(oneEnum);
            assertEquals( "Tag559EnuSecurityListRequestType\n" +
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