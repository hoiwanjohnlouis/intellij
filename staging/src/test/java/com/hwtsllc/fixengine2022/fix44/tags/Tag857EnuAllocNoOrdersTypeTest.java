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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix44.enums.Enum857AllocNoOrdersType;
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
class Tag857EnuAllocNoOrdersTypeTest {
    @Test
    void FIX0857Test() {
        FIX44 fixData = FIX44.FIX857_ENU_ALLOC_NO_ORDERS_TYPE;
        assertEquals( "857", fixData.getID());
        assertEquals( "ALLOC_NO_ORDERS_TYPE", fixData.getName());
        assertEquals( "AllocNoOrdersType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0857Test() {
        Log857EnuAllocNoOrdersType tagData;

        tagData = new Log857EnuAllocNoOrdersType( Enum857AllocNoOrdersType.NOT_SPECIFIED );
        assertEquals( Enum857AllocNoOrdersType.NOT_SPECIFIED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log857EnuAllocNoOrdersType( Enum857AllocNoOrdersType.LIST_PROVIDED );
        assertEquals( Enum857AllocNoOrdersType.LIST_PROVIDED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}