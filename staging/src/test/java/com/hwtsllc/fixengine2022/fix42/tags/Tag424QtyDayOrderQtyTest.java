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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.MyQtyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  424
 *  DayOrderQty
 *  Qty
 *  <p>
 *  For GT orders, the OrderQty (38) less all quantity (adjusted for stock splits)
 *  that traded on previous days.
 *  <p>
 *  DayOrderQty (424) = OrderQty – (CumQty (14) – DayCumQty (425))
 */
class Tag424QtyDayOrderQtyTest {
    @Test
    void FIX0424Test() {
        FIX42 fixData = FIX42.FIX424_QTY_DAY_ORDER_QTY;
        assertEquals( "424", fixData.toFIXIDString());
        assertEquals( "DAY_ORDER_QTY", fixData.toFIXNameString());
        assertEquals( "DayOrderQty", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0424Test() {
        Tag424QtyDayOrderQty tagData;

        tagData = new Tag424QtyDayOrderQty(new MyQtyType(
                Tag424QtyDayOrderQty.TESTA_QTY_DAY_ORDER_QTY));
        assertEquals( Tag424QtyDayOrderQty.TESTA_QTY_DAY_ORDER_QTY,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag424QtyDayOrderQty(new MyQtyType(
                Tag424QtyDayOrderQty.TESTB_QTY_DAY_ORDER_QTY));
        assertEquals( Tag424QtyDayOrderQty.TESTB_QTY_DAY_ORDER_QTY,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
}