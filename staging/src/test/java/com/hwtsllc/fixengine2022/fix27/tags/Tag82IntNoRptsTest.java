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
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  82
 *  NoRpts
 *  int
 *  <p>
 *  Total number of reports within series.
 */
class Tag82IntNoRptsTest {
    @Test
    void FIX0082Test() {
        FIX27 fixData = FIX27.FIX82_INT_NO_RPTS;
        assertEquals( "NO_RPTS", fixData.toFIXNameString());
        assertEquals( "82", fixData.toFIXIDString());
        assertEquals( "NoRpts", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0082Test() {
        Tag82IntNoRpts tagData;

        tagData = new Tag82IntNoRpts(new MyIntType(23) );
        assertEquals( 23, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag82IntNoRpts tagData;

        tagData = new Tag82IntNoRpts(new MyIntType(Tag82IntNoRpts.TESTB_INT_NO_RPTS));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag82IntNoRpts tagData;

        tagData = new Tag82IntNoRpts(new MyIntType(Tag82IntNoRpts.TESTB_INT_NO_RPTS));
        assertEquals( Tag82IntNoRpts.TESTB_INT_NO_RPTS, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag82IntNoRpts tagData;

        tagData = new Tag82IntNoRpts(new MyIntType(Tag82IntNoRpts.TESTB_INT_NO_RPTS));
        assertEquals( tagData.toFIXIDString() + "=" + Tag82IntNoRpts.TESTB_INT_NO_RPTS,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag82IntNoRpts tagData;

        tagData = new Tag82IntNoRpts(new MyIntType(Tag82IntNoRpts.TESTB_INT_NO_RPTS));
        assertEquals( String.valueOf(Tag82IntNoRpts.TESTB_INT_NO_RPTS),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag82IntNoRpts tagData;

        tagData = new Tag82IntNoRpts(new MyIntType(Tag82IntNoRpts.TESTA_INT_NO_RPTS));
        assertEquals( "Tag82IntNoRpts\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag82IntNoRpts.TESTA_INT_NO_RPTS + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag82IntNoRpts.TESTA_INT_NO_RPTS + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}