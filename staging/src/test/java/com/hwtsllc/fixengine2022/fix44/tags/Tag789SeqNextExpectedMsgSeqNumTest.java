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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.MySeqNumType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  789
 *  NextExpectedMsgSeqNum
 *  SeqNum
 *  <p></p>
 *  Next expected MsgSeqNum value to be received.
 */
class Tag789SeqNextExpectedMsgSeqNumTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX789_SEQ_NEXT_EXPECTED_MSG_SEQ_NUM;
        assertEquals( "789", fixData.toFIXIDString());
        assertEquals( "NEXT_EXPECTED_MSG_SEQ_NUM", fixData.toFIXNameString());
        assertEquals( "NextExpectedMsgSeqNum", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0789Test() {
        Tag789SeqNextExpectedMsgSeqNum tagData;
        int oneElement;

        oneElement = Tag789SeqNextExpectedMsgSeqNum.TESTA_SEQ_NEXT_EXPECTED_MSG_SEQ_NUM;
        tagData = new Tag789SeqNextExpectedMsgSeqNum( new MySeqNumType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_SEQ_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "789", tagData.toFIXIDString());
        assertEquals( "NEXT_EXPECTED_MSG_SEQ_NUM", tagData.toFIXNameString());
        assertEquals( "NextExpectedMsgSeqNum", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag789SeqNextExpectedMsgSeqNum.TESTB_SEQ_NEXT_EXPECTED_MSG_SEQ_NUM;
        tagData = new Tag789SeqNextExpectedMsgSeqNum( new MySeqNumType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_SEQ_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag789SeqNextExpectedMsgSeqNum tagData;
        int oneElement;

        oneElement = Tag789SeqNextExpectedMsgSeqNum.TESTA_SEQ_NEXT_EXPECTED_MSG_SEQ_NUM;
        tagData = new Tag789SeqNextExpectedMsgSeqNum( new MySeqNumType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag789SeqNextExpectedMsgSeqNum.TESTB_SEQ_NEXT_EXPECTED_MSG_SEQ_NUM;
        tagData = new Tag789SeqNextExpectedMsgSeqNum( new MySeqNumType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag789SeqNextExpectedMsgSeqNum tagData;
        int oneElement;

        oneElement = Tag789SeqNextExpectedMsgSeqNum.TESTB_SEQ_NEXT_EXPECTED_MSG_SEQ_NUM;
        tagData = new Tag789SeqNextExpectedMsgSeqNum( new MySeqNumType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_SEQ_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag789SeqNextExpectedMsgSeqNum tagData;
        int oneElement;

        oneElement = Tag789SeqNextExpectedMsgSeqNum.TESTB_SEQ_NEXT_EXPECTED_MSG_SEQ_NUM;
        tagData = new Tag789SeqNextExpectedMsgSeqNum( new MySeqNumType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag789SeqNextExpectedMsgSeqNum tagData;
        int oneElement;

        oneElement = Tag789SeqNextExpectedMsgSeqNum.TESTB_SEQ_NEXT_EXPECTED_MSG_SEQ_NUM;
        tagData = new Tag789SeqNextExpectedMsgSeqNum( new MySeqNumType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag789SeqNextExpectedMsgSeqNum tagData;
        int oneElement;

        oneElement = Tag789SeqNextExpectedMsgSeqNum.TESTA_SEQ_NEXT_EXPECTED_MSG_SEQ_NUM;
        tagData = new Tag789SeqNextExpectedMsgSeqNum( new MySeqNumType( oneElement ) );
        assertEquals( "Tag789SeqNextExpectedMsgSeqNum\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}