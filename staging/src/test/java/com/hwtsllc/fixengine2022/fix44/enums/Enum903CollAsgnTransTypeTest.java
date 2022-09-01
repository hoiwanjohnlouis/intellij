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
 *  903
 *  CollAsgnTransType
 *  int
 *  <p></p>
 *  Collateral Assignment Transaction Type
 *  <p></p>
 *  Valid values:
 *  <p>    0 - New
 *  <p>    1 - Replace
 *  <p>    2 - Cancel
 *  <p>    3 - Release
 *  <p>    4 - Reverse
 */
class Enum903CollAsgnTransTypeTest {
    @Test
    void EnumTest() {
        Enum903CollAsgnTransType enumType;

        enumType = Enum903CollAsgnTransType.NEW;
        assertEquals( "0", enumType.toFIXIDString() );
        assertEquals( "NEW", enumType.toFIXNameString() );
        assertEquals( "0 - New", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum903CollAsgnTransType.REPLACE;
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "REPLACE", enumType.toFIXNameString() );
        assertEquals( "1 - Replace", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum903CollAsgnTransType.CANCEL;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "CANCEL", enumType.toFIXNameString() );
        assertEquals( "2 - Cancel", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum903CollAsgnTransType.RELEASE;
        assertEquals( "3", enumType.toFIXIDString() );
        assertEquals( "RELEASE", enumType.toFIXNameString() );
        assertEquals( "3 - Release", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum903CollAsgnTransType.REVERSE;
        assertEquals( "4", enumType.toFIXIDString() );
        assertEquals( "REVERSE", enumType.toFIXNameString() );
        assertEquals( "4 - Reverse", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}