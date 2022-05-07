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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import com.hwtsllc.fixengine2022.fix41.enums.Enum169StandInstDbType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag169EnuStandInstDBTypeTest {
    @Test
    void FIX0169Test() {
        FIX41 fixData = FIX41.FIX169_ENU_STAND_INST_DB_TYPE;
        assertEquals( "169", fixData.getID());
        assertEquals( "STAND_INST_DB_TYPE", fixData.getName());
        assertEquals( "StandInstDbType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0169Test() {
        Tag169EnuStandInstDBType tagData;

        tagData = new Tag169EnuStandInstDBType(Enum169StandInstDbType.OTHER);
        assertEquals( Enum169StandInstDbType.OTHER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag169EnuStandInstDBType(Enum169StandInstDbType.DTC_SID);
        assertEquals( Enum169StandInstDbType.DTC_SID.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag169EnuStandInstDBType(Enum169StandInstDbType.THOMPSON_ALERT);
        assertEquals( Enum169StandInstDbType.THOMPSON_ALERT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag169EnuStandInstDBType(Enum169StandInstDbType.GLOBAL_CUSTODIAN);
        assertEquals( Enum169StandInstDbType.GLOBAL_CUSTODIAN.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag169EnuStandInstDBType(Enum169StandInstDbType.ACCOUNT_NET);
        assertEquals( Enum169StandInstDbType.ACCOUNT_NET.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}