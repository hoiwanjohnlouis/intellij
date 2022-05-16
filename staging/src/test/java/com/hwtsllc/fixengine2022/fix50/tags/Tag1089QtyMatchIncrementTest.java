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
 *  1089
 *  MatchIncrement
 *  Qty
 *  <p>
 *  Allows orders to specify a minimum quantity that applies to every execution
 *  (one execution could be for multiple counter-orders).
 *  <p>
 *  The order may still fill against smaller orders, but the cumulative quantity
 *  of the execution must be in multiples of the MatchIncrement.
 */
class Tag1089QtyMatchIncrementTest {
    @Test
    void FIX1089Test() {
        FIX50 fixData = FIX50.FIX1089_QTY_MATCH_INCREMENT;
        assertEquals( "1089", fixData.toFIXIDString());
        assertEquals( "MATCH_INCREMENT", fixData.toFIXNameString());
        assertEquals( "MatchIncrement", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1089Test() {
        Tag1089QtyMatchIncrement tagData;

        tagData = new Tag1089QtyMatchIncrement(new MyQtyType(
                Tag1089QtyMatchIncrement.TESTA_QTY_MATCH_INCREMENT));
        assertEquals( Tag1089QtyMatchIncrement.TESTA_QTY_MATCH_INCREMENT,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1089QtyMatchIncrement(new MyQtyType(
                Tag1089QtyMatchIncrement.TESTB_QTY_MATCH_INCREMENT));
        assertEquals( Tag1089QtyMatchIncrement.TESTB_QTY_MATCH_INCREMENT,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
}