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
 *  812
 *  ApplQueueMax
 *  int
 *  <p></p>
 *  Used to specify the maximum number of application messages
 *  that can be queued before a corrective action needs to take
 *  place to resolve the queuing issue.
 */
class Tag812IntApplQueueMaxTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX812_INT_APPL_QUEUE_MAX;
        assertEquals( "812", fixData.toFIXIDString());
        assertEquals( "APPL_QUEUE_MAX", fixData.toFIXNameString());
        assertEquals( "ApplQueueMax", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0812Test() {
        Tag812IntApplQueueMax tagData;
        int oneElement;

        oneElement = Tag812IntApplQueueMax.TESTA_INT_APPL_QUEUE_MAX;
        tagData = new Tag812IntApplQueueMax( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
        assertEquals( "812", tagData.toFIXIDString());
        assertEquals( "APPL_QUEUE_MAX", tagData.toFIXNameString());
        assertEquals( "ApplQueueMax", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag812IntApplQueueMax.TESTB_INT_APPL_QUEUE_MAX;
        tagData = new Tag812IntApplQueueMax( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag812IntApplQueueMax tagData;
        int oneElement;

        oneElement = Tag812IntApplQueueMax.TESTA_INT_APPL_QUEUE_MAX;
        tagData = new Tag812IntApplQueueMax( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag812IntApplQueueMax.TESTB_INT_APPL_QUEUE_MAX;
        tagData = new Tag812IntApplQueueMax( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag812IntApplQueueMax tagData;
        int oneElement;

        oneElement = Tag812IntApplQueueMax.TESTB_INT_APPL_QUEUE_MAX;
        tagData = new Tag812IntApplQueueMax( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag812IntApplQueueMax tagData;
        int oneElement;

        oneElement = Tag812IntApplQueueMax.TESTB_INT_APPL_QUEUE_MAX;
        tagData = new Tag812IntApplQueueMax( new MyIntType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag812IntApplQueueMax tagData;
        int oneElement;

        oneElement = Tag812IntApplQueueMax.TESTB_INT_APPL_QUEUE_MAX;
        tagData = new Tag812IntApplQueueMax( new MyIntType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag812IntApplQueueMax tagData;
        int oneElement;

        oneElement = Tag812IntApplQueueMax.TESTA_INT_APPL_QUEUE_MAX;
        tagData = new Tag812IntApplQueueMax( new MyIntType( oneElement ) );
        assertEquals( "Tag812IntApplQueueMax\n" +
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