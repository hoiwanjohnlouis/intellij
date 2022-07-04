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
 *  19
 *  ExecRefID
 *  String
 *  <p></p>
 *  Reference identifier used with Trade Cancel and Trade Correct execution types.
 *  <p></p>
 *  (Prior to FIX 4.1 this field was of type int)
 */
class Tag19StrExecRefIDTest {
    @Test
    void FIXTest() {
        FIX27 fixData = FIX27.FIX19_STR_EXEC_REF_ID;
        assertEquals( "EXEC_REF_ID", fixData.toEnumNameString());
        assertEquals( "19", fixData.toEnumIDString());
        assertEquals( "ExecRefID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0019Test() {
        Tag19StrExecRefID tagData;
        String oneElement;

        oneElement = "6789-XYZ";
        tagData = new Tag19StrExecRefID(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );

        oneElement = Tag10StrCheckSum.TESTA_STR_CHECK_SUM;
        tagData = new Tag19StrExecRefID(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );

        oneElement = Tag10StrCheckSum.TESTB_STR_CHECK_SUM;
        tagData = new Tag19StrExecRefID(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );
    }

    private void verifyTagInformation( Tag19StrExecRefID tagData, String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "FIX19_STR_EXEC_REF_ID", tagData.toEnumLabelString());
        assertEquals( "EXEC_REF_ID", tagData.toEnumNameString());
        assertEquals( "19", tagData.toEnumIDString());
        assertEquals( "ExecRefID", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void PrintFIXTagTest() {
        Tag19StrExecRefID tagData;
        String oneElement;

        oneElement = Tag10StrCheckSum.TESTA_STR_CHECK_SUM;
        tagData = new Tag19StrExecRefID(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag10StrCheckSum.TESTB_STR_CHECK_SUM;
        tagData = new Tag19StrExecRefID(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag19StrExecRefID tagData;
        String oneElement;

        oneElement = Tag10StrCheckSum.TESTB_STR_CHECK_SUM;
        tagData = new Tag19StrExecRefID(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag19StrExecRefID tagData;
        String oneElement;

        oneElement = Tag10StrCheckSum.TESTB_STR_CHECK_SUM;
        tagData = new Tag19StrExecRefID(new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag19StrExecRefID tagData;
        String oneElement;

        oneElement = Tag10StrCheckSum.TESTB_STR_CHECK_SUM;
        tagData = new Tag19StrExecRefID(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag19StrExecRefID tagData;
        String oneElement;

        oneElement = Tag10StrCheckSum.TESTA_STR_CHECK_SUM;
        tagData = new Tag19StrExecRefID(new MyStringType( oneElement ) );
        assertEquals( "Tag19StrExecRefID\n" +
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