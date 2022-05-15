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
 *  1112
 *  TriggerNewQty
 *  Qty
 *  <p>
 *  The Quantity the order should have after the trigger has hit.
 */
class Tag1112QtyTriggerNewQtyTest {
    @Test
    void FIX1112Test() {
        FIX50 fixData = FIX50.FIX1112_QTY_TRIGGER_NEW_QTY;
        assertEquals( "1112", fixData.getID());
        assertEquals( "TRIGGER_NEW_QTY", fixData.getName());
        assertEquals( "TriggerNewQty", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1112Test() {
        Tag1112QtyTriggerNewQty tagData;

        tagData = new Tag1112QtyTriggerNewQty(new MyQtyType(
                Tag1112QtyTriggerNewQty.TESTA_QTY_TRIGGER_NEW_QTY));
        assertEquals( Tag1112QtyTriggerNewQty.TESTA_QTY_TRIGGER_NEW_QTY,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1112QtyTriggerNewQty(new MyQtyType(
                Tag1112QtyTriggerNewQty.TESTB_QTY_TRIGGER_NEW_QTY));
        assertEquals( Tag1112QtyTriggerNewQty.TESTB_QTY_TRIGGER_NEW_QTY,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
}