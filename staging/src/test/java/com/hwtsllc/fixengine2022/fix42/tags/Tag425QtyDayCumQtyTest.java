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
 *  425
 *  DayCumQty
 *  Qty
 *  <p>
 *  Quantity on a GT order that has traded today.
 */
class Tag425QtyDayCumQtyTest {
    @Test
    void FIX0425Test() {
        FIX42 fixData = FIX42.FIX425_QTY_DAY_CUM_QTY;
        assertEquals( "425", fixData.toFIXIDString());
        assertEquals( "DAY_CUM_QTY", fixData.toFIXNameString());
        assertEquals( "DayCumQty", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0425Test() {
        Tag425QtyDayCumQty tagData;

        tagData = new Tag425QtyDayCumQty(new MyQtyType(
                Tag425QtyDayCumQty.TESTA_QTY_DAY_CUM_QTY));
        assertEquals( Tag425QtyDayCumQty.TESTA_QTY_DAY_CUM_QTY,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag425QtyDayCumQty(new MyQtyType(
                Tag425QtyDayCumQty.TESTB_QTY_DAY_CUM_QTY));
        assertEquals( Tag425QtyDayCumQty.TESTB_QTY_DAY_CUM_QTY,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
}