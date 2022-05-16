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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyQtyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1074
 *  LegCalculatedCcyLastQty
 *  Qty
 *  <p>
 *  Used for the calculated quantity of the other side of the currency for this leg.
 *  <p>
 *  Can be derived from LegQty and LegLastPx.
 */
class Tag1074QtyLegCalculatedCcyLastQtyTest {
    @Test
    void FIX1074Test() {
        FIX50 fixData = FIX50.FIX1074_QTY_LEG_CALCULATED_CCY_LAST_QTY;
        assertEquals( "1074", fixData.toFIXIDString());
        assertEquals( "LEG_CALCULATED_CCY_LAST_QTY", fixData.toFIXNameString());
        assertEquals( "LegCalculatedCcyLastQty", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1074Test() {
        Tag1074QtyLegCalculatedCcyLastQty tagData;

        tagData = new Tag1074QtyLegCalculatedCcyLastQty(new MyQtyType(
                Tag1074QtyLegCalculatedCcyLastQty.TESTA_QTY_LEG_CALCULATED_CCY_LAST_QTY));
        assertEquals( Tag1074QtyLegCalculatedCcyLastQty.TESTA_QTY_LEG_CALCULATED_CCY_LAST_QTY,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1074QtyLegCalculatedCcyLastQty(new MyQtyType(
                Tag1074QtyLegCalculatedCcyLastQty.TESTB_QTY_LEG_CALCULATED_CCY_LAST_QTY));
        assertEquals( Tag1074QtyLegCalculatedCcyLastQty.TESTB_QTY_LEG_CALCULATED_CCY_LAST_QTY,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
}