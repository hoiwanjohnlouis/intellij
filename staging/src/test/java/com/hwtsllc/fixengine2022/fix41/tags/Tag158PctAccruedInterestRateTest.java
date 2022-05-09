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
import com.hwtsllc.fixengine2022.datatypes.MyPercentageType;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  158
 *  AccruedInterestRate
 *  Percentage
 *  <p>
 *  The amount the buyer compensates the seller for the portion of the next coupon interest payment
 *  the seller has earned but will not receive from the issuer because the issuer will send the
 *  next coupon payment to the buyer.  Accrued Interest Rate is the annualized Accrued Interest
 *  amount divided by the purchase price of the bond.
 */
class Tag158PctAccruedInterestRateTest {
    @Test
    void FIX0158Test() {
        FIX41 fixData = FIX41.FIX158_PCT_ACCRUED_INTEREST_RATE;
        assertEquals( "158", fixData.getID());
        assertEquals( "ACCRUED_INTEREST_RATE", fixData.getName());
        assertEquals( "AccruedInterestRate", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0158Test() {
        Tag158PctAccruedInterestRate tagData;

        tagData = new Tag158PctAccruedInterestRate(
                new MyPercentageType(Tag158PctAccruedInterestRate.TESTA_PCT_ACCRUED_INTEREST_RATE));
        assertEquals( Tag158PctAccruedInterestRate.TESTA_PCT_ACCRUED_INTEREST_RATE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag158PctAccruedInterestRate(
                new MyPercentageType(Tag158PctAccruedInterestRate.TESTB_PCT_ACCRUED_INTEREST_RATE));
        assertEquals( Tag158PctAccruedInterestRate.TESTB_PCT_ACCRUED_INTEREST_RATE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}