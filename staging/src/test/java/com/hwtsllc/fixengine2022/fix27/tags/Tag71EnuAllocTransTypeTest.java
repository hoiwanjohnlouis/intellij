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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.fix27.enums.Enum71AllocTransType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag71EnuAllocTransTypeTest {

    @Test
    void FIX0071Test() {
        FIX27 fixData = FIX27.FIX71_ENU_ALLOC_TRANS_TYPE;
        assertEquals( "ALLOC_TRANS_TYPE", fixData.getName());
        assertEquals( "71", fixData.getID());
        assertEquals( "AllocTransType", fixData.getDescription());
        assertNotEquals( FIXType.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( FIXType.JUNK_NAME, fixData.getName());
        assertNotEquals( FIXType.JUNK_ID, fixData.getID());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0071Test() {
        Tag71EnuAllocTransType tagData;

        /*
         * 0-6 AllocTransType types
         */
        tagData = new Tag71EnuAllocTransType(Enum71AllocTransType.NEW);
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag71EnuAllocTransType(Enum71AllocTransType.REPLACE);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag71EnuAllocTransType(Enum71AllocTransType.CANCEL);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag71EnuAllocTransType(Enum71AllocTransType.PRELIMINARY_WITHOUT_MISC_FEES_AND_NETMONEY);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag71EnuAllocTransType(Enum71AllocTransType.CALCULATED_INCLUDES_MISC_FEES_AND_NETMONEY);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag71EnuAllocTransType(Enum71AllocTransType.CALCULATED_WITHOUT_PRELIMINARY);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag71EnuAllocTransType(Enum71AllocTransType.REVERSAL);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
    }
}