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

package com.hwtsllc.fixengine2022.fix50.enums;

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1008
 *  SideTrdSubTyp
 *  int
 *  <p>
 *  Used on a multi-sided trade to specify the type of trade for a given side
 *  <p></p>
 *  Valid values:
 *  <p>    0 - CMTA
 *  <p>    1 - Internal Transfer
 *  <p>    2 - External Transfer
 *  <p>    3 - Reject for Submitting Trade
 *  <p>    4 - Advisory for Contra Side
 *  <p></p>
 *  <p>    5 - Offset due to an allocation
 *  <p>    6 - Onset due to an allocation
 *  <p>    7 - Differential Spread
 *  <p>    8 - Implied Spread leg executed against an outright
 *  <p>    9 - Transaction from Exercise
 *  <p></p>
 *  <p>    10 - Transaction from Assignment
 */
class Enum1008SideTrdSubTypTest {
    @Test
    void EnumTest() {
        Enum1008SideTrdSubTyp enumType;

        enumType = Enum1008SideTrdSubTyp.CMTA;
        assertEquals( "0", enumType.getID() );
        assertEquals( "CMTA", enumType.getName() );
        assertEquals( "0 - CMTA", enumType.getDescription() );
        enumType = Enum1008SideTrdSubTyp.INTERNAL_TRANSFER;
        assertEquals( "1", enumType.getID() );
        assertEquals( "INTERNAL_TRANSFER", enumType.getName() );
        assertEquals( "1 - Internal Transfer", enumType.getDescription() );
        enumType = Enum1008SideTrdSubTyp.EXTERNAL_TRANSFER;
        assertEquals( "2", enumType.getID() );
        assertEquals( "EXTERNAL_TRANSFER", enumType.getName() );
        assertEquals( "2 - External Transfer", enumType.getDescription() );
        enumType = Enum1008SideTrdSubTyp.REJECT_SUBMISSION;
        assertEquals( "3", enumType.getID() );
        assertEquals( "REJECT_SUBMISSION", enumType.getName() );
        assertEquals( "3 - Reject for Submitting Trade", enumType.getDescription() );
        enumType = Enum1008SideTrdSubTyp.ADVISORY_FOR_CONTRA;
        assertEquals( "4", enumType.getID() );
        assertEquals( "ADVISORY_FOR_CONTRA", enumType.getName() );
        assertEquals( "4 - Advisory for Contra Side", enumType.getDescription() );

        enumType = Enum1008SideTrdSubTyp.OFFSET_DUE_TO_ALLOCATION;
        assertEquals( "5", enumType.getID() );
        assertEquals( "OFFSET_DUE_TO_ALLOCATION", enumType.getName() );
        assertEquals( "5 - Offset due to an allocation", enumType.getDescription() );
        enumType = Enum1008SideTrdSubTyp.ONSET_DUE_TO_ALLOCATION;
        assertEquals( "6", enumType.getID() );
        assertEquals( "ONSET_DUE_TO_ALLOCATION", enumType.getName() );
        assertEquals( "6 - Onset due to an allocation", enumType.getDescription() );
        enumType = Enum1008SideTrdSubTyp.DIFFERENTIAL_SPREAD;
        assertEquals( "7", enumType.getID() );
        assertEquals( "DIFFERENTIAL_SPREAD", enumType.getName() );
        assertEquals( "7 - Differential Spread", enumType.getDescription() );
        enumType = Enum1008SideTrdSubTyp.IMPLIED_SPREAD_LEG;
        assertEquals( "8", enumType.getID() );
        assertEquals( "IMPLIED_SPREAD_LEG", enumType.getName() );
        assertEquals( "8 - Implied Spread leg executed against an outright", enumType.getDescription() );
        enumType = Enum1008SideTrdSubTyp.TRANSACTION_FROM_EXERCISE;
        assertEquals( "9", enumType.getID() );
        assertEquals( "TRANSACTION_FROM_EXERCISE", enumType.getName() );
        assertEquals( "9 - Transaction from Exercise", enumType.getDescription() );

        enumType = Enum1008SideTrdSubTyp.TRANSACTION_FROM_ASSIGNMENT;
        assertEquals( "10", enumType.getID() );
        assertEquals( "TRANSACTION_FROM_ASSIGNMENT", enumType.getName() );
        assertEquals( "10 - Transaction from Assignment", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}