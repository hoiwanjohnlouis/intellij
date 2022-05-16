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

package com.hwtsllc.fixengine2022.fix42.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
class Enum419BasisPxTypeTest {
    @Test
    void Enum0419Test() {
        Enum419BasisPxType enumType;

        /*
         *  2-9, A-D, Z msg types
         */

        /*
         *  2-9, msg types
         */
        enumType = Enum419BasisPxType.CLOSING_PRICE_MORNING;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "CLOSING_PRICE_MORNING", enumType.toFIXNameString());
        assertEquals( "2 - Closing price at morning session", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum419BasisPxType.CLOSING_PRICE;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "CLOSING_PRICE", enumType.toFIXNameString());
        assertEquals( "3 - Closing price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum419BasisPxType.CURRENT_PRICE;
        assertEquals( "4", enumType.toFIXIDString());
        assertEquals( "CURRENT_PRICE", enumType.toFIXNameString());
        assertEquals( "4 - Current price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum419BasisPxType.SQ;
        assertEquals( "5", enumType.toFIXIDString());
        assertEquals( "SQ", enumType.toFIXNameString());
        assertEquals( "5 - SQ", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum419BasisPxType.VWAP_DAY;
        assertEquals( "6", enumType.toFIXIDString());
        assertEquals( "VWAP_DAY", enumType.toFIXNameString());
        assertEquals( "6 - VWAP through a day", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum419BasisPxType.VWAP_MORNING;
        assertEquals( "7", enumType.toFIXIDString());
        assertEquals( "VWAP_MORNING", enumType.toFIXNameString());
        assertEquals( "7 - VWAP through a morning session", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum419BasisPxType.VWAP_AFTERNOON;
        assertEquals( "8", enumType.toFIXIDString());
        assertEquals( "VWAP_AFTERNOON", enumType.toFIXNameString());
        assertEquals( "8 - VWAP through an afternoon session", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum419BasisPxType.VWAP_DAY_EXCEPT_YORI;
        assertEquals( "9", enumType.toFIXIDString());
        assertEquals( "VWAP_DAY_EXCEPT_YORI", enumType.toFIXNameString());
        assertEquals( "9 - VWAP through a day except YORI (an opening auction)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        /*
         *  A-D, msg types
         */
        enumType = Enum419BasisPxType.VWAP_MORNING_EXCEPT_YORI;
        assertEquals( "A", enumType.toFIXIDString());
        assertEquals( "VWAP_MORNING_EXCEPT_YORI", enumType.toFIXNameString());
        assertEquals( "A - VWAP through a morning session except YORI (an opening auction)",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum419BasisPxType.VWAP_AFTERNOON_EXCEPT_YORI;
        assertEquals( "B", enumType.toFIXIDString());
        assertEquals( "VWAP_AFTERNOON_EXCEPT_YORI", enumType.toFIXNameString());
        assertEquals( "B - VWAP through an afternoon session except YORI (an opening auction)",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum419BasisPxType.STRIKE;
        assertEquals( "C", enumType.toFIXIDString());
        assertEquals( "STRIKE", enumType.toFIXNameString());
        assertEquals( "C - Strike", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum419BasisPxType.OPEN;
        assertEquals( "D", enumType.toFIXIDString());
        assertEquals( "OPEN", enumType.toFIXNameString());
        assertEquals( "D - Open", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        /*
         *  Z, msg types
         */
        enumType = Enum419BasisPxType.OTHER;
        assertEquals( "Z", enumType.toFIXIDString());
        assertEquals( "OTHER", enumType.toFIXNameString());
        assertEquals( "Z - Others", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}