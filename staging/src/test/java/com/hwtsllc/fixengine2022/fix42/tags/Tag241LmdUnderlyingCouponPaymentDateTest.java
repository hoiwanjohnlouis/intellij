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

class Tag241LmdUnderlyingCouponPaymentDateTest {
    Tag241LmdUnderlyingCouponPaymentDate tagData;
    String [] TestArray = {
            Tag241LmdUnderlyingCouponPaymentDate.TESTA_LMD_UNDERLYING_COUPON_PAYMENT_DATE,
            Tag241LmdUnderlyingCouponPaymentDate.TESTB_LMD_UNDERLYING_COUPON_PAYMENT_DATE
    };

    @Test
    void PrintTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag241LmdUnderlyingCouponPaymentDate( new MyLocalMktDateType( oneElement ));
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag241LmdUnderlyingCouponPaymentDate( new MyLocalMktDateType( oneElement ));
            assertEquals( "FIX241_LMD_UNDERLYING_COUPON_PAYMENT_DATE", tagData.toFIXLabelString());
            assertEquals( "241", tagData.toFIXIDString());
            assertEquals( "UNDERLYING_COUPON_PAYMENT_DATE", tagData.toEnumNameString());
            assertEquals( "UnderlyingCouponPaymentDate", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag241LmdUnderlyingCouponPaymentDate( new MyLocalMktDateType( oneElement ));
            assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  241
         *  UnderlyingCouponPaymentDate
         *  LocalMktDate
         */

        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag241LmdUnderlyingCouponPaymentDate( new MyLocalMktDateType( oneElement ));
            assertEquals( oneElement, tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag241LmdUnderlyingCouponPaymentDate( new MyLocalMktDateType( oneElement ));
            assertEquals( "Tag241LmdUnderlyingCouponPaymentDate\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + oneElement + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
        }
    }
}