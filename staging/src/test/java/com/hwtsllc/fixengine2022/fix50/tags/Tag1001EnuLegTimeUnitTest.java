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

/**
 *  997 (same as 997, 1000, 1001)
 *  TimeUnit
 *  String
 *  <p>
 *  Unit of time associated with the contract.
 *  <p>
 *  NOTE: Additional values may be used by mutual agreement of the counterparties
 *  <p></p>
 *  1000
 *  UnderlyingTimeUnit
 *  String
 *  <p>
 *  Same as TimeUnit (997).
 *  <p></p>
 *  1001
 *  LegTimeUnit
 *  String
 *  <p>
 *  Same as TimeUnit (997).
 *  <p></p>
 *  Valid values:
 *  <p>    H - Hour
 *  <p>    Min - Minute
 *  <p>    S - Second
 *  <p></p>
 *  <p>    D - Day
 *  <p>    Wk - Week
 *  <p>    Mo - Month
 *  <p>    Yr - Year
 */
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
            assertEquals( "FIX1001_ENU_LEG_TIME_UNIT", tagData.toEnumLabelString());
            assertEquals( "1001", tagData.toEnumIDString());
            assertEquals( "LEG_TIME_UNIT", tagData.toEnumNameString());
            assertEquals( "LegTimeUnit", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  <p>    H - Hour
         *  <p>    Min - Minute
         *  <p>    S - Second
         */
        tagData = new Tag1001EnuLegTimeUnit( MyEnumTimeUnit.HH );
        assertEquals( "H", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1001EnuLegTimeUnit( MyEnumTimeUnit.MM );
        assertEquals( "Min", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1001EnuLegTimeUnit( MyEnumTimeUnit.SS );
        assertEquals( "S", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        /*
         *  <p>    D - Day
         *  <p>    Wk - Week
         *  <p>    Mo - Month
         *  <p>    Yr - Year
         */
        tagData = new Tag1001EnuLegTimeUnit( MyEnumTimeUnit.DD );
        assertEquals( "D", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1001EnuLegTimeUnit( MyEnumTimeUnit.WK );
        assertEquals( "Wk", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1001EnuLegTimeUnit( MyEnumTimeUnit.MO );
        assertEquals( "Mo", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1001EnuLegTimeUnit( MyEnumTimeUnit.YR );
        assertEquals( "Yr", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        // loop around the ENUM and process
        for ( MyEnumTimeUnit oneEnum : MyEnumTimeUnit.values()) {
            tagData = new Tag1001EnuLegTimeUnit(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumTimeUnit oneEnum : MyEnumTimeUnit.values()) {
            tagData = new Tag1001EnuLegTimeUnit(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
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