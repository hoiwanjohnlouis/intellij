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

package com.hwtsllc.fixengine2022.datatypes;

import org.junit.jupiter.api.Test;

/**
 *  814
 *  ApplQueueResolution
 *  Resolution taken when ApplQueueDepth (813) exceeds ApplQueueMax (812)
 *  or system specified maximum queue size.
 *  Valid values:
 *      0 - No Action Taken
 *      1 - Queue Flushed
 *      2 - Overlay Last
 *      3 - End Session
 */
class MyEnumApplQueueTest {
    @Test
    void EnumTest() {
        MyEnumApplQueue enumType;

        enumType = MyEnumApplQueue.NO_ACTION;
        enumType = MyEnumApplQueue.QUEUE_FLUSHED;
        enumType = MyEnumApplQueue.OVERLAY_LAST;
        enumType = MyEnumApplQueue.END_SESSION;
    }
}