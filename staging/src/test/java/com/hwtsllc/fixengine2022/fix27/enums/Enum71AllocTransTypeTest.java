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
 *  <p></p>
 *  Identifies allocation transaction type
 *  <p></p>
 *  <p> *** SOME VALUES HAVE BEEN REPLACED ***
 *  <p> *** See Replaced Features and Supported Approach ***
 *  <p></p>
 *  Valid values:
 *  <p>    0 - New
 *  <p>    1 - Replace
 *  <p>    2 - Cancel
 *  <p>    3 - Preliminary (without MiscFees and NetMoney) (Removed/Replaced)
 *  <p>    4 - Calculated (includes MiscFees and NetMoney) (Removed/Replaced)
 *  <p></p>
 *  <p>    5 - Calculated without Preliminary
 *          (sent unsolicited by broker, includes MiscFees and NetMoney)
 *          (Removed-Replaced)
 *  <p>    6 - Reversal
 */
class Enum71AllocTransTypeTest {
    @Test
    void Enum0071Test() {
        Enum71AllocTransType enumType;

        /*
         * 0-6 msg types
         */
        enumType = Enum71AllocTransType.NEW;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("NEW", enumType.toEnumNameString());
        assertEquals("0 - New", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum71AllocTransType.REPLACE;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("REPLACE", enumType.toEnumNameString());
        assertEquals("1 - Replace", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum71AllocTransType.CANCEL;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("CANCEL", enumType.toEnumNameString());
        assertEquals("2 - Cancel", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum71AllocTransType.PRELIMINARY_WITHOUT_MISC_FEES_AND_NETMONEY;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("PRELIMINARY_WITHOUT_MISC_FEES_AND_NETMONEY", enumType.toEnumNameString());
        assertEquals("3 - Preliminary (without MiscFees and NetMoney) (Removed/Replaced)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum71AllocTransType.CALCULATED_INCLUDES_MISC_FEES_AND_NETMONEY;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("CALCULATED_INCLUDES_MISC_FEES_AND_NETMONEY", enumType.toEnumNameString());
        assertEquals("4 - Calculated (includes MiscFees and NetMoney) (Removed/Replaced)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum71AllocTransType.CALCULATED_WITHOUT_PRELIMINARY;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("CALCULATED_WITHOUT_PRELIMINARY", enumType.toEnumNameString());
        assertEquals("5 - Calculated without Preliminary (sent unsolicited by broker, " +
                "includes MiscFees and NetMoney) (Removed/Replaced)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum71AllocTransType.REVERSAL;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("REVERSAL", enumType.toEnumNameString());
        assertEquals("6 - Reversal", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}