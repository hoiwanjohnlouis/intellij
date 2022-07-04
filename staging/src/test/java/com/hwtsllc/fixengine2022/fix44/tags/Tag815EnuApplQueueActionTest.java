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
class Tag815EnuApplQueueActionTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX815_ENU_APPL_QUEUE_ACTION;
        assertEquals( "815", fixData.toEnumIDString());
        assertEquals( "APPL_QUEUE_ACTION", fixData.toEnumNameString());
        assertEquals( "ApplQueueAction", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0815Test() {
        Tag815EnuApplQueueAction tagData;
        MyEnumApplQueue oneElement;

        oneElement = MyEnumApplQueue.NO_ACTION;
        tagData = new Tag815EnuApplQueueAction( oneElement );
        assertEquals( oneElement.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "815", tagData.toEnumIDString());
        assertEquals( "APPL_QUEUE_ACTION", tagData.toEnumNameString());
        assertEquals( "ApplQueueAction", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag815EnuApplQueueAction(MyEnumApplQueue.QUEUE_FLUSHED);
        assertEquals( MyEnumApplQueue.QUEUE_FLUSHED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag815EnuApplQueueAction(MyEnumApplQueue.OVERLAY_LAST);
        assertEquals( MyEnumApplQueue.OVERLAY_LAST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag815EnuApplQueueAction(MyEnumApplQueue.END_SESSION);
        assertEquals( MyEnumApplQueue.END_SESSION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag815EnuApplQueueAction tagData;

        // loop around the ENUM and process
        for ( MyEnumApplQueue oneEnum : MyEnumApplQueue.values()) {
            tagData = new Tag815EnuApplQueueAction(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag815EnuApplQueueAction tagData;

        // loop around the ENUM and process
        for (MyEnumApplQueue oneEnum : MyEnumApplQueue.values()) {
            tagData = new Tag815EnuApplQueueAction(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag815EnuApplQueueAction tagData;

        // loop around the ENUM and process
        for (MyEnumApplQueue oneEnum : MyEnumApplQueue.values()) {
            tagData = new Tag815EnuApplQueueAction(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag815EnuApplQueueAction tagData;

        // loop around the ENUM and process
        for (MyEnumApplQueue oneEnum : MyEnumApplQueue.values()) {
            tagData = new Tag815EnuApplQueueAction(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag815EnuApplQueueAction tagData;

        // loop around the ENUM and process
        for (MyEnumApplQueue oneEnum : MyEnumApplQueue.values()) {
            tagData = new Tag815EnuApplQueueAction(oneEnum);
            assertEquals( "Tag815EnuApplQueueAction\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}