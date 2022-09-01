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
 *  <p></p>
 *  Identifies how the trade is to be allocated
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Allocation not required
 *  <p>    1 - Allocation required (give-up trade) allocation information not
 *          provided (incomplete)
 *  <p>    2 - Use allocation provided with the trade
 *  <p>    3 - Allocation give-up executor
 *  <p>    4 - Allocation from executor
 *  <p></p>
 *  <p>    5 - Allocation to claim account
 */
class Enum826TradeAllocIndicatorTest {
    @Test
    void EnumTest() {
        Enum826TradeAllocIndicator enumType;

        enumType = Enum826TradeAllocIndicator.NOT_REQUIRED;
        assertEquals( "0", enumType.toFIXIDString() );
        assertEquals( "NOT_REQUIRED", enumType.toEnumNameString() );
        assertEquals( "0 - Allocation not required", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum826TradeAllocIndicator.REQUIRED;
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "REQUIRED", enumType.toEnumNameString() );
        assertEquals( "1 - Allocation required (give-up trade) allocation information not provided (incomplete)", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum826TradeAllocIndicator.USE_PROVIDED_INFO;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "USE_PROVIDED_INFO", enumType.toEnumNameString() );
        assertEquals( "2 - Use allocation provided with the trade", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum826TradeAllocIndicator.GIVE_UP_EXECUTOR;
        assertEquals( "3", enumType.toFIXIDString() );
        assertEquals( "GIVE_UP_EXECUTOR", enumType.toEnumNameString() );
        assertEquals( "3 - Allocation give-up executor", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum826TradeAllocIndicator.FROM_EXECUTOR;
        assertEquals( "4", enumType.toFIXIDString() );
        assertEquals( "FROM_EXECUTOR", enumType.toEnumNameString() );
        assertEquals( "4 - Allocation from executor", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum826TradeAllocIndicator.CLAIM_ACCOUNT;
        assertEquals( "5", enumType.toFIXIDString() );
        assertEquals( "CLAIM_ACCOUNT", enumType.toEnumNameString() );
        assertEquals( "5 - Allocation to claim account", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}