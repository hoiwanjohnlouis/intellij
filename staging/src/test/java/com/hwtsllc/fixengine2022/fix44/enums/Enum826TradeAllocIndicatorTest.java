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
 *  826
 *  TradeAllocIndicator
 *  int
 *  Identifies how the trade is to be allocated
 *  Valid values:
 *      0 - Allocation not required
 *      1 - Allocation required (give-up trade) allocation information not provided (incomplete)
 *      2 - Use allocation provided with the trade
 *      3 - Allocation give-up executor
 *      4 - Allocation from executor
 *      5 - Allocation to claim account
 */
class Enum826TradeAllocIndicatorTest {
    @Test
    void EnumTest() {
        Enum826TradeAllocIndicator enumType;

        enumType = Enum826TradeAllocIndicator.NOT_REQUIRED;
        assertEquals( "0", enumType.getID() );
        assertEquals( "NOT_REQUIRED", enumType.getName() );
        assertEquals( "0 - Allocation not required", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum826TradeAllocIndicator.REQUIRED;
        assertEquals( "1", enumType.getID() );
        assertEquals( "REQUIRED", enumType.getName() );
        assertEquals( "1 - Allocation required (give-up trade) allocation information not provided (incomplete)", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum826TradeAllocIndicator.USE_PROVIDED_INFO;
        assertEquals( "2", enumType.getID() );
        assertEquals( "USE_PROVIDED_INFO", enumType.getName() );
        assertEquals( "2 - Use allocation provided with the trade", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum826TradeAllocIndicator.GIVE_UP_EXECUTOR;
        assertEquals( "3", enumType.getID() );
        assertEquals( "GIVE_UP_EXECUTOR", enumType.getName() );
        assertEquals( "3 - Allocation give-up executor", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum826TradeAllocIndicator.FROM_EXECUTOR;
        assertEquals( "4", enumType.getID() );
        assertEquals( "FROM_EXECUTOR", enumType.getName() );
        assertEquals( "4 - Allocation from executor", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum826TradeAllocIndicator.CLAIM_ACCOUNT;
        assertEquals( "5", enumType.getID() );
        assertEquals( "CLAIM_ACCOUNT", enumType.getName() );
        assertEquals( "5 - Allocation to claim account", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}