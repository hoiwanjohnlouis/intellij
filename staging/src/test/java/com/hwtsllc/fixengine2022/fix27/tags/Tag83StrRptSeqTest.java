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
 *  83
 *  RptSeq
 *  int
 *  <p>
 *  Sequence number of message within report series.
 *  <p>
 *  Used to carry reporting sequence number of the fill as represented on the Trade Report Side.
 */
class Tag83StrRptSeqTest {
    @Test
    void FIX0083Test() {
        FIX27 fixData = FIX27.FIX83_STR_RPT_SEQ;
        assertEquals( "RPT_SEQ", fixData.toFIXNameString());
        assertEquals( "83", fixData.toFIXIDString());
        assertEquals( "RptSeq", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0083Test() {
        Tag83StrRptSeq tagData;

        tagData = new Tag83StrRptSeq(new MyStringType("Legolas-83RptSeq") );
        assertEquals( "Legolas-83RptSeq", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag83StrRptSeq tagData;

        tagData = new Tag83StrRptSeq(new MyStringType(Tag83StrRptSeq.TESTB_STR_RPT_SEQ));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag83StrRptSeq tagData;

        tagData = new Tag83StrRptSeq(new MyStringType(Tag83StrRptSeq.TESTB_STR_RPT_SEQ));
        assertEquals( Tag83StrRptSeq.TESTB_STR_RPT_SEQ, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag83StrRptSeq tagData;

        tagData = new Tag83StrRptSeq(new MyStringType(Tag83StrRptSeq.TESTB_STR_RPT_SEQ));
        assertEquals( tagData.toFIXIDString() + "=" + Tag83StrRptSeq.TESTB_STR_RPT_SEQ,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag83StrRptSeq tagData;

        tagData = new Tag83StrRptSeq(new MyStringType(Tag83StrRptSeq.TESTB_STR_RPT_SEQ));
        assertEquals( Tag83StrRptSeq.TESTB_STR_RPT_SEQ,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag83StrRptSeq tagData;

        tagData = new Tag83StrRptSeq(new MyStringType(Tag83StrRptSeq.TESTA_STR_RPT_SEQ));
        assertEquals( "Tag83StrRptSeq\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag83StrRptSeq.TESTA_STR_RPT_SEQ + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag83StrRptSeq.TESTA_STR_RPT_SEQ + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}