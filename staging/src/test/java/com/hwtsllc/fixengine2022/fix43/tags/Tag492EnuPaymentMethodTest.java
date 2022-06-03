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
import com.hwtsllc.fixengine2022.fix43.enums.Enum492PaymentMethod;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  492 (same as 492,)
 *  PaymentMethod
 *  int
 *  <p></p>
 *  A code identifying the Settlement payment method.
 *  <p>
 *  16 through 998 are reserved for future use
 *  <p></p>
 *  Values above 1000 are available for use by private agreement among counterparties
 *  <p></p>
 *  Valid values:
 *  <p>    1 - CREST
 *  <p>    2 - NSCC
 *  <p>    3 - Euroclear
 *  <p>    4 - Clearstream
 *  <p>    5 - Cheque
 *  <p></p>
 *  <p>    6 - Telegraphic Transfer
 *  <p>    7 - Fed Wire
 *  <p>    8 - Debit Card
 *  <p>    9 - Direct Debit (BECS)
 *  <p>    10 - Direct Credit (BECS)
 *  <p></p>
 *  <p>    11 - Credit Card
 *  <p>    12 - ACH Debit
 *  <p>    13 - ACH Credit
 *  <p>    14 - BPAY
 *  <p>    15 - High Value Clearing System (HVACS)
 *  <p></p>
 *  <p>    or any value conforming to the data type Reserved1000Plus
 */
class Tag492EnuPaymentMethodTest {
    @Test
    void FIX0492Test() {
        FIX43 fixData = FIX43.FIX492_ENU_PAYMENT_METHOD;
        assertEquals( "492", fixData.toFIXIDString());
        assertEquals( "PAYMENT_METHOD", fixData.toFIXNameString());
        assertEquals( "PaymentMethod", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0492Test() {
        Tag492EnuPaymentMethod tagData;

        /*
         * 1-15 types
         */
        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.CREST );
        assertEquals( Enum492PaymentMethod.CREST.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.NSCC );
        assertEquals( Enum492PaymentMethod.NSCC.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.EUROCLEAR );
        assertEquals( Enum492PaymentMethod.EUROCLEAR.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.CLEARSTREAM );
        assertEquals( Enum492PaymentMethod.CLEARSTREAM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.CHEQUE );
        assertEquals( Enum492PaymentMethod.CHEQUE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.TELEGRAPHIC_TRANSFER );
        assertEquals( Enum492PaymentMethod.TELEGRAPHIC_TRANSFER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.FED_WIRE );
        assertEquals( Enum492PaymentMethod.FED_WIRE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.DEBIT_CARD );
        assertEquals( Enum492PaymentMethod.DEBIT_CARD.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.DIRECT_DEBIT );
        assertEquals( Enum492PaymentMethod.DIRECT_DEBIT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.DIRECT_CREDIT );
        assertEquals( Enum492PaymentMethod.DIRECT_CREDIT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.CREDIT_CARD );
        assertEquals( Enum492PaymentMethod.CREDIT_CARD.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.ACH_DEBIT );
        assertEquals( Enum492PaymentMethod.ACH_DEBIT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.ACH_CREDIT );
        assertEquals( Enum492PaymentMethod.ACH_CREDIT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.BPAY );
        assertEquals( Enum492PaymentMethod.BPAY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag492EnuPaymentMethod( Enum492PaymentMethod.HIGH_VALUE_CLEARING_SYSTEM );
        assertEquals( Enum492PaymentMethod.HIGH_VALUE_CLEARING_SYSTEM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}