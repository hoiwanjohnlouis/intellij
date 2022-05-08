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
 *  903
 *  CollAsgnTransType
 *  int
 *  Collateral Assignment Transaction Type
 *  Valid values:
 *      0 - New
 *      1 - Replace
 *      2 - Cancel
 *      3 - Release
 *      4 - Reverse
 */
class Enum903CollAsgnTransTypeTest {
    @Test
    void EnumTest() {
        Enum903CollAsgnTransType enumType;

        enumType = Enum903CollAsgnTransType.NEW;
        assertEquals( "0", enumType.getID() );
        assertEquals( "NEW", enumType.getName() );
        assertEquals( "0 - New", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum903CollAsgnTransType.REPLACE;
        assertEquals( "1", enumType.getID() );
        assertEquals( "REPLACE", enumType.getName() );
        assertEquals( "1 - Replace", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum903CollAsgnTransType.CANCEL;
        assertEquals( "2", enumType.getID() );
        assertEquals( "CANCEL", enumType.getName() );
        assertEquals( "2 - Cancel", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum903CollAsgnTransType.RELEASE;
        assertEquals( "3", enumType.getID() );
        assertEquals( "RELEASE", enumType.getName() );
        assertEquals( "3 - Release", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum903CollAsgnTransType.REVERSE;
        assertEquals( "4", enumType.getID() );
        assertEquals( "REVERSE", enumType.getName() );
        assertEquals( "4 - Reverse", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}