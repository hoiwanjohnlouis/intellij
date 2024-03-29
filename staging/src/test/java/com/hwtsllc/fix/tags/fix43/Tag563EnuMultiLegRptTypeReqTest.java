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

package com.hwtsllc.fix.tags.fix43;

import com.hwtsllc.fix.enums.fix43.Enum563MultiLegRptTypeReq;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag563EnuMultiLegRptTypeReqTest {
    Tag563EnuMultiLegRptTypeReq tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum563MultiLegRptTypeReq oneEnum : Enum563MultiLegRptTypeReq.values()) {
            tagData = new Tag563EnuMultiLegRptTypeReq(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum563MultiLegRptTypeReq oneEnum : Enum563MultiLegRptTypeReq.values()) {
            tagData = new Tag563EnuMultiLegRptTypeReq(oneEnum);
            assertEquals( "FIX563_ENU_MULTI_LEG_RPT_TYPE_REQ", tagData.toFIXLabelString());
            assertEquals( "563", tagData.toFIXIDString());
            assertEquals( "MULTI_LEG_RPT_TYPE_REQ", tagData.toFIXNameString());
            assertEquals( "MultiLegRptTypeReq", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum563MultiLegRptTypeReq oneEnum : Enum563MultiLegRptTypeReq.values()) {
            tagData = new Tag563EnuMultiLegRptTypeReq(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  563
         *  MultiLegRptTypeReq
         *  int
         *  <p>    0 - Report by mulitleg security only (do not report legs)
         *  <p>    1 - Report by multileg security and by instrument legs belonging to the multileg security
         *  <p>    2 - Report by instrument legs belonging to the multileg security only
         *              (do not report status of multileg security)
         */
        tagData = new Tag563EnuMultiLegRptTypeReq( Enum563MultiLegRptTypeReq.MULITLEG_SECURITY_ONLY );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag563EnuMultiLegRptTypeReq( Enum563MultiLegRptTypeReq.MULTILEG_SECURITY_LEGS );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag563EnuMultiLegRptTypeReq( Enum563MultiLegRptTypeReq.INSTRUMENT_LEGS );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum563MultiLegRptTypeReq oneEnum : Enum563MultiLegRptTypeReq.values()) {
            tagData = new Tag563EnuMultiLegRptTypeReq(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum563MultiLegRptTypeReq oneEnum : Enum563MultiLegRptTypeReq.values()) {
            tagData = new Tag563EnuMultiLegRptTypeReq(oneEnum);
            assertEquals( "Tag563EnuMultiLegRptTypeReq\n" +
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