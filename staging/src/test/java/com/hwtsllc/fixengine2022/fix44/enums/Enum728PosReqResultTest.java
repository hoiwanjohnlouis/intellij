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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum728PosReqResultTest {
    /**
     *  728
     *  PosReqResult
     *  Result of Request for Position
     *  4000+ Reserved and available for bi-laterally agreed upon user-defined values
     *  Valid values:
     *      0 - Valid request
     *      1 - Invalid or unsupported request
     *      2 - No positions found that match criteria
     *      3 - Not authorized to request positions
     *      4 - Request for position not supported
     *      99 - Other (use Text (58) in conjunction with this code for an explanation)
     *
     *      or any value conforming to the data type Reserved100Plus
     */
    @Test
    void EnumTest() {
        Enum728PosReqResult enumType;

        enumType = Enum728PosReqResult.VALID_REQUEST;
        assertEquals( "0", enumType.toFIXIDString());
        assertEquals( "VALID_REQUEST", enumType.toFIXNameString());
        assertEquals( "0 - Valid request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum728PosReqResult.UNSUPPORTED_REQUEST;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "UNSUPPORTED_REQUEST", enumType.toFIXNameString());
        assertEquals( "1 - Invalid or unsupported request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum728PosReqResult.NO_POSITIONS_FOUND;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "NO_POSITIONS_FOUND", enumType.toFIXNameString());
        assertEquals( "2 - No positions found that match criteria", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum728PosReqResult.NOT_AUTHORIZED;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "NOT_AUTHORIZED", enumType.toFIXNameString());
        assertEquals( "3 - Not authorized to request positions", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum728PosReqResult.REQUEST_NOT_SUPPORTED;
        assertEquals( "4", enumType.toFIXIDString());
        assertEquals( "REQUEST_NOT_SUPPORTED", enumType.toFIXNameString());
        assertEquals( "4 - Request for position not supported", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum728PosReqResult.OTHER;
        assertEquals( "99", enumType.toFIXIDString());
        assertEquals( "OTHER", enumType.toFIXNameString());
        assertEquals( "99 - Other (use Text (58) in conjunction with this code for an explanation)",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}