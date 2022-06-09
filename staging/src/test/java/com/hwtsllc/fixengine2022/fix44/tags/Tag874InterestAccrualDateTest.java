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
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  874
 *  InterestAccrualDate
 *  LocalMktDate
 *  <p></p>
 *  The start date used for calculating accrued interest on
 *  debt instruments which are being sold between interest payment dates.
 *  <p></p>
 *  Often but not always the same as the Issue Date and the Dated Date
 */
class Tag874InterestAccrualDateTest {
    @Test
    void FIX0874Test() {
        FIX44 fixData = FIX44.FIX874_INTEREST_ACCRUAL_DATE;
        assertEquals( "874", fixData.toFIXIDString());
        assertEquals( "INTEREST_ACCRUAL_DATE", fixData.toFIXNameString());
        assertEquals( "InterestAccrualDate", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0874Test() {
        Tag874InterestAccrualDate tagData;

    }
}