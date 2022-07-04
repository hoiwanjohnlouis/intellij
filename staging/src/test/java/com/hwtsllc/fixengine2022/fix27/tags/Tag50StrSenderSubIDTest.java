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
 *  50
 *  SenderSubID
 *  String
 *  <p></p>
 *  Assigned value used to identify specific message originator (desk, trader, etc.)
 */
class Tag50StrSenderSubIDTest {
    @Test
    void FIX0050Test() {
        FIX27 fixData = FIX27.FIX50_STR_SENDER_SUB_ID;
        assertEquals( "SENDER_SUB_ID", fixData.toEnumNameString());
        assertEquals( "50", fixData.toEnumIDString());
        assertEquals( "SenderSubID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0050Test() {
        Tag50StrSenderSubID tagData;
        String oneElement;

        oneElement = "BEST";
        tagData = new Tag50StrSenderSubID(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );

        oneElement = Tag50StrSenderSubID.TESTA_STR_SENDER_SUB_ID;
        tagData = new Tag50StrSenderSubID(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );

        oneElement = Tag50StrSenderSubID.TESTB_STR_SENDER_SUB_ID;
        tagData = new Tag50StrSenderSubID(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );
    }
    private void verifyTagInformation( Tag50StrSenderSubID tagData, String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "SENDER_SUB_ID", tagData.toEnumNameString());
        assertEquals( "50", tagData.toEnumIDString());
        assertEquals( "SenderSubID", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }
    @Test
    void PrintFIXTagTest() {
        Tag50StrSenderSubID tagData;
        String oneElement;

        oneElement = Tag50StrSenderSubID.TESTA_STR_SENDER_SUB_ID;
        tagData = new Tag50StrSenderSubID(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag50StrSenderSubID.TESTB_STR_SENDER_SUB_ID;
        tagData = new Tag50StrSenderSubID(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag50StrSenderSubID tagData;
        String oneElement;

        oneElement = Tag50StrSenderSubID.TESTB_STR_SENDER_SUB_ID;
        tagData = new Tag50StrSenderSubID(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag50StrSenderSubID tagData;
        String oneElement;

        oneElement = Tag50StrSenderSubID.TESTB_STR_SENDER_SUB_ID;
        tagData = new Tag50StrSenderSubID(new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag50StrSenderSubID tagData;
        String oneElement;

        oneElement = Tag50StrSenderSubID.TESTB_STR_SENDER_SUB_ID;
        tagData = new Tag50StrSenderSubID(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag50StrSenderSubID tagData;
        String oneElement;

        oneElement = Tag50StrSenderSubID.TESTA_STR_SENDER_SUB_ID;
        tagData = new Tag50StrSenderSubID(new MyStringType( oneElement ) );
        assertEquals( "Tag50StrSenderSubID\n" +
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