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

import com.hwtsllc.fixengine2022.datatypes.MyEnumAcctIDSource;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag661EnuAllocAcctIDSourceTest {
    Tag661EnuAllocAcctIDSource tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumAcctIDSource oneEnum : MyEnumAcctIDSource.values()) {
            tagData = new Tag661EnuAllocAcctIDSource(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumAcctIDSource oneEnum : MyEnumAcctIDSource.values()) {
            tagData = new Tag661EnuAllocAcctIDSource(oneEnum);
            assertEquals( "FIX661_ENU_ALLOC_ACCT_ID_SOURCE", tagData.toFIXLabelString());
            assertEquals( "661", tagData.toFIXIDString());
            assertEquals( "ALLOC_ACCT_ID_SOURCE", tagData.toFIXNameString());
            assertEquals( "AllocAcctIDSource", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumAcctIDSource oneEnum : MyEnumAcctIDSource.values()) {
            tagData = new Tag661EnuAllocAcctIDSource(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  660 (same as 660, 661)
         *  AcctIDSource
         *  int
         *  661 (same as 660, 601)
         *  AllocAcctIDSource
         *  int
         *  <p>    1 - BIC
         *  <p>    2 - SID Code
         *  <p>    3 - TFM (GSPTA)
         *  <p>    4 - OMGEO (Alert ID)
         *  <p>    5 - DTCC Code
         */
        tagData = new Tag661EnuAllocAcctIDSource( MyEnumAcctIDSource.BIC );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag661EnuAllocAcctIDSource(MyEnumAcctIDSource.SID);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag661EnuAllocAcctIDSource(MyEnumAcctIDSource.TFM);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag661EnuAllocAcctIDSource(MyEnumAcctIDSource.OMGEO);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag661EnuAllocAcctIDSource(MyEnumAcctIDSource.DTCC);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    99 - Other (custom or proprietary)
         */
        tagData = new Tag661EnuAllocAcctIDSource(MyEnumAcctIDSource.OTHER);
        assertEquals( "99", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( MyEnumAcctIDSource oneEnum : MyEnumAcctIDSource.values()) {
            tagData = new Tag661EnuAllocAcctIDSource(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumAcctIDSource oneEnum : MyEnumAcctIDSource.values()) {
            tagData = new Tag661EnuAllocAcctIDSource(oneEnum);
            assertEquals( "Tag661EnuAllocAcctIDSource\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
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