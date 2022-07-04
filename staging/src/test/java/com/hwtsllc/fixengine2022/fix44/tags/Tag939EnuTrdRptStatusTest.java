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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.fix44.enums.Enum939TrdRptStatus;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  939
 *  TrdRptStatus
 *  int
 *  <p></p>
 *  Trade Report Status
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Accepted
 *  <p>    1 - Rejected
 *  <p>    3 - Accepted with errors
 */
class Tag939EnuTrdRptStatusTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX939_ENU_TRD_RPT_STATUS;
        assertEquals( "939", fixData.toEnumIDString());
        assertEquals( "TRD_RPT_STATUS", fixData.toEnumNameString());
        assertEquals( "TrdRptStatus", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0939Test() {
        Tag939EnuTrdRptStatus tagData;
        Enum939TrdRptStatus oneElement;

        oneElement = Enum939TrdRptStatus.ACCEPTED;
        tagData = new Tag939EnuTrdRptStatus( oneElement );
        assertEquals( oneElement.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "939", tagData.toEnumIDString());
        assertEquals( "TRD_RPT_STATUS", tagData.toEnumNameString());
        assertEquals( "TrdRptStatus", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag939EnuTrdRptStatus( Enum939TrdRptStatus.REJECTED );
        assertEquals( Enum939TrdRptStatus.REJECTED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag939EnuTrdRptStatus( Enum939TrdRptStatus.ACCEPTED_WITH_ERRORS );
        assertEquals( Enum939TrdRptStatus.ACCEPTED_WITH_ERRORS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag939EnuTrdRptStatus tagData;

        // loop around the ENUM and process
        for ( Enum939TrdRptStatus oneEnum : Enum939TrdRptStatus.values()) {
            tagData = new Tag939EnuTrdRptStatus(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag939EnuTrdRptStatus tagData;

        // loop around the ENUM and process
        for (Enum939TrdRptStatus oneEnum : Enum939TrdRptStatus.values()) {
            tagData = new Tag939EnuTrdRptStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag939EnuTrdRptStatus tagData;

        // loop around the ENUM and process
        for (Enum939TrdRptStatus oneEnum : Enum939TrdRptStatus.values()) {
            tagData = new Tag939EnuTrdRptStatus(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag939EnuTrdRptStatus tagData;

        // loop around the ENUM and process
        for (Enum939TrdRptStatus oneEnum : Enum939TrdRptStatus.values()) {
            tagData = new Tag939EnuTrdRptStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag939EnuTrdRptStatus tagData;

        // loop around the ENUM and process
        for (Enum939TrdRptStatus oneEnum : Enum939TrdRptStatus.values()) {
            tagData = new Tag939EnuTrdRptStatus(oneEnum);
            assertEquals( "Tag939EnuTrdRptStatus\n" +
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