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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.MySeqNumType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  369
 *  LastMsgSeqNumProcessed
 *  SeqNum
 *  <p>
 *  The last MsgSeqNum (34) value received by the FIX engine and processed by
 *  downstream application, such as trading engine or order routing system.
 *  <p>
 *  Can be specified on every message sent.
 *  <p></p>
 *  Useful for detecting a backlog with a counterparty.
 */
class Tag369SeqLastMsgSeqNumProcessedTest {
    Tag369SeqLastMsgSeqNumProcessed tagData;
    int [] TestArray = {
            Tag369SeqLastMsgSeqNumProcessed.TESTA_SEQ_LAST_MSG_SEQ_NUM_PROCESSED,
            Tag369SeqLastMsgSeqNumProcessed.TESTB_SEQ_LAST_MSG_SEQ_NUM_PROCESSED
    };

    @Test
    void PrintTest() {
        // process array of tags
        for ( int oneElement : TestArray ) {
            tagData = new Tag369SeqLastMsgSeqNumProcessed( new MySeqNumType( oneElement ));
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // process array of tags
        for ( int oneElement : TestArray ) {
            tagData = new Tag369SeqLastMsgSeqNumProcessed( new MySeqNumType( oneElement ));
            assertEquals( "FIX369_SEQ_LAST_MSG_SEQ_NUM_PROCESSED", tagData.toEnumLabelString());
            assertEquals( "369", tagData.toEnumIDString());
            assertEquals( "LAST_MSG_SEQ_NUM_PROCESSED", tagData.toEnumNameString());
            assertEquals( "LastMsgSeqNumProcessed", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        // process array of tags
        for ( int oneElement : TestArray ) {
            tagData = new Tag369SeqLastMsgSeqNumProcessed( new MySeqNumType( oneElement ));
            assertEquals( oneElement, tagData.getDataValue() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // process array of tags
        for ( int oneElement : TestArray ) {
            tagData = new Tag369SeqLastMsgSeqNumProcessed( new MySeqNumType( oneElement ));
            assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
        }
    }
    @Test
    void TagToStringTest() {
        // process array of tags
        for ( int oneElement : TestArray ) {
            tagData = new Tag369SeqLastMsgSeqNumProcessed( new MySeqNumType( oneElement ));
            assertEquals( String.valueOf( oneElement ), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // process array of tags
        for ( int oneElement : TestArray ) {
            tagData = new Tag369SeqLastMsgSeqNumProcessed( new MySeqNumType( oneElement ));
            assertEquals( "Tag369SeqLastMsgSeqNumProcessed\n" +
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
}