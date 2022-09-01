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

package com.hwtsllc.fixengine2022.fix27.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  102
 *  CxlRejReason
 *  int
 *  <p></p>
 *  Code to identify reason for cancel rejection.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Too late to cancel
 *  <p>    1 - Unknown order
 *  <p>    2 - Broker - Exchange Option
 *  <p>    3 - Order already in Pending Cancel or Pending Replace status
 *  <p>    4 - Unable to process Order Mass Cancel Request
 *  <p></p>
 *  <p>    5 - OrigOrdModTime (586) did not match last TransactTime (60) of order
 *  <p>    6 - Duplicate ClOrdID (11) received
 *  <p>    18 - Invalid price increment
 *  <p>    99 - Other
 *  <p></p>
 *  <p>    Or any value conforming to the data type Reserved100Plus
 */
class Enum102CxlRejReasonTest {
    @Test
    void Enum0102Test() {
        Enum102CxlRejReason enumType;

        /*
         *  0-6, 18, 99, msg types
         */

        /*
         *  0-6, msg types
         */
        enumType = Enum102CxlRejReason.TOO_LATE_TO_CANCEL;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("TOO_LATE_TO_CANCEL", enumType.toFIXNameString());
        assertEquals("0 - Too late to cancel", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum102CxlRejReason.UNKNOWN_ORDER;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("UNKNOWN_ORDER", enumType.toFIXNameString());
        assertEquals("1 - Unknown order", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum102CxlRejReason.BROKER_OR_EXCHANGE_OPTION;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("BROKER_OR_EXCHANGE_OPTION", enumType.toFIXNameString());
        assertEquals("2 - Broker or Exchange Option", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum102CxlRejReason.PENDING_STATUS;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("PENDING_STATUS", enumType.toFIXNameString());
        assertEquals("3 - Pending status", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum102CxlRejReason.UNABLE_TO_PROCESS_MASS_CANCEL_REQUEST;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("UNABLE_TO_PROCESS_MASS_CANCEL_REQUEST", enumType.toFIXNameString());
        assertEquals("4 - Unable to process Order Mass Cancel Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum102CxlRejReason.UNMATCHED_ORIG_ORD_MOD_TIME;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("UNMATCHED_ORIG_ORD_MOD_TIME", enumType.toFIXNameString());
        assertEquals("5 - OrigOrdModTime (586) did not match last TransactTime (60) of order",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum102CxlRejReason.DUPLICATE_CLORDID;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("DUPLICATE_CLORDID", enumType.toFIXNameString());
        assertEquals("6 - Duplicate ClOrdID (11) received", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        /*
         *  18, msg types
         */
        enumType = Enum102CxlRejReason.INVALID_PRICE_INCREMENT;
        assertEquals("18", enumType.toFIXIDString());
        assertEquals("INVALID_PRICE_INCREMENT", enumType.toFIXNameString());
        assertEquals("18 - Invalid price increment", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());



        /*
         *  99, msg types
         */
        enumType = Enum102CxlRejReason.OTHER;
        assertEquals("99", enumType.toFIXIDString());
        assertEquals("OTHER", enumType.toFIXNameString());
        assertEquals("99 - Other", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}