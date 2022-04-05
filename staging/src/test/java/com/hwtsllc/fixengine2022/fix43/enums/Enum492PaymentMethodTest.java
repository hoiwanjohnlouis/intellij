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

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum492PaymentMethodTest {
    /**
     *  Information is the same for TAGS 492
     */
    @Test
    void Enum0492Test() {
        Enum492PaymentMethod enumType;

        /*
         * 1-15 types
         */
        enumType = Enum492PaymentMethod.CREST;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("1,CREST,1 - CREST", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum492PaymentMethod.NSCC;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("2,NSCC,2 - NSCC", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum492PaymentMethod.EUROCLEAR;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("3,EUROCLEAR,3 - Euroclear", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum492PaymentMethod.CLEARSTREAM;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("4,CLEARSTREAM,4 - Clearstream", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum492PaymentMethod.CHEQUE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("5,CHEQUE,5 - Cheque", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum492PaymentMethod.TELEGRAPHIC_TRANSFER;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("6,TELEGRAPHIC_TRANSFER,6 - Telegraphic Transfer", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum492PaymentMethod.FED_WIRE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("7,FED_WIRE,7 - Fed Wire", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum492PaymentMethod.DEBIT_CARD;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("8,DEBIT_CARD,8 - Debit Card", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum492PaymentMethod.DIRECT_DEBIT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("9,DIRECT_DEBIT,9 - Direct Debit (BECS)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum492PaymentMethod.DIRECT_CREDIT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("10,DIRECT_CREDIT,10 - Direct Credit (BECS)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum492PaymentMethod.CREDIT_CARD;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("11,CREDIT_CARD,11 - Credit Card", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum492PaymentMethod.ACH_DEBIT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("12,ACH_DEBIT,12 - ACH Debit", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum492PaymentMethod.ACH_CREDIT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("13,ACH_CREDIT,13 - ACH Credit", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum492PaymentMethod.BPAY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("14,BPAY,14 - BPAY", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum492PaymentMethod.HIGH_VALUE_CLEARING_SYSTEM;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("15,HVACS,15 - High Value Clearing System (HVACS)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
}