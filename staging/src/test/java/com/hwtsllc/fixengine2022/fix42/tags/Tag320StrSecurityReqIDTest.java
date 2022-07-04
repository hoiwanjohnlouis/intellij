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
 *  320
 *  SecurityReqID
 *  String
 *  <p>
 *  Unique ID of a Security Definition Request.
 */
class Tag320StrSecurityReqIDTest {
    @Test
    void FIX0320Test() {
        FIX42 fixData = FIX42.FIX320_STR_SECURITY_REQ_ID;
        assertEquals( "320", fixData.toEnumIDString());
        assertEquals( "SECURITY_REQ_ID", fixData.toEnumNameString());
        assertEquals( "SecurityReqID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0320Test() {
        Tag320StrSecurityReqID tagData;
        String oneElement;

        oneElement = Tag320StrSecurityReqID.TESTA_STR_SECURITY_REQ_ID;
        tagData = new Tag320StrSecurityReqID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag320StrSecurityReqID.TESTB_STR_SECURITY_REQ_ID;
        tagData = new Tag320StrSecurityReqID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag320StrSecurityReqID tagData;
        String oneElement;

        oneElement = Tag320StrSecurityReqID.TESTB_STR_SECURITY_REQ_ID;
        tagData = new Tag320StrSecurityReqID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag320StrSecurityReqID tagData;
        String oneElement;

        oneElement = Tag320StrSecurityReqID.TESTB_STR_SECURITY_REQ_ID;
        tagData = new Tag320StrSecurityReqID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag320StrSecurityReqID tagData;
        String oneElement;

        oneElement = Tag320StrSecurityReqID.TESTB_STR_SECURITY_REQ_ID;
        tagData = new Tag320StrSecurityReqID( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag320StrSecurityReqID tagData;
        String oneElement;

        oneElement = Tag320StrSecurityReqID.TESTB_STR_SECURITY_REQ_ID;
        tagData = new Tag320StrSecurityReqID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag320StrSecurityReqID tagData;
        String oneElement;

        oneElement = Tag320StrSecurityReqID.TESTA_STR_SECURITY_REQ_ID;
        tagData = new Tag320StrSecurityReqID( new MyStringType( oneElement ) );
        assertEquals( "Tag320StrSecurityReqID\n" +
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