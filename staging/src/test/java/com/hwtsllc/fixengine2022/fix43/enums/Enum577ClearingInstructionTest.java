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
 *  577
 *  ClearingInstruction
 *  int
 *  <p></p>
 *  Eligibility of this trade for clearing and central counterparty processing
 *  values above 4000 are reserved for agreement between parties
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Process normally
 *  <p>    1 - Exclude from all netting
 *  <p>    2 - Bilateral netting only
 *  <p>    3 - Ex clearing
 *  <p>    4 - Special trade
 *  <p></p>
 *  <p>    5 - Multilateral netting
 *  <p>    6 - Clear against central counterparty
 *  <p>    7 - Exclude from central counterparty
 *  <p>    8 - Manual mode (pre-posting and/or pre-giveup)
 *  <p>    9 - Automatic posting mode (trade posting to the position account number specified)
 *  <p></p>
 *  <p>    10 - Automatic give-up mode (trade give-up to the give-up destination number specified)
 *  <p>    11 - Qualified Service Representative QSR
 *  <p>    12 - Customer trade
 *  <p>    13 - Self clearing
 */
class Enum577ClearingInstructionTest {
    /*
     *  Information is the same for TAGS 577
     */
    @Test
    void Enum0577Test() {
        Enum577ClearingInstruction enumType;

        /*
         *  0-13 types
         */
        enumType = Enum577ClearingInstruction.PROCESS_NORMALLY;
        assertEquals( "0", enumType.toFIXIDString());
        assertEquals( "PROCESS_NORMALLY", enumType.toFIXNameString());
        assertEquals( "0 - Process normally", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum577ClearingInstruction.EXCLUDE_ALL_NETTING;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "EXCLUDE_ALL_NETTING", enumType.toFIXNameString());
        assertEquals( "1 - Exclude from all netting", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum577ClearingInstruction.BILATERAL_NETTING_ONLY;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "BILATERAL_NETTING_ONLY", enumType.toFIXNameString());
        assertEquals( "2 - Bilateral netting only", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum577ClearingInstruction.EX_CLEARING;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "EX_CLEARING", enumType.toFIXNameString());
        assertEquals( "3 - Ex clearing", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum577ClearingInstruction.SPECIAL_TRADE;
        assertEquals( "4", enumType.toFIXIDString());
        assertEquals( "SPECIAL_TRADE", enumType.toFIXNameString());
        assertEquals( "4 - Special trade", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum577ClearingInstruction.MULTILATERAL_NETTING;
        assertEquals( "5", enumType.toFIXIDString());
        assertEquals( "MULTILATERAL_NETTING", enumType.toFIXNameString());
        assertEquals( "5 - Multilateral netting", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum577ClearingInstruction.CLEAR_AGAINST_CENTRAL_COUNTERPARTY;
        assertEquals( "6", enumType.toFIXIDString());
        assertEquals( "CLEAR_AGAINST_CENTRAL_COUNTERPARTY", enumType.toFIXNameString());
        assertEquals( "6 - Clear against central counterparty", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum577ClearingInstruction.EXCLUDE_FROM_CENTRAL_COUNTERPARTY;
        assertEquals( "7", enumType.toFIXIDString());
        assertEquals( "EXCLUDE_FROM_CENTRAL_COUNTERPARTY", enumType.toFIXNameString());
        assertEquals( "7 - Exclude from central counterparty", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum577ClearingInstruction.MANUAL;
        assertEquals( "8", enumType.toFIXIDString());
        assertEquals( "MANUAL", enumType.toFIXNameString());
        assertEquals( "8 - Manual mode (pre-posting and/or pre-giveup)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum577ClearingInstruction.AUTOMATIC_POSTING;
        assertEquals( "9", enumType.toFIXIDString());
        assertEquals( "AUTOMATIC_POSTING", enumType.toFIXNameString());
        assertEquals( "9 - Automatic posting mode (trade posting to the position account number specified)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum577ClearingInstruction.AUTOMATIC_GIVE_UP;
        assertEquals( "10", enumType.toFIXIDString());
        assertEquals( "AUTOMATIC_GIVE_UP", enumType.toFIXNameString());
        assertEquals( "10 - Automatic give-up mode (trade give-up to the give-up destination number specified)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum577ClearingInstruction.QUALIFIED_SERVICE_REPRESENTATIVE;
        assertEquals( "11", enumType.toFIXIDString());
        assertEquals( "QUALIFIED_SERVICE_REPRESENTATIVE", enumType.toFIXNameString());
        assertEquals( "11 - Qualified Service Representative QSR", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum577ClearingInstruction.CUSTOMER_TRADE;
        assertEquals( "12", enumType.toFIXIDString());
        assertEquals( "CUSTOMER_TRADE", enumType.toFIXNameString());
        assertEquals( "12 - Customer trade", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum577ClearingInstruction.SELF_CLEARING;
        assertEquals( "13", enumType.toFIXIDString());
        assertEquals( "SELF_CLEARING", enumType.toFIXNameString());
        assertEquals( "13 - Self clearing", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}