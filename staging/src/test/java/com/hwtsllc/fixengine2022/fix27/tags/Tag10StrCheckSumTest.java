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
 *  10
 *  CheckSum
 *  String
 *  <p></p>
 *  Three byte, simple checksum
 *  <p></p>
 *  i.e. serves, with the trailing <SOH>, as the end-of-message delimiter.
 *  <p></p>
 *  (see Volume 2: "Checksum Calculation" for description).
 *  ALWAYS LAST FIELD IN MESSAGE;
 *  <p></p>
 *  Always defined as three characters.
 *  <p></p>
 *  (Always unencrypted)
 */
class Tag10StrCheckSumTest {
    @Test
    void FIXTest() {
        FIX27 fixData = FIX27.FIX10_STR_CHECK_SUM;
        assertEquals( "CHECK_SUM", fixData.toEnumNameString());
        assertEquals( "10", fixData.toEnumIDString());
        assertEquals( "CheckSum", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0010Test() {
        Tag10StrCheckSum tagData;
        String oneElement;

        oneElement = "MLCO-ABCD1234";
        tagData = new Tag10StrCheckSum(new MyStringType( oneElement ) );
        verifyTagInformation( oneElement, tagData );

        oneElement = Tag10StrCheckSum.TESTA_STR_CHECK_SUM;
        tagData = new Tag10StrCheckSum(new MyStringType( oneElement ) );
        verifyTagInformation( oneElement, tagData );

        oneElement = Tag10StrCheckSum.TESTB_STR_CHECK_SUM;
        tagData = new Tag10StrCheckSum(new MyStringType( oneElement ) );
        verifyTagInformation( oneElement, tagData );
    }

    private void verifyTagInformation( String oneElement, Tag10StrCheckSum tagData ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "FIX10_STR_CHECK_SUM", tagData.toEnumLabelString());
        assertEquals( "CHECK_SUM", tagData.toEnumNameString());
        assertEquals( "10", tagData.toEnumIDString());
        assertEquals( "CheckSum", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void PrintFIXTagTest() {
        Tag10StrCheckSum tagData;
        String oneElement;

        oneElement = Tag10StrCheckSum.TESTA_STR_CHECK_SUM;
        tagData = new Tag10StrCheckSum(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag10StrCheckSum.TESTB_STR_CHECK_SUM;
        tagData = new Tag10StrCheckSum(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag10StrCheckSum tagData;
        String oneElement;

        oneElement = Tag10StrCheckSum.TESTB_STR_CHECK_SUM;
        tagData = new Tag10StrCheckSum(new MyStringType( oneElement ));
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag10StrCheckSum tagData;
        String oneElement;

        oneElement = Tag10StrCheckSum.TESTB_STR_CHECK_SUM;
        tagData = new Tag10StrCheckSum(new MyStringType( oneElement ));
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag10StrCheckSum tagData;
        String oneElement;

        oneElement = Tag10StrCheckSum.TESTB_STR_CHECK_SUM;
        tagData = new Tag10StrCheckSum(new MyStringType( oneElement ));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag10StrCheckSum tagData;
        String oneElement;

        oneElement = Tag10StrCheckSum.TESTA_STR_CHECK_SUM;
        tagData = new Tag10StrCheckSum(new MyStringType( oneElement ));
        assertEquals( "Tag10StrCheckSum\n" +
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