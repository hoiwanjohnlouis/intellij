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
import com.hwtsllc.fixengine2022.fix44.enums.Enum796AllocCancReplaceReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  796
 *  AllocCancReplaceReason
 *  int
 *  <p></p>
 *  Reason for cancelling or replacing an Allocation Instruction
 *  or Allocation Report message
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Original details incomplete or incorrect
 *  <p>    2 - Change in underlying order details
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
class Tag796EnuAllocCancReplaceReasonTest {
    @Test
    void FIX0796Test() {
        FIX44 fixData = FIX44.FIX796_ENU_ALLOC_CANC_REPLACE_REASON;
        assertEquals( "796", fixData.toFIXIDString());
        assertEquals( "ALLOC_CANC_REPLACE_REASON", fixData.toFIXNameString());
        assertEquals( "AllocCancReplaceReason", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0796Test() {
        Tag796EnuAllocCancReplaceReason tagData;

        tagData = new Tag796EnuAllocCancReplaceReason(Enum796AllocCancReplaceReason.ORIGINAL_DETAILS_INCOMPLETE);
        assertEquals( Enum796AllocCancReplaceReason.ORIGINAL_DETAILS_INCOMPLETE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag796EnuAllocCancReplaceReason(Enum796AllocCancReplaceReason.CHANGE_IN_UNDERLYING_ORDER);
        assertEquals( Enum796AllocCancReplaceReason.CHANGE_IN_UNDERLYING_ORDER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag796EnuAllocCancReplaceReason(Enum796AllocCancReplaceReason.OTHER);
        assertEquals( Enum796AllocCancReplaceReason.OTHER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}