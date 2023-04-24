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

import com.hwtsllc.fixengine2022.fix43.enums.Enum577ClearingInstruction;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag577EnuClearingInstructionTest {
    Tag577EnuClearingInstruction tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum577ClearingInstruction oneEnum : Enum577ClearingInstruction.values()) {
            tagData = new Tag577EnuClearingInstruction(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum577ClearingInstruction oneEnum : Enum577ClearingInstruction.values()) {
            tagData = new Tag577EnuClearingInstruction(oneEnum);
            assertEquals( "FIX577_ENU_CLEARING_INSTRUCTION", tagData.toFIXLabelString());
            assertEquals( "577", tagData.toFIXIDString());
            assertEquals( "CLEARING_INSTRUCTION", tagData.toFIXNameString());
            assertEquals( "ClearingInstruction", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum577ClearingInstruction oneEnum : Enum577ClearingInstruction.values()) {
            tagData = new Tag577EnuClearingInstruction(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  577
         *  ClearingInstruction
         *  int
         *  <p>    0 - Process normally
         *  <p>    1 - Exclude from all netting
         *  <p>    2 - Bilateral netting only
         *  <p>    3 - Ex clearing
         *  <p>    4 - Special trade
         */
        tagData = new Tag577EnuClearingInstruction( Enum577ClearingInstruction.PROCESS_NORMALLY );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag577EnuClearingInstruction( Enum577ClearingInstruction.EXCLUDE_ALL_NETTING );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag577EnuClearingInstruction( Enum577ClearingInstruction.BILATERAL_NETTING_ONLY );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag577EnuClearingInstruction( Enum577ClearingInstruction.EX_CLEARING );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag577EnuClearingInstruction( Enum577ClearingInstruction.SPECIAL_TRADE );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    5 - Multilateral netting
         *  <p>    6 - Clear against central counterparty
         *  <p>    7 - Exclude from central counterparty
         *  <p>    8 - Manual mode (pre-posting and/or pre-giveup)
         *  <p>    9 - Automatic posting mode (trade posting to the position account number specified)
         */
        tagData = new Tag577EnuClearingInstruction( Enum577ClearingInstruction.MULTILATERAL_NETTING );
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag577EnuClearingInstruction( Enum577ClearingInstruction.CLEAR_AGAINST_CENTRAL_COUNTERPARTY );
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag577EnuClearingInstruction( Enum577ClearingInstruction.EXCLUDE_FROM_CENTRAL_COUNTERPARTY );
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag577EnuClearingInstruction( Enum577ClearingInstruction.MANUAL );
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag577EnuClearingInstruction( Enum577ClearingInstruction.AUTOMATIC_POSTING );
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    10 - Automatic give-up mode (trade give-up to the give-up destination number specified)
         *  <p>    11 - Qualified Service Representative QSR
         *  <p>    12 - Customer trade
         *  <p>    13 - Self clearing
         */
        tagData = new Tag577EnuClearingInstruction( Enum577ClearingInstruction.AUTOMATIC_GIVE_UP );
        assertEquals( "10", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag577EnuClearingInstruction( Enum577ClearingInstruction.QUALIFIED_SERVICE_REPRESENTATIVE );
        assertEquals( "11", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag577EnuClearingInstruction( Enum577ClearingInstruction.CUSTOMER_TRADE );
        assertEquals( "12", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag577EnuClearingInstruction( Enum577ClearingInstruction.SELF_CLEARING );
        assertEquals( "13", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum577ClearingInstruction oneEnum : Enum577ClearingInstruction.values()) {
            tagData = new Tag577EnuClearingInstruction(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum577ClearingInstruction oneEnum : Enum577ClearingInstruction.values()) {
            tagData = new Tag577EnuClearingInstruction(oneEnum);
            assertEquals( "Tag577EnuClearingInstruction\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}