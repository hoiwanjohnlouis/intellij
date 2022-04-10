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

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum477DistribPaymentMethodTest {
    /**
     *  Information is the same for TAGS 477
     */
    @Test
    void Enum0477Test() {
        Enum477DistribPaymentMethod enumType;

        /*
         * 1-12 types
         */
        enumType = Enum477DistribPaymentMethod.CREST;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("1,CREST,1 - CREST", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum477DistribPaymentMethod.NSCC;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("2,NSCC,2 - NSCC", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum477DistribPaymentMethod.EUROCLEAR;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("3,EUROCLEAR,3 - Euroclear", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum477DistribPaymentMethod.CLEARSTREAM;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("4,CLEARSTREAM,4 - Clearstream", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum477DistribPaymentMethod.CHEQUE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("5,CHEQUE,5 - Cheque", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum477DistribPaymentMethod.TELEGRAPHIC_TRANSFER;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("6,TELEGRAPHIC_TRANSFER,6 - Telegraphic Transfer", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum477DistribPaymentMethod.FED_WIRE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("7,FED_WIRE,7 - Fed Wire", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum477DistribPaymentMethod.DIRECT_CREDIT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("8,DIRECT_CREDIT,8 - Direct Credit (BECS, BACS)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum477DistribPaymentMethod.ACH_CREDIT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("9,ACH_CREDIT,9 - ACH Credit", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum477DistribPaymentMethod.BPAY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("10,BPAY,10 - BPAY", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum477DistribPaymentMethod.HIGH_VALUE_CLEARING_SYSTEM;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("11,HVACS,11 - High Value Clearing System HVACS", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum477DistribPaymentMethod.REINVEST_IN_FUND;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("12,REINVEST_IN_FUND,12 - Reinvest In Fund", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());
    }
}