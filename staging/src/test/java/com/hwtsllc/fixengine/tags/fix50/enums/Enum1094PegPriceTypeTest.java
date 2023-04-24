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

package com.hwtsllc.fixengine.tags.fix50.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
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
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "LAST_PEG", enumType.toFIXNameString() );
        assertEquals( "1 - Last peg (last sale)", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1094PegPriceType.MID_PEG;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "MID_PEG", enumType.toFIXNameString() );
        assertEquals( "2 - Mid-price peg (midprice of inside quote)", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1094PegPriceType.OPENING_PEG;
        assertEquals( "3", enumType.toFIXIDString() );
        assertEquals( "OPENING_PEG", enumType.toFIXNameString() );
        assertEquals( "3 - Opening peg", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1094PegPriceType.MARKET_PEG;
        assertEquals( "4", enumType.toFIXIDString() );
        assertEquals( "MARKET_PEG", enumType.toFIXNameString() );
        assertEquals( "4 - Market peg", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1094PegPriceType.PRIMARY_PEG;
        assertEquals( "5", enumType.toFIXIDString() );
        assertEquals( "PRIMARY_PEG", enumType.toFIXNameString() );
        assertEquals( "5 - Primary peg (primary market - buy at bid or sell at offer)", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum1094PegPriceType.FIXED_PEG;
        assertEquals( "6", enumType.toFIXIDString() );
        assertEquals( "FIXED_PEG", enumType.toFIXNameString() );
        assertEquals( "6 - Fixed Peg to Local best bid or offer at time of order", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1094PegPriceType.PEG_TO_VWAP;
        assertEquals( "7", enumType.toFIXIDString() );
        assertEquals( "PEG_TO_VWAP", enumType.toFIXNameString() );
        assertEquals( "7 - Peg to VWAP", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1094PegPriceType.TRAILING_STOP;
        assertEquals( "8", enumType.toFIXIDString() );
        assertEquals( "TRAILING_STOP", enumType.toFIXNameString() );
        assertEquals( "8 - Trailing Stop Peg", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1094PegPriceType.PEG_TO_LIMIT;
        assertEquals( "9", enumType.toFIXIDString() );
        assertEquals( "PEG_TO_LIMIT", enumType.toFIXNameString() );
        assertEquals( "9 - Peg to Limit Price", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}