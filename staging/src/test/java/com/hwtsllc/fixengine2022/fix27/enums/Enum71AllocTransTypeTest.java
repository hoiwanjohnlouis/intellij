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
 *  71
 *  AllocTransType
 *  char
 *  Identifies allocation transaction type
 *  *** SOME VALUES HAVE BEEN REPLACED ***
 *  *** See Replaced Features and Supported Approach ***
 *  Valid values:
 *      0 - New
 *      1 - Replace
 *      2 - Cancel
 *      3 - Preliminary (without MiscFees and NetMoney) (Removed/Replaced)
 *      4 - Calculated (includes MiscFees and NetMoney) (Removed/Replaced)
 *      5 - Calculated without Preliminary
 *          (sent unsolicited by broker, includes MiscFees and NetMoney)
 *          (Removed-Replaced)
 *      6 - Reversal
 */
class Enum71AllocTransTypeTest {
    @Test
    void Enum0071Test() {
        Enum71AllocTransType enumType;

        /*
         * 0-6 msg types
         */
        enumType = Enum71AllocTransType.NEW;
        assertEquals("0", enumType.getID());
        assertEquals("NEW", enumType.getName());
        assertEquals("0 - New", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum71AllocTransType.REPLACE;
        assertEquals("1", enumType.getID());
        assertEquals("REPLACE", enumType.getName());
        assertEquals("1 - Replace", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum71AllocTransType.CANCEL;
        assertEquals("2", enumType.getID());
        assertEquals("CANCEL", enumType.getName());
        assertEquals("2 - Cancel", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum71AllocTransType.PRELIMINARY_WITHOUT_MISC_FEES_AND_NETMONEY;
        assertEquals("3", enumType.getID());
        assertEquals("PRELIMINARY_WITHOUT_MISC_FEES_AND_NETMONEY", enumType.getName());
        assertEquals("3 - Preliminary (without MiscFees and NetMoney) (Removed/Replaced)",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum71AllocTransType.CALCULATED_INCLUDES_MISC_FEES_AND_NETMONEY;
        assertEquals("4", enumType.getID());
        assertEquals("CALCULATED_INCLUDES_MISC_FEES_AND_NETMONEY", enumType.getName());
        assertEquals("4 - Calculated (includes MiscFees and NetMoney) (Removed/Replaced)",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum71AllocTransType.CALCULATED_WITHOUT_PRELIMINARY;
        assertEquals("5", enumType.getID());
        assertEquals("CALCULATED_WITHOUT_PRELIMINARY", enumType.getName());
        assertEquals("5 - Calculated without Preliminary (sent unsolicited by broker, " +
                "includes MiscFees and NetMoney) (Removed/Replaced)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum71AllocTransType.REVERSAL;
        assertEquals("6", enumType.getID());
        assertEquals("REVERSAL", enumType.getName());
        assertEquals("6 - Reversal", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}