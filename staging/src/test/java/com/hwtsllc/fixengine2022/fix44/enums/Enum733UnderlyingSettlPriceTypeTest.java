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

class Enum733UnderlyingSettlPriceTypeTest {
    /**
     *  733 (same as 731, 733)
     *  UnderlyingSettlPriceType
     *  Underlying security’s SettlPriceType.
     *              See SettlPriceType (731) field for description
     *  Valid values:
     *      1 - Final
     *      2 - Theoretical
     */
    @Test
    void EnumTest() {
        Enum733UnderlyingSettlPriceType enumType;

        enumType = Enum733UnderlyingSettlPriceType.FINAL;
        assertEquals( "1", enumType.getID());
        assertEquals( "FINAL", enumType.getName());
        assertEquals( "1 - Final", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum733UnderlyingSettlPriceType.THEORETICAL;
        assertEquals( "2", enumType.getID());
        assertEquals( "THEORETICAL", enumType.getName());
        assertEquals( "2 - Theoretical", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}