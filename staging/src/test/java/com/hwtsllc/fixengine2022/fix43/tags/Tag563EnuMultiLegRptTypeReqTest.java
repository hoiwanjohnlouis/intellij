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

import com.hwtsllc.fixengine2022.fix43.enums.Enum563MultiLegRptTypeReq;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  563
 *  MultiLegRptTypeReq
 *  int
 *  <p></p>
 *  Indicates the method of execution reporting requested by issuer of the order.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Report by mulitleg security only (do not report legs)
 *  <p>    1 - Report by multileg security and by instrument legs belonging to the multileg security
 *  <p>    2 - Report by instrument legs belonging to the multileg security only
 *              (do not report status of multileg security)
 */
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
            assertEquals( "FIX563_ENU_MULTI_LEG_RPT_TYPE_REQ", tagData.toEnumLabelString());
            assertEquals( "563", tagData.toEnumIDString());
            assertEquals( "MULTI_LEG_RPT_TYPE_REQ", tagData.toEnumNameString());
            assertEquals( "MultiLegRptTypeReq", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  0-2 types
         */
        tagData = new Tag563EnuMultiLegRptTypeReq( Enum563MultiLegRptTypeReq.MULITLEG_SECURITY_ONLY );
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag563EnuMultiLegRptTypeReq( Enum563MultiLegRptTypeReq.MULTILEG_SECURITY_LEGS );
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag563EnuMultiLegRptTypeReq( Enum563MultiLegRptTypeReq.INSTRUMENT_LEGS );
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for (Enum563MultiLegRptTypeReq oneEnum : Enum563MultiLegRptTypeReq.values()) {
            tagData = new Tag563EnuMultiLegRptTypeReq(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum563MultiLegRptTypeReq oneEnum : Enum563MultiLegRptTypeReq.values()) {
            tagData = new Tag563EnuMultiLegRptTypeReq(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
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