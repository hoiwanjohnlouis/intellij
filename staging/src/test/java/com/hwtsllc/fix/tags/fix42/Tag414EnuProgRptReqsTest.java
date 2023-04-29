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

package com.hwtsllc.fix.tags.fix42;

import com.hwtsllc.fix.enums.fix42.Enum414ProgRptReqs;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag414EnuProgRptReqsTest {
    Tag414EnuProgRptReqs tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum414ProgRptReqs oneEnum : Enum414ProgRptReqs.values()) {
            tagData = new Tag414EnuProgRptReqs(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum414ProgRptReqs oneEnum : Enum414ProgRptReqs.values()) {
            tagData = new Tag414EnuProgRptReqs(oneEnum);
            assertEquals( "FIX414_ENU_PROG_RPT_REQS", tagData.toFIXLabelString());
            assertEquals( "414", tagData.toFIXIDString());
            assertEquals( "PROG_RPT_REQS", tagData.toFIXNameString());
            assertEquals( "ProgRptReqs", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum414ProgRptReqs oneEnum : Enum414ProgRptReqs.values()) {
            tagData = new Tag414EnuProgRptReqs(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  414
         *  ProgRptReqs
         *  int
         *  <p>     1-3 msg types
         *  <p>     "1 - Buy-side explicitly requests status using Statue Request (default), the sell-side firm can,
         *               however, send a DONE status List STatus Response  in an unsolicited fashion"
         *  <p>     "2 - Sell-side periodically sends status using List Status.
         *               Period optionally specified in ProgressPeriod"
         *  <p>     "3 - Real-time execution reports (to be discourage)"
         */
        tagData = new Tag414EnuProgRptReqs(Enum414ProgRptReqs.BUY_SIDE_STATUS);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag414EnuProgRptReqs(Enum414ProgRptReqs.SELL_SIDE_STATUS);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag414EnuProgRptReqs(Enum414ProgRptReqs.REAL_TIME_EXECUTION_REPORTS);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum414ProgRptReqs oneEnum : Enum414ProgRptReqs.values()) {
            tagData = new Tag414EnuProgRptReqs(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum414ProgRptReqs oneEnum : Enum414ProgRptReqs.values()) {
            tagData = new Tag414EnuProgRptReqs(oneEnum);
            assertEquals( "Tag414EnuProgRptReqs\n" +
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