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
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import com.hwtsllc.fixengine2022.fix42.enums.Enum291FinancialStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag291EnuFinancialStatusTest {
    @Test
    void FIX0291Test() {
        FIX42 fixData = FIX42.FIX291_ENU_FINANCIAL_STATUS;
        assertEquals( "291", fixData.getID());
        assertEquals( "FINANCIAL_STATUS", fixData.getName());
        assertEquals( "FinancialStatus", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  291
     *  FinancialStatus
     *
     *      1-3 msg types
     *      BANKRUPT( "1", "BANKRUPT", "1 - Bankrupt" ),
     *      PENDING_DELISTING( "2", "PENDING_DELISTING", "2 - Pending delisting" ),
     *      RESTRICTED( "3", "RESTRICTED", "3 - Restricted" ),
     */
    @Test
    void Tag0291Test() {
        Tag291EnuFinancialStatus tagData;

        /**
         * 1-3 msg types
         */
        tagData = new Tag291EnuFinancialStatus(Enum291FinancialStatus.BANKRUPT);
        assertEquals( Enum291FinancialStatus.BANKRUPT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag291EnuFinancialStatus(Enum291FinancialStatus.PENDING_DELISTING);
        assertEquals( Enum291FinancialStatus.PENDING_DELISTING.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag291EnuFinancialStatus(Enum291FinancialStatus.RESTRICTED);
        assertEquals( Enum291FinancialStatus.RESTRICTED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}