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

/**
 *  419
 *  BasisPxType
 *  char
 *  <p>
 *  Code to represent the basis price type.
 *  <p></p>
 *  Valid values:
 *  <p>    2 - Closing price at morning session
 *  <p>    3 - Closing price
 *  <p>    4 - Current price
 *  <p>    5 - SQ
 *  <p>    6 - VWAP through a day
 *  <p></p>
 *  <p>    7 - VWAP through a morning session
 *  <p>    8 - VWAP through an afternoon session
 *  <p>    9 - VWAP through a day except "YORI" (an opening auction)
 *  <p></p>
 *  <p>    A - VWAP through a morning session except "YORI" (an opening auction)
 *  <p>    B - VWAP through an afternoon session except "YORI" (an opening auction)
 *  <p>    C - Strike
 *  <p>    D - Open
 *  <p></p>
 *  <p>    Z - Others
 */
class Tag419EnuBasisPxTypeTest {
    @Test
    void FIX0419Test() {
        FIX42 fixData = FIX42.FIX419_ENU_BASIS_PX_TYPE;
        assertEquals( "419", fixData.toFIXIDString());
        assertEquals( "BASIS_PX_TYPE", fixData.toFIXNameString());
        assertEquals( "BasisPxType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0419Test() {
        Tag419EnuBasisPxType tagData;

        /*
         *  2-9, A-D, Z msg types
         */
        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.CLOSING_PRICE_MORNING);
        assertEquals( Enum419BasisPxType.CLOSING_PRICE_MORNING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.CLOSING_PRICE);
        assertEquals( Enum419BasisPxType.CLOSING_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.CURRENT_PRICE);
        assertEquals( Enum419BasisPxType.CURRENT_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.SQ);
        assertEquals( Enum419BasisPxType.SQ.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.VWAP_DAY);
        assertEquals( Enum419BasisPxType.VWAP_DAY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.VWAP_MORNING);
        assertEquals( Enum419BasisPxType.VWAP_MORNING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.VWAP_AFTERNOON);
        assertEquals( Enum419BasisPxType.VWAP_AFTERNOON.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.VWAP_DAY_EXCEPT_YORI);
        assertEquals( Enum419BasisPxType.VWAP_DAY_EXCEPT_YORI.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.VWAP_MORNING_EXCEPT_YORI);
        assertEquals( Enum419BasisPxType.VWAP_MORNING_EXCEPT_YORI.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.VWAP_AFTERNOON_EXCEPT_YORI);
        assertEquals( Enum419BasisPxType.VWAP_AFTERNOON_EXCEPT_YORI.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.STRIKE);
        assertEquals( Enum419BasisPxType.STRIKE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.OPEN);
        assertEquals( Enum419BasisPxType.OPEN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.OTHER);
        assertEquals( Enum419BasisPxType.OTHER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}