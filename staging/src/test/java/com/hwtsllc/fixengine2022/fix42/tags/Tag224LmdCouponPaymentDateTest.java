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
import com.hwtsllc.fixengine2022.datatypes.MyLocalMktDateType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  224
 *  CouponPaymentDate
 *  LocalMktDate
 *  <p>
 *  Date interest is to be paid.  Used in identifying Corporate Bond issues.
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 *  <p></p>
 *  (prior to FIX 4.4 field was of type UTCDate)
 */
class Tag224LmdCouponPaymentDateTest {
    @Test
    void FIX0224Test() {
        FIX42 fixData = FIX42.FIX224_LMD_COUPON_PAYMENT_DATE;
        assertEquals( "224", fixData.toFIXIDString());
        assertEquals( "COUPON_PAYMENT_DATE", fixData.toFIXNameString());
        assertEquals( "CouponPaymentDate", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0224Test() {
        Tag224LmdCouponPaymentDate tagData;

        tagData = new Tag224LmdCouponPaymentDate(new MyLocalMktDateType(
                Tag224LmdCouponPaymentDate.TESTA_LMD_COUPON_PAYMENT_DATE));
        assertEquals( Tag224LmdCouponPaymentDate.TESTA_LMD_COUPON_PAYMENT_DATE,
                tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag224LmdCouponPaymentDate(new MyLocalMktDateType(
                Tag224LmdCouponPaymentDate.TESTB_LMD_COUPON_PAYMENT_DATE));
        assertEquals( Tag224LmdCouponPaymentDate.TESTB_LMD_COUPON_PAYMENT_DATE,
                tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
    }
}