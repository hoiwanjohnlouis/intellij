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
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
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
class Tag998EnuUnderlyingUnitOfMeasureTest {
    @Test
    void FIX0998Test() {
        FIX50 fixData = FIX50.FIX998_ENU_UNDERLYING_UNIT_OF_MEASURE;
        assertEquals( "998", fixData.getID());
        assertEquals( "UNDERLYING_UNIT_OF_MEASURE", fixData.getName());
        assertEquals( "UnderlyingUnitOfMeasure", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0998Test() {
        Tag998EnuUnderlyingUnitOfMeasure tagData;

        tagData = new Tag998EnuUnderlyingUnitOfMeasure( MyEnumUnitOfMeasure.BARRELS );
        assertEquals( MyEnumUnitOfMeasure.BARRELS.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag998EnuUnderlyingUnitOfMeasure( MyEnumUnitOfMeasure.BILLION_CUBIC_FEET );
        assertEquals( MyEnumUnitOfMeasure.BILLION_CUBIC_FEET.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag998EnuUnderlyingUnitOfMeasure( MyEnumUnitOfMeasure.BUSHELS );
        assertEquals( MyEnumUnitOfMeasure.BUSHELS.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag998EnuUnderlyingUnitOfMeasure( MyEnumUnitOfMeasure.POUNDS );
        assertEquals( MyEnumUnitOfMeasure.POUNDS.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag998EnuUnderlyingUnitOfMeasure( MyEnumUnitOfMeasure.GALLONS );
        assertEquals( MyEnumUnitOfMeasure.GALLONS.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag998EnuUnderlyingUnitOfMeasure( MyEnumUnitOfMeasure.MILLION_BARRELS );
        assertEquals( MyEnumUnitOfMeasure.MILLION_BARRELS.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag998EnuUnderlyingUnitOfMeasure( MyEnumUnitOfMeasure.MILLION_BTU );
        assertEquals( MyEnumUnitOfMeasure.MILLION_BTU.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag998EnuUnderlyingUnitOfMeasure( MyEnumUnitOfMeasure.MEGAWATT_HOURS );
        assertEquals( MyEnumUnitOfMeasure.MEGAWATT_HOURS.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag998EnuUnderlyingUnitOfMeasure( MyEnumUnitOfMeasure.TROY_OUNCES );
        assertEquals( MyEnumUnitOfMeasure.TROY_OUNCES.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag998EnuUnderlyingUnitOfMeasure( MyEnumUnitOfMeasure.METRIC_TONS );
        assertEquals( MyEnumUnitOfMeasure.METRIC_TONS.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag998EnuUnderlyingUnitOfMeasure( MyEnumUnitOfMeasure.US_TONS );
        assertEquals( MyEnumUnitOfMeasure.US_TONS.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag998EnuUnderlyingUnitOfMeasure( MyEnumUnitOfMeasure.US_DOLLARS );
        assertEquals( MyEnumUnitOfMeasure.US_DOLLARS.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
}