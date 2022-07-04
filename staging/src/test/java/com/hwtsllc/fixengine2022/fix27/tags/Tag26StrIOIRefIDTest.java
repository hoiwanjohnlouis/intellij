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
 *  26
 *  IOIRefID
 *  String
 *  <p></p>
 *  Reference identifier used with CANCEL and REPLACE, transaction types.
 *  <p></p>
 *  (Prior to FIX 4.1 this field was of type int)
 */
class Tag26StrIOIRefIDTest {
    @Test
    void FIXTest() {
        FIX27 fixData = FIX27.FIX26_STR_IOI_REF_ID;
        assertEquals( "IOI_REF_ID", fixData.toEnumNameString());
        assertEquals( "26", fixData.toEnumIDString());
        assertEquals( "IOIRefID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0026Test() {
        Tag26StrIOIRefID tagData;
        String oneElement;

        oneElement = "B";
        tagData = new Tag26StrIOIRefID(new MyStringType( oneElement ) );
        verifyTagInformation( oneElement, tagData );

        oneElement = Tag26StrIOIRefID.TESTA_STR_IOI_REF_ID;
        tagData = new Tag26StrIOIRefID(new MyStringType( oneElement ) );
        verifyTagInformation( oneElement, tagData );

        oneElement = Tag26StrIOIRefID.TESTB_STR_IOI_REF_ID;
        tagData = new Tag26StrIOIRefID(new MyStringType( oneElement ) );
        verifyTagInformation( oneElement, tagData );
    }

    private void verifyTagInformation( String oneElement, Tag26StrIOIRefID tagData ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "IOI_REF_ID", tagData.toEnumNameString());
        assertEquals( "26", tagData.toEnumIDString());
        assertEquals( "IOIRefID", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void PrintFIXTagTest() {
        Tag26StrIOIRefID tagData;
        String oneElement;

        oneElement = Tag26StrIOIRefID.TESTA_STR_IOI_REF_ID;
        tagData = new Tag26StrIOIRefID(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag26StrIOIRefID.TESTB_STR_IOI_REF_ID;
        tagData = new Tag26StrIOIRefID(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag26StrIOIRefID tagData;
        String oneElement;

        oneElement = Tag26StrIOIRefID.TESTB_STR_IOI_REF_ID;
        tagData = new Tag26StrIOIRefID(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag26StrIOIRefID tagData;
        String oneElement;

        oneElement = Tag26StrIOIRefID.TESTB_STR_IOI_REF_ID;
        tagData = new Tag26StrIOIRefID(new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag26StrIOIRefID tagData;
        String oneElement;

        oneElement = Tag26StrIOIRefID.TESTB_STR_IOI_REF_ID;
        tagData = new Tag26StrIOIRefID(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag26StrIOIRefID tagData;
        String oneElement;

        oneElement = Tag26StrIOIRefID.TESTA_STR_IOI_REF_ID;
        tagData = new Tag26StrIOIRefID(new MyStringType( oneElement ) );
        assertEquals( "Tag26StrIOIRefID\n" +
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