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
import com.hwtsllc.fixengine2022.datatypes.MyPercentageType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag223PctCouponRateTest {
    @Test
    void FIX0223Test() {
        FIX42 fixData = FIX42.FIX223_PCT_COUPON_RATE;
        assertEquals( "223", fixData.getID());
        assertEquals( "COUPON_RATE", fixData.getName());
        assertEquals( "CouponRate", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0223Test() {
        Log223PctCouponRate tagData;

        tagData = new Log223PctCouponRate(new MyPercentageType(
                Log223PctCouponRate.TESTA_PCT_COUPON_RATE));
        assertEquals( Log223PctCouponRate.TESTA_PCT_COUPON_RATE,
                tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );

        tagData = new Log223PctCouponRate(new MyPercentageType(
                Log223PctCouponRate.TESTB_PCT_COUPON_RATE));
        assertEquals( Log223PctCouponRate.TESTB_PCT_COUPON_RATE,
                tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );
    }
}