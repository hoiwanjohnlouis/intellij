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
import com.hwtsllc.fixengine2022.fix44.enums.Enum660AcctIDSource;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag660EnuAcctIDSourceTest {
    @Test
    void FIX0660Test() {
        FIX44 fixData = FIX44.FIX660_ENU_ACCT_ID_SOURCE;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX44.JUNK_ID, fixData.getID());
        assertNotEquals( FIX44.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  660 (same as 660, 661)
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
    @Test
    void Tag0660Test() {
        Tag660EnuAcctIDSource tagData;

        tagData = new Tag660EnuAcctIDSource(Enum660AcctIDSource.BIC);
        assertEquals( Enum660AcctIDSource.BIC.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag660EnuAcctIDSource(Enum660AcctIDSource.SID);
        assertEquals( Enum660AcctIDSource.SID.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag660EnuAcctIDSource(Enum660AcctIDSource.TFM);
        assertEquals( Enum660AcctIDSource.TFM.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag660EnuAcctIDSource(Enum660AcctIDSource.OMGEO);
        assertEquals( Enum660AcctIDSource.OMGEO.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag660EnuAcctIDSource(Enum660AcctIDSource.DTCC);
        assertEquals( Enum660AcctIDSource.DTCC.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag660EnuAcctIDSource(Enum660AcctIDSource.OTHER);
        assertEquals( Enum660AcctIDSource.OTHER.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}