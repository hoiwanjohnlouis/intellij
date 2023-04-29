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
 *  992
 *  IndividualAllocType
 *  int
 *  <p>
 *  Identifies whether the allocation is to be sub-allocated or allocated to a third party
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Sub Allocate
 *  <p>    2 - Third Party Allocation
 */
class Enum992IndividualAllocTypeTest {
    @Test
    void EnumTest() {
        Enum992IndividualAllocType enumType;

        enumType = Enum992IndividualAllocType.SUB_ALLOCATE;
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "SUB_ALLOCATE", enumType.toFIXNameString() );
        assertEquals( "1 - Sub Allocate", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum992IndividualAllocType.THIRD_PARTY_ALLOCATION;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "THIRD_PARTY_ALLOCATION", enumType.toFIXNameString() );
        assertEquals( "2 - Third Party Allocation", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}