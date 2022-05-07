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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.MyEnumIOIQty;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  682 (same as 27, 682)
 *  LegIOIQty
 *  Leg-specific IOI quantity.
 *          See IOIQty (27) for description and valid values
 *  Valid values:
 *      0 - 1000000000
 *      S - Small
 *      M - Medium
 *      L - Large
 *      U - Undisclosed Quantity
 */
class Tag682EnuLegIOIQtyTest {
    @Test
    void FIX0682Test() {
        FIX44 fixData = FIX44.FIX682_ENU_LEG_IOI_QTY;
        assertEquals( "682", fixData.getID());
        assertEquals( "LEG_IOI_QTY", fixData.getName());
        assertEquals( "LegIOIQty", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0682Test() {
        Tag682EnuLegIOIQty tagData;

        tagData = new Tag682EnuLegIOIQty(MyEnumIOIQty.ONE_BILLION);
        assertEquals( MyEnumIOIQty.ONE_BILLION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag682EnuLegIOIQty(MyEnumIOIQty.SMALL);
        assertEquals( MyEnumIOIQty.SMALL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag682EnuLegIOIQty(MyEnumIOIQty.MEDIUM);
        assertEquals( MyEnumIOIQty.MEDIUM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag682EnuLegIOIQty(MyEnumIOIQty.LARGE);
        assertEquals( MyEnumIOIQty.LARGE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag682EnuLegIOIQty(MyEnumIOIQty.UNDISCLOSED_QUANTITY);
        assertEquals( MyEnumIOIQty.UNDISCLOSED_QUANTITY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}