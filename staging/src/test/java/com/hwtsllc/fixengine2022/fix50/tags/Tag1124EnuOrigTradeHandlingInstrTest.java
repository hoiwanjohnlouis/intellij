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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.MyEnumTradeHandlingInstr;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1123 (same as 1123, 1124,)
 *  TradeHandlingInstr
 *  char
 *  <p>
 *  Specified how the Trade Capture Report should be handled by the Respondent.
 *  <p></p>
 *  1124
 *  OrigTradeHandlingInstr
 *  char
 *  <p>
 *  Optionally used with TradeHandlingInstr = 0 to relay the trade handling instruction
 *  used when reporting the trade to the marketplace.
 *  <p>
 *  Same values as TradeHandlingInstr (1123)
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Trade Confirmation
 *  <p>    1 - Two-Party Report
 *  <p>    2 - One-Party Report for Matching
 *  <p>    3 - One-Party Report for Pass Through
 *  <p>    4 - Automated Floor Order Routing
 */
class Tag1124EnuOrigTradeHandlingInstrTest {
    Tag1124EnuOrigTradeHandlingInstr tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumTradeHandlingInstr oneEnum : MyEnumTradeHandlingInstr.values()) {
            tagData = new Tag1124EnuOrigTradeHandlingInstr(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumTradeHandlingInstr oneEnum : MyEnumTradeHandlingInstr.values()) {
            tagData = new Tag1124EnuOrigTradeHandlingInstr(oneEnum);
            assertEquals( "FIX1124_ENU_ORIG_TRADE_HANDLING_INSTR", tagData.toEnumLabelString());
            assertEquals( "1124", tagData.toEnumIDString());
            assertEquals( "ORIG_TRADE_HANDLING_INSTR", tagData.toEnumNameString());
            assertEquals( "OrigTradeHandlingInstr", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  <p>    0 - Trade Confirmation
         *  <p>    1 - Two-Party Report
         *  <p>    2 - One-Party Report for Matching
         *  <p>    3 - One-Party Report for Pass Through
         *  <p>    4 - Automated Floor Order Routing
         */
        tagData = new Tag1124EnuOrigTradeHandlingInstr( MyEnumTradeHandlingInstr.TRADE_CONFIRMATION );
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1124EnuOrigTradeHandlingInstr( MyEnumTradeHandlingInstr.TWO_PARTY_REPORT );
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1124EnuOrigTradeHandlingInstr( MyEnumTradeHandlingInstr.ONE_PARTY_MATCHING );
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1124EnuOrigTradeHandlingInstr( MyEnumTradeHandlingInstr.ONE_PARTY_PASS_THROUGH );
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1124EnuOrigTradeHandlingInstr( MyEnumTradeHandlingInstr.AUTOMATED_ROUTING );
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        // loop around the ENUM and process
        for ( MyEnumTradeHandlingInstr oneEnum : MyEnumTradeHandlingInstr.values()) {
            tagData = new Tag1124EnuOrigTradeHandlingInstr(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumTradeHandlingInstr oneEnum : MyEnumTradeHandlingInstr.values()) {
            tagData = new Tag1124EnuOrigTradeHandlingInstr(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( MyEnumTradeHandlingInstr oneEnum : MyEnumTradeHandlingInstr.values()) {
            tagData = new Tag1124EnuOrigTradeHandlingInstr(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumTradeHandlingInstr oneEnum : MyEnumTradeHandlingInstr.values()) {
            tagData = new Tag1124EnuOrigTradeHandlingInstr(oneEnum);
            assertEquals( "Tag1124EnuOrigTradeHandlingInstr\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}