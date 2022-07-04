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
        assertEquals("0", enumType.toEnumIDString());
        assertEquals("TOO_LATE_TO_CANCEL", enumType.toEnumNameString());
        assertEquals("0 - Too late to cancel", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum102CxlRejReason.UNKNOWN_ORDER;
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("UNKNOWN_ORDER", enumType.toEnumNameString());
        assertEquals("1 - Unknown order", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum102CxlRejReason.BROKER_OR_EXCHANGE_OPTION;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("BROKER_OR_EXCHANGE_OPTION", enumType.toEnumNameString());
        assertEquals("2 - Broker or Exchange Option", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum102CxlRejReason.PENDING_STATUS;
        assertEquals("3", enumType.toEnumIDString());
        assertEquals("PENDING_STATUS", enumType.toEnumNameString());
        assertEquals("3 - Pending status", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum102CxlRejReason.UNABLE_TO_PROCESS_MASS_CANCEL_REQUEST;
        assertEquals("4", enumType.toEnumIDString());
        assertEquals("UNABLE_TO_PROCESS_MASS_CANCEL_REQUEST", enumType.toEnumNameString());
        assertEquals("4 - Unable to process Order Mass Cancel Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum102CxlRejReason.UNMATCHED_ORIG_ORD_MOD_TIME;
        assertEquals("5", enumType.toEnumIDString());
        assertEquals("UNMATCHED_ORIG_ORD_MOD_TIME", enumType.toEnumNameString());
        assertEquals("5 - OrigOrdModTime (586) did not match last TransactTime (60) of order",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum102CxlRejReason.DUPLICATE_CLORDID;
        assertEquals("6", enumType.toEnumIDString());
        assertEquals("DUPLICATE_CLORDID", enumType.toEnumNameString());
        assertEquals("6 - Duplicate ClOrdID (11) received", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         *  18, msg types
         */
        enumType = Enum102CxlRejReason.INVALID_PRICE_INCREMENT;
        assertEquals("18", enumType.toEnumIDString());
        assertEquals("INVALID_PRICE_INCREMENT", enumType.toEnumNameString());
        assertEquals("18 - Invalid price increment", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());



        /*
         *  99, msg types
         */
        enumType = Enum102CxlRejReason.OTHER;
        assertEquals("99", enumType.toEnumIDString());
        assertEquals("OTHER", enumType.toEnumNameString());
        assertEquals("99 - Other", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}