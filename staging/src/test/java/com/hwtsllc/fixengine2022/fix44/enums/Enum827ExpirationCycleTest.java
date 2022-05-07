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

/**
 *  827
 *  ExpirationCycle
 *  int
 *  Part of trading cycle when an instrument expires. Field is applicable for derivatives.
 *  Valid values:
 *      0 - Expire on trading session close (default)
 *      1 - Expire on trading session open
 */
class Enum827ExpirationCycleTest {
    @Test
    void EnumTest() {
        Enum827ExpirationCycle enumType;

        enumType = Enum827ExpirationCycle.EXPIRE_ON_CLOSE;
        assertEquals( "0", enumType.getID() );
        assertEquals( "EXPIRE_ON_CLOSE", enumType.getName() );
        assertEquals( "0 - Expire on trading session close (default)", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum827ExpirationCycle.EXPIRE_ON_OPEN;
        assertEquals( "1", enumType.getID() );
        assertEquals( "EXPIRE_ON_OPEN", enumType.getName() );
        assertEquals( "1 - Expire on trading session open", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}