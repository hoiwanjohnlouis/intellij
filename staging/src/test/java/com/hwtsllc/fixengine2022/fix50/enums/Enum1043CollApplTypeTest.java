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
 *  1043
 *  CollApplType
 *  int
 *  <p>
 *  conveys how the collateral should be/has been applied
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Specific Deposit
 *  <p>    1 - General
 */
class Enum1043CollApplTypeTest {
    @Test
    void EnumTest() {
        Enum1043CollApplType enumType;

        enumType = Enum1043CollApplType.SPECIFIC_DEPOSIT;
        assertEquals( "0", enumType.getID() );
        assertEquals( "SPECIFIC_DEPOSIT", enumType.getName() );
        assertEquals( "0 - Specific Deposit", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1043CollApplType.GENERAL;
        assertEquals( "1", enumType.getID() );
        assertEquals( "GENERAL", enumType.getName() );
        assertEquals( "1 - General", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}