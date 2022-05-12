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
import com.hwtsllc.fixengine2022.fix44.enums.Enum939TrdRptStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  939
 *  TrdRptStatus
 *  int
 *  Trade Report Status
 *  Valid values:
 *      0 - Accepted
 *      1 - Rejected
 *      3 - Accepted with errors
 */
class Tag939EnuTrdRptStatusTest {
    @Test
    void FIX0939Test() {
        FIX44 fixData = FIX44.FIX939_ENU_TRD_RPT_STATUS;
        assertEquals( "939", fixData.getID());
        assertEquals( "TRD_RPT_STATUS", fixData.getName());
        assertEquals( "TrdRptStatus", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0939Test() {
        Log939EnuTrdRptStatus tagData;

        tagData = new Log939EnuTrdRptStatus( Enum939TrdRptStatus.ACCEPTED );
        assertEquals( Enum939TrdRptStatus.ACCEPTED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log939EnuTrdRptStatus( Enum939TrdRptStatus.REJECTED );
        assertEquals( Enum939TrdRptStatus.REJECTED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log939EnuTrdRptStatus( Enum939TrdRptStatus.ACCEPTED_WITH_ERRORS );
        assertEquals( Enum939TrdRptStatus.ACCEPTED_WITH_ERRORS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}