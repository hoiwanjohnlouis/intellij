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

package com.hwtsllc.fixengine2022.datatypes;

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
class MyEnumUnitOfMeasureTest {
    @Test
    void EnumTest() {
        MyEnumUnitOfMeasure enumType;

        enumType = MyEnumUnitOfMeasure.BARRELS;
        assertEquals( "Bbl", enumType.toFIXIDString() );
        assertEquals( "BARRELS", enumType.toFIXNameString() );
        assertEquals( "Bbl - Barrels", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumUnitOfMeasure.BILLION_CUBIC_FEET;
        assertEquals( "Bcf", enumType.toFIXIDString() );
        assertEquals( "BILLION_CUBIC_FEET", enumType.toFIXNameString() );
        assertEquals( "Bcf - Billion cubic feet", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumUnitOfMeasure.BUSHELS;
        assertEquals( "Bu", enumType.toFIXIDString() );
        assertEquals( "BUSHELS", enumType.toFIXNameString() );
        assertEquals( "Bu - Bushels", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumUnitOfMeasure.POUNDS;
        assertEquals( "lbs", enumType.toFIXIDString() );
        assertEquals( "POUNDS", enumType.toFIXNameString() );
        assertEquals( "lbs - pounds", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumUnitOfMeasure.GALLONS;
        assertEquals( "Gal", enumType.toFIXIDString() );
        assertEquals( "GALLONS", enumType.toFIXNameString() );
        assertEquals( "Gal - Gallons", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumUnitOfMeasure.MILLION_BARRELS;
        assertEquals( "MMbbl", enumType.toFIXIDString() );
        assertEquals( "MILLION_BARRELS", enumType.toFIXNameString() );
        assertEquals( "MMbbl - Million Barrels", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumUnitOfMeasure.MILLION_BTU;
        assertEquals( "MMBtu", enumType.toFIXIDString() );
        assertEquals( "MILLION_BTU", enumType.toFIXNameString() );
        assertEquals( "MMBtu - One Million BTU", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumUnitOfMeasure.MEGAWATT_HOURS;
        assertEquals( "MWh", enumType.toFIXIDString() );
        assertEquals( "MEGAWATT_HOURS", enumType.toFIXNameString() );
        assertEquals( "MWh - Megawatt hours", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumUnitOfMeasure.TROY_OUNCES;
        assertEquals( "oz_tr", enumType.toFIXIDString() );
        assertEquals( "TROY_OUNCES", enumType.toFIXNameString() );
        assertEquals( "oz_tr - Troy Ounces", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumUnitOfMeasure.METRIC_TONS;
        assertEquals( "t", enumType.toFIXIDString() );
        assertEquals( "METRIC_TONS", enumType.toFIXNameString() );
        assertEquals( "t - Metric Tons (aka Tonne)", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumUnitOfMeasure.US_TONS;
        assertEquals( "tn", enumType.toFIXIDString() );
        assertEquals( "US_TONS", enumType.toFIXNameString() );
        assertEquals( "tn - Tons (US)", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumUnitOfMeasure.US_DOLLARS;
        assertEquals( "USD", enumType.toFIXIDString() );
        assertEquals( "US_DOLLARS", enumType.toFIXNameString() );
        assertEquals( "USD - US Dollars", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}