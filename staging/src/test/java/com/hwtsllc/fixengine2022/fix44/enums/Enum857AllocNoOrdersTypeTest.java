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
 *  857
 *  AllocNoOrdersType
 *  int
 *  Indicates how the orders being booked and allocated by an Allocation Instruction or Allocation
 *  Report message are identified, i.e. by explicit definition in the NoOrders group or not.
 *  Valid values:
 *      0 - Not Specified
 *      1 - Explicit List Provided
 */
class Enum857AllocNoOrdersTypeTest {
    @Test
    void EnumTest() {
        Enum857AllocNoOrdersType enumType;

        enumType = Enum857AllocNoOrdersType.NOT_SPECIFIED;
        assertEquals( "0", enumType.getID() );
        assertEquals( "NOT_SPECIFIED", enumType.getName() );
        assertEquals( "0 - Not Specified", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum857AllocNoOrdersType.LIST_PROVIDED;
        assertEquals( "1", enumType.getID() );
        assertEquals( "LIST_PROVIDED", enumType.getName() );
        assertEquals( "1 - Explicit List Provided", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}