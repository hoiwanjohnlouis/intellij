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

package com.hwtsllc.fixengine.tags.fix42.enums;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  434
 *  CxlRejResponseTo
 *  char
 *  <p>
 *  Identifies the type of request that a Cancel Reject is in response to.
 *  <p></p>
 *  Valid values:
 *  <p>    1-2 msg types
 *  <p>    1 - Order cancel request
 *  <p>    2 - Order cancel/replace request
 */
class Enum434CxlRejResponseToTest {
    @Test
    void Enum0434Test() {
        Enum434CxlRejResponseTo enumType;

        /*
         * 1-2 msg types
         */
        enumType = Enum434CxlRejResponseTo.ORDER_CANCEL_REQUEST;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("ORDER_CANCEL_REQUEST", enumType.toFIXNameString());
        assertEquals("1 - Order cancel request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum434CxlRejResponseTo.ORDER_MODIFICATION_REQUEST;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("ORDER_MODIFICATION_REQUEST", enumType.toFIXNameString());
        assertEquals("2 - Order cancel/replace request", enumType.toFIXDescriptionString());
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