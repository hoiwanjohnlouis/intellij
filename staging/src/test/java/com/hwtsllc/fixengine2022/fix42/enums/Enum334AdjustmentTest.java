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

package com.hwtsllc.fixengine2022.fix42.enums;

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  Tag334
 *  Enu
 *  Adjustment
 *
 *      1-3 msg types
 *      CANCEL( "1", "CANCEL", "1 - Cancel" ),
 *      ERROR( "2", "ERROR", "2 - Error" ),
 *      CORRECTION( "3", "CORRECTION", "3 - Correction" ),
 */
class Enum334AdjustmentTest {
    @Test
    void Enum0334Test() {
        Enum334Adjustment enumType;

        /**
         * 1-3 msg types
         */
        enumType = Enum334Adjustment.CANCEL;
        assertEquals( "1", enumType.getID());
        assertEquals( "CANCEL", enumType.getName());
        assertEquals( "1 - Cancel", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum334Adjustment.ERROR;
        assertEquals( "2", enumType.getID());
        assertEquals( "ERROR", enumType.getName());
        assertEquals( "2 - Error", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum334Adjustment.CORRECTION;
        assertEquals( "3", enumType.getID());
        assertEquals( "CORRECTION", enumType.getName());
        assertEquals( "3 - Correction", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}