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
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import com.hwtsllc.fixengine2022.datatypes.MyEnumAcctIDSource;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  661 (same as 660, 601)
 *  Used to identify the source of the Account (1) code.
 *  This is especially useful if the account is a new account that the Respondent may not have setup yet in their system.
 *  AcctIDSource
 *  Valid values:
 *      1 - BIC
 *     	2 - SID Code
 *      3 - TFM (GSPTA)
 *     	4 - OMGEO (Alert ID)
 *     	5 - DTCC Code
 *     	99 - Other (custom or proprietary)
 */
class Tag661EnuAllocAcctIDSourceTest {
    @Test
    void FIX0661Test() {
        FIX44 fixData = FIX44.FIX661_ENU_ALLOC_ACCT_ID_SOURCE;
        assertEquals( "661", fixData.getID());
        assertEquals( "ALLOC_ACCT_ID_SOURCE", fixData.getName());
        assertEquals( "AllocAcctIdSource", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0661Test() {
        Tag661EnuAllocAcctIDSource tagData;

        tagData = new Tag661EnuAllocAcctIDSource(MyEnumAcctIDSource.BIC);
        assertEquals( MyEnumAcctIDSource.BIC.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag661EnuAllocAcctIDSource(MyEnumAcctIDSource.SID);
        assertEquals( MyEnumAcctIDSource.SID.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag661EnuAllocAcctIDSource(MyEnumAcctIDSource.TFM);
        assertEquals( MyEnumAcctIDSource.TFM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag661EnuAllocAcctIDSource(MyEnumAcctIDSource.OMGEO);
        assertEquals( MyEnumAcctIDSource.OMGEO.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag661EnuAllocAcctIDSource(MyEnumAcctIDSource.DTCC);
        assertEquals( MyEnumAcctIDSource.DTCC.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag661EnuAllocAcctIDSource(MyEnumAcctIDSource.OTHER);
        assertEquals( MyEnumAcctIDSource.OTHER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}