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

package com.hwtsllc.fixengine2022.fix50.enums;

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1094
 *  PegPriceType
 *  int
 *  <p>
 *  Defines the type of peg.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Last peg (last sale)
 *  <p>    2 - Mid-price peg (midprice of inside quote)
 *  <p>    3 - Opening peg
 *  <p>    4 - Market peg
 *  <p>    5 - Primary peg (primary market - buy at bid or sell at offer)
 *  <p></p>
 *  <p>    6 - Fixed Peg to Local best bid or offer at time of order
 *  <p>    7 - Peg to VWAP
 *  <p>    8 - Trailing Stop Peg
 *  <p>    9 - Peg to Limit Price
 */
class Enum1094PegPriceTypeTest {
    @Test
    void EnumTest() {
        Enum1094PegPriceType enumType;

        enumType = Enum1094PegPriceType.LAST_PEG;
        assertEquals( "1", enumType.getID() );
        assertEquals( "LAST_PEG", enumType.getName() );
        assertEquals( "1 - Last peg (last sale)", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1094PegPriceType.MID_PEG;
        assertEquals( "2", enumType.getID() );
        assertEquals( "MID_PEG", enumType.getName() );
        assertEquals( "2 - Mid-price peg (midprice of inside quote)", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1094PegPriceType.OPENING_PEG;
        assertEquals( "3", enumType.getID() );
        assertEquals( "OPENING_PEG", enumType.getName() );
        assertEquals( "3 - Opening peg", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1094PegPriceType.MARKET_PEG;
        assertEquals( "4", enumType.getID() );
        assertEquals( "MARKET_PEG", enumType.getName() );
        assertEquals( "4 - Market peg", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1094PegPriceType.PRIMARY_PEG;
        assertEquals( "5", enumType.getID() );
        assertEquals( "PRIMARY_PEG", enumType.getName() );
        assertEquals( "5 - Primary peg (primary market - buy at bid or sell at offer)", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum1094PegPriceType.FIXED_PEG;
        assertEquals( "6", enumType.getID() );
        assertEquals( "FIXED_PEG", enumType.getName() );
        assertEquals( "6 - Fixed Peg to Local best bid or offer at time of order", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1094PegPriceType.PEG_TO_VWAP;
        assertEquals( "7", enumType.getID() );
        assertEquals( "PEG_TO_VWAP", enumType.getName() );
        assertEquals( "7 - Peg to VWAP", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1094PegPriceType.TRAILING_STOP;
        assertEquals( "8", enumType.getID() );
        assertEquals( "TRAILING_STOP", enumType.getName() );
        assertEquals( "8 - Trailing Stop Peg", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1094PegPriceType.PEG_TO_LIMIT;
        assertEquals( "9", enumType.getID() );
        assertEquals( "PEG_TO_LIMIT", enumType.getName() );
        assertEquals( "9 - Peg to Limit Price", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}