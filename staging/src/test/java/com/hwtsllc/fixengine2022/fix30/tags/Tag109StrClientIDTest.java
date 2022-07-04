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

package com.hwtsllc.fixengine2022.fix30.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX30;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  109
 *  ClientID
 *  String
 *  <p>
 *  Deprecated in FIX.4.2
 *  <p>
 *  Firm identifier used in third party-transactions
 *  <p>
 *  (should not be a substitute for OnBehalfOfCompID/DeliverToCompID).
 */
// @Deprecated
class Tag109StrClientIDTest {

    @Test
    void FIXTest() {
        FIX30 fixData = FIX30.FIX109_STR_CLIENT_ID;
        assertEquals( "CLIENT_ID", fixData.toEnumNameString());
        assertEquals( "109", fixData.toEnumIDString());
        assertEquals( "ClientID (replaced)", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0109Test() {
        Tag109StrClientID tagData;
        String oneElement;

        oneElement = "SOME-ACCT-NUMBER";
        tagData = new Tag109StrClientID(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "CLIENT_ID", tagData.toEnumNameString());
        assertEquals( "109", tagData.toEnumIDString());
        assertEquals( "ClientID (replaced)", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag109StrClientID.TESTA_STR_CLIENT_ID;
        tagData = new Tag109StrClientID(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag109StrClientID.TESTB_STR_CLIENT_ID;
        tagData = new Tag109StrClientID(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag109StrClientID tagData;
        String oneElement;

        oneElement = Tag109StrClientID.TESTA_STR_CLIENT_ID;
        tagData = new Tag109StrClientID(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag109StrClientID.TESTB_STR_CLIENT_ID;
        tagData = new Tag109StrClientID(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag109StrClientID tagData;
        String oneElement;

        oneElement = Tag109StrClientID.TESTB_STR_CLIENT_ID;
        tagData = new Tag109StrClientID(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag109StrClientID tagData;
        String oneElement;

        oneElement = Tag109StrClientID.TESTB_STR_CLIENT_ID;
        tagData = new Tag109StrClientID(new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag109StrClientID tagData;
        String oneElement;

        oneElement = Tag109StrClientID.TESTB_STR_CLIENT_ID;
        tagData = new Tag109StrClientID(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag109StrClientID tagData;
        String oneElement;

        oneElement = Tag109StrClientID.TESTA_STR_CLIENT_ID;
        tagData = new Tag109StrClientID(new MyStringType( oneElement ) );
        assertEquals( "Tag109StrClientID\n" +
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