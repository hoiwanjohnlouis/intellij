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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.fix42.enums.Enum216RoutingType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag340EnuTradSesStatusTest {
    @Test
    void FIX0340Test() {
        FIX42 fixData = FIX42.FIX340_ENU_TRAD_SES_STATUS;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     * 0-6 msg types
     */
    UNKNOWN( "0", "UNKNOWN", "0 - Unknown" ),
    HALTED( "1", "HALTED", "1 - Halted" ),
    OPEN( "2", "OPEN", "2 - Open" ),
    CLOSED( "3", "CLOSED", "3 - Closed" ),
    PRE_OPEN( "4", "PRE_OPEN", "4 - Pre-Open" ),
    PRE_CLOSE( "5", "PRE_CLOSE", "5 - Pre-Close" ),
    REQUEST_REJECTED( "6", "REQUEST_REJECTED", "6 - Request Rejected" ),
    @Test
    void Tag0340Test() {
        Tag340EnuTradSesStatus tagData;

        tagData = new Tag216EnuRoutingType(Enum216RoutingType.TARGET_FIRM);
        assertEquals( Enum216RoutingType.TARGET_FIRM.getID(),
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}