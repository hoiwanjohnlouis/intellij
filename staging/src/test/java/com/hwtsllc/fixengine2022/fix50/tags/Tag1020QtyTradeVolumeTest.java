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
 *  1020
 *  TradeVolume
 *  Qty
 *  <p>
 *  Used to report volume with a trade
 */
class Tag1020QtyTradeVolumeTest {
    @Test
    void FIX1020Test() {
        FIX50 fixData = FIX50.FIX1020_QTY_TRADE_VOLUME;
        assertEquals( "1020", fixData.getID());
        assertEquals( "TRADE_VOLUME", fixData.getName());
        assertEquals( "TradeVolume", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1020Test() {
        Tag1020QtyTradeVolume tagData;

        tagData = new Tag1020QtyTradeVolume(new MyQtyType(
                Tag1020QtyTradeVolume.TESTA_QTY_TRADE_VOLUME));
        assertEquals( Tag1020QtyTradeVolume.TESTA_QTY_TRADE_VOLUME,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1020QtyTradeVolume(new MyQtyType(
                Tag1020QtyTradeVolume.TESTB_QTY_TRADE_VOLUME));
        assertEquals( Tag1020QtyTradeVolume.TESTB_QTY_TRADE_VOLUME,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
}