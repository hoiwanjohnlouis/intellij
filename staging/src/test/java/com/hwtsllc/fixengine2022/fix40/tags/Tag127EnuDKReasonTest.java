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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX40;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix40.enums.Enum127DKReason;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  127
 *  DKReason
 *  char
 *  Reason for execution rejection.
 *  Valid values:
 *      A - Unknown Symbol
 *      B - Wrong Side
 *      C - Quantity Exceeds Order
 *      D - No Matching Order
 *      E - Price Exceeds Limit
 *      F - Calculation Difference
 *      Z - Other
 */
class Tag127EnuDKReasonTest {
    @Test
    void FIX0127Test() {
        FIX40 fixData = FIX40.FIX127_ENU_DK_REASON;
        assertEquals( fixData.getName(), "DK_REASON");
        assertEquals( fixData.getID(), "127");
        assertEquals( fixData.getDescription(), "DKReason");
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0127Test() {
        Tag127EnuDKReason tagData;

        /**
         * A-F, Z DKReason type
         */
        tagData = new Tag127EnuDKReason(Enum127DKReason.UNKNOWN_SYMBOL);
        assertEquals( "A", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag127EnuDKReason(Enum127DKReason.WRONG_SIDE);
        assertEquals( "B", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag127EnuDKReason(Enum127DKReason.QUANTITY_EXCEEDS_ORDER);
        assertEquals( "C", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag127EnuDKReason(Enum127DKReason.NO_MATCHING_ORDER);
        assertEquals( "D", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag127EnuDKReason(Enum127DKReason.PRICE_EXCEEDS_LIMIT);
        assertEquals( "E", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag127EnuDKReason(Enum127DKReason.CALCULATION_DIFFERENCE);
        assertEquals( "F", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag127EnuDKReason(Enum127DKReason.OTHER);
        assertEquals( "Z", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}