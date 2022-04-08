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
import com.hwtsllc.fixengine2022.fix40.enums.Enum127DKReason;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag127EnuDKReasonTest {

    @Test
    void FIX0127Test() {
        FIX40 fixData = FIX40.FIX127_ENU_DK_REASON;
        assertEquals( fixData.getName(), "DK_REASON");
        assertEquals( fixData.getID(), "127");
        assertEquals( fixData.getDescription(), "DKReason");
        assertNotEquals( FIX40.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( FIX40.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX40.JUNK_ID, fixData.getID());
        assertNotEquals( FIX40.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0127Test() {
        Tag127EnuDKReason tagData;

        /*
         * A-F, Z DKReason type
         */
        tagData = new Tag127EnuDKReason(Enum127DKReason.UNKNOWN_SYMBOL);
        assertEquals( "A", tagData.getDataValue());
        assertNotEquals( FIX40.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag127EnuDKReason(Enum127DKReason.WRONG_SIDE);
        assertEquals( "B", tagData.getDataValue());
        assertNotEquals( FIX40.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag127EnuDKReason(Enum127DKReason.QUANTITY_EXCEEDS_ORDER);
        assertEquals( "C", tagData.getDataValue());
        assertNotEquals( FIX40.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag127EnuDKReason(Enum127DKReason.NO_MATCHING_ORDER);
        assertEquals( "D", tagData.getDataValue());
        assertNotEquals( FIX40.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag127EnuDKReason(Enum127DKReason.PRICE_EXCEEDS_LIMIT);
        assertEquals( "E", tagData.getDataValue());
        assertNotEquals( FIX40.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag127EnuDKReason(Enum127DKReason.CALCULATION_DIFFERENCE);
        assertEquals( "F", tagData.getDataValue());
        assertNotEquals( FIX40.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag127EnuDKReason(Enum127DKReason.OTHER);
        assertEquals( "Z", tagData.getDataValue());
        assertNotEquals( FIX40.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}