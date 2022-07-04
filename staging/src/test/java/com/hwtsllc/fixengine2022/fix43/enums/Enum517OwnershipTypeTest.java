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

package com.hwtsllc.fixengine2022.fix43.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  517
 *  OwnershipType
 *  char
 *  <p></p>
 *  The relationship between Registration parties.
 *  <p></p>
 *  Valid values:
 *  <p>    J - Joint Investors
 *  <p>    T - Tenants in Common
 *  <p>    2 - Joint Trustees
 */
class Enum517OwnershipTypeTest {
    /*
     *  Information is the same for TAGS 517
     */
    @Test
    void Enum0517Test() {
        Enum517OwnershipType enumType;

        /*
         * J, T,and 2 types
         */

        /*
         *  J, type
         */
        enumType = Enum517OwnershipType.JOINT_INVESTORS;
        assertEquals("J", enumType.toEnumIDString());
        assertEquals("JOINT_INVESTORS", enumType.toEnumNameString());
        assertEquals("J - Joint Investors", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         *  T, type
         */
        enumType = Enum517OwnershipType.TENANTS_IN_COMMON;
        assertEquals("T", enumType.toEnumIDString());
        assertEquals("TENANTS_IN_COMMON", enumType.toEnumNameString());
        assertEquals("T - Tenants in Common", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         *  2, type
         */
        enumType = Enum517OwnershipType.JOINT_TRUSTEES;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("JOINT_TRUSTEES", enumType.toEnumNameString());
        assertEquals("2 - Joint Trustees", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}