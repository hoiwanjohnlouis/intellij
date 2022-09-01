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
 *  401
 *  SideValueInd
 *  int
 *  <p>
 *  Code to identify which "SideValue" the value refers to.
 *  <p>
 *  SideValue1 and SideValue2 are used as opposed to Buy or Sell
 *  so that the basket can be quoted either way as Buy or Sell.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Side Value 1
 *  <p>    2 - Side Value 2
 */
class Enum401SideValueIndTest {
    @Test
    void Enum0401Test() {
        Enum401SideValueInd enumType;

        /*
         * 1-2 msg types
         */
        enumType = Enum401SideValueInd.SIDE_VALUE_1;
        assertEquals( "1", enumType.toEnumIDString());
        assertEquals( "SIDE_VALUE_1", enumType.toEnumNameString());
        assertEquals( "1 - Side Value 1", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum401SideValueInd.SIDE_VALUE_2;
        assertEquals( "2", enumType.toEnumIDString());
        assertEquals( "SIDE_VALUE_2", enumType.toEnumNameString());
        assertEquals( "2 - Side Value 2", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}