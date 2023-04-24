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

package com.hwtsllc.fixengine.tags.fix44.enums;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  752
 *  SideMultiLegReportingType
 *  int
 *  <p></p>
 *  Used to indicate if the side being reported on Trade Capture Report
 *  represents a leg of a multileg instrument or a single security.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Single Security (default if not specified)
 *  <p>    2 - Individual leg of a multileg security
 *  <p>    3 - Multileg Security
 */
class Enum752SideMultiLegReportingTypeTest {
    @Test
    void EnumTest() {
        Enum752SideMultiLegReportingType enumType;

        enumType = Enum752SideMultiLegReportingType.SINGLE_SECURITY;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "SINGLE_SECURITY", enumType.toFIXNameString());
        assertEquals( "1 - Single Security (default if not specified)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum752SideMultiLegReportingType.INDIVIDUAL_LEG;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "INDIVIDUAL_LEG", enumType.toFIXNameString());
        assertEquals( "2 - Individual leg of a multileg security", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum752SideMultiLegReportingType.MULTILEG_SECURITY;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "MULTILEG_SECURITY", enumType.toFIXNameString());
        assertEquals( "3 - Multileg Security", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}