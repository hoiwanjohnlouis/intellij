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

import com.hwtsllc.fixengine2022.datatypes.MyEnumApplQueue;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  814 (same as 814, 815)
 *  ApplQueueResolution
 *  int
 *  <p>
 *  Resolution taken when ApplQueueDepth (813) exceeds ApplQueueMax (812)
 *  or system specified maximum queue size.
 *  <p></p>
 *  815 (same as 814, 815)
 *  ApplQueueAction
 *  int
 *  <p>
 *  Action to take to resolve an application message queue (backlog).
 *  <p></p>
 *  Valid values:
 *  <p>    0 - No Action Taken
 *  <p>    1 - Queue Flushed
 *  <p>    2 - Overlay Last
 *  <p>    3 - End Session
 */
class Tag814EnuApplQueueResolutionTest {
    Tag814EnuApplQueueResolution tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumApplQueue oneEnum : MyEnumApplQueue.values()) {
            tagData = new Tag814EnuApplQueueResolution(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumApplQueue oneEnum : MyEnumApplQueue.values()) {
            tagData = new Tag814EnuApplQueueResolution(oneEnum);
            assertEquals( "FIX814_ENU_APPL_QUEUE_RESOLUTION", tagData.toEnumLabelString());
            assertEquals( "814", tagData.toEnumIDString());
            assertEquals( "APPL_QUEUE_RESOLUTION", tagData.toEnumNameString());
            assertEquals( "ApplQueueResolution", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  <p>    0 - No Action Taken
         *  <p>    1 - Queue Flushed
         *  <p>    2 - Overlay Last
         *  <p>    3 - End Session
         */
        tagData = new Tag814EnuApplQueueResolution( MyEnumApplQueue.NO_ACTION );
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag814EnuApplQueueResolution(MyEnumApplQueue.QUEUE_FLUSHED);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag814EnuApplQueueResolution(MyEnumApplQueue.OVERLAY_LAST);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag814EnuApplQueueResolution(MyEnumApplQueue.END_SESSION);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( MyEnumApplQueue oneEnum : MyEnumApplQueue.values()) {
            tagData = new Tag814EnuApplQueueResolution(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumApplQueue oneEnum : MyEnumApplQueue.values()) {
            tagData = new Tag814EnuApplQueueResolution(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( MyEnumApplQueue oneEnum : MyEnumApplQueue.values()) {
            tagData = new Tag814EnuApplQueueResolution(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumApplQueue oneEnum : MyEnumApplQueue.values()) {
            tagData = new Tag814EnuApplQueueResolution(oneEnum);
            assertEquals( "Tag814EnuApplQueueResolution\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}