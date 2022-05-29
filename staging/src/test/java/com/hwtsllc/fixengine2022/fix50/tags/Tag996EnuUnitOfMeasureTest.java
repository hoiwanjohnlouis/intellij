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
class Tag996EnuUnitOfMeasureTest {
    @Test
    void FIX0996Test() {
        FIX50 fixData = FIX50.FIX996_ENU_UNIT_OF_MEASURE;
        assertEquals( "996", fixData.toFIXIDString());
        assertEquals( "UNIT_OF_MEASURE", fixData.toFIXNameString());
        assertEquals( "UnitOfMeasure", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0996Test() {
        Tag996EnuUnitOfMeasure tagData;

        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.BARRELS );
        assertEquals( MyEnumUnitOfMeasure.BARRELS.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.BILLION_CUBIC_FEET );
        assertEquals( MyEnumUnitOfMeasure.BILLION_CUBIC_FEET.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.BUSHELS );
        assertEquals( MyEnumUnitOfMeasure.BUSHELS.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.POUNDS );
        assertEquals( MyEnumUnitOfMeasure.POUNDS.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.GALLONS );
        assertEquals( MyEnumUnitOfMeasure.GALLONS.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.MILLION_BARRELS );
        assertEquals( MyEnumUnitOfMeasure.MILLION_BARRELS.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.MILLION_BTU );
        assertEquals( MyEnumUnitOfMeasure.MILLION_BTU.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.MEGAWATT_HOURS );
        assertEquals( MyEnumUnitOfMeasure.MEGAWATT_HOURS.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.TROY_OUNCES );
        assertEquals( MyEnumUnitOfMeasure.TROY_OUNCES.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.METRIC_TONS );
        assertEquals( MyEnumUnitOfMeasure.METRIC_TONS.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.US_TONS );
        assertEquals( MyEnumUnitOfMeasure.US_TONS.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag996EnuUnitOfMeasure( MyEnumUnitOfMeasure.US_DOLLARS );
        assertEquals( MyEnumUnitOfMeasure.US_DOLLARS.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag996EnuUnitOfMeasure tagData;

        // loop around the ENUM and process
        for ( MyEnumUnitOfMeasure oneEnum : MyEnumUnitOfMeasure.values()) {
            tagData = new Tag996EnuUnitOfMeasure(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag996EnuUnitOfMeasure tagData;

        // loop around the ENUM and process
        for (MyEnumUnitOfMeasure oneEnum : MyEnumUnitOfMeasure.values()) {
            tagData = new Tag996EnuUnitOfMeasure(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag996EnuUnitOfMeasure tagData;

        // loop around the ENUM and process
        for (MyEnumUnitOfMeasure oneEnum : MyEnumUnitOfMeasure.values()) {
            tagData = new Tag996EnuUnitOfMeasure(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag996EnuUnitOfMeasure tagData;

        // loop around the ENUM and process
        for (MyEnumUnitOfMeasure oneEnum : MyEnumUnitOfMeasure.values()) {
            tagData = new Tag996EnuUnitOfMeasure(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag996EnuUnitOfMeasure tagData;

        // loop around the ENUM and process
        for (MyEnumUnitOfMeasure oneEnum : MyEnumUnitOfMeasure.values()) {
            tagData = new Tag996EnuUnitOfMeasure(oneEnum);
            assertEquals( "Tag996EnuUnitOfMeasure\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}