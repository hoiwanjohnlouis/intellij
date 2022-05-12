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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix50.enums.Enum1094PegPriceType;
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
class Tag1094EnuPegPriceTypeTest {
    @Test
    void FIX1094Test() {
        FIX50 fixData = FIX50.FIX1094_ENU_PEG_PRICE_TYPE;
        assertEquals( "1094", fixData.getID());
        assertEquals( "PEG_PRICE_TYPE", fixData.getName());
        assertEquals( "PegPriceType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1094Test() {
        Tag1094EnuPegPriceType tagData;

        tagData = new Tag1094EnuPegPriceType( Enum1094PegPriceType.LAST_PEG );
        assertEquals( Enum1094PegPriceType.LAST_PEG.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1094EnuPegPriceType( Enum1094PegPriceType.MID_PEG );
        assertEquals( Enum1094PegPriceType.MID_PEG.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1094EnuPegPriceType( Enum1094PegPriceType.OPENING_PEG );
        assertEquals( Enum1094PegPriceType.OPENING_PEG.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1094EnuPegPriceType( Enum1094PegPriceType.MARKET_PEG );
        assertEquals( Enum1094PegPriceType.MARKET_PEG.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1094EnuPegPriceType( Enum1094PegPriceType.PRIMARY_PEG );
        assertEquals( Enum1094PegPriceType.PRIMARY_PEG.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag1094EnuPegPriceType( Enum1094PegPriceType.FIXED_PEG );
        assertEquals( Enum1094PegPriceType.FIXED_PEG.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1094EnuPegPriceType( Enum1094PegPriceType.PEG_TO_VWAP );
        assertEquals( Enum1094PegPriceType.PEG_TO_VWAP.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1094EnuPegPriceType( Enum1094PegPriceType.TRAILING_STOP );
        assertEquals( Enum1094PegPriceType.TRAILING_STOP.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1094EnuPegPriceType( Enum1094PegPriceType.PEG_TO_LIMIT );
        assertEquals( Enum1094PegPriceType.PEG_TO_LIMIT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}