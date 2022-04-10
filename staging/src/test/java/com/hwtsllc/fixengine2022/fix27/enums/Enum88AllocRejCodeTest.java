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

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum88AllocRejCodeTest {
    @Test
    void Enum0088Test() {
        Enum88AllocRejCode enumType;

        /*
         * 0-13 msg types
         */
        enumType = Enum88AllocRejCode.UNKNOWN_ACCOUNT;
        assertEquals("0", enumType.getID());
        assertEquals("UNKNOWN_ACCOUNT", enumType.getName());
        assertEquals("0 - Unknown account(s)", enumType.getDescription());
        assertNotEquals( FIX27.JUNK_ID, enumType.getID());
        assertNotEquals( FIX27.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum88AllocRejCode.INCORRECT_QUANTITY;
        assertEquals("1", enumType.getID());
        assertEquals("INCORRECT_QUANTITY", enumType.getName());
        assertEquals("1 - Incorrect quantity", enumType.getDescription());
        assertNotEquals( FIX27.JUNK_ID, enumType.getID());
        assertNotEquals( FIX27.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum88AllocRejCode.INCORRECT_AVERAGE_PRICE;
        assertEquals("2", enumType.getID());
        assertEquals("INCORRECT_AVERAGE_PRICE", enumType.getName());
        assertEquals("2 - Incorrect average price", enumType.getDescription());
        assertNotEquals( FIX27.JUNK_ID, enumType.getID());
        assertNotEquals( FIX27.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum88AllocRejCode.UNKNOWN_EXECUTING_BROKER_MNEMONIC;
        assertEquals("3", enumType.getID());
        assertEquals("UNKNOWN_EXECUTING_BROKER_MNEMONIC", enumType.getName());
        assertEquals("3 - Unknown executing broker mnemonic", enumType.getDescription());
        assertNotEquals( FIX27.JUNK_ID, enumType.getID());
        assertNotEquals( FIX27.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum88AllocRejCode.COMMISSION_DIFFERENCE;
        assertEquals("4", enumType.getID());
        assertEquals("COMMISSION_DIFFERENCE", enumType.getName());
        assertEquals("4 - Commission difference", enumType.getDescription());
        assertNotEquals( FIX27.JUNK_ID, enumType.getID());
        assertNotEquals( FIX27.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum88AllocRejCode.UNKNOWN_ORDERID;
        assertEquals("5", enumType.getID());
        assertEquals("UNKNOWN_ORDERID", enumType.getName());
        assertEquals("5 - Unknown OrderID (37)", enumType.getDescription());
        assertNotEquals( FIX27.JUNK_ID, enumType.getID());
        assertNotEquals( FIX27.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum88AllocRejCode.UNKNOWN_LISTID;
        assertEquals("6", enumType.getID());
        assertEquals("UNKNOWN_LISTID", enumType.getName());
        assertEquals("6 - Unknown ListID (66)", enumType.getDescription());
        assertNotEquals( FIX27.JUNK_ID, enumType.getID());
        assertNotEquals( FIX27.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum88AllocRejCode.OTHER;
        assertEquals("7", enumType.getID());
        assertEquals("OTHER", enumType.getName());
        assertEquals("7 - Other (further in Text (58))", enumType.getDescription());
        assertNotEquals( FIX27.JUNK_ID, enumType.getID());
        assertNotEquals( FIX27.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum88AllocRejCode.INCORRECT_ALLOCATED_QUANTITY;
        assertEquals("8", enumType.getID());
        assertEquals("INCORRECT_ALLOCATED_QUANTITY", enumType.getName());
        assertEquals("8 - Incorrect allocated quantity", enumType.getDescription());
        assertNotEquals( FIX27.JUNK_ID, enumType.getID());
        assertNotEquals( FIX27.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum88AllocRejCode.CALCULATION_DIFFERENCE;
        assertEquals("9", enumType.getID());
        assertEquals("CALCULATION_DIFFERENCE", enumType.getName());
        assertEquals("9 - Calculation difference", enumType.getDescription());
        assertNotEquals( FIX27.JUNK_ID, enumType.getID());
        assertNotEquals( FIX27.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum88AllocRejCode.UNKNOWN_OR_STALE_EXECID;
        assertEquals("10", enumType.getID());
        assertEquals("UNKNOWN_OR_STALE_EXECID", enumType.getName());
        assertEquals("10 - Unknown or stale ExecID", enumType.getDescription());
        assertNotEquals( FIX27.JUNK_ID, enumType.getID());
        assertNotEquals( FIX27.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum88AllocRejCode.MISMATCHED_DATA;
        assertEquals("11", enumType.getID());
        assertEquals("MISMATCHED_DATA", enumType.getName());
        assertEquals("11 - Mismatched data", enumType.getDescription());
        assertNotEquals( FIX27.JUNK_ID, enumType.getID());
        assertNotEquals( FIX27.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum88AllocRejCode.UNKNOWN_CLORDID;
        assertEquals("12", enumType.getID());
        assertEquals("UNKNOWN_CLORDID", enumType.getName());
        assertEquals("12 - Unknown ClOrdID", enumType.getDescription());
        assertNotEquals( FIX27.JUNK_ID, enumType.getID());
        assertNotEquals( FIX27.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum88AllocRejCode.WAREHOUSE_REQUEST_REJECTED;
        assertEquals("13", enumType.getID());
        assertEquals("WAREHOUSE_REQUEST_REJECTED", enumType.getName());
        assertEquals("13 - Warehouse request rejected", enumType.getDescription());
        assertNotEquals( FIX27.JUNK_ID, enumType.getID());
        assertNotEquals( FIX27.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, enumType.getDescription());
    }
}