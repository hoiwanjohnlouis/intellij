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
import com.hwtsllc.fixengine2022.fix42.enums.Enum429ListStatusType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag429EnuListStatusTypeTest {
    @Test
    void FIX0429Test() {
        FIX42 fixData = FIX42.FIX429_ENU_LIST_STATUS_TYPE;
        assertEquals( "429", fixData.getID());
        assertEquals( "LIST_STATUS_TYPE", fixData.getName());
        assertEquals( "ListStatusType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  Tag429
     *  Enu
     *  ListStatusType
     *
     *      1-6 msg types
     *      ACK( "1", "ACK", "1 - Ack" ),
     *      RESPONSE( "2", "RESPONSE", "2 - Response" ),
     *      TIMED( "3", "TIMED", "3 - Timed" ),
     *      EXEC_STARTED( "4", "EXEC_STARTED", "4 - Exec Started" ),
     *      ALL_DONE( "5", "ALL_DONE", "5 - All Done" ),
     *      ALERT( "6", "ALERT", "6 - Alert" ),
     */
    @Test
    void Tag0429Test() {
        Log429EnuListStatusType tagData;

        /**
         * 1-6 msg types
         */
        tagData = new Log429EnuListStatusType(Enum429ListStatusType.ACK);
        assertEquals( Enum429ListStatusType.ACK.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log429EnuListStatusType(Enum429ListStatusType.RESPONSE);
        assertEquals( Enum429ListStatusType.RESPONSE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log429EnuListStatusType(Enum429ListStatusType.TIMED);
        assertEquals( Enum429ListStatusType.TIMED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log429EnuListStatusType(Enum429ListStatusType.EXEC_STARTED);
        assertEquals( Enum429ListStatusType.EXEC_STARTED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log429EnuListStatusType(Enum429ListStatusType.ALL_DONE);
        assertEquals( Enum429ListStatusType.ALL_DONE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log429EnuListStatusType(Enum429ListStatusType.ALERT);
        assertEquals( Enum429ListStatusType.ALERT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}