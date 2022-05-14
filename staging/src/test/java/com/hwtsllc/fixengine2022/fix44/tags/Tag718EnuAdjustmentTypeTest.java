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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix44.enums.Enum718AdjustmentType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  718
 *  AdjustmentType
 *  Type of adjustment to be applied, used for PCS and PAJ
 *  Valid values:
 *      0 - Process Request As Margin Disposition
 *      1 - Delta Plus
 *      2 - Delta Minus
 *      3 - Final
 */
class Tag718EnuAdjustmentTypeTest {
    @Test
    void FIX0718Test() {
        FIX44 fixData = FIX44.FIX718_ENU_ADJUSTMENT_TYPE;
        assertEquals( "718", fixData.getID());
        assertEquals( "ADJUSTMENT_TYPE", fixData.getName());
        assertEquals( "AdjustmentType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0718Test() {
        Tag718EnuAdjustmentType tagData;

        tagData = new Tag718EnuAdjustmentType(Enum718AdjustmentType.MARGIN_DISPOSITION);
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag718EnuAdjustmentType(Enum718AdjustmentType.DELTA_PLUS);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag718EnuAdjustmentType(Enum718AdjustmentType.DELTA_MINUS);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag718EnuAdjustmentType(Enum718AdjustmentType.FINAL);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}