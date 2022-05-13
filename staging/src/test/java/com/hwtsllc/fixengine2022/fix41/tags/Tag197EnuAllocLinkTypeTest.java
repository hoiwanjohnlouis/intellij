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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix41.enums.Enum197AllocLinkType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  197
 *  AllocLinkType
 *  int
 *  <p>
 *  Identifies the type of Allocation linkage when AllocLinkID (96) is used.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - FX Netting
 *  <p>    1 - FX Swap
 */
class Tag197EnuAllocLinkTypeTest {
    @Test
    void FIX0197Test() {
        FIX41 fixData = FIX41.FIX197_ENU_ALLOC_LINK_TYPE;
        assertEquals( "197", fixData.getID());
        assertEquals( "ALLOC_LINK_TYPE", fixData.getName());
        assertEquals( "AllocLinkType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0197Test() {
        Tag197EnuAllocLinkType tagData;

        tagData = new Tag197EnuAllocLinkType(Enum197AllocLinkType.FX_NETTING);
        assertEquals( Enum197AllocLinkType.FX_NETTING.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag197EnuAllocLinkType(Enum197AllocLinkType.FX_SWAP);
        assertEquals( Enum197AllocLinkType.FX_SWAP.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}