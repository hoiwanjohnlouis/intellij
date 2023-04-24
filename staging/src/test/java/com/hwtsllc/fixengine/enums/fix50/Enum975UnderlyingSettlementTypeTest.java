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

package com.hwtsllc.fixengine.enums.fix50;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  975
 *  UnderlyingSettlementType
 *  int
 *  <p>
 *  Indicates order settlement period for the underlying instrument.
 *  <p></p>
 *  Valid values:
 *  <p>    2 - T+1
 *  <p>    4 - T+3
 *  <p>    5 - T+4
 */
class Enum975UnderlyingSettlementTypeTest {
    @Test
    void EnumTest() {
        Enum975UnderlyingSettlementType enumType;

        enumType = Enum975UnderlyingSettlementType.T_PLUS_1;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "T_PLUS_1", enumType.toFIXNameString() );
        assertEquals( "2 - T+1", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum975UnderlyingSettlementType.T_PLUS_3;
        assertEquals( "4", enumType.toFIXIDString() );
        assertEquals( "T_PLUS_3", enumType.toFIXNameString() );
        assertEquals( "4 - T+3", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum975UnderlyingSettlementType.T_PLUS_4;
        assertEquals( "5", enumType.toFIXIDString() );
        assertEquals( "T_PLUS_4", enumType.toFIXNameString() );
        assertEquals( "5 - T+4", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}