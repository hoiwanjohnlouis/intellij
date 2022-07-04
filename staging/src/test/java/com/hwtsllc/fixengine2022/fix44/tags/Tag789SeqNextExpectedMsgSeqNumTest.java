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
        assertEquals( "789", fixData.toEnumIDString());
        assertEquals( "NEXT_EXPECTED_MSG_SEQ_NUM", fixData.toEnumNameString());
        assertEquals( "NextExpectedMsgSeqNum", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0789Test() {
        Tag789SeqNextExpectedMsgSeqNum tagData;
        int oneElement;

        oneElement = Tag789SeqNextExpectedMsgSeqNum.TESTA_SEQ_NEXT_EXPECTED_MSG_SEQ_NUM;
        tagData = new Tag789SeqNextExpectedMsgSeqNum( new MySeqNumType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_SEQ_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "789", tagData.toEnumIDString());
        assertEquals( "NEXT_EXPECTED_MSG_SEQ_NUM", tagData.toEnumNameString());
        assertEquals( "NextExpectedMsgSeqNum", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

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
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
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
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}