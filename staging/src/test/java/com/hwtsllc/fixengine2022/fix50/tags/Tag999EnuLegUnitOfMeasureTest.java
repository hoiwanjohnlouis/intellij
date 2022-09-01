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

import com.hwtsllc.fixengine2022.datatypes.MyEnumUnitOfMeasure;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag999EnuLegUnitOfMeasureTest {
    Tag999EnuLegUnitOfMeasure tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumUnitOfMeasure oneEnum : MyEnumUnitOfMeasure.values()) {
            tagData = new Tag999EnuLegUnitOfMeasure(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumUnitOfMeasure oneEnum : MyEnumUnitOfMeasure.values()) {
            tagData = new Tag999EnuLegUnitOfMeasure(oneEnum);
            assertEquals( "FIX999_ENU_LEG_UNIT_OF_MEASURE", tagData.toFIXLabelString());
            assertEquals( "999", tagData.toEnumIDString());
            assertEquals( "LEG_UNIT_OF_MEASURE", tagData.toEnumNameString());
            assertEquals( "LegUnitOfMeasure", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumUnitOfMeasure oneEnum : MyEnumUnitOfMeasure.values()) {
            tagData = new Tag999EnuLegUnitOfMeasure(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  999 (same as 996, 998, 999,)
         *  LegUnitofMeasure
         *  String
         *  <p>    Bbl - Barrels
         *  <p>    Bcf - Billion cubic feet
         *  <p>    Bu - Bushels
         *  <p>    lbs - pounds
         *  <p>    Gal - Gallons
         */
        tagData = new Tag999EnuLegUnitOfMeasure( MyEnumUnitOfMeasure.BARRELS );
        assertEquals( "Bbl", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag999EnuLegUnitOfMeasure( MyEnumUnitOfMeasure.BILLION_CUBIC_FEET );
        assertEquals( "Bcf", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag999EnuLegUnitOfMeasure( MyEnumUnitOfMeasure.BUSHELS );
        assertEquals( "Bu", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag999EnuLegUnitOfMeasure( MyEnumUnitOfMeasure.POUNDS );
        assertEquals( "lbs", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag999EnuLegUnitOfMeasure( MyEnumUnitOfMeasure.GALLONS );
        assertEquals( "Gal", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>    MMbbl - Million Barrels
         *  <p>    MMBtu - One Million BTU
         *  <p>    MWh - Megawatt hours
         *  <p>    oz_tr - Troy Ounces
         *  <p>    t - Metric Tons (aka Tonne)
         */
        tagData = new Tag999EnuLegUnitOfMeasure( MyEnumUnitOfMeasure.MILLION_BARRELS );
        assertEquals( "MMbbl", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag999EnuLegUnitOfMeasure( MyEnumUnitOfMeasure.MILLION_BTU );
        assertEquals( "MMBtu", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag999EnuLegUnitOfMeasure( MyEnumUnitOfMeasure.MEGAWATT_HOURS );
        assertEquals( "MWh", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag999EnuLegUnitOfMeasure( MyEnumUnitOfMeasure.TROY_OUNCES );
        assertEquals( "oz_tr", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag999EnuLegUnitOfMeasure( MyEnumUnitOfMeasure.METRIC_TONS );
        assertEquals( "t", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>    tn - Tons (US)
         *  <p>    USD - US Dollars
         */
        tagData = new Tag999EnuLegUnitOfMeasure( MyEnumUnitOfMeasure.US_TONS );
        assertEquals( "tn", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag999EnuLegUnitOfMeasure( MyEnumUnitOfMeasure.US_DOLLARS );
        assertEquals( "USD", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );


        // loop around the ENUM and process
        for ( MyEnumUnitOfMeasure oneEnum : MyEnumUnitOfMeasure.values()) {
            tagData = new Tag999EnuLegUnitOfMeasure(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumUnitOfMeasure oneEnum : MyEnumUnitOfMeasure.values()) {
            tagData = new Tag999EnuLegUnitOfMeasure(oneEnum);
            assertEquals( "Tag999EnuLegUnitOfMeasure\n" +
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