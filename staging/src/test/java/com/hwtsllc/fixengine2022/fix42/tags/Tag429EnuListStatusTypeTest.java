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

/**
 *  429
 *  ListStatusType
 *  int
 *  <p>
 *  Code to represent the status type.
 *  <p></p>
 *  Valid values:
 *  <p>    1-6 msg types
 *  <p>    1 - Ack
 *  <p>    2 - Response
 *  <p>    3 - Timed
 *  <p>    4 - Exec Started
 *  <p>    5 - All Done
 *  <p></p>
 *  <p>    6 - Alert
 */
class Tag429EnuListStatusTypeTest {
    @Test
    void FIX0429Test() {
        FIX42 fixData = FIX42.FIX429_ENU_LIST_STATUS_TYPE;
        assertEquals( "429", fixData.toFIXIDString());
        assertEquals( "LIST_STATUS_TYPE", fixData.toFIXNameString());
        assertEquals( "ListStatusType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0429Test() {
        Tag429EnuListStatusType tagData;

        /*
         * 1-6 msg types
         */
        tagData = new Tag429EnuListStatusType(Enum429ListStatusType.ACK);
        assertEquals( Enum429ListStatusType.ACK.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag429EnuListStatusType(Enum429ListStatusType.RESPONSE);
        assertEquals( Enum429ListStatusType.RESPONSE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag429EnuListStatusType(Enum429ListStatusType.TIMED);
        assertEquals( Enum429ListStatusType.TIMED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag429EnuListStatusType(Enum429ListStatusType.EXEC_STARTED);
        assertEquals( Enum429ListStatusType.EXEC_STARTED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag429EnuListStatusType(Enum429ListStatusType.ALL_DONE);
        assertEquals( Enum429ListStatusType.ALL_DONE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag429EnuListStatusType(Enum429ListStatusType.ALERT);
        assertEquals( Enum429ListStatusType.ALERT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}