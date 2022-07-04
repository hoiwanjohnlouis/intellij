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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.fix43.enums.Enum577ClearingInstruction;
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
class Tag577EnuClearingInstructionTest {
    @Test
    void FIX0577Test() {
        FIX43 fixData = FIX43.FIX577_ENU_CLEARING_INSTRUCTION;
        assertEquals( "577", fixData.toEnumIDString());
        assertEquals( "CLEARING_INSTRUCTION", fixData.toEnumNameString());
        assertEquals( "ClearingInstruction", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0577Test() {
        Tag577EnuClearingInstruction tagData;

        /*
         *  0-13 types
         */
        tagData = new Tag577EnuClearingInstruction( Enum577ClearingInstruction.PROCESS_NORMALLY );
        assertEquals( Enum577ClearingInstruction.PROCESS_NORMALLY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag577EnuClearingInstruction( Enum577ClearingInstruction.EXCLUDE_ALL_NETTING );
        assertEquals( Enum577ClearingInstruction.EXCLUDE_ALL_NETTING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag577EnuClearingInstruction( Enum577ClearingInstruction.BILATERAL_NETTING_ONLY );
        assertEquals( Enum577ClearingInstruction.BILATERAL_NETTING_ONLY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag577EnuClearingInstruction( Enum577ClearingInstruction.EX_CLEARING );
        assertEquals( Enum577ClearingInstruction.EX_CLEARING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag577EnuClearingInstruction( Enum577ClearingInstruction.SPECIAL_TRADE );
        assertEquals( Enum577ClearingInstruction.SPECIAL_TRADE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag577EnuClearingInstruction( Enum577ClearingInstruction.MULTILATERAL_NETTING );
        assertEquals( Enum577ClearingInstruction.MULTILATERAL_NETTING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag577EnuClearingInstruction( Enum577ClearingInstruction.CLEAR_AGAINST_CENTRAL_COUNTERPARTY );
        assertEquals( Enum577ClearingInstruction.CLEAR_AGAINST_CENTRAL_COUNTERPARTY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag577EnuClearingInstruction( Enum577ClearingInstruction.EXCLUDE_FROM_CENTRAL_COUNTERPARTY );
        assertEquals( Enum577ClearingInstruction.EXCLUDE_FROM_CENTRAL_COUNTERPARTY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag577EnuClearingInstruction( Enum577ClearingInstruction.MANUAL );
        assertEquals( Enum577ClearingInstruction.MANUAL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag577EnuClearingInstruction( Enum577ClearingInstruction.AUTOMATIC_POSTING );
        assertEquals( Enum577ClearingInstruction.AUTOMATIC_POSTING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag577EnuClearingInstruction( Enum577ClearingInstruction.AUTOMATIC_GIVE_UP );
        assertEquals( Enum577ClearingInstruction.AUTOMATIC_GIVE_UP.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag577EnuClearingInstruction( Enum577ClearingInstruction.QUALIFIED_SERVICE_REPRESENTATIVE );
        assertEquals( Enum577ClearingInstruction.QUALIFIED_SERVICE_REPRESENTATIVE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag577EnuClearingInstruction( Enum577ClearingInstruction.CUSTOMER_TRADE );
        assertEquals( Enum577ClearingInstruction.CUSTOMER_TRADE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag577EnuClearingInstruction( Enum577ClearingInstruction.SELF_CLEARING );
        assertEquals( Enum577ClearingInstruction.SELF_CLEARING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag577EnuClearingInstruction tagData;

        // loop around the ENUM and process
        for ( Enum577ClearingInstruction oneEnum : Enum577ClearingInstruction.values()) {
            tagData = new Tag577EnuClearingInstruction(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag577EnuClearingInstruction tagData;

        // loop around the ENUM and process
        for (Enum577ClearingInstruction oneEnum : Enum577ClearingInstruction.values()) {
            tagData = new Tag577EnuClearingInstruction(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag577EnuClearingInstruction tagData;

        // loop around the ENUM and process
        for (Enum577ClearingInstruction oneEnum : Enum577ClearingInstruction.values()) {
            tagData = new Tag577EnuClearingInstruction(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag577EnuClearingInstruction tagData;

        // loop around the ENUM and process
        for (Enum577ClearingInstruction oneEnum : Enum577ClearingInstruction.values()) {
            tagData = new Tag577EnuClearingInstruction(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag577EnuClearingInstruction tagData;

        // loop around the ENUM and process
        for (Enum577ClearingInstruction oneEnum : Enum577ClearingInstruction.values()) {
            tagData = new Tag577EnuClearingInstruction(oneEnum);
            assertEquals( "Tag577EnuClearingInstruction\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}