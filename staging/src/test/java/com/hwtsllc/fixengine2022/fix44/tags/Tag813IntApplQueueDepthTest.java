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
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  813
 *  ApplQueueDepth
 *  int
 *  <p></p>
 *  Current number of application messages that were queued
 *  at the time that the message was created by the counterparty.
 */
class Tag813IntApplQueueDepthTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX813_INT_APPL_QUEUE_DEPTH;
        assertEquals( "813", fixData.toFIXIDString());
        assertEquals( "APPL_QUEUE_DEPTH", fixData.toFIXNameString());
        assertEquals( "ApplQueueDepth", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0813Test() {
        Tag813IntApplQueueDepth tagData;
        int oneElement;

        oneElement = Tag813IntApplQueueDepth.TESTA_INT_APPL_QUEUE_DEPTH;
        tagData = new Tag813IntApplQueueDepth( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
        assertEquals( "813", tagData.toFIXIDString());
        assertEquals( "APPL_QUEUE_DEPTH", tagData.toFIXNameString());
        assertEquals( "ApplQueueDepth", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag813IntApplQueueDepth.TESTB_INT_APPL_QUEUE_DEPTH;
        tagData = new Tag813IntApplQueueDepth( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag813IntApplQueueDepth tagData;
        int oneElement;

        oneElement = Tag813IntApplQueueDepth.TESTA_INT_APPL_QUEUE_DEPTH;
        tagData = new Tag813IntApplQueueDepth( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag813IntApplQueueDepth.TESTB_INT_APPL_QUEUE_DEPTH;
        tagData = new Tag813IntApplQueueDepth( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag813IntApplQueueDepth tagData;
        int oneElement;

        oneElement = Tag813IntApplQueueDepth.TESTB_INT_APPL_QUEUE_DEPTH;
        tagData = new Tag813IntApplQueueDepth( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag813IntApplQueueDepth tagData;
        int oneElement;

        oneElement = Tag813IntApplQueueDepth.TESTB_INT_APPL_QUEUE_DEPTH;
        tagData = new Tag813IntApplQueueDepth( new MyIntType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag813IntApplQueueDepth tagData;
        int oneElement;

        oneElement = Tag813IntApplQueueDepth.TESTB_INT_APPL_QUEUE_DEPTH;
        tagData = new Tag813IntApplQueueDepth( new MyIntType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag813IntApplQueueDepth tagData;
        int oneElement;

        oneElement = Tag813IntApplQueueDepth.TESTA_INT_APPL_QUEUE_DEPTH;
        tagData = new Tag813IntApplQueueDepth( new MyIntType( oneElement ) );
        assertEquals( "Tag813IntApplQueueDepth\n" +
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