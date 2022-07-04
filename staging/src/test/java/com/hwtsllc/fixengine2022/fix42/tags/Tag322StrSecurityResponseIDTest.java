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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  322
 *  SecurityResponseID
 *  String
 *  <p>
 *  Unique ID of a Security Definition message.
 */
class Tag322StrSecurityResponseIDTest {
    @Test
    void FIX0322Test() {
        FIX42 fixData = FIX42.FIX322_STR_SECURITY_RESPONSE_ID;
        assertEquals( "322", fixData.toEnumIDString());
        assertEquals( "SECURITY_RESPONSE_ID", fixData.toEnumNameString());
        assertEquals( "SecurityResponseID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0322Test() {
        Tag322StrSecurityResponseID tagData;
        String oneElement;

        oneElement = Tag322StrSecurityResponseID.TESTA_STR_SECURITY_RESPONSE_ID;
        tagData = new Tag322StrSecurityResponseID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag322StrSecurityResponseID.TESTB_STR_SECURITY_RESPONSE_ID;
        tagData = new Tag322StrSecurityResponseID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag322StrSecurityResponseID tagData;
        String oneElement;

        oneElement = Tag322StrSecurityResponseID.TESTB_STR_SECURITY_RESPONSE_ID;
        tagData = new Tag322StrSecurityResponseID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag322StrSecurityResponseID tagData;
        String oneElement;

        oneElement = Tag322StrSecurityResponseID.TESTB_STR_SECURITY_RESPONSE_ID;
        tagData = new Tag322StrSecurityResponseID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag322StrSecurityResponseID tagData;
        String oneElement;

        oneElement = Tag322StrSecurityResponseID.TESTB_STR_SECURITY_RESPONSE_ID;
        tagData = new Tag322StrSecurityResponseID( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag322StrSecurityResponseID tagData;
        String oneElement;

        oneElement = Tag322StrSecurityResponseID.TESTB_STR_SECURITY_RESPONSE_ID;
        tagData = new Tag322StrSecurityResponseID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag322StrSecurityResponseID tagData;
        String oneElement;

        oneElement = Tag322StrSecurityResponseID.TESTA_STR_SECURITY_RESPONSE_ID;
        tagData = new Tag322StrSecurityResponseID( new MyStringType( oneElement ) );
        assertEquals( "Tag322StrSecurityResponseID\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}