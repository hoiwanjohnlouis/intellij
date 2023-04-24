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

package com.hwtsllc.fixengine.tags.fix50;

import com.hwtsllc.fixengine.datatypes.MyEnumUnitOfMeasure;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag996EnuUnitOfMeasureTest {
    Tag996EnuUnitOfMeasure tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumUnitOfMeasure oneEnum : MyEnumUnitOfMeasure.values()) {
            tagData = new Tag996EnuUnitOfMeasure(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumUnitOfMeasure oneEnum : MyEnumUnitOfMeasure.values()) {
            tagData = new Tag996EnuUnitOfMeasure(oneEnum);
            assertEquals( "FIX996_ENU_UNIT_OF_MEASURE", tagData.toFIXLabelString());
            assertEquals( "996", tagData.toFIXIDString());
            assertEquals( "UNIT_OF_MEASURE", tagData.toFIXNameString());
            assertEquals( "UnitOfMeasure", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumUnitOfMeasure oneEnum : MyEnumUnitOfMeasure.values()) {
            tagData = new Tag996EnuUnitOfMeasure(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  996 (same as 996, 998, 999,)
         *  UnitofMeasure
         *  String
         *  <p>    Bbl - Barrels
         *  <p>    Bcf - Billion cubic feet
         *  <p>    Bu - Bushels
         *  <p>    lbs - pounds
         *  <p>    Gal - Gallons
         */
        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.BARRELS );
        assertEquals( "Bbl", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.BILLION_CUBIC_FEET );
        assertEquals( "Bcf", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.BUSHELS );
        assertEquals( "Bu", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.POUNDS );
        assertEquals( "lbs", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.GALLONS );
        assertEquals( "Gal", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>    MMbbl - Million Barrels
         *  <p>    MMBtu - One Million BTU
         *  <p>    MWh - Megawatt hours
         *  <p>    oz_tr - Troy Ounces
         *  <p>    t - Metric Tons (aka Tonne)
         */
        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.MILLION_BARRELS );
        assertEquals( "MMbbl", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.MILLION_BTU );
        assertEquals( "MMBtu", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.MEGAWATT_HOURS );
        assertEquals( "MWh", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.TROY_OUNCES );
        assertEquals( "oz_tr", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.METRIC_TONS );
        assertEquals( "t", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>    tn - Tons (US)
         *  <p>    USD - US Dollars
         */
        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.US_TONS );
        assertEquals( "tn", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.US_DOLLARS );
        assertEquals( "USD", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );


        // loop around the ENUM and process
        for ( MyEnumUnitOfMeasure oneEnum : MyEnumUnitOfMeasure.values()) {
            tagData = new Tag996EnuUnitOfMeasure(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumUnitOfMeasure oneEnum : MyEnumUnitOfMeasure.values()) {
            tagData = new Tag996EnuUnitOfMeasure(oneEnum);
            assertEquals( "Tag996EnuUnitOfMeasure\n" +
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