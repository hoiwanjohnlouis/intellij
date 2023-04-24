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

package com.hwtsllc.fixengine.tags.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.MyEnumTimeUnit;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag997EnuTimeUnitTest {
    Tag997EnuTimeUnit tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumTimeUnit oneEnum : MyEnumTimeUnit.values()) {
            tagData = new Tag997EnuTimeUnit(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumTimeUnit oneEnum : MyEnumTimeUnit.values()) {
            tagData = new Tag997EnuTimeUnit(oneEnum);
            assertEquals( "FIX997_ENU_TIME_UNIT", tagData.toFIXLabelString());
            assertEquals( "997", tagData.toFIXIDString());
            assertEquals( "TIME_UNIT", tagData.toFIXNameString());
            assertEquals( "TimeUnit", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumTimeUnit oneEnum : MyEnumTimeUnit.values()) {
            tagData = new Tag997EnuTimeUnit(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  997 (same as 997, 1000, 1001)
         *  TimeUnit
         *  String
         *  <p>    H - Hour
         *  <p>    Min - Minute
         *  <p>    S - Second
         */
        tagData = new Tag997EnuTimeUnit( MyEnumTimeUnit.HH );
        assertEquals( "H", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag997EnuTimeUnit( MyEnumTimeUnit.MM );
        assertEquals( "Min", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag997EnuTimeUnit( MyEnumTimeUnit.SS );
        assertEquals( "S", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>    D - Day
         *  <p>    Wk - Week
         *  <p>    Mo - Month
         *  <p>    Yr - Year
         */
        tagData = new Tag997EnuTimeUnit( MyEnumTimeUnit.DD );
        assertEquals( "D", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag997EnuTimeUnit( MyEnumTimeUnit.WK );
        assertEquals( "Wk", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag997EnuTimeUnit( MyEnumTimeUnit.MO );
        assertEquals( "Mo", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag997EnuTimeUnit( MyEnumTimeUnit.YR );
        assertEquals( "Yr", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );


        // loop around the ENUM and process
        for ( MyEnumTimeUnit oneEnum : MyEnumTimeUnit.values()) {
            tagData = new Tag997EnuTimeUnit(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumTimeUnit oneEnum : MyEnumTimeUnit.values()) {
            tagData = new Tag997EnuTimeUnit(oneEnum);
            assertEquals( "Tag997EnuTimeUnit\n" +
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