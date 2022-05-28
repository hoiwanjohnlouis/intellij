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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.fix42.enums.Enum414ProgRptReqs;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  414
 *  ProgRptReqs
 *  int
 *  <p>
 *  Code to identify the desired frequency of progress reports.
 *  <p></p>
 *  Valid values:
 *  <p>     1-3 msg types
 *  <p>     "1 - Buy-side explicitly requests status using Statue Request (default), the sell-side firm can,
 *               however, send a DONE status List STatus Response  in an unsolicited fashion"
 *  <p>     "2 - Sell-side periodically sends status using List Status.
 *               Period optionally specified in ProgressPeriod"
 *  <p>     "3 - Real-time execution reports (to be discourage)"
 */
class Tag414EnuProgRptReqsTest {
    @Test
    void FIX0414Test() {
        FIX42 fixData = FIX42.FIX414_ENU_PROG_RPT_REQS;
        assertEquals( "414", fixData.toFIXIDString());
        assertEquals( "PROG_RPT_REQS", fixData.toFIXNameString());
        assertEquals( "ProgRptReqs", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0414Test() {
        Tag414EnuProgRptReqs tagData;

        /*
         * 1-3 msg types
         */
        tagData = new Tag414EnuProgRptReqs(Enum414ProgRptReqs.BUY_SIDE_STATUS);
        assertEquals( Enum414ProgRptReqs.BUY_SIDE_STATUS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag414EnuProgRptReqs(Enum414ProgRptReqs.SELL_SIDE_STATUS);
        assertEquals( Enum414ProgRptReqs.SELL_SIDE_STATUS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag414EnuProgRptReqs(Enum414ProgRptReqs.REAL_TIME_EXECUTION_REPORTS);
        assertEquals( Enum414ProgRptReqs.REAL_TIME_EXECUTION_REPORTS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag414EnuProgRptReqs tagData;

        // loop around the ENUM and process
        for (Enum414ProgRptReqs oneEnum : Enum414ProgRptReqs.values()) {
            tagData = new Tag414EnuProgRptReqs(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag414EnuProgRptReqs tagData;

        // loop around the ENUM and process
        for (Enum414ProgRptReqs oneEnum : Enum414ProgRptReqs.values()) {
            tagData = new Tag414EnuProgRptReqs(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag414EnuProgRptReqs tagData;

        // loop around the ENUM and process
        for (Enum414ProgRptReqs oneEnum : Enum414ProgRptReqs.values()) {
            tagData = new Tag414EnuProgRptReqs(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag414EnuProgRptReqs tagData;

        // loop around the ENUM and process
        for (Enum414ProgRptReqs oneEnum : Enum414ProgRptReqs.values()) {
            tagData = new Tag414EnuProgRptReqs(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag414EnuProgRptReqs tagData;

        // loop around the ENUM and process
        for (Enum414ProgRptReqs oneEnum : Enum414ProgRptReqs.values()) {
            tagData = new Tag414EnuProgRptReqs(oneEnum);
            assertEquals( "Tag414EnuProgRptReqs\n" +
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