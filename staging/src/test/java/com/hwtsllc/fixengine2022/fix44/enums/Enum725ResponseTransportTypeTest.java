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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum725ResponseTransportTypeTest {
    /**
     *  725
     *  ResponseTransportType
     *  Identifies how the response to the request should be transmitted.
     *              Details specified via ResponseDestination (726).
     *  Valid values:
     *      0 - Inband - transport the request was sent over (default)
     *      1 - Out of Band - pre-arranged out-of-band delivery mechanism
     *              (i.e. FTP, HTTP, NDM, etc.) between counterparties
     */
    @Test
    void EnumTest() {
        Enum725ResponseTransportType enumType;

        enumType = Enum725ResponseTransportType.INBAND;
        assertEquals( "0", enumType.getID());
        assertEquals( "INBAND", enumType.getName());
        assertEquals( "0 - Inband - transport the request was sent over (default)",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum725ResponseTransportType.OUT_OF_BAND;
        assertEquals( "1", enumType.getID());
        assertEquals( "OUT_OF_BAND", enumType.getName());
        assertEquals( "1 - Out of Band - pre-arranged out-of-band delivery mechanism " +
                        "(i.e. FTP, HTTP, NDM, etc.) between counterparties",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}