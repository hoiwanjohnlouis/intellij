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

import com.hwtsllc.fixengine2022.datatypes.MySeqNumType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  34
 *  MsgSeqNum
 *  SeqNum
 *  <p></p>
 *  Integer message sequence number.
 */
class Tag34SeqMsgSeqNumTest {
    @Test
    void PrintFIXTagTest() {
        Tag34SeqMsgSeqNum tagData;
        int oneElement;

        oneElement = Tag34SeqMsgSeqNum.TESTA_SEQ_MSG_SEQ_NO;
        tagData = new Tag34SeqMsgSeqNum(new MySeqNumType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag34SeqMsgSeqNum.TESTB_SEQ_MSG_SEQ_NO;
        tagData = new Tag34SeqMsgSeqNum(new MySeqNumType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag34SeqMsgSeqNum tagData;
        int oneElement;

        oneElement = Tag34SeqMsgSeqNum.TESTA_SEQ_MSG_SEQ_NO;
        tagData = new Tag34SeqMsgSeqNum(new MySeqNumType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag34SeqMsgSeqNum.TESTB_SEQ_MSG_SEQ_NO;
        tagData = new Tag34SeqMsgSeqNum(new MySeqNumType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag34SeqMsgSeqNum tagData ) {
        assertEquals( "FIX34_SEQ_MSG_SEQ_NUM", tagData.toEnumLabelString());
        assertEquals( "MSG_SEQ_NUM", tagData.toEnumNameString());
        assertEquals( "34", tagData.toEnumIDString());
        assertEquals( "MsgSeqNum", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag34SeqMsgSeqNum tagData;
        int oneElement;

        oneElement = Tag34SeqMsgSeqNum.TESTA_SEQ_MSG_SEQ_NO;
        tagData = new Tag34SeqMsgSeqNum(new MySeqNumType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag34SeqMsgSeqNum.TESTB_SEQ_MSG_SEQ_NO;
        tagData = new Tag34SeqMsgSeqNum(new MySeqNumType( oneElement ));
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag34SeqMsgSeqNum tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_SEQ_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag34SeqMsgSeqNum tagData;
        int oneElement;

        oneElement = Tag34SeqMsgSeqNum.TESTA_SEQ_MSG_SEQ_NO;
        tagData = new Tag34SeqMsgSeqNum(new MySeqNumType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag34SeqMsgSeqNum.TESTB_SEQ_MSG_SEQ_NO;
        tagData = new Tag34SeqMsgSeqNum(new MySeqNumType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag34SeqMsgSeqNum tagData, final int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag34SeqMsgSeqNum tagData;
        int oneElement;

        oneElement = Tag34SeqMsgSeqNum.TESTA_SEQ_MSG_SEQ_NO;
        tagData = new Tag34SeqMsgSeqNum(new MySeqNumType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag34SeqMsgSeqNum.TESTB_SEQ_MSG_SEQ_NO;
        tagData = new Tag34SeqMsgSeqNum(new MySeqNumType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag34SeqMsgSeqNum tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag34SeqMsgSeqNum tagData;
        int oneElement;

        oneElement = Tag34SeqMsgSeqNum.TESTA_SEQ_MSG_SEQ_NO;
        tagData = new Tag34SeqMsgSeqNum(new MySeqNumType( oneElement ));
        verifyVerboseString( tagData, oneElement );

        oneElement = Tag34SeqMsgSeqNum.TESTB_SEQ_MSG_SEQ_NO;
        tagData = new Tag34SeqMsgSeqNum(new MySeqNumType( oneElement ));
        verifyVerboseString( tagData, oneElement );
    }

    private void verifyVerboseString( final Tag34SeqMsgSeqNum tagData, final int oneElement ) {
        assertEquals( "Tag34SeqMsgSeqNum\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + tagData.getDataValue() + "]\n" +
                        "\tValuePair[" + tagData.toValuePairString() + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}