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
 *  399
 *  BidDescriptorType
 *  int
 *  <p>
 *  Code to identify the type of BidDescriptor (400).
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Sector
 *  <p>    2 - Country
 *  <p>    3 - Index
 */
class Enum399BidDescriptorTypeTest {
    @Test
    void Enum0399Test() {
        Enum399BidDescriptorType enumType;

        /*
         * 1-3 msg types
         */
        enumType = Enum399BidDescriptorType.SECTOR;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "SECTOR", enumType.toFIXNameString());
        assertEquals( "1 - Sector", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum399BidDescriptorType.COUNTRY;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "COUNTRY", enumType.toFIXNameString());
        assertEquals( "2 - Country", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum399BidDescriptorType.INDEX;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "INDEX", enumType.toFIXNameString());
        assertEquals( "3 - Index", enumType.toFIXDescriptionString());
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