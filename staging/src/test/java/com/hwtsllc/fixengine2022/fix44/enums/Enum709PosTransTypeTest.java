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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum709PosTransTypeTest {
    /**
     *  709
     *  PosTransType
     *  Identifies the type of position transaction
     *  Valid values:
     *      1 - Exercise
     *      2 - Do Not Exercise
     *      3 - Position Adjustment
     *      4 - Position Change Submission or Margin Disposition
     *      5 - Pledge
     *      6 - Large Trader Submission
     */
    @Test
    void EnumTest() {
        Enum709PosTransType enumType;

        enumType = Enum709PosTransType.EXERCISE;
        assertEquals( "1", enumType.getID());
        assertEquals( "EXERCISE", enumType.getName());
        assertEquals( "1 - Exercise", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum709PosTransType.DO_NOT_EXERCISE;
        assertEquals( "2", enumType.getID());
        assertEquals( "DO_NOT_EXERCISE", enumType.getName());
        assertEquals( "2 - Do Not Exercise", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum709PosTransType.POSITION_ADJUSTMENT;
        assertEquals( "3", enumType.getID());
        assertEquals( "POSITION_ADJUSTMENT", enumType.getName());
        assertEquals( "3 - Position Adjustment", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum709PosTransType.MARGIN_DISPOSITION;
        assertEquals( "4", enumType.getID());
        assertEquals( "MARGIN_DISPOSITION", enumType.getName());
        assertEquals( "4 - Position Change Submission or Margin Disposition", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum709PosTransType.PLEDGE;
        assertEquals( "5", enumType.getID());
        assertEquals( "PLEDGE", enumType.getName());
        assertEquals( "5 - Pledge", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum709PosTransType.LARGE_TRADER_SUBMISSION;
        assertEquals( "6", enumType.getID());
        assertEquals( "LARGE_TRADER_SUBMISSION", enumType.getName());
        assertEquals( "6 - Large Trader Submission", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}