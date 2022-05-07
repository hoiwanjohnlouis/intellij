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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  Tag434
 *  Enu
 *  CxlRejResponseTo
 *
 *      1-2 msg types
 *      ORDER_CANCEL_REQUEST( "1", "ORDER_CANCEL_REQUEST", "1 - Order cancel request" ),
 *      ORDER_MODIFICATION_REQUEST( "2", "ORDER_MODIFICATION_REQUEST", "2 - Order cancel/replace request" ),
 */
class Enum434CxlRejResponseToTest {
    @Test
    void Enum0434Test() {
        Enum434CxlRejResponseTo enumType;

        /**
         * 1-2 msg types
         */
        enumType = Enum434CxlRejResponseTo.ORDER_CANCEL_REQUEST;
        assertEquals("1", enumType.getID());
        assertEquals("ORDER_CANCEL_REQUEST", enumType.getName());
        assertEquals("1 - Order cancel request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum434CxlRejResponseTo.ORDER_MODIFICATION_REQUEST;
        assertEquals("2", enumType.getID());
        assertEquals("ORDER_MODIFICATION_REQUEST", enumType.getName());
        assertEquals("2 - Order cancel/replace request", enumType.getDescription());
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