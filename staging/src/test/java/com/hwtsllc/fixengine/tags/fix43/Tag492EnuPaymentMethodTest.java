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

package com.hwtsllc.fixengine.tags.fix43;

import com.hwtsllc.fixengine.enums.fix43.Enum492PaymentMethod;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag492EnuPaymentMethodTest {
    Tag492EnuPaymentMethod tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum492PaymentMethod oneEnum : Enum492PaymentMethod.values()) {
            tagData = new Tag492EnuPaymentMethod(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum492PaymentMethod oneEnum : Enum492PaymentMethod.values()) {
            tagData = new Tag492EnuPaymentMethod(oneEnum);
            assertEquals( "FIX492_ENU_PAYMENT_METHOD", tagData.toFIXLabelString());
            assertEquals( "492", tagData.toFIXIDString());
            assertEquals( "PAYMENT_METHOD", tagData.toFIXNameString());
            assertEquals( "PaymentMethod", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum492PaymentMethod oneEnum : Enum492PaymentMethod.values()) {
            tagData = new Tag492EnuPaymentMethod(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  492 (same as 492,)
         *  PaymentMethod
         *  int
         *  <p>    1 - CREST
         *  <p>    2 - NSCC
         *  <p>    3 - Euroclear
         *  <p>    4 - Clearstream
         *  <p>    5 - Cheque
         */
        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.CREST );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.NSCC );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.EUROCLEAR );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.CLEARSTREAM );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.CHEQUE );
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    6 - Telegraphic Transfer
         *  <p>    7 - Fed Wire
         *  <p>    8 - Debit Card
         *  <p>    9 - Direct Debit (BECS)
         *  <p>    10 - Direct Credit (BECS)
         */
        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.TELEGRAPHIC_TRANSFER );
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.FED_WIRE );
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.DEBIT_CARD );
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.DIRECT_DEBIT );
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.DIRECT_CREDIT );
        assertEquals( "10", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    11 - Credit Card
         *  <p>    12 - ACH Debit
         *  <p>    13 - ACH Credit
         *  <p>    14 - BPAY
         *  <p>    15 - High Value Clearing System (HVACS)
         *  <p>    or any value conforming to the data type Reserved1000Plus
         */
        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.CREDIT_CARD );
        assertEquals( "11", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.ACH_DEBIT );
        assertEquals( "12", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.ACH_CREDIT );
        assertEquals( "13", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.BPAY );
        assertEquals( "14", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.HIGH_VALUE_CLEARING_SYSTEM );
        assertEquals( "15", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum492PaymentMethod oneEnum : Enum492PaymentMethod.values()) {
            tagData = new Tag492EnuPaymentMethod(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum492PaymentMethod oneEnum : Enum492PaymentMethod.values()) {
            tagData = new Tag492EnuPaymentMethod(oneEnum);
            assertEquals( "Tag492EnuPaymentMethod\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}