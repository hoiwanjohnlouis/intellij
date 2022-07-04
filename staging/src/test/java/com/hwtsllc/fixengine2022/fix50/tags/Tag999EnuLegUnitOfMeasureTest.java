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

import com.hwtsllc.fixengine2022.datatypes.FIX50;
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
class Tag999EnuLegUnitOfMeasureTest {
    @Test
    void FIX0999Test() {
        FIX50 fixData = FIX50.FIX999_ENU_LEG_UNIT_OF_MEASURE;
        assertEquals( "999", fixData.toEnumIDString());
        assertEquals( "LEG_UNIT_OF_MEASURE", fixData.toEnumNameString());
        assertEquals( "LegUnitOfMeasure", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0999Test() {
        Tag999EnuLegUnitOfMeasure tagData;

        tagData = new Tag999EnuLegUnitOfMeasure( MyEnumUnitOfMeasure.BARRELS );
        assertEquals( MyEnumUnitOfMeasure.BARRELS.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag999EnuLegUnitOfMeasure( MyEnumUnitOfMeasure.BILLION_CUBIC_FEET );
        assertEquals( MyEnumUnitOfMeasure.BILLION_CUBIC_FEET.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag999EnuLegUnitOfMeasure( MyEnumUnitOfMeasure.BUSHELS );
        assertEquals( MyEnumUnitOfMeasure.BUSHELS.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag999EnuLegUnitOfMeasure( MyEnumUnitOfMeasure.POUNDS );
        assertEquals( MyEnumUnitOfMeasure.POUNDS.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag999EnuLegUnitOfMeasure( MyEnumUnitOfMeasure.GALLONS );
        assertEquals( MyEnumUnitOfMeasure.GALLONS.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag999EnuLegUnitOfMeasure( MyEnumUnitOfMeasure.MILLION_BARRELS );
        assertEquals( MyEnumUnitOfMeasure.MILLION_BARRELS.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag999EnuLegUnitOfMeasure( MyEnumUnitOfMeasure.MILLION_BTU );
        assertEquals( MyEnumUnitOfMeasure.MILLION_BTU.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag999EnuLegUnitOfMeasure( MyEnumUnitOfMeasure.MEGAWATT_HOURS );
        assertEquals( MyEnumUnitOfMeasure.MEGAWATT_HOURS.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag999EnuLegUnitOfMeasure( MyEnumUnitOfMeasure.TROY_OUNCES );
        assertEquals( MyEnumUnitOfMeasure.TROY_OUNCES.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag999EnuLegUnitOfMeasure( MyEnumUnitOfMeasure.METRIC_TONS );
        assertEquals( MyEnumUnitOfMeasure.METRIC_TONS.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag999EnuLegUnitOfMeasure( MyEnumUnitOfMeasure.US_TONS );
        assertEquals( MyEnumUnitOfMeasure.US_TONS.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag999EnuLegUnitOfMeasure( MyEnumUnitOfMeasure.US_DOLLARS );
        assertEquals( MyEnumUnitOfMeasure.US_DOLLARS.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag999EnuLegUnitOfMeasure tagData;

        // loop around the ENUM and process
        for ( MyEnumUnitOfMeasure oneEnum : MyEnumUnitOfMeasure.values()) {
            tagData = new Tag999EnuLegUnitOfMeasure(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag999EnuLegUnitOfMeasure tagData;

        // loop around the ENUM and process
        for (MyEnumUnitOfMeasure oneEnum : MyEnumUnitOfMeasure.values()) {
            tagData = new Tag999EnuLegUnitOfMeasure(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag999EnuLegUnitOfMeasure tagData;

        // loop around the ENUM and process
        for (MyEnumUnitOfMeasure oneEnum : MyEnumUnitOfMeasure.values()) {
            tagData = new Tag999EnuLegUnitOfMeasure(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag999EnuLegUnitOfMeasure tagData;

        // loop around the ENUM and process
        for (MyEnumUnitOfMeasure oneEnum : MyEnumUnitOfMeasure.values()) {
            tagData = new Tag999EnuLegUnitOfMeasure(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag999EnuLegUnitOfMeasure tagData;

        // loop around the ENUM and process
        for (MyEnumUnitOfMeasure oneEnum : MyEnumUnitOfMeasure.values()) {
            tagData = new Tag999EnuLegUnitOfMeasure(oneEnum);
            assertEquals( "Tag999EnuLegUnitOfMeasure\n" +
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