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
        assertEquals( "0", enumType.toEnumIDString());
        assertEquals( "PROCESS_NORMALLY", enumType.toEnumNameString());
        assertEquals( "0 - Process normally", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum577ClearingInstruction.EXCLUDE_ALL_NETTING;
        assertEquals( "1", enumType.toEnumIDString());
        assertEquals( "EXCLUDE_ALL_NETTING", enumType.toEnumNameString());
        assertEquals( "1 - Exclude from all netting", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum577ClearingInstruction.BILATERAL_NETTING_ONLY;
        assertEquals( "2", enumType.toEnumIDString());
        assertEquals( "BILATERAL_NETTING_ONLY", enumType.toEnumNameString());
        assertEquals( "2 - Bilateral netting only", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum577ClearingInstruction.EX_CLEARING;
        assertEquals( "3", enumType.toEnumIDString());
        assertEquals( "EX_CLEARING", enumType.toEnumNameString());
        assertEquals( "3 - Ex clearing", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum577ClearingInstruction.SPECIAL_TRADE;
        assertEquals( "4", enumType.toEnumIDString());
        assertEquals( "SPECIAL_TRADE", enumType.toEnumNameString());
        assertEquals( "4 - Special trade", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum577ClearingInstruction.MULTILATERAL_NETTING;
        assertEquals( "5", enumType.toEnumIDString());
        assertEquals( "MULTILATERAL_NETTING", enumType.toEnumNameString());
        assertEquals( "5 - Multilateral netting", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum577ClearingInstruction.CLEAR_AGAINST_CENTRAL_COUNTERPARTY;
        assertEquals( "6", enumType.toEnumIDString());
        assertEquals( "CLEAR_AGAINST_CENTRAL_COUNTERPARTY", enumType.toEnumNameString());
        assertEquals( "6 - Clear against central counterparty", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum577ClearingInstruction.EXCLUDE_FROM_CENTRAL_COUNTERPARTY;
        assertEquals( "7", enumType.toEnumIDString());
        assertEquals( "EXCLUDE_FROM_CENTRAL_COUNTERPARTY", enumType.toEnumNameString());
        assertEquals( "7 - Exclude from central counterparty", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum577ClearingInstruction.MANUAL;
        assertEquals( "8", enumType.toEnumIDString());
        assertEquals( "MANUAL", enumType.toEnumNameString());
        assertEquals( "8 - Manual mode (pre-posting and/or pre-giveup)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum577ClearingInstruction.AUTOMATIC_POSTING;
        assertEquals( "9", enumType.toEnumIDString());
        assertEquals( "AUTOMATIC_POSTING", enumType.toEnumNameString());
        assertEquals( "9 - Automatic posting mode (trade posting to the position account number specified)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum577ClearingInstruction.AUTOMATIC_GIVE_UP;
        assertEquals( "10", enumType.toEnumIDString());
        assertEquals( "AUTOMATIC_GIVE_UP", enumType.toEnumNameString());
        assertEquals( "10 - Automatic give-up mode (trade give-up to the give-up destination number specified)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum577ClearingInstruction.QUALIFIED_SERVICE_REPRESENTATIVE;
        assertEquals( "11", enumType.toEnumIDString());
        assertEquals( "QUALIFIED_SERVICE_REPRESENTATIVE", enumType.toEnumNameString());
        assertEquals( "11 - Qualified Service Representative QSR", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum577ClearingInstruction.CUSTOMER_TRADE;
        assertEquals( "12", enumType.toEnumIDString());
        assertEquals( "CUSTOMER_TRADE", enumType.toEnumNameString());
        assertEquals( "12 - Customer trade", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum577ClearingInstruction.SELF_CLEARING;
        assertEquals( "13", enumType.toEnumIDString());
        assertEquals( "SELF_CLEARING", enumType.toEnumNameString());
        assertEquals( "13 - Self clearing", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}