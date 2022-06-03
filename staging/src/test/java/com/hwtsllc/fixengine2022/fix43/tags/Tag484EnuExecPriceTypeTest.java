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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.fix43.enums.Enum484PriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  484
 *  ExecPriceType
 *  char
 *  <p></p>
 *  For CIV - Identifies how the execution price LastPx (31)
 *  was calculated from the fund unit/share price(s) calculated
 *  at the fund valuation point.
 *  <p></p>
 *  Valid values:
 *  <p>    B - Bid price
 *  <p>    C - Creation price
 *  <p>    D - Creation price plus adjustment percent
 *  <p>    E - Creation price plus adjustment amount
 *  <p>    O - Offer price
 *  <p></p>
 *  <p>    P - Offer price minus adjustment percent
 *  <p>    Q - Offer price minus adjustment amount
 *  <p>    S - Single price
 */
class Tag484EnuExecPriceTypeTest {
    @Test
    void FIX0484Test() {
        FIX43 fixData = FIX43.FIX484_ENU_EXEC_PRICE_TYPE;
        assertEquals( "484", fixData.toFIXIDString());
        assertEquals( "EXEC_PRICE_TYPE", fixData.toFIXNameString());
        assertEquals( "ExecPriceType", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0484Test() {
        Tag484EnuExecPriceType tagData;

        /*
         *  B, C, D, E, O, P, Q, and S types
         */


        /*
         *  B, C, D, E, types
         */
        tagData = new Tag484EnuExecPriceType( Enum484PriceType.BID_PRICE );
        assertEquals( Enum484PriceType.BID_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag484EnuExecPriceType( Enum484PriceType.CREATION_PRICE );
        assertEquals( Enum484PriceType.CREATION_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag484EnuExecPriceType( Enum484PriceType.CREATION_PRICE_PLUS_PERCENT );
        assertEquals( Enum484PriceType.CREATION_PRICE_PLUS_PERCENT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag484EnuExecPriceType( Enum484PriceType.CREATION_PRICE_PLUS_AMOUNT );
        assertEquals( Enum484PriceType.CREATION_PRICE_PLUS_AMOUNT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * O, P, Q, and S types
         */
        tagData = new Tag484EnuExecPriceType( Enum484PriceType.OFFER_PRICE );
        assertEquals( Enum484PriceType.OFFER_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag484EnuExecPriceType( Enum484PriceType.OFFER_PRICE_MINUS_PERCENT );
        assertEquals( Enum484PriceType.OFFER_PRICE_MINUS_PERCENT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag484EnuExecPriceType( Enum484PriceType.OFFER_PRICE_MINUS_AMOUNT );
        assertEquals( Enum484PriceType.OFFER_PRICE_MINUS_AMOUNT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         *  S type
         */
        tagData = new Tag484EnuExecPriceType( Enum484PriceType.SINGLE_PRICE );
        assertEquals( Enum484PriceType.SINGLE_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}