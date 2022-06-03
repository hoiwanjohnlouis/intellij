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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.fix43.enums.Enum497FundRenewWaiv;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  497
 *  FundRenewWaiv
 *  char
 *  <p></p>
 *  A one character code identifying whether
 *  the Fund based renewal commission is to be waived.
 *  <p></p>
 *  Valid values:
 *  <p>    N - No
 *  <p>    Y - Yes
 */
class Tag497EnuFundRenewWaivTest {
    @Test
    void FIX0497Test() {
        FIX43 fixData = FIX43.FIX497_ENU_FUND_RENEW_WAIV;
        assertEquals( "497", fixData.toFIXIDString());
        assertEquals( "FUND_RENEW_WAIV", fixData.toFIXNameString());
        assertEquals( "FundRenewWaiv", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0497Test() {
        Tag497EnuFundRenewWaiv tagData;

        /*
         * N, Y types
         */
        tagData = new Tag497EnuFundRenewWaiv( Enum497FundRenewWaiv.NO );
        assertEquals( Enum497FundRenewWaiv.NO.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag497EnuFundRenewWaiv( Enum497FundRenewWaiv.YES );
        assertEquals( Enum497FundRenewWaiv.YES.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}