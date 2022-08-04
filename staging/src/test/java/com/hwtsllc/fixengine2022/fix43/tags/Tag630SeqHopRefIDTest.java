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

import com.hwtsllc.fixengine2022.datatypes.MySeqNumType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  630
 *  HopRefID
 *  SeqNum
 *  <p></p>
 *  Reference identifier assigned by HopCompID (628) associated with the message sent.
 *  <p></p>
 *  It is recommended that this value be the MsgSeqNum (34) of the message sent by the third party.
 *  <p></p>
 *  Applicable when messages are communicated/re-distributed via third parties
 *  which function as service bureaus or "hubs".
 *  <p></p>
 *  Only applicable if OnBehalfOfCompID (115) is being used.
 */
class Tag630SeqHopRefIDTest {
    Tag630SeqHopRefID tagData;
    int [] TestArray = {
            Tag630SeqHopRefID.TESTA_SEQ_HOP_REF_ID,
            Tag630SeqHopRefID.TESTB_SEQ_HOP_REF_ID
    };

    @Test
    void PrintTest() {
        // process array of tags
        for ( int oneElement : TestArray ) {
            tagData = new Tag630SeqHopRefID( new MySeqNumType( oneElement ));
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // process array of tags
        for ( int oneElement : TestArray ) {
            tagData = new Tag630SeqHopRefID( new MySeqNumType( oneElement ));
            assertEquals( "FIX630_SEQ_HOP_REF_ID", tagData.toEnumLabelString());
            assertEquals( "630", tagData.toEnumIDString());
            assertEquals( "HOP_REF_ID", tagData.toEnumNameString());
            assertEquals( "HopRefID", tagData.toEnumDescriptionString());
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
            tagData = new Tag630SeqHopRefID( new MySeqNumType( oneElement ));
            assertEquals( oneElement, tagData.getDataValue() );
            assertNotEquals( MyTestValues.JUNK_SEQ_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // process array of tags
        for ( int oneElement : TestArray ) {
            tagData = new Tag630SeqHopRefID( new MySeqNumType( oneElement ));
            assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
        }
    }
    @Test
    void TagToStringTest() {
        // process array of tags
        for ( int oneElement : TestArray ) {
            tagData = new Tag630SeqHopRefID( new MySeqNumType( oneElement ));
            assertEquals( String.valueOf( oneElement ), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // process array of tags
        for ( int oneElement : TestArray ) {
            tagData = new Tag630SeqHopRefID( new MySeqNumType( oneElement ));
            assertEquals( "Tag630SeqHopRefID\n" +
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