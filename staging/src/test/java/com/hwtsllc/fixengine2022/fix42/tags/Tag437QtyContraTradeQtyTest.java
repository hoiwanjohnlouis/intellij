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
 *  437
 *  ContraTradeQty
 *  Qty
 *  <p>
 *  Quantity traded with the ContraBroker (375).
 */
class Tag437QtyContraTradeQtyTest {
    @Test
    void FIX0437Test() {
        FIX42 fixData = FIX42.FIX437_QTY_CONTRA_TRADE_QTY;
        assertEquals( "437", fixData.toFIXIDString());
        assertEquals( "CONTRA_TRADE_QTY", fixData.toFIXNameString());
        assertEquals( "ContraTradeQty", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0437Test() {
        Tag437QtyContraTradeQty tagData;

        tagData = new Tag437QtyContraTradeQty(new MyQtyType(
                Tag437QtyContraTradeQty.TESTA_QTY_CONTRA_TRADE_QTY));
        assertEquals( Tag437QtyContraTradeQty.TESTA_QTY_CONTRA_TRADE_QTY,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag437QtyContraTradeQty(new MyQtyType(
                Tag437QtyContraTradeQty.TESTB_QTY_CONTRA_TRADE_QTY));
        assertEquals( Tag437QtyContraTradeQty.TESTB_QTY_CONTRA_TRADE_QTY,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
}