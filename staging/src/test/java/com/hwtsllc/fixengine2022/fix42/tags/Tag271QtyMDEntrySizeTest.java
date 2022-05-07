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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.MyQtyType;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag271QtyMDEntrySizeTest {
    @Test
    void FIX0271Test() {
        FIX42 fixData = FIX42.FIX271_QTY_MD_ENTRY_SIZE;
        assertEquals( "271", fixData.getID());
        assertEquals( "MD_ENTRY_SIZE", fixData.getName());
        assertEquals( "MDEntrySize", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0271Test() {
        Tag271QtyMDEntrySize tagData;

        tagData = new Tag271QtyMDEntrySize(new MyQtyType(
                Tag271QtyMDEntrySize.TESTA_QTY_MD_ENTRY_SIZE));
        assertEquals( Tag271QtyMDEntrySize.TESTA_QTY_MD_ENTRY_SIZE,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag271QtyMDEntrySize(new MyQtyType(
                Tag271QtyMDEntrySize.TESTB_QTY_MD_ENTRY_SIZE));
        assertEquals( Tag271QtyMDEntrySize.TESTB_QTY_MD_ENTRY_SIZE,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
}