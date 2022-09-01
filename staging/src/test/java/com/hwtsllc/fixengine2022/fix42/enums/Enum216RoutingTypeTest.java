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
 *  216
 *  RoutingType
 *  int
 *  <p>
 *  Indicates the type of RoutingID (217) specified.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Target Firm
 *  <p>    2 - Target List
 *  <p>    3 - Block Firm
 *  <p>    4 - Block List
 */
class Enum216RoutingTypeTest {
    @Test
    void Enum0216Test() {
        Enum216RoutingType enumType;

        /*
         * 1-4 msg types
         */
        enumType = Enum216RoutingType.TARGET_FIRM;
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("TARGET_FIRM", enumType.toEnumNameString());
        assertEquals("1 - Target Firm", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum216RoutingType.TARGET_LIST;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("TARGET_LIST", enumType.toEnumNameString());
        assertEquals("2 - Target List", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum216RoutingType.BLOCK_FIRM;
        assertEquals("3", enumType.toEnumIDString());
        assertEquals("BLOCK_FIRM", enumType.toEnumNameString());
        assertEquals("3 - Block Firm", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum216RoutingType.BLOCK_LIST;
        assertEquals("4", enumType.toEnumIDString());
        assertEquals("BLOCK_LIST", enumType.toEnumNameString());
        assertEquals("4 - Block List", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}