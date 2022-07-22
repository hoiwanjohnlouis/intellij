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

import com.hwtsllc.fixengine2022.datatypes.MyLocalMktDateType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  241
 *  UnderlyingCouponPaymentDate
 *  LocalMktDate
 *  <p></p>
 *  Underlying security’s CouponPaymentDate.
 *  <p></p>
 *  See CouponPaymentDate (224) field for description
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 *  <p></p>
 *  (prior to FIX 4.4 field was of type UTCDate)
 */
class Tag241LmdUnderlyingCouponPaymentDateTest {
    @Test
    void PrintTest() {
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
    void FIXTagTest() {
        Tag241LmdUnderlyingCouponPaymentDate tagData;
        String oneElement;

        oneElement = Tag241LmdUnderlyingCouponPaymentDate.TESTA_LMD_UNDERLYING_COUPON_PAYMENT_DATE;
        tagData = new Tag241LmdUnderlyingCouponPaymentDate( new MyLocalMktDateType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag241LmdUnderlyingCouponPaymentDate.TESTB_LMD_UNDERLYING_COUPON_PAYMENT_DATE;
        tagData = new Tag241LmdUnderlyingCouponPaymentDate( new MyLocalMktDateType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag241LmdUnderlyingCouponPaymentDate tagData, final String oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag241LmdUnderlyingCouponPaymentDate tagData ) {
        assertEquals( "FIX241_LMD_UNDERLYING_COUPON_PAYMENT_DATE", tagData.toEnumLabelString());
        assertEquals( "241", tagData.toEnumIDString());
        assertEquals( "UNDERLYING_COUPON_PAYMENT_DATE", tagData.toEnumNameString());
        assertEquals( "UnderlyingCouponPaymentDate", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag241LmdUnderlyingCouponPaymentDate tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag241LmdUnderlyingCouponPaymentDate tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag241LmdUnderlyingCouponPaymentDate tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }

    private void verifyVerboseString( final Tag241LmdUnderlyingCouponPaymentDate tagData ) {
        assertEquals( "Tag241LmdUnderlyingCouponPaymentDate\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + tagData.getDataValue() + "]\n" +
                        "\tValuePair[" + tagData.toValuePairString() + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}