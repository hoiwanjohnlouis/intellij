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

import com.hwtsllc.fixengine2022.datatypes.FIX50;
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
class Tag1123EnuTradeHandlingInstrTest {
    @Test
    void FIX1123Test() {
        FIX50 fixData = FIX50.FIX1123_ENU_TRADE_HANDLING_INSTR;
        assertEquals( "1123", fixData.toFIXIDString());
        assertEquals( "TRADE_HANDLING_INSTR", fixData.toFIXNameString());
        assertEquals( "TradeHandlingInstr", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1123Test() {
        Tag1123EnuTradeHandlingInstr tagData;

        tagData = new Tag1123EnuTradeHandlingInstr( MyEnumTradeHandlingInstr.TRADE_CONFIRMATION );
        assertEquals( MyEnumTradeHandlingInstr.TRADE_CONFIRMATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1123EnuTradeHandlingInstr( MyEnumTradeHandlingInstr.TWO_PARTY_REPORT );
        assertEquals( MyEnumTradeHandlingInstr.TWO_PARTY_REPORT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1123EnuTradeHandlingInstr( MyEnumTradeHandlingInstr.ONE_PARTY_MATCHING );
        assertEquals( MyEnumTradeHandlingInstr.ONE_PARTY_MATCHING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1123EnuTradeHandlingInstr( MyEnumTradeHandlingInstr.ONE_PARTY_PASS_THROUGH );
        assertEquals( MyEnumTradeHandlingInstr.ONE_PARTY_PASS_THROUGH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1123EnuTradeHandlingInstr( MyEnumTradeHandlingInstr.AUTOMATED_ROUTING );
        assertEquals( MyEnumTradeHandlingInstr.AUTOMATED_ROUTING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1123EnuTradeHandlingInstr tagData;

        // loop around the ENUM and process
        for ( MyEnumTradeHandlingInstr oneEnum : MyEnumTradeHandlingInstr.values()) {
            tagData = new Tag1123EnuTradeHandlingInstr(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag1123EnuTradeHandlingInstr tagData;

        // loop around the ENUM and process
        for (MyEnumTradeHandlingInstr oneEnum : MyEnumTradeHandlingInstr.values()) {
            tagData = new Tag1123EnuTradeHandlingInstr(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1123EnuTradeHandlingInstr tagData;

        // loop around the ENUM and process
        for (MyEnumTradeHandlingInstr oneEnum : MyEnumTradeHandlingInstr.values()) {
            tagData = new Tag1123EnuTradeHandlingInstr(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag1123EnuTradeHandlingInstr tagData;

        // loop around the ENUM and process
        for (MyEnumTradeHandlingInstr oneEnum : MyEnumTradeHandlingInstr.values()) {
            tagData = new Tag1123EnuTradeHandlingInstr(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1123EnuTradeHandlingInstr tagData;

        // loop around the ENUM and process
        for (MyEnumTradeHandlingInstr oneEnum : MyEnumTradeHandlingInstr.values()) {
            tagData = new Tag1123EnuTradeHandlingInstr(oneEnum);
            assertEquals( "Tag1123EnuTradeHandlingInstr\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}