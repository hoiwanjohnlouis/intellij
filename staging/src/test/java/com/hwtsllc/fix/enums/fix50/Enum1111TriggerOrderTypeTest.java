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

package com.hwtsllc.fix.enums.fix50;

import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1111
 *  TriggerOrderType
 *  char
 *  <p>
 *  The OrdType the order should have after the trigger has hit.
 *  <p>
 *  Required to express orders that change from Limit to Market.
 *  <p>
 *  Other values from OrdType (40) may be used if appropriate and bilaterally agreed upon.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Market
 *  <p>    2 - Limit
 */
class Enum1111TriggerOrderTypeTest {
    @Test
    void EnumTest() {
        Enum1111TriggerOrderType enumType;

        enumType = Enum1111TriggerOrderType.MARKET;
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "MARKET", enumType.toFIXNameString() );
        assertEquals( "1 - Market", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1111TriggerOrderType.LIMIT;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "LIMIT", enumType.toFIXNameString() );
        assertEquals( "2 - Limit", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}