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
import com.hwtsllc.fixengine2022.datatypes.MyEnumAcctIDSource;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  660 (same as 660, 661)
 *  AcctIDSource
 *  int
 *  <p>
 *  Used to identify the source of the Account (1) code.
 *  This is especially useful if the account is a new account
 *  that the Respondent may not have set up yet in their system.
 *  <p></p>
 *  661 (same as 660, 601)
 *  AllocAcctIDSource
 *  int
 *  <p>
 *  Used to identify the source of the AllocAccount (79) code.
 *      See AcctIDSource (660) for valid values.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - BIC
 *  <p>    2 - SID Code
 *  <p>    3 - TFM (GSPTA)
 *  <p>    4 - OMGEO (Alert ID)
 *  <p>    5 - DTCC Code
 *  <p>    99 - Other (custom or proprietary)
 */
class Tag661EnuAllocAcctIDSourceTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX661_ENU_ALLOC_ACCT_ID_SOURCE;
        assertEquals( "661", fixData.toEnumIDString());
        assertEquals( "ALLOC_ACCT_ID_SOURCE", fixData.toEnumNameString());
        assertEquals( "AllocAcctIDSource", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0661Test() {
        Tag661EnuAllocAcctIDSource tagData;
        MyEnumAcctIDSource oneElement;

        oneElement = MyEnumAcctIDSource.BIC;
        tagData = new Tag661EnuAllocAcctIDSource( oneElement );
        assertEquals( oneElement.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "661", tagData.toEnumIDString());
        assertEquals( "ALLOC_ACCT_ID_SOURCE", tagData.toEnumNameString());
        assertEquals( "AllocAcctIDSource", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag661EnuAllocAcctIDSource(MyEnumAcctIDSource.SID);
        assertEquals( MyEnumAcctIDSource.SID.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag661EnuAllocAcctIDSource(MyEnumAcctIDSource.TFM);
        assertEquals( MyEnumAcctIDSource.TFM.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag661EnuAllocAcctIDSource(MyEnumAcctIDSource.OMGEO);
        assertEquals( MyEnumAcctIDSource.OMGEO.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag661EnuAllocAcctIDSource(MyEnumAcctIDSource.DTCC);
        assertEquals( MyEnumAcctIDSource.DTCC.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag661EnuAllocAcctIDSource(MyEnumAcctIDSource.OTHER);
        assertEquals( MyEnumAcctIDSource.OTHER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag661EnuAllocAcctIDSource tagData;

        // loop around the ENUM and process
        for ( MyEnumAcctIDSource oneEnum : MyEnumAcctIDSource.values()) {
            tagData = new Tag661EnuAllocAcctIDSource(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag661EnuAllocAcctIDSource tagData;

        // loop around the ENUM and process
        for (MyEnumAcctIDSource oneEnum : MyEnumAcctIDSource.values()) {
            tagData = new Tag661EnuAllocAcctIDSource(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag661EnuAllocAcctIDSource tagData;

        // loop around the ENUM and process
        for (MyEnumAcctIDSource oneEnum : MyEnumAcctIDSource.values()) {
            tagData = new Tag661EnuAllocAcctIDSource(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag661EnuAllocAcctIDSource tagData;

        // loop around the ENUM and process
        for (MyEnumAcctIDSource oneEnum : MyEnumAcctIDSource.values()) {
            tagData = new Tag661EnuAllocAcctIDSource(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag661EnuAllocAcctIDSource tagData;

        // loop around the ENUM and process
        for (MyEnumAcctIDSource oneEnum : MyEnumAcctIDSource.values()) {
            tagData = new Tag661EnuAllocAcctIDSource(oneEnum);
            assertEquals( "Tag661EnuAllocAcctIDSource\n" +
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