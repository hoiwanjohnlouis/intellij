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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix42.enums.Enum419BasisPxType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag419EnuBasisPxTypeTest {
    @Test
    void FIX0419Test() {
        FIX42 fixData = FIX42.FIX419_ENU_BASIS_PX_TYPE;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  Tag419
     *  Enu
     *  BasisPxType
     *
     *      2-9, A-D, Z msg types
     *      CLOSING_PRICE_MORNING( "2", "CLOSING_PRICE_MORNING", "2 - Closing price at morning session" ),
     *      CLOSING_PRICE( "3", "CLOSING_PRICE", "3 - Closing price" ),
     *      CURRENT_PRICE( "4", "CURRENT_PRICE", "4 - Current price" ),
     *      SQ( "5", "SQ", "5 - SQ" ),
     *      VWAP_DAY( "6", "VWAP_DAY", "6 - VWAP through a day" ),
     *      VWAP_MORNING( "7", "VWAP_MORNING", "7 - VWAP through a morning session" ),
     *      VWAP_AFTERNOON( "8", "VWAP_AFTERNOON", "8 - VWAP through an afternoon session" ),
     *      VWAP_DAY_EXCEPT_YORI( "9", "VWAP_DAY_EXCEPT_YORI",
     *                          "9 - VWAP through a day except YORI (an opening auction)" ),
     *      VWAP_MORNING_EXCEPT_YORI( "A", "VWAP_MORNING_EXCEPT_YORI",
     *                          "A - VWAP through a morning session except YORI (an opening auction)" ),
     *      VWAP_AFTERNOON_EXCEPT_YORI( "B", "VWAP_AFTERNOON_EXCEPT_YORI",
     *                          "B - VWAP through an afternoon session except YORI (an opening auction)" ),
     *      STRIKE( "C", "STRIKE", "C - Strike" ),
     *      OPEN( "D", "OPEN", "D - Open" ),
     *      OTHER( "Z", "OTHER", "Z - Others" ),
     */
    @Test
    void Tag0419Test() {
        Log419EnuBasisPxType tagData;

        /**
         *  2-9, A-D, Z msg types
         */
        tagData = new Log419EnuBasisPxType(Enum419BasisPxType.CLOSING_PRICE_MORNING);
        assertEquals( Enum419BasisPxType.CLOSING_PRICE_MORNING.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log419EnuBasisPxType(Enum419BasisPxType.CLOSING_PRICE);
        assertEquals( Enum419BasisPxType.CLOSING_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log419EnuBasisPxType(Enum419BasisPxType.CURRENT_PRICE);
        assertEquals( Enum419BasisPxType.CURRENT_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log419EnuBasisPxType(Enum419BasisPxType.SQ);
        assertEquals( Enum419BasisPxType.SQ.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log419EnuBasisPxType(Enum419BasisPxType.VWAP_DAY);
        assertEquals( Enum419BasisPxType.VWAP_DAY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log419EnuBasisPxType(Enum419BasisPxType.VWAP_MORNING);
        assertEquals( Enum419BasisPxType.VWAP_MORNING.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log419EnuBasisPxType(Enum419BasisPxType.VWAP_AFTERNOON);
        assertEquals( Enum419BasisPxType.VWAP_AFTERNOON.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log419EnuBasisPxType(Enum419BasisPxType.VWAP_DAY_EXCEPT_YORI);
        assertEquals( Enum419BasisPxType.VWAP_DAY_EXCEPT_YORI.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log419EnuBasisPxType(Enum419BasisPxType.VWAP_MORNING_EXCEPT_YORI);
        assertEquals( Enum419BasisPxType.VWAP_MORNING_EXCEPT_YORI.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log419EnuBasisPxType(Enum419BasisPxType.VWAP_AFTERNOON_EXCEPT_YORI);
        assertEquals( Enum419BasisPxType.VWAP_AFTERNOON_EXCEPT_YORI.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log419EnuBasisPxType(Enum419BasisPxType.STRIKE);
        assertEquals( Enum419BasisPxType.STRIKE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log419EnuBasisPxType(Enum419BasisPxType.OPEN);
        assertEquals( Enum419BasisPxType.OPEN.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log419EnuBasisPxType(Enum419BasisPxType.OTHER);
        assertEquals( Enum419BasisPxType.OTHER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}