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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  68
 *  TotNoOrders
 *  int
 *  Total number of list order entries across all messages.
 *
 *  Should be the sum of all NoOrders (73) in each message that has
 *  repeating list order entries related to the same ListID (66).
 *  Used to support fragmentation.
 *
 *  (Prior to FIX 4.2 this field was named "ListNoOrds")
 */
class Tag68IntTotNoOrdersTest {
    @Test
    void FIX0068Test() {
        FIX27 fixData = FIX27.FIX68_INT_TOT_NO_ORDERS;
        assertEquals( "TOT_NO_ORDERS", fixData.getName());
        assertEquals( "68", fixData.getID());
        assertEquals( "TotNoOrders (formerly named: ListNoOrds)", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0068Test() {
        Log68IntTotNoOrders tagData;

        tagData = new Log68IntTotNoOrders(new MyIntType(123));
        assertEquals( 123, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
}