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
        assertEquals( "BARRELS", enumType.toEnumNameString() );
        assertEquals( "Bbl - Barrels", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumUnitOfMeasure.BILLION_CUBIC_FEET;
        assertEquals( "Bcf", enumType.toFIXIDString() );
        assertEquals( "BILLION_CUBIC_FEET", enumType.toEnumNameString() );
        assertEquals( "Bcf - Billion cubic feet", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumUnitOfMeasure.BUSHELS;
        assertEquals( "Bu", enumType.toFIXIDString() );
        assertEquals( "BUSHELS", enumType.toEnumNameString() );
        assertEquals( "Bu - Bushels", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumUnitOfMeasure.POUNDS;
        assertEquals( "lbs", enumType.toFIXIDString() );
        assertEquals( "POUNDS", enumType.toEnumNameString() );
        assertEquals( "lbs - pounds", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumUnitOfMeasure.GALLONS;
        assertEquals( "Gal", enumType.toFIXIDString() );
        assertEquals( "GALLONS", enumType.toEnumNameString() );
        assertEquals( "Gal - Gallons", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumUnitOfMeasure.MILLION_BARRELS;
        assertEquals( "MMbbl", enumType.toFIXIDString() );
        assertEquals( "MILLION_BARRELS", enumType.toEnumNameString() );
        assertEquals( "MMbbl - Million Barrels", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumUnitOfMeasure.MILLION_BTU;
        assertEquals( "MMBtu", enumType.toFIXIDString() );
        assertEquals( "MILLION_BTU", enumType.toEnumNameString() );
        assertEquals( "MMBtu - One Million BTU", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumUnitOfMeasure.MEGAWATT_HOURS;
        assertEquals( "MWh", enumType.toFIXIDString() );
        assertEquals( "MEGAWATT_HOURS", enumType.toEnumNameString() );
        assertEquals( "MWh - Megawatt hours", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumUnitOfMeasure.TROY_OUNCES;
        assertEquals( "oz_tr", enumType.toFIXIDString() );
        assertEquals( "TROY_OUNCES", enumType.toEnumNameString() );
        assertEquals( "oz_tr - Troy Ounces", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumUnitOfMeasure.METRIC_TONS;
        assertEquals( "t", enumType.toFIXIDString() );
        assertEquals( "METRIC_TONS", enumType.toEnumNameString() );
        assertEquals( "t - Metric Tons (aka Tonne)", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumUnitOfMeasure.US_TONS;
        assertEquals( "tn", enumType.toFIXIDString() );
        assertEquals( "US_TONS", enumType.toEnumNameString() );
        assertEquals( "tn - Tons (US)", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumUnitOfMeasure.US_DOLLARS;
        assertEquals( "USD", enumType.toFIXIDString() );
        assertEquals( "US_DOLLARS", enumType.toEnumNameString() );
        assertEquals( "USD - US Dollars", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}