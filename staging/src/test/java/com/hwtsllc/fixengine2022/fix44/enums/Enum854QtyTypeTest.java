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
 *  854
 *  QtyType
 *  int
 *  <p></p>
 *  Type of quantity specified in a quantity field:
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Units (shares, par, currency)
 *  <p>    1 - Contracts (if used - must specify ContractMultiplier (tag 231))
 *  <p>    2 - Units of Measure per Time Unit
 *          (if used - must specify UnitofMeasure (tag 996) and TimeUnit (tag 997))
 */
class Enum854QtyTypeTest {
    @Test
    void EnumTest() {
        Enum854QtyType enumType;

        enumType = Enum854QtyType.UNITS;
        assertEquals( "0", enumType.toEnumIDString() );
        assertEquals( "UNITS", enumType.toEnumNameString() );
        assertEquals( "0 - Units (shares, par, currency)", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum854QtyType.CONTRACTS;
        assertEquals( "1", enumType.toEnumIDString() );
        assertEquals( "CONTRACTS", enumType.toEnumNameString() );
        assertEquals( "1 - Contracts (if used - must specify ContractMultiplier (tag 231))",
                enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum854QtyType.MEASURE_PER_TIME;
        assertEquals( "2", enumType.toEnumIDString() );
        assertEquals( "MEASURE_PER_TIME", enumType.toEnumNameString() );
        assertEquals( "2 - Units of Measure per Time Unit " +
                            "(if used - must specify UnitofMeasure (tag 996) and TimeUnit (tag 997))",
                enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}