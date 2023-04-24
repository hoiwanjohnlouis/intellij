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

package com.hwtsllc.fixengine.tags.fix43.enums;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  560
 *  SecurityRequestResult
 *  int
 *  <p></p>
 *  The results returned to a Security Request message
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Valid request
 *  <p>    1 - Invalid or unsupported request
 *  <p>    2 - No instruments found that match selection criteria
 *  <p>    3 - Not authorized to retrieve instrument data
 *  <p>    4 - Instrument data temporarily unavailable
 *  <p>    5 - Request for instrument data not supported
 */
class Enum560SecurityRequestResultTest {
    /*
     *  Information is the same for TAGS 560
     */
    @Test
    void Enum0560Test() {
        Enum560SecurityRequestResult enumType;

        /*
         *  0-5 types
         */
        enumType = Enum560SecurityRequestResult.VALID_REQUEST;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("VALID_REQUEST", enumType.toFIXNameString());
        assertEquals("0 - Valid request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum560SecurityRequestResult.UNSUPPORTED_REQUEST;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("UNSUPPORTED_REQUEST", enumType.toFIXNameString());
        assertEquals("1 - Invalid or unsupported request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum560SecurityRequestResult.NO_INSTRUMENTS_FOUND;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("NO_INSTRUMENTS_FOUND", enumType.toFIXNameString());
        assertEquals("2 - No instruments found that match selection criteria", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum560SecurityRequestResult.NOT_AUTHORIZED;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("NOT_AUTHORIZED", enumType.toFIXNameString());
        assertEquals("3 - Not authorized to retrieve instrument data", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum560SecurityRequestResult.INSTRUMENT_DATA_UNAVAILABLE;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("INSTRUMENT_DATA_UNAVAILABLE", enumType.toFIXNameString());
        assertEquals("4 - Instrument data temporarily unavailable", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum560SecurityRequestResult.REQUEST_NOT_SUPPORTED;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("REQUEST_NOT_SUPPORTED", enumType.toFIXNameString());
        assertEquals("5 - Request for instrument data not supported", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}