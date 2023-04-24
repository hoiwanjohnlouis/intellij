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

package com.hwtsllc.fixengine.datatypes;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  88 (same as 88, 776)
 *  AllocRejCode
 *  int
 *  <p></p>
 *  Identifies reason for rejection.
 *  <p></p>
 *  776 (same as 88, 776)
 *  IndividualAllocRejCode
 *  int
 *  <p></p>
 *  Identified reason for rejecting an individual AllocAccount (79) detail.
 *  <p></p>
 *      Same values as  AllocRejCode (88)
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Unknown account(s)
 *  <p>    1 - Incorrect quantity
 *  <p>    2 - Incorrect average price
 *  <p>    3 - Unknown executing broker mnemonic
 *  <p>    4 - Commission difference
 *  <p></p>
 *  <p>    5 - Unknown OrderID (37)
 *  <p>    6 - Unknown ListID (66)
 *  <p>    7 - Other (further in Text (58))
 *  <p>    8 - Incorrect allocated quantity
 *  <p>    9 - Calculation difference
 *  <p></p>
 *  <p>    10 - Unknown or stale ExecID
 *  <p>    11 - Mismatched data
 *  <p>    12 - Unknown ClOrdID
 *  <p>    13 - Warehouse request rejected
 */
class MyEnumAllocRejCodeTest {
    @Test
    void Enum0088Test() {
        MyEnumAllocRejCode enumType;

        /*
         * 0-13 msg types
         */
        enumType = MyEnumAllocRejCode.UNKNOWN_ACCOUNT;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("UNKNOWN_ACCOUNT", enumType.toFIXNameString());
        assertEquals("0 - Unknown account(s)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumAllocRejCode.INCORRECT_QUANTITY;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("INCORRECT_QUANTITY", enumType.toFIXNameString());
        assertEquals("1 - Incorrect quantity", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumAllocRejCode.INCORRECT_AVERAGE_PRICE;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("INCORRECT_AVERAGE_PRICE", enumType.toFIXNameString());
        assertEquals("2 - Incorrect average price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumAllocRejCode.UNKNOWN_EXECUTING_BROKER_MNEMONIC;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("UNKNOWN_EXECUTING_BROKER_MNEMONIC", enumType.toFIXNameString());
        assertEquals("3 - Unknown executing broker mnemonic", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumAllocRejCode.COMMISSION_DIFFERENCE;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("COMMISSION_DIFFERENCE", enumType.toFIXNameString());
        assertEquals("4 - Commission difference", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumAllocRejCode.UNKNOWN_ORDERID;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("UNKNOWN_ORDERID", enumType.toFIXNameString());
        assertEquals("5 - Unknown OrderID (37)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumAllocRejCode.UNKNOWN_LISTID;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("UNKNOWN_LISTID", enumType.toFIXNameString());
        assertEquals("6 - Unknown ListID (66)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumAllocRejCode.OTHER;
        assertEquals("7", enumType.toFIXIDString());
        assertEquals("OTHER", enumType.toFIXNameString());
        assertEquals("7 - Other (further in Text (58))", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumAllocRejCode.INCORRECT_ALLOCATED_QUANTITY;
        assertEquals("8", enumType.toFIXIDString());
        assertEquals("INCORRECT_ALLOCATED_QUANTITY", enumType.toFIXNameString());
        assertEquals("8 - Incorrect allocated quantity", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumAllocRejCode.CALCULATION_DIFFERENCE;
        assertEquals("9", enumType.toFIXIDString());
        assertEquals("CALCULATION_DIFFERENCE", enumType.toFIXNameString());
        assertEquals("9 - Calculation difference", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumAllocRejCode.UNKNOWN_OR_STALE_EXECID;
        assertEquals("10", enumType.toFIXIDString());
        assertEquals("UNKNOWN_OR_STALE_EXECID", enumType.toFIXNameString());
        assertEquals("10 - Unknown or stale ExecID", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumAllocRejCode.MISMATCHED_DATA;
        assertEquals("11", enumType.toFIXIDString());
        assertEquals("MISMATCHED_DATA", enumType.toFIXNameString());
        assertEquals("11 - Mismatched data", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumAllocRejCode.UNKNOWN_CLORDID;
        assertEquals("12", enumType.toFIXIDString());
        assertEquals("UNKNOWN_CLORDID", enumType.toFIXNameString());
        assertEquals("12 - Unknown ClOrdID", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumAllocRejCode.WAREHOUSE_REQUEST_REJECTED;
        assertEquals("13", enumType.toFIXIDString());
        assertEquals("WAREHOUSE_REQUEST_REJECTED", enumType.toFIXNameString());
        assertEquals("13 - Warehouse request rejected", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}