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

/**
 *  477 (same as 477,)
 *  DistribPaymentMethod
 *  int
 *  <p></p>
 *  A code identifying the payment method for a (fractional) distribution.
 *  13 through 998 are reserved for future use
 *  <p>
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
 *  <p>    8 - Direct Credit (BECS,BACS)
 *  <p>    9 - ACH Debit
 *  <p>    10 - BPAY
 *  <p></p>
 *  <p>    11 - High Value Clearing System HVACS
 *  <p>    12 - Reinvest In Fund
 *  <p>    or any value conforming to the data type Reserved1000Plus
 */
class Enum477DistribPaymentMethodTest {
    @Test
    void Enum0477Test() {
        Enum477DistribPaymentMethod enumType;

        /*
         * 1-12 types
         */
        enumType = Enum477DistribPaymentMethod.CREST;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("CREST", enumType.toFIXNameString());
        assertEquals("1 - CREST", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum477DistribPaymentMethod.NSCC;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("NSCC", enumType.toFIXNameString());
        assertEquals("2 - NSCC", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum477DistribPaymentMethod.EUROCLEAR;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("EUROCLEAR", enumType.toFIXNameString());
        assertEquals("3 - Euroclear", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum477DistribPaymentMethod.CLEARSTREAM;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("CLEARSTREAM", enumType.toFIXNameString());
        assertEquals("4 - Clearstream", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum477DistribPaymentMethod.CHEQUE;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("CHEQUE", enumType.toFIXNameString());
        assertEquals("5 - Cheque", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum477DistribPaymentMethod.TELEGRAPHIC_TRANSFER;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("TELEGRAPHIC_TRANSFER", enumType.toFIXNameString());
        assertEquals("6 - Telegraphic Transfer", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum477DistribPaymentMethod.FED_WIRE;
        assertEquals("7", enumType.toFIXIDString());
        assertEquals("FED_WIRE", enumType.toFIXNameString());
        assertEquals("7 - Fed Wire", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum477DistribPaymentMethod.DIRECT_CREDIT;
        assertEquals("8", enumType.toFIXIDString());
        assertEquals("DIRECT_CREDIT", enumType.toFIXNameString());
        assertEquals("8 - Direct Credit (BECS, BACS)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum477DistribPaymentMethod.ACH_CREDIT;
        assertEquals("9", enumType.toFIXIDString());
        assertEquals("ACH_CREDIT", enumType.toFIXNameString());
        assertEquals("9 - ACH Credit", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum477DistribPaymentMethod.BPAY;
        assertEquals("10", enumType.toFIXIDString());
        assertEquals("BPAY", enumType.toFIXNameString());
        assertEquals("10 - BPAY", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum477DistribPaymentMethod.HIGH_VALUE_CLEARING_SYSTEM;
        assertEquals("11", enumType.toFIXIDString());
        assertEquals("HVACS", enumType.toFIXNameString());
        assertEquals("11 - High Value Clearing System HVACS", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum477DistribPaymentMethod.REINVEST_IN_FUND;
        assertEquals("12", enumType.toFIXIDString());
        assertEquals("REINVEST_IN_FUND", enumType.toFIXNameString());
        assertEquals("12 - Reinvest In Fund", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}