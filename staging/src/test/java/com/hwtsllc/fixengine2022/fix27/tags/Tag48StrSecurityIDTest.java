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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  48
 *  SecurityID
 *  String
 *  <p></p>
 *  Security identifier value of SecurityIDSource (22) type
 *  <p></p>
 *  (e.g. CUSIP, SEDOL, ISIN, etc).  Requires SecurityIDSource.
 */
class Tag48StrSecurityIDTest {
    @Test
    void FIX0048Test() {
        FIX27 fixData = FIX27.FIX48_STR_SECURITY_ID;
        assertEquals( "SECURITY_ID", fixData.toEnumNameString());
        assertEquals( "48", fixData.toEnumIDString());
        assertEquals( "SecurityID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0048Test() {
        Tag48StrSecurityID tagData;
        String oneElement;

        oneElement = "TESTA";
        tagData = new Tag48StrSecurityID(new MyStringType( oneElement ) );
        verifyTagInformation( oneElement, tagData );

        oneElement = Tag48StrSecurityID.TESTA_STR_SECURITY_ID;
        tagData = new Tag48StrSecurityID(new MyStringType( oneElement ));
        verifyTagInformation( oneElement, tagData );

        oneElement = Tag48StrSecurityID.TESTB_STR_SECURITY_ID;
        tagData = new Tag48StrSecurityID(new MyStringType( oneElement ));
        verifyTagInformation( oneElement, tagData );
    }

    private void verifyTagInformation( String oneElement, Tag48StrSecurityID tagData ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "SECURITY_ID", tagData.toEnumNameString());
        assertEquals( "48", tagData.toEnumIDString());
        assertEquals( "SecurityID", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void PrintFIXTagTest() {
        Tag48StrSecurityID tagData;
        String oneElement;

        oneElement = Tag48StrSecurityID.TESTA_STR_SECURITY_ID;
        tagData = new Tag48StrSecurityID(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        oneElement = Tag48StrSecurityID.TESTB_STR_SECURITY_ID;
        tagData = new Tag48StrSecurityID(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagGetDataValueTest() {
        Tag48StrSecurityID tagData;
        String oneElement;

        oneElement = Tag48StrSecurityID.TESTB_STR_SECURITY_ID;
        tagData = new Tag48StrSecurityID(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag48StrSecurityID tagData;
        String oneElement;

        oneElement = Tag48StrSecurityID.TESTB_STR_SECURITY_ID;
        tagData = new Tag48StrSecurityID(new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag48StrSecurityID tagData;
        String oneElement;

        oneElement = Tag48StrSecurityID.TESTB_STR_SECURITY_ID;
        tagData = new Tag48StrSecurityID(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag48StrSecurityID tagData;
        String oneElement;

        oneElement = Tag48StrSecurityID.TESTA_STR_SECURITY_ID;
        tagData = new Tag48StrSecurityID(new MyStringType( oneElement ) );
        assertEquals( "Tag48StrSecurityID\n" +
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