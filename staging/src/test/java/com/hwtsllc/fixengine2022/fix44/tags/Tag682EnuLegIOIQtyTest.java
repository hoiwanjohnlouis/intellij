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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  27 (same as 27, 682)
 *  IOIQty
 *  String
 *  <p>
 *  Quantity (e.g. number of shares) in numeric form or relative size.
 *  <p></p>
 *  682 (same as 27, 682)
 *  LegIOIQty
 *  String
 *  <p>
 *  Leg-specific IOI quantity.
 *  <p>
 *  See IOIQty (27) for description and valid values
 *  <p></p>
 *  Valid values:
 *  <p>    0 - 1000000000
 *  <p>    S - Small
 *  <p>    M - Medium
 *  <p>    L - Large
 *  <p>    U - Undisclosed Quantity
 */
class Tag682EnuLegIOIQtyTest {
    @Test
    void FIX0682Test() {
        FIX44 fixData = FIX44.FIX682_ENU_LEG_IOI_QTY;
        assertEquals( "682", fixData.toFIXIDString());
        assertEquals( "LEG_IOI_QTY", fixData.toFIXNameString());
        assertEquals( "LegIOIQty", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0682Test() {
        Tag682EnuLegIOIQty tagData;

        tagData = new Tag682EnuLegIOIQty(MyEnumIOIQty.ONE_BILLION);
        assertEquals( MyEnumIOIQty.ONE_BILLION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag682EnuLegIOIQty(MyEnumIOIQty.SMALL);
        assertEquals( MyEnumIOIQty.SMALL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag682EnuLegIOIQty(MyEnumIOIQty.MEDIUM);
        assertEquals( MyEnumIOIQty.MEDIUM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag682EnuLegIOIQty(MyEnumIOIQty.LARGE);
        assertEquals( MyEnumIOIQty.LARGE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag682EnuLegIOIQty(MyEnumIOIQty.UNDISCLOSED_QUANTITY);
        assertEquals( MyEnumIOIQty.UNDISCLOSED_QUANTITY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}