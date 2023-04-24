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
 *  374
 *  Enu
 *  BidRequestTransType
 *  char
 *  <p>
 *  Identifies the Bid Request message type.
 *  <p></p>
 *  Valid values:
 *  <p>    C, and N msg types
 *  <p>    "C - Cancel"
 *  <p>    "N - New"
 */
class Enum374BidRequestTransTypeTest {
    @Test
    void Enum0374Test() {
        Enum374BidRequestTransType enumType;

        /*
         * C, and N msg types
         */
        enumType = Enum374BidRequestTransType.CANCEL;
        assertEquals( "C", enumType.toFIXIDString());
        assertEquals( "CANCEL", enumType.toFIXNameString());
        assertEquals( "C - Cancel", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum374BidRequestTransType.NEW;
        assertEquals( "N", enumType.toFIXIDString());
        assertEquals( "NEW", enumType.toFIXNameString());
        assertEquals( "N - New", enumType.toFIXDescriptionString());
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