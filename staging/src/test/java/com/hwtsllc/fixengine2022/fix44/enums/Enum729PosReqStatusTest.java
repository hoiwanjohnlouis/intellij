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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  729
 *  PosReqStatus
 *  int
 *  <p></p>
 *  Status of Request for Positions
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Completed
 *  <p>    1 - Completed With Warnings
 *  <p>    2 - Rejected
 */
class Enum729PosReqStatusTest {
    @Test
    void EnumTest() {
        Enum729PosReqStatus enumType;

        enumType = Enum729PosReqStatus.COMPLETED;
        assertEquals( "0", enumType.toFIXIDString());
        assertEquals( "COMPLETED", enumType.toFIXNameString());
        assertEquals( "0 - Completed", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum729PosReqStatus.COMPLETED_WITH_WARNINGS;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "COMPLETED_WITH_WARNINGS", enumType.toFIXNameString());
        assertEquals( "1 - Completed With Warnings", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum729PosReqStatus.REJECTED;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "REJECTED", enumType.toFIXNameString());
        assertEquals( "2 - Rejected", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}