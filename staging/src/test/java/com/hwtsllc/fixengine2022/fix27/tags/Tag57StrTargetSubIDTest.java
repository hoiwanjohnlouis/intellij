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
 *  57
 *  TargetSubID
 *  String
 *  <p></p>
 *  Assigned value used to identify specific individual or unit intended to receive message.
 *  <p></p>
 *  "ADMIN" reserved for administrative messages not intended for a specific user.
 */
class Tag57StrTargetSubIDTest {
    @Test
    void FIX0057Test() {
        FIX27 fixData = FIX27.FIX57_STR_TARGET_SUB_ID;
        assertEquals( "TARGET_SUB_ID", fixData.toEnumNameString());
        assertEquals( "57", fixData.toEnumIDString());
        assertEquals( "TargetSubID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0057Test() {
        Tag57StrTargetSubID tagData;
        String oneElement;

        oneElement = "MLCO";
        tagData = new Tag57StrTargetSubID(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );

        oneElement = Tag57StrTargetSubID.TESTA_STR_TARGET_SUB_ID;
        tagData = new Tag57StrTargetSubID(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );

        oneElement = Tag57StrTargetSubID.TESTB_STR_TARGET_SUB_ID;
        tagData = new Tag57StrTargetSubID(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );
    }

    private void verifyTagInformation( Tag57StrTargetSubID tagData, String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "TARGET_SUB_ID", tagData.toEnumNameString());
        assertEquals( "57", tagData.toEnumIDString());
        assertEquals( "TargetSubID", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void PrintFIXTagTest() {
        Tag57StrTargetSubID tagData;
        String oneElement;

        oneElement = Tag57StrTargetSubID.TESTA_STR_TARGET_SUB_ID;
        tagData = new Tag57StrTargetSubID(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag57StrTargetSubID.TESTB_STR_TARGET_SUB_ID;
        tagData = new Tag57StrTargetSubID(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag57StrTargetSubID tagData;
        String oneElement;

        oneElement = Tag57StrTargetSubID.TESTB_STR_TARGET_SUB_ID;
        tagData = new Tag57StrTargetSubID(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag57StrTargetSubID tagData;
        String oneElement;

        oneElement = Tag57StrTargetSubID.TESTB_STR_TARGET_SUB_ID;
        tagData = new Tag57StrTargetSubID(new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag57StrTargetSubID tagData;
        String oneElement;

        oneElement = Tag57StrTargetSubID.TESTB_STR_TARGET_SUB_ID;
        tagData = new Tag57StrTargetSubID(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag57StrTargetSubID tagData;
        String oneElement;

        oneElement = Tag57StrTargetSubID.TESTA_STR_TARGET_SUB_ID;
        tagData = new Tag57StrTargetSubID(new MyStringType( oneElement ) );
        assertEquals( "Tag57StrTargetSubID\n" +
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