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
import com.hwtsllc.fixengine2022.fix44.enums.Enum722PosMaintStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  722
 *  PosMaintStatus
 *  Status of Position Maintenance Request
 *  Valid values:
 *      0 - Accepted
 *      1 - Accepted With Warnings
 *      2 - Rejected
 *      3 - Completed
 *      4 - Completed With Warnings
 */
class Tag722EnuPosMaintStatusTest {
    @Test
    void FIX0722Test() {
        FIX44 fixData = FIX44.FIX722_ENU_POS_MAINT_STATUS;
        assertEquals( "722", fixData.getID());
        assertEquals( "POS_MAINT_STATUS", fixData.getName());
        assertEquals( "PosMaintStatus", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0722Test() {
        Log722EnuPosMaintStatus tagData;

        tagData = new Log722EnuPosMaintStatus(Enum722PosMaintStatus.ACCEPTED);
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log722EnuPosMaintStatus(Enum722PosMaintStatus.ACCEPTED_WITH_WARNINGS);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log722EnuPosMaintStatus(Enum722PosMaintStatus.REJECTED);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log722EnuPosMaintStatus(Enum722PosMaintStatus.COMPLETED);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log722EnuPosMaintStatus(Enum722PosMaintStatus.COMPLETED_WITH_WARNINGS);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}