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

/**
 *  996 (same as 996, 998, 999,)
 *  UnitofMeasure
 *  String
 *  <p>
 *  Physical unit of measure for Derivative products.
 *  <p>
 *  NOTE: Additional values may be used by mutual agreement of the counterparties
 *  <p>
 *  (http://www.unc.edu/~rowlett/units/index.html is a good source for units)
 *  <p></p>
 *  998
 *  UnderlyingUnitofMeasure
 *  String
 *  <p>
 *  Same as UnitofMeasure (996).
 *  <p></p>
 *  999
 *  LegUnitofMeasure
 *  String
 *  <p>
 *  Same as UnitofMeasure (996).
 *  <p></p>
 *  Valid values:
 *  <p>    Bbl - Barrels
 *  <p>    Bcf - Billion cubic feet
 *  <p>    Bu - Bushels
 *  <p>    lbs - pounds
 *  <p>    Gal - Gallons
 *  <p></p>
 *  <p>    MMbbl - Million Barrels
 *  <p>    MMBtu - One Million BTU
 *  <p>    MWh - Megawatt hours
 *  <p>    oz_tr - Troy Ounces
 *  <p>    t - Metric Tons (aka Tonne)
 *  <p></p>
 *  <p>    tn - Tons (US)
 *  <p>    USD - US Dollars
 */
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
            assertEquals( "FIX996_ENU_UNIT_OF_MEASURE", tagData.toEnumLabelString());
            assertEquals( "996", tagData.toEnumIDString());
            assertEquals( "UNIT_OF_MEASURE", tagData.toEnumNameString());
            assertEquals( "UnitOfMeasure", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  <p>    Bbl - Barrels
         *  <p>    Bcf - Billion cubic feet
         *  <p>    Bu - Bushels
         *  <p>    lbs - pounds
         *  <p>    Gal - Gallons
         */
        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.BARRELS );
        assertEquals( "Bbl", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.BILLION_CUBIC_FEET );
        assertEquals( "Bcf", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.BUSHELS );
        assertEquals( "Bu", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.POUNDS );
        assertEquals( "lbs", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.GALLONS );
        assertEquals( "Gal", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        /*
         *  <p>    MMbbl - Million Barrels
         *  <p>    MMBtu - One Million BTU
         *  <p>    MWh - Megawatt hours
         *  <p>    oz_tr - Troy Ounces
         *  <p>    t - Metric Tons (aka Tonne)
         */
        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.MILLION_BARRELS );
        assertEquals( "MMbbl", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.MILLION_BTU );
        assertEquals( "MMBtu", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.MEGAWATT_HOURS );
        assertEquals( "MWh", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.TROY_OUNCES );
        assertEquals( "oz_tr", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.METRIC_TONS );
        assertEquals( "t", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        /*
         *  <p>    tn - Tons (US)
         *  <p>    USD - US Dollars
         */
        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.US_TONS );
        assertEquals( "tn", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.US_DOLLARS );
        assertEquals( "USD", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        // loop around the ENUM and process
        for ( MyEnumUnitOfMeasure oneEnum : MyEnumUnitOfMeasure.values()) {
            tagData = new Tag996EnuUnitOfMeasure(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumUnitOfMeasure oneEnum : MyEnumUnitOfMeasure.values()) {
            tagData = new Tag996EnuUnitOfMeasure(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
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