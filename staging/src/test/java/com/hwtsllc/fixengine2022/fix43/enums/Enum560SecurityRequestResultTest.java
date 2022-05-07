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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum560SecurityRequestResultTest {
    /**
     *  Information is the same for TAGS 560
     */
    @Test
    void Enum0560Test() {
        Enum560SecurityRequestResult enumType;

        /*
         *  0-5 types
         */
        enumType = Enum560SecurityRequestResult.VALID_REQUEST;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("0,VALID_REQUEST,0 - Valid request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum560SecurityRequestResult.UNSUPPORTED_REQUEST;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("1,UNSUPPORTED_REQUEST,1 - Invalid or unsupported request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum560SecurityRequestResult.NO_INSTRUMENTS_FOUND;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("2,NO_INSTRUMENTS_FOUND,2 - No instruments found that match selection criteria", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum560SecurityRequestResult.NOT_AUTHORIZED;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("3,NOT_AUTHORIZED,3 - Not authorized to retrieve instrument data", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum560SecurityRequestResult.INSTRUMENT_DATA_UNAVAILABLE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("4,INSTRUMENT_DATA_UNAVAILABLE,4 - Instrument data temporarily unavailable", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum560SecurityRequestResult.REQUEST_NOT_SUPPORTED;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("5,REQUEST_NOT_SUPPORTED,5 - Request for instrument data not supported", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}