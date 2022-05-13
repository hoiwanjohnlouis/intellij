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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix42.enums.Enum431ListOrderStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  Tag431
 *  Enu
 *  ListOrderStatus
 *
 *      1-7 msg types
 *      IN_BIDDING_PROCESS( "1", "IN_BIDDING_PROCESS", "1 - In Bidding Process" ),
 *      RECEIVED_FOR_EXECUTION( "2", "RECEIVED_FOR_EXECUTION", "2 - Received For Execution" ),
 *      EXECUTING( "3", "EXECUTING", "3 - Executing" ),
 *      CANCELLING( "4", "CANCELLING", "4 - Cancelling" ),
 *      ALERT( "5", "ALERT", "5 - Alert" ),
 *      ALL_DONE( "6", "ALL_DONE", "6 - All Done" ),
 *      REJECT( "7", "REJECT", "7 - Reject" ),
 */
class Tag431EnuListOrderStatusTest {
    @Test
    void FIX0431Test() {
        FIX42 fixData = FIX42.FIX431_ENU_LIST_ORDER_STATUS;
        assertEquals( "431", fixData.getID());
        assertEquals( "LIST_ORDER_STATUS", fixData.getName());
        assertEquals( "ListOrderStatus", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0431Test() {
        Tag431EnuListOrderStatus tagData;

        /*
         * 1-7 msg types
         */
        tagData = new Tag431EnuListOrderStatus(Enum431ListOrderStatus.IN_BIDDING_PROCESS);
        assertEquals( Enum431ListOrderStatus.IN_BIDDING_PROCESS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag431EnuListOrderStatus(Enum431ListOrderStatus.RECEIVED_FOR_EXECUTION);
        assertEquals( Enum431ListOrderStatus.RECEIVED_FOR_EXECUTION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag431EnuListOrderStatus(Enum431ListOrderStatus.EXECUTING);
        assertEquals( Enum431ListOrderStatus.EXECUTING.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag431EnuListOrderStatus(Enum431ListOrderStatus.CANCELLING);
        assertEquals( Enum431ListOrderStatus.CANCELLING.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag431EnuListOrderStatus(Enum431ListOrderStatus.ALERT);
        assertEquals( Enum431ListOrderStatus.ALERT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag431EnuListOrderStatus(Enum431ListOrderStatus.ALL_DONE);
        assertEquals( Enum431ListOrderStatus.ALL_DONE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag431EnuListOrderStatus(Enum431ListOrderStatus.REJECT);
        assertEquals( Enum431ListOrderStatus.REJECT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}