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
 *  16
 *  EndSeqNo
 *  SeqNum
 *  Message sequence number of last message in range to be resent.
 *
 *  If request is for a single message BeginSeqNo (7) = EndSeqNo.
 *  If request is for all messages subsequent to a particular message,
 *  EndSeqNo = "0" (representing infinity).
 */
class Tag16SeqEndSeqNoTest {
    @Test
    void FIX0016Test() {
        FIX27 fixData = FIX27.FIX16_SEQ_END_SEQ_NO;
        assertEquals("END_SEQ_NO", fixData.toFIXNameString());
        assertEquals("16", fixData.toFIXIDString());
        assertEquals("EndSeqNo", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0016Test() {
        Tag16SeqEndSeqNo tagData;

        tagData = new Tag16SeqEndSeqNo(new MySeqNumType(6789));
        assertEquals(6789, tagData.getDataValue());
        assertNotEquals(MyTestValues.JUNK_SEQ_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag16SeqEndSeqNo tagData;

        tagData = new Tag16SeqEndSeqNo(new MySeqNumType(Tag16SeqEndSeqNo.TESTB_SEQ_END_SEQ_NO));
        System.out.println(tagData.toVerboseString());
    }
    @Test
    void TagGetDataValueTest() {
        Tag16SeqEndSeqNo tagData;

        tagData = new Tag16SeqEndSeqNo(new MySeqNumType(Tag16SeqEndSeqNo.TESTB_SEQ_END_SEQ_NO));
        assertEquals(Tag16SeqEndSeqNo.TESTB_SEQ_END_SEQ_NO, tagData.getDataValue());
        assertNotEquals(MyTestValues.JUNK_SEQ_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag16SeqEndSeqNo tagData;

        tagData = new Tag16SeqEndSeqNo(new MySeqNumType(Tag16SeqEndSeqNo.TESTB_SEQ_END_SEQ_NO));
        assertEquals(tagData.toFIXIDString() + "=" + Tag16SeqEndSeqNo.TESTB_SEQ_END_SEQ_NO,
                tagData.toValuePairString());
        assertNotEquals(MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag16SeqEndSeqNo tagData;

        tagData = new Tag16SeqEndSeqNo(new MySeqNumType(Tag16SeqEndSeqNo.TESTB_SEQ_END_SEQ_NO));
        assertEquals(String.valueOf(Tag16SeqEndSeqNo.TESTB_SEQ_END_SEQ_NO),
                tagData.toString());
        assertNotEquals(MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag16SeqEndSeqNo tagData;

        tagData = new Tag16SeqEndSeqNo(new MySeqNumType(Tag16SeqEndSeqNo.TESTA_SEQ_END_SEQ_NO));
        assertEquals("Tag16SeqEndSeqNo\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag16SeqEndSeqNo.TESTA_SEQ_END_SEQ_NO + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag16SeqEndSeqNo.TESTA_SEQ_END_SEQ_NO + "]",
                tagData.toVerboseString());
        assertNotEquals(MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}