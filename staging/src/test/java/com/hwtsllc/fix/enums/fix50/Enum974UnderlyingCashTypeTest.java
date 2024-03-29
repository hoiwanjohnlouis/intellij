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
 *  974
 *  UnderlyingCashType
 *  String
 *  <p>
 *  Specific to the &lt;UnderlyingInstrument&gt; Used for derivatives that deliver into cash underlying.
 *  <p></p>
 *  Valid values:
 *  <p>    FIXED - FIXED
 *  <p>    DIFF - DIFF
 */
class Enum974UnderlyingCashTypeTest {
    @Test
    void EnumTest() {
        Enum974UnderlyingCashType enumType;

        enumType = Enum974UnderlyingCashType.FIXED;
        assertEquals( "FIXED", enumType.toFIXIDString() );
        assertEquals( "FIXED", enumType.toFIXNameString() );
        assertEquals( "FIXED - FIXED", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum974UnderlyingCashType.DIFF;
        assertEquals( "DIFF", enumType.toFIXIDString() );
        assertEquals( "DIFF", enumType.toFIXNameString() );
        assertEquals( "DIFF - DIFF", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}