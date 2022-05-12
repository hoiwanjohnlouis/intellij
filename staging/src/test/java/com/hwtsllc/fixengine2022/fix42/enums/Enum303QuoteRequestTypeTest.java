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

class Enum303QuoteRequestTypeTest {
    /**
     *  303
     *  QuoteRequestType
     *
     *      1-2 msg types
     *      MANUAL( "1", "MANUAL", "1 - Manual" ),
     *      AUTOMATIC( "2", "AUTOMATIC", "2 - Automatic" ),
     */
    @Test
    void Enum0303Test() {
        Enum303QuoteRequestType enumType;

        /**
         * 1-2 msg types
         */
        enumType = Enum303QuoteRequestType.MANUAL;
        assertEquals( "1", enumType.getID());
        assertEquals( "MANUAL", enumType.getName());
        assertEquals( "1 - Manual", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum303QuoteRequestType.AUTOMATIC;
        assertEquals( "2", enumType.getID());
        assertEquals( "AUTOMATIC", enumType.getName());
        assertEquals( "2 - Automatic", enumType.getDescription());
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