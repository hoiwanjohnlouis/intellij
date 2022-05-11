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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import com.hwtsllc.fixengine2022.fix50.enums.Enum1093LotType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1093
 *  LotType
 *  char
 *  <p>
 *  Defines the lot type assigned to the order.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Odd Lot
 *  <p>    2 - Round Lot
 *  <p>    3 - Block Lot
 */
class Tag1093EnuLotTypeTest {
    @Test
    void FIX1093Test() {
        FIX50 fixData = FIX50.FIX1093_ENU_LOT_TYPE;
        assertEquals( "1093", fixData.getID());
        assertEquals( "LOT_TYPE", fixData.getName());
        assertEquals( "LotType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1093Test() {
        Tag1093EnuLotType tagData;

        tagData = new Tag1093EnuLotType( Enum1093LotType.ODD_LOT );
        assertEquals( Enum1093LotType.ODD_LOT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1093EnuLotType( Enum1093LotType.ROUND_LOT );
        assertEquals( Enum1093LotType.ROUND_LOT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1093EnuLotType( Enum1093LotType.BLOCK_LOT );
        assertEquals( Enum1093LotType.BLOCK_LOT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}