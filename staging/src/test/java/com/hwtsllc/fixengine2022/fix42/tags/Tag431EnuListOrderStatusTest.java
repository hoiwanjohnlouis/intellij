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

class Tag431EnuListOrderStatusTest {
    @Test
    void FIX0431Test() {
        FIX42 fixData = FIX42.FIX431_ENU_LIST_ORDER_STATUS;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     * 1-7 msg types
     */
    IN_BIDDING_PROCESS( "1", "IN_BIDDING_PROCESS", "1 - In Bidding Process" ),
    RECEIVED_FOR_EXECUTION( "2", "RECEIVED_FOR_EXECUTION", "2 - Received For Execution" ),
    EXECUTING( "3", "EXECUTING", "3 - Executing" ),
    CANCELLING( "4", "CANCELLING", "4 - Cancelling" ),
    ALERT( "5", "ALERT", "5 - Alert" ),
    ALL_DONE( "6", "ALL_DONE", "6 - All Done" ),
    REJECT( "7", "REJECT", "7 - Reject" ),
    @Test
    void Tag0431Test() {
        Tag431EnuListOrderStatus tagData;

        tagData = new Tag216EnuRoutingType(Enum216RoutingType.TARGET_FIRM);
        assertEquals( Enum216RoutingType.TARGET_FIRM.getID(),
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}