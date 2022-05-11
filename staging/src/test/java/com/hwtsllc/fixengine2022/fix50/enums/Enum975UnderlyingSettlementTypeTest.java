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

package com.hwtsllc.fixengine2022.fix50.enums;

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
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
        assertEquals( "2", enumType.getID() );
        assertEquals( "T_PLUS_1", enumType.getName() );
        assertEquals( "2 - T+1", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum975UnderlyingSettlementType.T_PLUS_3;
        assertEquals( "4", enumType.getID() );
        assertEquals( "T_PLUS_3", enumType.getName() );
        assertEquals( "4 - T+3", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum975UnderlyingSettlementType.T_PLUS_4;
        assertEquals( "5", enumType.getID() );
        assertEquals( "T_PLUS_4", enumType.getName() );
        assertEquals( "5 - T+4", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}