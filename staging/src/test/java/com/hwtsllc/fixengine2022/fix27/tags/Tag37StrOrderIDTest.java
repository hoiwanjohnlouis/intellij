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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  37
 *  OrderID
 *  String
 *  Unique identifier for Order as assigned by sell-side (broker, exchange, ECN).
 *  Uniqueness must be guaranteed within a single trading day.
 *  Firms which accept multi-day orders should consider
 *  embedding a date within the OrderID field to assure uniqueness across days.
 */
class Tag37StrOrderIDTest {
    @Test
    void FIX0037Test() {
        FIX27 fixData = FIX27.FIX37_STR_ORDER_ID;
        assertEquals( "ORDER_ID", fixData.getName());
        assertEquals( "37", fixData.getID());
        assertEquals( "OrderID", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0037Test() {
        Tag37StrOrderID tagData;

        tagData = new Tag37StrOrderID(new MyStringType("ORD-24601") );
        assertEquals( "ORD-24601", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}