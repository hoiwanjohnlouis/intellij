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
 *  1093
 *  LotType
 *  char
 *  <p>
 *  Defines the lot type assigned to the order.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Odd Lot
 *  <p>    2 - Round Lot
 *  <p>    3 - Block Lot
 */
class Enum1093LotTypeTest {
    @Test
    void EnumTest() {
        Enum1093LotType enumType;

        enumType = Enum1093LotType.ODD_LOT;
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "ODD_LOT", enumType.toFIXNameString() );
        assertEquals( "1 - Odd Lot", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1093LotType.ROUND_LOT;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "ROUND_LOT", enumType.toFIXNameString() );
        assertEquals( "2 - Round Lot", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1093LotType.BLOCK_LOT;
        assertEquals( "3", enumType.toFIXIDString() );
        assertEquals( "BLOCK_LOT", enumType.toFIXNameString() );
        assertEquals( "3 - Block Lot", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}