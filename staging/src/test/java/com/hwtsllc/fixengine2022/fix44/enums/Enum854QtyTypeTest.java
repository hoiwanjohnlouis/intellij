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
 *  854
 *  QtyType
 *  int
 *  Type of quantity specified in a quantity field:
 *  Valid values:
 *      0 - Units (shares, par, currency)
 *      1 - Contracts (if used - must specify ContractMultiplier (tag 231))
 *      2 - Units of Measure per Time Unit (if used - must specify UnitofMeasure (tag 996) and TimeUnit (tag 997))
 */
class Enum854QtyTypeTest {
    @Test
    void EnumTest() {
        Enum854QtyType enumType;

        enumType = Enum854QtyType.UNITS;
        assertEquals( "0", enumType.getID() );
        assertEquals( "UNITS", enumType.getName() );
        assertEquals( "0 - Units (shares, par, currency)", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum854QtyType.CONTRACTS;
        assertEquals( "1", enumType.getID() );
        assertEquals( "CONTRACTS", enumType.getName() );
        assertEquals( "1 - Contracts (if used - must specify ContractMultiplier (tag 231))",
                enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum854QtyType.MEASURE_PER_TIME;
        assertEquals( "2", enumType.getID() );
        assertEquals( "MEASURE_PER_TIME", enumType.getName() );
        assertEquals( "2 - Units of Measure per Time Unit " +
                            "(if used - must specify UnitofMeasure (tag 996) and TimeUnit (tag 997))",
                enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}