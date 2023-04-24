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

package com.hwtsllc.fixengine.tags.fix50.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1109
 *  TriggerPriceDirection
 *  char
 *  <p>
 *  The side from which the trigger price is reached.
 *  <p></p>
 *  Valid values:
 *  <p>    U - Trigger if the price of the specified type goes UP to or through the specified Trigger Price
 *  <p>    D - Trigger if the price of the specified type goes DOWN to or through the specified Trigger Price
 */
class Enum1109TriggerPriceDirectionTest {
    @Test
    void EnumTest() {
        Enum1109TriggerPriceDirection enumType;

        enumType = Enum1109TriggerPriceDirection.TRIGGER_UP;
        assertEquals( "U", enumType.toFIXIDString() );
        assertEquals( "TRIGGER_UP", enumType.toFIXNameString() );
        assertEquals( "U - Trigger if the price of the specified type goes UP to or through the specified Trigger Price", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1109TriggerPriceDirection.TRIGGER_DOWN;
        assertEquals( "D", enumType.toFIXIDString() );
        assertEquals( "TRIGGER_DOWN", enumType.toFIXNameString() );
        assertEquals( "D - Trigger if the price of the specified type goes DOWN to or through the specified Trigger Price", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}