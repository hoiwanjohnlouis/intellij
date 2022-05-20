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
import com.hwtsllc.fixengine2022.datatypes.MySeqNumType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  45
 *  RefSeqNum
 *  SeqNum
 *  Reference message sequence number
 */
class Tag45SeqRefSeqNumTest {
    @Test
    void FIX0045Test() {
        FIX27 fixData = FIX27.FIX45_SEQ_REF_SEQ_NUM;
        assertEquals( "REF_SEQ_NUM", fixData.toFIXNameString());
        assertEquals( "45", fixData.toFIXIDString());
        assertEquals( "RefSeqNum", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0045Test() {
        Tag45SeqRefSeqNum tagData;

        tagData = new Tag45SeqRefSeqNum(new MySeqNumType(32523) );
        assertEquals( 32523, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_SEQ_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag45SeqRefSeqNum tagData;

        tagData = new Tag45SeqRefSeqNum(new MySeqNumType(Tag45SeqRefSeqNum.TESTB_SEQ_REF_SEQ_NO));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag45SeqRefSeqNum tagData;

        tagData = new Tag45SeqRefSeqNum(new MySeqNumType(Tag45SeqRefSeqNum.TESTB_SEQ_REF_SEQ_NO));
        assertEquals( Tag45SeqRefSeqNum.TESTB_SEQ_REF_SEQ_NO, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_SEQ_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag45SeqRefSeqNum tagData;

        tagData = new Tag45SeqRefSeqNum(new MySeqNumType(Tag45SeqRefSeqNum.TESTB_SEQ_REF_SEQ_NO));
        assertEquals( tagData.toFIXIDString() + "=" + Tag45SeqRefSeqNum.TESTB_SEQ_REF_SEQ_NO,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag45SeqRefSeqNum tagData;

        tagData = new Tag45SeqRefSeqNum(new MySeqNumType(Tag45SeqRefSeqNum.TESTB_SEQ_REF_SEQ_NO));
        assertEquals( String.valueOf(Tag45SeqRefSeqNum.TESTB_SEQ_REF_SEQ_NO),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag45SeqRefSeqNum tagData;

        tagData = new Tag45SeqRefSeqNum(new MySeqNumType(Tag45SeqRefSeqNum.TESTA_SEQ_REF_SEQ_NO));
        assertEquals( "Tag45SeqRefSeqNum\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag45SeqRefSeqNum.TESTA_SEQ_REF_SEQ_NO + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag45SeqRefSeqNum.TESTA_SEQ_REF_SEQ_NO + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}