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

/**
 *  718
 *  AdjustmentType
 *  int
 *  <p></p>
 *  Type of adjustment to be applied, used for PCS and PAJ
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Process Request As Margin Disposition
 *  <p>    1 - Delta Plus
 *  <p>    2 - Delta Minus
 *  <p>    3 - Final
 */
class Enum718AdjustmentTypeTest {
    @Test
    void EnumTest() {
        Enum718AdjustmentType enumType;

        enumType = Enum718AdjustmentType.MARGIN_DISPOSITION;
        assertEquals( "0", enumType.toEnumIDString());
        assertEquals( "MARGIN_DISPOSITION", enumType.toEnumNameString());
        assertEquals( "0 - Process Request As Margin Disposition", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum718AdjustmentType.DELTA_PLUS;
        assertEquals( "1", enumType.toEnumIDString());
        assertEquals( "DELTA_PLUS", enumType.toEnumNameString());
        assertEquals( "1 - Delta Plus", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum718AdjustmentType.DELTA_MINUS;
        assertEquals( "2", enumType.toEnumIDString());
        assertEquals( "DELTA_MINUS", enumType.toEnumNameString());
        assertEquals( "2 - Delta Minus", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum718AdjustmentType.FINAL;
        assertEquals( "3", enumType.toEnumIDString());
        assertEquals( "FINAL", enumType.toEnumNameString());
        assertEquals( "3 - Final", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}