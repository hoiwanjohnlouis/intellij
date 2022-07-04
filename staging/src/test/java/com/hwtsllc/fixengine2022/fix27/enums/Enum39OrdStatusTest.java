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
 *  39
 *  OrdStatus
 *  char
 *  <p></p>
 *  Identifies current status of order.
 *  <p></p>
 *  *** SOME VALUES HAVE BEEN REPLACED ***
 *  <p>
 *  *** See Replaced Features and Supported Approach ***
 *  <p>
 *      (see Volume : "Glossary" for value definitions)
 *  <p></p>
 *  Valid values:
 *  <p>    0 - New
 *  <p>    1 - Partially filled
 *  <p>    2 - Filled
 *  <p>    3 - Done for day
 *  <p>    4 - Canceled
 *  <p></p>
 *  <p>    5 - Replaced (No longer used)
 *  <p>    6 - Pending Cancel (i.e. result of Order Cancel Request)
 *  <p>    7 - Stopped
 *  <p>    8 - Rejected
 *  <p>    9 - Suspended
 *  <p></p>
 *  <p>    A - Pending New
 *  <p>    B - Calculated
 *  <p>    C - Expired
 *  <p>    D - Accepted for Bidding
 *  <p>    E - Pending Replace (i.e. result of Order Cancel/Replace Request)
 */
class Enum39OrdStatusTest {
    @Test
    void Enum0039Test() {
        Enum39OrdStatus enumType;

        /*
         * 0-9 msg types
         */
        enumType = Enum39OrdStatus.NEW;
        assertEquals("0", enumType.toEnumIDString());
        assertEquals("NEW", enumType.toEnumNameString());
        assertEquals("0 - New", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum39OrdStatus.PARTIALLY_FILLED;
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("PARTIALLY_FILLED", enumType.toEnumNameString());
        assertEquals("1 - Partially filled", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum39OrdStatus.FILLED;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("FILLED", enumType.toEnumNameString());
        assertEquals("2 - Filled", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum39OrdStatus.DONE_FOR_DAY;
        assertEquals("3", enumType.toEnumIDString());
        assertEquals("DONE_FOR_DAY", enumType.toEnumNameString());
        assertEquals("3 - Done for day", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum39OrdStatus.CANCELED;
        assertEquals("4", enumType.toEnumIDString());
        assertEquals("CANCELED", enumType.toEnumNameString());
        assertEquals("4 - Canceled", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum39OrdStatus.REPLACED;
        assertEquals("5", enumType.toEnumIDString());
        assertEquals("REPLACED", enumType.toEnumNameString());
        assertEquals("5 - Replaced (No longer used)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum39OrdStatus.PENDING_CANCEL;
        assertEquals("6", enumType.toEnumIDString());
        assertEquals("PENDING_CANCEL", enumType.toEnumNameString());
        assertEquals("6 - Pending Cancel (i.e. result of Order Cancel Request)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum39OrdStatus.STOPPED;
        assertEquals("7", enumType.toEnumIDString());
        assertEquals("STOPPED", enumType.toEnumNameString());
        assertEquals("7 - Stopped", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum39OrdStatus.REJECTED;
        assertEquals("8", enumType.toEnumIDString());
        assertEquals("REJECTED", enumType.toEnumNameString());
        assertEquals("8 - Rejected", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum39OrdStatus.SUSPENDED;
        assertEquals("9", enumType.toEnumIDString());
        assertEquals("SUSPENDED", enumType.toEnumNameString());
        assertEquals("9 - Suspended", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         * A-E msg types
         */
        enumType = Enum39OrdStatus.PENDING_NEW;
        assertEquals("A", enumType.toEnumIDString());
        assertEquals("PENDING_NEW", enumType.toEnumNameString());
        assertEquals("A - Pending New", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum39OrdStatus.CALCULATED;
        assertEquals("B", enumType.toEnumIDString());
        assertEquals("CALCULATED", enumType.toEnumNameString());
        assertEquals("B - Calculated", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum39OrdStatus.EXPIRED;
        assertEquals("C", enumType.toEnumIDString());
        assertEquals("EXPIRED", enumType.toEnumNameString());
        assertEquals("C - Expired", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum39OrdStatus.ACCEPTED_FOR_BIDDING;
        assertEquals("D", enumType.toEnumIDString());
        assertEquals("ACCEPTED_FOR_BIDDING", enumType.toEnumNameString());
        assertEquals("D - Accepted for Bidding", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum39OrdStatus.PENDING_REPLACE;
        assertEquals("E", enumType.toEnumIDString());
        assertEquals("PENDING_REPLACE", enumType.toEnumNameString());
        assertEquals("E - Pending Replace (i.e. result of Order Cancel/Replace Request)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}