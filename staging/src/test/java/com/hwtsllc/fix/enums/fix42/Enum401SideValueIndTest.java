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
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "SIDE_VALUE_1", enumType.toFIXNameString());
        assertEquals( "1 - Side Value 1", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum401SideValueInd.SIDE_VALUE_2;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "SIDE_VALUE_2", enumType.toFIXNameString());
        assertEquals( "2 - Side Value 2", enumType.toFIXDescriptionString());
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