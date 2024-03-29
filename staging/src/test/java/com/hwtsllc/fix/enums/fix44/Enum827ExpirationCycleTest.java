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

package com.hwtsllc.fix.enums.fix44;

import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  827
 *  ExpirationCycle
 *  int
 *  <p></p>
 *  Part of trading cycle when an instrument expires. Field is applicable for derivatives.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Expire on trading session close (default)
 *  <p>    1 - Expire on trading session open
 */
class Enum827ExpirationCycleTest {
    @Test
    void EnumTest() {
        Enum827ExpirationCycle enumType;

        enumType = Enum827ExpirationCycle.EXPIRE_ON_CLOSE;
        assertEquals( "0", enumType.toFIXIDString() );
        assertEquals( "EXPIRE_ON_CLOSE", enumType.toFIXNameString() );
        assertEquals( "0 - Expire on trading session close (default)", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum827ExpirationCycle.EXPIRE_ON_OPEN;
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "EXPIRE_ON_OPEN", enumType.toFIXNameString() );
        assertEquals( "1 - Expire on trading session open", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}