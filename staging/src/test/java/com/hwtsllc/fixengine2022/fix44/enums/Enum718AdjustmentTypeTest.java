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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum718AdjustmentTypeTest {
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
    @Test
    void EnumTest() {
        Enum718AdjustmentType enumType;

        enumType = Enum718AdjustmentType.MARGIN_DISPOSITION;
        assertEquals( "0", enumType.getID());
        assertEquals( "MARGIN_DISPOSITION", enumType.getName());
        assertEquals( "0 - Process Request As Margin Disposition", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum718AdjustmentType.DELTA_PLUS;
        assertEquals( "1", enumType.getID());
        assertEquals( "DELTA_PLUS", enumType.getName());
        assertEquals( "1 - Delta Plus", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum718AdjustmentType.DELTA_MINUS;
        assertEquals( "2", enumType.getID());
        assertEquals( "DELTA_MINUS", enumType.getName());
        assertEquals( "2 - Delta Minus", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum718AdjustmentType.FINAL;
        assertEquals( "3", enumType.getID());
        assertEquals( "FINAL", enumType.getName());
        assertEquals( "3 - Final", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}