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

package com.hwtsllc.fix.enums.fix42;

import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  334
 *  Enu
 *  Adjustment
 *  int
 *  <p>
 *  Identifies the type of adjustment.
 *  <p></p>
 *  Valid values:
 *  <p>    1-3 msg types
 *  <p>    CANCEL( "1", "CANCEL", "1 - Cancel" ),
 *  <p>    ERROR( "2", "ERROR", "2 - Error" ),
 *  <p>    CORRECTION( "3", "CORRECTION", "3 - Correction" ),
 */
class Enum334AdjustmentTest {
    @Test
    void Enum0334Test() {
        Enum334Adjustment enumType;

        /*
         * 1-3 msg types
         */
        enumType = Enum334Adjustment.CANCEL;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "CANCEL", enumType.toFIXNameString());
        assertEquals( "1 - Cancel", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum334Adjustment.ERROR;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "ERROR", enumType.toFIXNameString());
        assertEquals( "2 - Error", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum334Adjustment.CORRECTION;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "CORRECTION", enumType.toFIXNameString());
        assertEquals( "3 - Correction", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}