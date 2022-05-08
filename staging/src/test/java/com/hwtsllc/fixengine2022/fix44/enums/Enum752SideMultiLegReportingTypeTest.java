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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum752SideMultiLegReportingTypeTest {
    /**
     *  752
     *  SideMultiLegReportingType
     *  Used to indicate if the side being reported on Trade Capture Report
     *  represents a leg of a multileg instrument or a single security.
     *  Valid values:
     *      1 - Single Security (default if not specified)
     *      2 - Individual leg of a multileg security
     *      3 - Multileg Security
     */
    @Test
    void EnumTest() {
        Enum752SideMultiLegReportingType enumType;

        enumType = Enum752SideMultiLegReportingType.SINGLE_SECURITY;
        assertEquals( "1", enumType.getID());
        assertEquals( "SINGLE_SECURITY", enumType.getName());
        assertEquals( "1 - Single Security (default if not specified)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum752SideMultiLegReportingType.INDIVIDUAL_LEG;
        assertEquals( "2", enumType.getID());
        assertEquals( "INDIVIDUAL_LEG", enumType.getName());
        assertEquals( "2 - Individual leg of a multileg security", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum752SideMultiLegReportingType.MULTILEG_SECURITY;
        assertEquals( "3", enumType.getID());
        assertEquals( "MULTILEG_SECURITY", enumType.getName());
        assertEquals( "3 - Multileg Security", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}