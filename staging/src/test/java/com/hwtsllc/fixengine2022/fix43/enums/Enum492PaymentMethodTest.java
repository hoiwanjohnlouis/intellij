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

package com.hwtsllc.fixengine2022.fix43.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum492PaymentMethodTest {
    /**
     *  492 (same as 492,)
     *  PaymentMethod
     *  A code identifying the Settlement payment method. 16 through 998 are reserved for future use
     *              Values above 1000 are available for use by private agreement among counterparties
     *  Valid values:
     *      1 - CREST
     *      2 - NSCC
     *      3 - Euroclear
     *      4 - Clearstream
     *      5 - Cheque
     *      6 - Telegraphic Transfer
     *      7 - Fed Wire
     *      8 - Debit Card
     *      9 - Direct Debit (BECS)
     *      10 - Direct Credit (BECS)
     *      11 - Credit Card
     *      12 - ACH Debit
     *      13 - ACH Credit
     *      14 - BPAY
     *      15 - High Value Clearing System (HVACS)
     *
     *      or any value conforming to the data type Reserved1000Plus
     */
    @Test
    void Enum0492Test() {
        Enum492PaymentMethod enumType;

        /*
         * 1-15 types
         */
        enumType = Enum492PaymentMethod.CREST;
        assertEquals("1", enumType.getID());
        assertEquals("CREST", enumType.getName());
        assertEquals("1 - CREST", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum492PaymentMethod.NSCC;
        assertEquals("2", enumType.getID());
        assertEquals("NSCC", enumType.getName());
        assertEquals("2 - NSCC", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum492PaymentMethod.EUROCLEAR;
        assertEquals("3", enumType.getID());
        assertEquals("EUROCLEAR", enumType.getName());
        assertEquals("3 - Euroclear", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum492PaymentMethod.CLEARSTREAM;
        assertEquals("4", enumType.getID());
        assertEquals("CLEARSTREAM", enumType.getName());
        assertEquals("4 - Clearstream", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum492PaymentMethod.CHEQUE;
        assertEquals("5", enumType.getID());
        assertEquals("CHEQUE", enumType.getName());
        assertEquals("5 - Cheque", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum492PaymentMethod.TELEGRAPHIC_TRANSFER;
        assertEquals("6", enumType.getID());
        assertEquals("TELEGRAPHIC_TRANSFER", enumType.getName());
        assertEquals("6 - Telegraphic Transfer", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum492PaymentMethod.FED_WIRE;
        assertEquals("7", enumType.getID());
        assertEquals("FED_WIRE", enumType.getName());
        assertEquals("7 - Fed Wire", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum492PaymentMethod.DEBIT_CARD;
        assertEquals("8", enumType.getID());
        assertEquals("DEBIT_CARD", enumType.getName());
        assertEquals("8 - Debit Card", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum492PaymentMethod.DIRECT_DEBIT;
        assertEquals("9", enumType.getID());
        assertEquals("DIRECT_DEBIT", enumType.getName());
        assertEquals("9 - Direct Debit (BECS)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum492PaymentMethod.DIRECT_CREDIT;
        assertEquals("10", enumType.getID());
        assertEquals("DIRECT_CREDIT", enumType.getName());
        assertEquals("10 - Direct Credit (BECS)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum492PaymentMethod.CREDIT_CARD;
        assertEquals("11", enumType.getID());
        assertEquals("CREDIT_CARD", enumType.getName());
        assertEquals("11 - Credit Card", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum492PaymentMethod.ACH_DEBIT;
        assertEquals("12", enumType.getID());
        assertEquals("ACH_DEBIT", enumType.getName());
        assertEquals("12 - ACH Debit", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum492PaymentMethod.ACH_CREDIT;
        assertEquals("13", enumType.getID());
        assertEquals("ACH_CREDIT", enumType.getName());
        assertEquals("13 - ACH Credit", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum492PaymentMethod.BPAY;
        assertEquals("14", enumType.getID());
        assertEquals("BPAY", enumType.getName());
        assertEquals("14 - BPAY", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum492PaymentMethod.HIGH_VALUE_CLEARING_SYSTEM;
        assertEquals("15", enumType.getID());
        assertEquals("HVACS", enumType.getName());
        assertEquals("15 - High Value Clearing System (HVACS)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}