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

package com.hwtsllc.fixengine.tags.fix44.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  725
 *  ResponseTransportType
 *  int
 *  <p></p>
 *  Identifies how the response to the request should be transmitted.
 *  <p></p>
 *  Details specified via ResponseDestination (726).
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Inband - transport the request was sent over (default)
 *  <p>    1 - Out of Band - pre-arranged out-of-band delivery mechanism
 *              (i.e. FTP, HTTP, NDM, etc.) between counterparties
 */
class Enum725ResponseTransportTypeTest {
    @Test
    void EnumTest() {
        Enum725ResponseTransportType enumType;

        enumType = Enum725ResponseTransportType.INBAND;
        assertEquals( "0", enumType.toFIXIDString());
        assertEquals( "INBAND", enumType.toFIXNameString());
        assertEquals( "0 - Inband - transport the request was sent over (default)",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum725ResponseTransportType.OUT_OF_BAND;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "OUT_OF_BAND", enumType.toFIXNameString());
        assertEquals( "1 - Out of Band - pre-arranged out-of-band delivery mechanism " +
                        "(i.e. FTP, HTTP, NDM, etc.) between counterparties",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}