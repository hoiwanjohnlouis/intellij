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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix44.enums.Enum725ResponseTransportType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
class Tag725EnuResponseTransportTypeTest {
    @Test
    void FIX0725Test() {
        FIX44 fixData = FIX44.FIX725_ENU_RESPONSE_TRANSPORT_TYPE;
        assertEquals( "725", fixData.getID());
        assertEquals( "RESPONSE_TRANSPORT_TYPE", fixData.getName());
        assertEquals( "ResponseTransportType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0725Test() {
        Tag725EnuResponseTransportType tagData;

        tagData = new Tag725EnuResponseTransportType(Enum725ResponseTransportType.INBAND);
        assertEquals( "0", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag725EnuResponseTransportType(Enum725ResponseTransportType.OUT_OF_BAND);
        assertEquals( "1", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}