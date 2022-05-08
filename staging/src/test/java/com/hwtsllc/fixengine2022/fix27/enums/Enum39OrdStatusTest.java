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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  39
 *  OrdStatus
 *  char
 *  Identifies current status of order.
 *
 *  *** SOME VALUES HAVE BEEN REPLACED ***
 *  *** See Replaced Features and Supported Approach ***
 *      (see Volume : "Glossary" for value definitions)
 *
 *  Valid values:
 *      0 - New
 *      1 - Partially filled
 *      2 - Filled
 *      3 - Done for day
 *      4 - Canceled
 *
 *      5 - Replaced (No longer used)
 *      6 - Pending Cancel (i.e. result of Order Cancel Request)
 *      7 - Stopped
 *      8 - Rejected
 *      9 - Suspended
 *
 *      A - Pending New
 *      B - Calculated
 *      C - Expired
 *      D - Accepted for Bidding
 *      E - Pending Replace (i.e. result of Order Cancel/Replace Request)
 */
class Enum39OrdStatusTest {
    @Test
    void Enum0039Test() {
        Enum39OrdStatus enumType;

        /**
         * 0-9 msg types
         */
        enumType = Enum39OrdStatus.NEW;
        assertEquals("0", enumType.getID());
        assertEquals("NEW", enumType.getName());
        assertEquals("0 - New", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum39OrdStatus.PARTIALLY_FILLED;
        assertEquals("1", enumType.getID());
        assertEquals("PARTIALLY_FILLED", enumType.getName());
        assertEquals("1 - Partially filled", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum39OrdStatus.FILLED;
        assertEquals("2", enumType.getID());
        assertEquals("FILLED", enumType.getName());
        assertEquals("2 - Filled", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum39OrdStatus.DONE_FOR_DAY;
        assertEquals("3", enumType.getID());
        assertEquals("DONE_FOR_DAY", enumType.getName());
        assertEquals("3 - Done for day", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum39OrdStatus.CANCELED;
        assertEquals("4", enumType.getID());
        assertEquals("CANCELED", enumType.getName());
        assertEquals("4 - Canceled", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum39OrdStatus.REPLACED;
        assertEquals("5", enumType.getID());
        assertEquals("REPLACED", enumType.getName());
        assertEquals("5 - Replaced (No longer used)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum39OrdStatus.PENDING_CANCEL;
        assertEquals("6", enumType.getID());
        assertEquals("PENDING_CANCEL", enumType.getName());
        assertEquals("6 - Pending Cancel (i.e. result of Order Cancel Request)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum39OrdStatus.STOPPED;
        assertEquals("7", enumType.getID());
        assertEquals("STOPPED", enumType.getName());
        assertEquals("7 - Stopped", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum39OrdStatus.REJECTED;
        assertEquals("8", enumType.getID());
        assertEquals("REJECTED", enumType.getName());
        assertEquals("8 - Rejected", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum39OrdStatus.SUSPENDED;
        assertEquals("9", enumType.getID());
        assertEquals("SUSPENDED", enumType.getName());
        assertEquals("9 - Suspended", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        /**
         * A-E msg types
         */
        enumType = Enum39OrdStatus.PENDING_NEW;
        assertEquals("A", enumType.getID());
        assertEquals("PENDING_NEW", enumType.getName());
        assertEquals("A - Pending New", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum39OrdStatus.CALCULATED;
        assertEquals("B", enumType.getID());
        assertEquals("CALCULATED", enumType.getName());
        assertEquals("B - Calculated", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum39OrdStatus.EXPIRED;
        assertEquals("C", enumType.getID());
        assertEquals("EXPIRED", enumType.getName());
        assertEquals("C - Expired", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum39OrdStatus.ACCEPTED_FOR_BIDDING;
        assertEquals("D", enumType.getID());
        assertEquals("ACCEPTED_FOR_BIDDING", enumType.getName());
        assertEquals("D - Accepted for Bidding", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum39OrdStatus.PENDING_REPLACE;
        assertEquals("E", enumType.getID());
        assertEquals("PENDING_REPLACE", enumType.getName());
        assertEquals("E - Pending Replace (i.e. result of Order Cancel/Replace Request)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}