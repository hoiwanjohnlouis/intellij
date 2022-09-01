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
 *  394
 *  BidType
 *  int
 *  <p>
 *  Code to identify the type of Bid Request.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - "Non Disclosed" style (e.g. US/European)
 *  <p>    2 - "Disclosed" style (e.g. Japanese)
 *  <p>    3 - No bidding process
 */
class Enum394BidTypeTest {
    @Test
    void Enum0394Test() {
        Enum394BidType enumType;

        /*
         * 1-3 msg types
         */
        enumType = Enum394BidType.NON_DISCLOSED;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "NON_DISCLOSED", enumType.toFIXNameString());
        assertEquals( "1 - Non Disclosed style (e.g. US/European)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum394BidType.DISCLOSED;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "DISCLOSED", enumType.toFIXNameString());
        assertEquals( "2 - Disclosed style (e.g. Japanese)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum394BidType.NO_BIDDING;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "NO_BIDDING", enumType.toFIXNameString());
        assertEquals( "3 - No bidding process", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}