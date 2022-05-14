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
import com.hwtsllc.fixengine2022.datatypes.MyEnumOffsetType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  836 (same as 836, 842,)
 *  PegOffsetType
 *  int
 *  <p>
 *  Type of Peg Offset value
 *  <p></p>
 *  842
 *  DiscretionOffsetType
 *  int
 *  <p>
 *  Type of Discretion Offset value
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Price (default)
 *  <p>    1 - Basis Points
 *  <p>    2 - Ticks
 *  <p>    3 - Price Tier or Level
 */
class Tag842EnuDiscretionOffsetTypeTest {
    @Test
    void FIX0842Test() {
        FIX44 fixData = FIX44.FIX842_ENU_DISCRETION_OFFSET_TYPE;
        assertEquals( "842", fixData.getID());
        assertEquals( "DISCRETION_OFFSET_TYPE", fixData.getName());
        assertEquals( "DiscretionOffsetType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0842Test() {
        Tag842EnuDiscretionOffsetType tagData;

        tagData = new Tag842EnuDiscretionOffsetType(MyEnumOffsetType.PRICE);
        assertEquals( MyEnumOffsetType.PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag842EnuDiscretionOffsetType(MyEnumOffsetType.BASIS);
        assertEquals( MyEnumOffsetType.BASIS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag842EnuDiscretionOffsetType(MyEnumOffsetType.TICKS);
        assertEquals( MyEnumOffsetType.TICKS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag842EnuDiscretionOffsetType(MyEnumOffsetType.TIER_OR_LEVEL);
        assertEquals( MyEnumOffsetType.TIER_OR_LEVEL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}