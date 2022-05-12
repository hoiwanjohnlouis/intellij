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
 *  152
 *  CashOrderQty
 *  Qty
 *  <p>
 *  Specifies the approximate order quantity desired in
 *  total monetary units vs. as tradeable units (e.g. number of shares).
 *  The broker or fund manager (for CIV orders) would be responsible for
 *  converting and calculating a tradeable unit (e.g. share) quantity (OrderQty (38))
 *  based upon this amount to be used for the actual order and subsequent messages.
 */
class Tag152QtyCashOrderQtyTest {
    @Test
    void FIX0152Test() {
        FIX41 fixData = FIX41.FIX152_QTY_CASH_ORDER_QTY;
        assertEquals( "152", fixData.getID());
        assertEquals( "CASH_ORDER_QTY", fixData.getName());
        assertEquals( "CashOrderQty", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0152Test() {
        Log152QtyCashOrderQty tagData;

        tagData = new Log152QtyCashOrderQty(new MyQtyType(Log152QtyCashOrderQty.TESTA_QTY_CASH_ORDER_QTY));
        assertEquals( Log152QtyCashOrderQty.TESTA_QTY_CASH_ORDER_QTY, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        tagData = new Log152QtyCashOrderQty(new MyQtyType(Log152QtyCashOrderQty.TESTB_QTY_CASH_ORDER_QTY));
        assertEquals( Log152QtyCashOrderQty.TESTB_QTY_CASH_ORDER_QTY, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
}