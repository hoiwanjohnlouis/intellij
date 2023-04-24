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

class Tag1123EnuTradeHandlingInstrTest {
    Tag1123EnuTradeHandlingInstr tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumTradeHandlingInstr oneEnum : MyEnumTradeHandlingInstr.values()) {
            tagData = new Tag1123EnuTradeHandlingInstr(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumTradeHandlingInstr oneEnum : MyEnumTradeHandlingInstr.values()) {
            tagData = new Tag1123EnuTradeHandlingInstr(oneEnum);
            assertEquals( "FIX1123_ENU_TRADE_HANDLING_INSTR", tagData.toFIXLabelString());
            assertEquals( "1123", tagData.toFIXIDString());
            assertEquals( "TRADE_HANDLING_INSTR", tagData.toFIXNameString());
            assertEquals( "TradeHandlingInstr", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumTradeHandlingInstr oneEnum : MyEnumTradeHandlingInstr.values()) {
            tagData = new Tag1123EnuTradeHandlingInstr(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  1123 (same as 1123, 1124,)
         *  TradeHandlingInstr
         *  char
         *  <p>    0 - Trade Confirmation
         *  <p>    1 - Two-Party Report
         *  <p>    2 - One-Party Report for Matching
         *  <p>    3 - One-Party Report for Pass Through
         *  <p>    4 - Automated Floor Order Routing
         */
        tagData = new Tag1123EnuTradeHandlingInstr( MyEnumTradeHandlingInstr.TRADE_CONFIRMATION );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1123EnuTradeHandlingInstr( MyEnumTradeHandlingInstr.TWO_PARTY_REPORT );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1123EnuTradeHandlingInstr( MyEnumTradeHandlingInstr.ONE_PARTY_MATCHING );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1123EnuTradeHandlingInstr( MyEnumTradeHandlingInstr.ONE_PARTY_PASS_THROUGH );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1123EnuTradeHandlingInstr( MyEnumTradeHandlingInstr.AUTOMATED_ROUTING );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( MyEnumTradeHandlingInstr oneEnum : MyEnumTradeHandlingInstr.values()) {
            tagData = new Tag1123EnuTradeHandlingInstr(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumTradeHandlingInstr oneEnum : MyEnumTradeHandlingInstr.values()) {
            tagData = new Tag1123EnuTradeHandlingInstr(oneEnum);
            assertEquals( "Tag1123EnuTradeHandlingInstr\n" +
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