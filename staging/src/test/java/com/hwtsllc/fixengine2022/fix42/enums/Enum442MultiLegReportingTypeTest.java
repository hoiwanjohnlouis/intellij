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
 *  Tag442
 *  Enu
 *  MultiLegReportingType
 *
 *      1-3 msg types
 *      SINGLE_SECURITY( "1", "SINGLE_SECURITY", "1 - Single security (default if not specified)" ),
 *      INDIVIDUAL_LEG_SECURITY( "2", "INDIVIDUAL_LEG_SECURITY", "2 - Individual leg of a multi=leg security" ),
 *      MULTI_LEG_SECURITY( "3", "MULTI_LEG_SECURITY", "3 - Multi-leg security" ),
 */
class Enum442MultiLegReportingTypeTest {
    @Test
    void Enum0442Test() {
        Enum442MultiLegReportingType enumType;

        /**
         * 1-3 msg types
         */
        enumType = Enum442MultiLegReportingType.SINGLE_SECURITY;
        assertEquals("1", enumType.getID());
        assertEquals("SINGLE_SECURITY", enumType.getName());
        assertEquals("1 - Single security (default if not specified)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum442MultiLegReportingType.INDIVIDUAL_LEG_SECURITY;
        assertEquals("2", enumType.getID());
        assertEquals("INDIVIDUAL_LEG_SECURITY", enumType.getName());
        assertEquals("2 - Individual leg of a multi=leg security", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum442MultiLegReportingType.MULTI_LEG_SECURITY;
        assertEquals("3", enumType.getID());
        assertEquals("MULTI_LEG_SECURITY", enumType.getName());
        assertEquals("3 - Multi-leg security", enumType.getDescription());
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