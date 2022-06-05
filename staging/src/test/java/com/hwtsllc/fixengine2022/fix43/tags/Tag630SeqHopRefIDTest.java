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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.MySeqNumType;
import com.hwtsllc.fixengine2022.fix42.tags.Tag630SeqHopRefID;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  630
 *  HopRefID
 *  SeqNum
 *  <p>
 *  Reference identifier assigned by HopCompID (628) associated with the message sent.
 *  <p>
 *  It is recommended that this value be the MsgSeqNum (34) of the message sent by the third party.
 *  <p>
 *  Applicable when messages are communicated/re-distributed via third parties
 *  which function as service bureaus or "hubs".
 *  <p>
 *  Only applicable if OnBehalfOfCompID (115) is being used.
 */
class Tag630SeqHopRefIDTest {
    @Test
    void FIX0630Test() {
        FIX43 fixData = FIX43.FIX630_SEQ_HOP_REF_ID;
        assertEquals( "630", fixData.toFIXIDString());
        assertEquals( "HOP_REF_ID", fixData.toFIXNameString());
        assertEquals( "HopRefID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0630Test() {
        Tag630SeqHopRefID tagData;

    }
    @Test
    void PrintFIXTagTest() {
        Tag630SeqHopRefID tagData;
        int oneElement;

        oneElement = Tag630SeqHopRefID.TESTA_SEQ_LAST_MSG_SEQ_NUM_PROCESSED;
        tagData = new Tag630SeqHopRefID( new MySeqNumType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag630SeqHopRefID.TESTB_SEQ_LAST_MSG_SEQ_NUM_PROCESSED;
        tagData = new Tag630SeqHopRefID( new MySeqNumType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag630SeqHopRefID tagData;
        int oneElement;

        oneElement = Tag630SeqHopRefID.TESTB_SEQ_LAST_MSG_SEQ_NUM_PROCESSED;
        tagData = new Tag630SeqHopRefID( new MySeqNumType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_SEQ_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag630SeqHopRefID tagData;
        int oneElement;

        oneElement = Tag630SeqHopRefID.TESTB_SEQ_LAST_MSG_SEQ_NUM_PROCESSED;
        tagData = new Tag630SeqHopRefID( new MySeqNumType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag630SeqHopRefID tagData;
        int oneElement;

        oneElement = Tag630SeqHopRefID.TESTB_SEQ_LAST_MSG_SEQ_NUM_PROCESSED;
        tagData = new Tag630SeqHopRefID( new MySeqNumType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag630SeqHopRefID tagData;
        int oneElement;

        oneElement = Tag630SeqHopRefID.TESTA_SEQ_LAST_MSG_SEQ_NUM_PROCESSED;
        tagData = new Tag630SeqHopRefID( new MySeqNumType( oneElement ) );
        assertEquals( "Tag630SeqHopRefID\n" +
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