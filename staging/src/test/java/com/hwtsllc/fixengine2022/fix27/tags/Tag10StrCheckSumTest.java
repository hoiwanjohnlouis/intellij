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
 *  Three byte, simple checksum
 *
 *  i.e. serves, with the trailing <SOH>, as the end-of-message delimiter.
 *
 *  (see Volume 2: "Checksum Calculation" for description).
 *  ALWAYS LAST FIELD IN MESSAGE;
 *
 *  Always defined as three characters.
 *  (Always unencrypted)
 */
class Tag10StrCheckSumTest {
    @Test
    void FIX0010Test() {
        FIX27 fixData = FIX27.FIX10_STR_CHECK_SUM;
        assertEquals( "CHECK_SUM", fixData.toFIXNameString());
        assertEquals( "10", fixData.toFIXIDString());
        assertEquals( "CheckSum", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void PrintFIXTagTest() {
        Tag10StrCheckSum tagData;

        tagData = new Tag10StrCheckSum(new MyStringType(Tag10StrCheckSum.TESTB_STR_CHECK_SUM));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag10StrCheckSum tagData;

        tagData = new Tag10StrCheckSum(new MyStringType(Tag10StrCheckSum.TESTB_STR_CHECK_SUM));
        assertEquals( Tag10StrCheckSum.TESTB_STR_CHECK_SUM, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag10StrCheckSum tagData;

        tagData = new Tag10StrCheckSum(new MyStringType(Tag10StrCheckSum.TESTB_STR_CHECK_SUM));
        assertEquals( tagData.toFIXIDString() + "=" + Tag10StrCheckSum.TESTB_STR_CHECK_SUM,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag10StrCheckSum tagData;

        tagData = new Tag10StrCheckSum(new MyStringType(Tag10StrCheckSum.TESTB_STR_CHECK_SUM));
        assertEquals( Tag10StrCheckSum.TESTB_STR_CHECK_SUM,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag10StrCheckSum tagData;

        tagData = new Tag10StrCheckSum(new MyStringType(Tag10StrCheckSum.TESTA_STR_CHECK_SUM));
        assertEquals( "Tag10StrCheckSum\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag10StrCheckSum.TESTA_STR_CHECK_SUM + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag10StrCheckSum.TESTA_STR_CHECK_SUM + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}