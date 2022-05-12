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
        assertEquals( "Bbl", enumType.getID() );
        assertEquals( "BARRELS", enumType.getName() );
        assertEquals( "Bbl - Barrels", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumUnitOfMeasure.BILLION_CUBIC_FEET;
        assertEquals( "Bcf", enumType.getID() );
        assertEquals( "BILLION_CUBIC_FEET", enumType.getName() );
        assertEquals( "Bcf - Billion cubic feet", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumUnitOfMeasure.BUSHELS;
        assertEquals( "Bu", enumType.getID() );
        assertEquals( "BUSHELS", enumType.getName() );
        assertEquals( "Bu - Bushels", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumUnitOfMeasure.POUNDS;
        assertEquals( "lbs", enumType.getID() );
        assertEquals( "POUNDS", enumType.getName() );
        assertEquals( "lbs - pounds", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumUnitOfMeasure.GALLONS;
        assertEquals( "Gal", enumType.getID() );
        assertEquals( "GALLONS", enumType.getName() );
        assertEquals( "Gal - Gallons", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumUnitOfMeasure.MILLION_BARRELS;
        assertEquals( "MMbbl", enumType.getID() );
        assertEquals( "MILLION_BARRELS", enumType.getName() );
        assertEquals( "MMbbl - Million Barrels", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumUnitOfMeasure.MILLION_BTU;
        assertEquals( "MMBtu", enumType.getID() );
        assertEquals( "MILLION_BTU", enumType.getName() );
        assertEquals( "MMBtu - One Million BTU", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumUnitOfMeasure.MEGAWATT_HOURS;
        assertEquals( "MWh", enumType.getID() );
        assertEquals( "MEGAWATT_HOURS", enumType.getName() );
        assertEquals( "MWh - Megawatt hours", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumUnitOfMeasure.TROY_OUNCES;
        assertEquals( "oz_tr", enumType.getID() );
        assertEquals( "TROY_OUNCES", enumType.getName() );
        assertEquals( "oz_tr - Troy Ounces", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumUnitOfMeasure.METRIC_TONS;
        assertEquals( "t", enumType.getID() );
        assertEquals( "METRIC_TONS", enumType.getName() );
        assertEquals( "t - Metric Tons (aka Tonne)", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumUnitOfMeasure.US_TONS;
        assertEquals( "tn", enumType.getID() );
        assertEquals( "US_TONS", enumType.getName() );
        assertEquals( "tn - Tons (US)", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumUnitOfMeasure.US_DOLLARS;
        assertEquals( "USD", enumType.getID() );
        assertEquals( "US_DOLLARS", enumType.getName() );
        assertEquals( "USD - US Dollars", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}