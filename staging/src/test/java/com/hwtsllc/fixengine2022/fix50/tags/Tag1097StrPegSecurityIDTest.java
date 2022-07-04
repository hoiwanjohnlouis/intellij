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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1097
 *  PegSecurityID
 *  String
 *  <p>
 *  Defines the identity of the security off whose prices the order will peg.
 */
class Tag1097StrPegSecurityIDTest {
    @Test
    void FIX1097Test() {
        FIX50 fixData = FIX50.FIX1097_STR_PEG_SECURITY_ID;
        assertEquals( "1097", fixData.toEnumIDString());
        assertEquals( "PEG_SECURITY_ID", fixData.toEnumNameString());
        assertEquals( "PegSecurityID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1097Test() {
        Tag1097StrPegSecurityID tagData;
        String oneElement;

        oneElement = "Chloe Kim";
        tagData = new Tag1097StrPegSecurityID( new MyStringType(oneElement) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag1097StrPegSecurityID.TESTA_STR_PEG_SECURITY_ID;
        tagData = new Tag1097StrPegSecurityID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag1097StrPegSecurityID.TESTB_STR_PEG_SECURITY_ID;
        tagData = new Tag1097StrPegSecurityID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag1097StrPegSecurityID tagData;
        String oneElement;

        oneElement = Tag1097StrPegSecurityID.TESTA_STR_PEG_SECURITY_ID;
        tagData = new Tag1097StrPegSecurityID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag1097StrPegSecurityID.TESTB_STR_PEG_SECURITY_ID;
        tagData = new Tag1097StrPegSecurityID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag1097StrPegSecurityID tagData;
        String oneElement;

        oneElement = Tag1097StrPegSecurityID.TESTB_STR_PEG_SECURITY_ID;
        tagData = new Tag1097StrPegSecurityID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1097StrPegSecurityID tagData;
        String oneElement;

        oneElement = Tag1097StrPegSecurityID.TESTB_STR_PEG_SECURITY_ID;
        tagData = new Tag1097StrPegSecurityID( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag1097StrPegSecurityID tagData;
        String oneElement;

        oneElement = Tag1097StrPegSecurityID.TESTB_STR_PEG_SECURITY_ID;
        tagData = new Tag1097StrPegSecurityID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1097StrPegSecurityID tagData;
        String oneElement;

        oneElement = Tag1097StrPegSecurityID.TESTA_STR_PEG_SECURITY_ID;
        tagData = new Tag1097StrPegSecurityID( new MyStringType( oneElement ) );
        assertEquals( "Tag1097StrPegSecurityID\n" +
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