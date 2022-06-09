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

import com.hwtsllc.fixengine2022.datatypes.MyEnumSettlPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MyEnumSettlPriceTypeTest {
    /**
     *  731 (same as 731, 733)
     *  SettlPriceType
     *  Type of settlement price
     *  Valid values:
     *      1 - Final
     *      2 - Theoretical
     */
    @Test
    void EnumTest() {
        MyEnumSettlPriceType enumType;

        enumType = MyEnumSettlPriceType.FINAL;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "FINAL", enumType.toFIXNameString());
        assertEquals( "1 - Final", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSettlPriceType.THEORETICAL;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "THEORETICAL", enumType.toFIXNameString());
        assertEquals( "2 - Theoretical", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}