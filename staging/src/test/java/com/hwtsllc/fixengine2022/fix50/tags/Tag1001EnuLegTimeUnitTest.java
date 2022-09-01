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

import com.hwtsllc.fixengine2022.datatypes.MyEnumTimeUnit;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag1001EnuLegTimeUnitTest {
    Tag1001EnuLegTimeUnit tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumTimeUnit oneEnum : MyEnumTimeUnit.values()) {
            tagData = new Tag1001EnuLegTimeUnit(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumTimeUnit oneEnum : MyEnumTimeUnit.values()) {
            tagData = new Tag1001EnuLegTimeUnit(oneEnum);
            assertEquals( "FIX1001_ENU_LEG_TIME_UNIT", tagData.toFIXLabelString());
            assertEquals( "1001", tagData.toEnumIDString());
            assertEquals( "LEG_TIME_UNIT", tagData.toEnumNameString());
            assertEquals( "LegTimeUnit", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumTimeUnit oneEnum : MyEnumTimeUnit.values()) {
            tagData = new Tag1001EnuLegTimeUnit(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  1001 (same as 997, 1000, 1001)
         *  LegTimeUnit
         *  String
         *  <p>    H - Hour
         *  <p>    Min - Minute
         *  <p>    S - Second
         */
        tagData = new Tag1001EnuLegTimeUnit( MyEnumTimeUnit.HH );
        assertEquals( "H", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag1001EnuLegTimeUnit( MyEnumTimeUnit.MM );
        assertEquals( "Min", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag1001EnuLegTimeUnit( MyEnumTimeUnit.SS );
        assertEquals( "S", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>    D - Day
         *  <p>    Wk - Week
         *  <p>    Mo - Month
         *  <p>    Yr - Year
         */
        tagData = new Tag1001EnuLegTimeUnit( MyEnumTimeUnit.DD );
        assertEquals( "D", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag1001EnuLegTimeUnit( MyEnumTimeUnit.WK );
        assertEquals( "Wk", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag1001EnuLegTimeUnit( MyEnumTimeUnit.MO );
        assertEquals( "Mo", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag1001EnuLegTimeUnit( MyEnumTimeUnit.YR );
        assertEquals( "Yr", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );


        // loop around the ENUM and process
        for ( MyEnumTimeUnit oneEnum : MyEnumTimeUnit.values()) {
            tagData = new Tag1001EnuLegTimeUnit(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumTimeUnit oneEnum : MyEnumTimeUnit.values()) {
            tagData = new Tag1001EnuLegTimeUnit(oneEnum);
            assertEquals( "Tag1001EnuLegTimeUnit\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
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