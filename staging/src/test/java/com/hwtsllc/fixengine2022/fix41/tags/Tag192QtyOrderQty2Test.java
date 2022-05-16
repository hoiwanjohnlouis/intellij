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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.MyQtyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  192
 *  OrderQty2
 *  Qty
 *  <p>
 *  Deprecated in FIX.5.0 OrderQty (38) of the future part of a F/X swap order.
 */
// @Deprecated
class Tag192QtyOrderQty2Test {
    @Test
    void FIX0192Test() {
        FIX41 fixData = FIX41.FIX192_QTY_ORDER_QTY_2;
        assertEquals( "192", fixData.toFIXIDString());
        assertEquals( "ORDER_QTY_2", fixData.toFIXNameString());
        assertEquals( "OrderQty2", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0192Test() {
        Tag192QtyOrderQty2 tagData;

        tagData = new Tag192QtyOrderQty2(new MyQtyType(Tag192QtyOrderQty2.TESTA_QTY_ORDER_QTY_2));
        assertEquals( Tag192QtyOrderQty2.TESTA_QTY_ORDER_QTY_2, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag192QtyOrderQty2(new MyQtyType(Tag192QtyOrderQty2.TESTB_QTY_ORDER_QTY_2));
        assertEquals( Tag192QtyOrderQty2.TESTB_QTY_ORDER_QTY_2, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
}