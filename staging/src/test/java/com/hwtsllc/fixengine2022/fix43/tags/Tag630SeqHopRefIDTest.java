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
        assertEquals( "630", fixData.toEnumIDString());
        assertEquals( "HOP_REF_ID", fixData.toEnumNameString());
        assertEquals( "HopRefID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0630Test() {
        Tag630SeqHopRefID tagData;
        int oneElement;

        oneElement = Tag630SeqHopRefID.TESTA_SEQ_HOP_REF_ID;
        tagData = new Tag630SeqHopRefID( new MySeqNumType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_SEQ_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag630SeqHopRefID.TESTB_SEQ_HOP_REF_ID;
        tagData = new Tag630SeqHopRefID( new MySeqNumType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_SEQ_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag630SeqHopRefID tagData;
        int oneElement;

        oneElement = Tag630SeqHopRefID.TESTA_SEQ_HOP_REF_ID;
        tagData = new Tag630SeqHopRefID( new MySeqNumType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag630SeqHopRefID.TESTB_SEQ_HOP_REF_ID;
        tagData = new Tag630SeqHopRefID( new MySeqNumType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag630SeqHopRefID tagData;
        int oneElement;

        oneElement = Tag630SeqHopRefID.TESTB_SEQ_HOP_REF_ID;
        tagData = new Tag630SeqHopRefID( new MySeqNumType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_SEQ_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag630SeqHopRefID tagData;
        int oneElement;

        oneElement = Tag630SeqHopRefID.TESTB_SEQ_HOP_REF_ID;
        tagData = new Tag630SeqHopRefID( new MySeqNumType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag630SeqHopRefID tagData;
        int oneElement;

        oneElement = Tag630SeqHopRefID.TESTB_SEQ_HOP_REF_ID;
        tagData = new Tag630SeqHopRefID( new MySeqNumType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag630SeqHopRefID tagData;
        int oneElement;

        oneElement = Tag630SeqHopRefID.TESTA_SEQ_HOP_REF_ID;
        tagData = new Tag630SeqHopRefID( new MySeqNumType( oneElement ) );
        assertEquals( "Tag630SeqHopRefID\n" +
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