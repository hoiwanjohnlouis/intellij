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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  442
 *  MultiLegReportingType
 *  char
 *  <p>
 *  Used to indicate what an Execution Report represents
 *  <p>
 *  (e.g. used with multi-leg securities, such as option strategies, spreads, etc.).
 *  <p></p>
 *  Valid values:
 *  <p>    1-3 msg types
 *  <p>    1 - Single security (default if not specified)
 *  <p>    2 - Individual leg of a multi=leg security
 *  <p>    3 - Multi-leg security
 */
class Enum442MultiLegReportingTypeTest {
    @Test
    void Enum0442Test() {
        Enum442MultiLegReportingType enumType;

        /*
         * 1-3 msg types
         */
        enumType = Enum442MultiLegReportingType.SINGLE_SECURITY;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("SINGLE_SECURITY", enumType.toFIXNameString());
        assertEquals("1 - Single security (default if not specified)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum442MultiLegReportingType.INDIVIDUAL_LEG_SECURITY;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("INDIVIDUAL_LEG_SECURITY", enumType.toFIXNameString());
        assertEquals("2 - Individual leg of a multi=leg security", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum442MultiLegReportingType.MULTI_LEG_SECURITY;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("MULTI_LEG_SECURITY", enumType.toFIXNameString());
        assertEquals("3 - Multi-leg security", enumType.toFIXDescriptionString());
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