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
import com.hwtsllc.fixengine2022.fix44.enums.Enum682LegIOIQty;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag682EnuLegIOIQtyTest {
    @Test
    void FIX0682Test() {
        FIX44 fixData = FIX44.FIX682_ENU_LEG_IOI_QTY;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX44.JUNK_ID, fixData.getID());
        assertNotEquals( FIX44.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, fixData.getDescription());
    }
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
    @Test
    void Tag0682Test() {
        Tag682EnuLegIOIQty tagData;

        tagData = new Tag682EnuLegIOIQty(Enum682LegIOIQty.ONE_BILLION);
        assertEquals( Enum682LegIOIQty.ONE_BILLION.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag682EnuLegIOIQty(Enum682LegIOIQty.SMALL);
        assertEquals( Enum682LegIOIQty.SMALL.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag682EnuLegIOIQty(Enum682LegIOIQty.MEDIUM);
        assertEquals( Enum682LegIOIQty.MEDIUM.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag682EnuLegIOIQty(Enum682LegIOIQty.LARGE);
        assertEquals( Enum682LegIOIQty.LARGE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag682EnuLegIOIQty(Enum682LegIOIQty.UNDISCLOSED_QUANTITY);
        assertEquals( Enum682LegIOIQty.UNDISCLOSED_QUANTITY.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}