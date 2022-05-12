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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1100
 *  TriggerType
 *  char
 *  <p>
 *  Defines when the trigger will hit,
 *  i.e. the action specified by the trigger instructions will come into effect.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Partial Execution
 *  <p>    2 - Specified Trading Session
 *  <p>    3 - Next Auction
 *  <p>    4 - Price Movement
 */
class Enum1100TriggerTypeTest {
    @Test
    void EnumTest() {
        Enum1100TriggerType enumType;

        enumType = Enum1100TriggerType.PARTIAL_EXECUTION;
        assertEquals( "1", enumType.getID() );
        assertEquals( "PARTIAL_EXECUTION", enumType.getName() );
        assertEquals( "1 - Partial Execution", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1100TriggerType.SPECIFIED_SESSION;
        assertEquals( "2", enumType.getID() );
        assertEquals( "SPECIFIED_SESSION", enumType.getName() );
        assertEquals( "2 - Specified Trading Session", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1100TriggerType.NEXT_AUCTION;
        assertEquals( "3", enumType.getID() );
        assertEquals( "NEXT_AUCTION", enumType.getName() );
        assertEquals( "3 - Next Auction", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1100TriggerType.PRICE_MOVEMENT;
        assertEquals( "4", enumType.getID() );
        assertEquals( "PRICE_MOVEMENT", enumType.getName() );
        assertEquals( "4 - Price Movement", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}