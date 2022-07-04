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
 *  241
 *  UnderlyingCouponPaymentDate
 *  LocalMktDate
 *  <p>
 *  Underlying security’s CouponPaymentDate.
 *  <p>
 *  See CouponPaymentDate (224) field for description
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 *  <p></p>
 *  (prior to FIX 4.4 field was of type UTCDate)
 */
class Tag241LmdUnderlyingCouponPaymentDateTest {
    @Test
    void FIX0241Test() {
        FIX42 fixData = FIX42.FIX241_LMD_UNDERLYING_COUPON_PAYMENT_DATE;
        assertEquals( "241", fixData.toEnumIDString());
        assertEquals( "UNDERLYING_COUPON_PAYMENT_DATE", fixData.toEnumNameString());
        assertEquals( "UnderlyingCouponPaymentDate", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0241Test() {
        Tag241LmdUnderlyingCouponPaymentDate tagData;
        String oneElement;

        oneElement = Tag241LmdUnderlyingCouponPaymentDate.TESTA_LMD_UNDERLYING_COUPON_PAYMENT_DATE;
        tagData = new Tag241LmdUnderlyingCouponPaymentDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag241LmdUnderlyingCouponPaymentDate.TESTB_LMD_UNDERLYING_COUPON_PAYMENT_DATE;
        tagData = new Tag241LmdUnderlyingCouponPaymentDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag241LmdUnderlyingCouponPaymentDate tagData;
        String oneElement;

        oneElement = Tag241LmdUnderlyingCouponPaymentDate.TESTA_LMD_UNDERLYING_COUPON_PAYMENT_DATE;
        tagData = new Tag241LmdUnderlyingCouponPaymentDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag241LmdUnderlyingCouponPaymentDate.TESTB_LMD_UNDERLYING_COUPON_PAYMENT_DATE;
        tagData = new Tag241LmdUnderlyingCouponPaymentDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag241LmdUnderlyingCouponPaymentDate tagData;
        String oneElement;

        oneElement = Tag241LmdUnderlyingCouponPaymentDate.TESTB_LMD_UNDERLYING_COUPON_PAYMENT_DATE;
        tagData = new Tag241LmdUnderlyingCouponPaymentDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag241LmdUnderlyingCouponPaymentDate tagData;
        String oneElement;

        oneElement = Tag241LmdUnderlyingCouponPaymentDate.TESTB_LMD_UNDERLYING_COUPON_PAYMENT_DATE;
        tagData = new Tag241LmdUnderlyingCouponPaymentDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag241LmdUnderlyingCouponPaymentDate tagData;
        String oneElement;

        oneElement = Tag241LmdUnderlyingCouponPaymentDate.TESTB_LMD_UNDERLYING_COUPON_PAYMENT_DATE;
        tagData = new Tag241LmdUnderlyingCouponPaymentDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag241LmdUnderlyingCouponPaymentDate tagData;
        String oneElement;

        oneElement = Tag241LmdUnderlyingCouponPaymentDate.TESTA_LMD_UNDERLYING_COUPON_PAYMENT_DATE;
        tagData = new Tag241LmdUnderlyingCouponPaymentDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( "Tag241LmdUnderlyingCouponPaymentDate\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}