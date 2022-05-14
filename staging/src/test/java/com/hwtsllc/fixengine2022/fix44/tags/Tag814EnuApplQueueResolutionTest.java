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
class Tag814EnuApplQueueResolutionTest {
    @Test
    void FIX0814Test() {
        FIX44 fixData = FIX44.FIX814_ENU_APPL_QUEUE_RESOLUTION;
        assertEquals( "814", fixData.getID());
        assertEquals( "APPL_QUEUE_RESOLUTION", fixData.getName());
        assertEquals( "ApplQueueResolution", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0814Test() {
        Tag814EnuApplQueueResolution tagData;

        tagData = new Tag814EnuApplQueueResolution(MyEnumApplQueue.NO_ACTION);
        assertEquals( MyEnumApplQueue.NO_ACTION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag814EnuApplQueueResolution(MyEnumApplQueue.QUEUE_FLUSHED);
        assertEquals( MyEnumApplQueue.QUEUE_FLUSHED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag814EnuApplQueueResolution(MyEnumApplQueue.OVERLAY_LAST);
        assertEquals( MyEnumApplQueue.OVERLAY_LAST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag814EnuApplQueueResolution(MyEnumApplQueue.END_SESSION);
        assertEquals( MyEnumApplQueue.END_SESSION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}