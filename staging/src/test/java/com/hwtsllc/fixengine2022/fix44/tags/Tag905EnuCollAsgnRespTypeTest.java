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
import com.hwtsllc.fixengine2022.fix44.enums.Enum905CollAsgnRespType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  905
 *  CollAsgnRespType
 *  int
 *  Collateral Assignment Response Type
 *  Valid values:
 *      0 - Received
 *      1 - Accepted
 *      2 - Declined
 *      3 - Rejected
 */
class Tag905EnuCollAsgnRespTypeTest {
    @Test
    void FIX0905Test() {
        FIX44 fixData = FIX44.FIX905_ENU_COLL_ASGN_RESP_TYPE;
        assertEquals( "905", fixData.getID());
        assertEquals( "COLL_ASGN_RESP_TYPE", fixData.getName());
        assertEquals( "CollAsgnRespType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0905Test() {
        Tag905EnuCollAsgnRespType tagData;

        tagData = new Tag905EnuCollAsgnRespType( Enum905CollAsgnRespType.RECEIVED );
        assertEquals( Enum905CollAsgnRespType.RECEIVED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag905EnuCollAsgnRespType( Enum905CollAsgnRespType.ACCEPTED );
        assertEquals( Enum905CollAsgnRespType.ACCEPTED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag905EnuCollAsgnRespType( Enum905CollAsgnRespType.DECLINED );
        assertEquals( Enum905CollAsgnRespType.DECLINED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag905EnuCollAsgnRespType( Enum905CollAsgnRespType.REJECTED );
        assertEquals( Enum905CollAsgnRespType.REJECTED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}