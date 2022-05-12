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

        /**
         *  2-9, A-D, Z msg types
         */

        /**
         *  2-9, msg types
         */
        enumType = Enum419BasisPxType.CLOSING_PRICE_MORNING;
        assertEquals( "2", enumType.getID());
        assertEquals( "CLOSING_PRICE_MORNING", enumType.getName());
        assertEquals( "2 - Closing price at morning session", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum419BasisPxType.CLOSING_PRICE;
        assertEquals( "3", enumType.getID());
        assertEquals( "CLOSING_PRICE", enumType.getName());
        assertEquals( "3 - Closing price", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum419BasisPxType.CURRENT_PRICE;
        assertEquals( "4", enumType.getID());
        assertEquals( "CURRENT_PRICE", enumType.getName());
        assertEquals( "4 - Current price", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum419BasisPxType.SQ;
        assertEquals( "5", enumType.getID());
        assertEquals( "SQ", enumType.getName());
        assertEquals( "5 - SQ", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum419BasisPxType.VWAP_DAY;
        assertEquals( "6", enumType.getID());
        assertEquals( "VWAP_DAY", enumType.getName());
        assertEquals( "6 - VWAP through a day", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum419BasisPxType.VWAP_MORNING;
        assertEquals( "7", enumType.getID());
        assertEquals( "VWAP_MORNING", enumType.getName());
        assertEquals( "7 - VWAP through a morning session", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum419BasisPxType.VWAP_AFTERNOON;
        assertEquals( "8", enumType.getID());
        assertEquals( "VWAP_AFTERNOON", enumType.getName());
        assertEquals( "8 - VWAP through an afternoon session", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum419BasisPxType.VWAP_DAY_EXCEPT_YORI;
        assertEquals( "9", enumType.getID());
        assertEquals( "VWAP_DAY_EXCEPT_YORI", enumType.getName());
        assertEquals( "9 - VWAP through a day except YORI (an opening auction)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        /**
         *  A-D, msg types
         */
        enumType = Enum419BasisPxType.VWAP_MORNING_EXCEPT_YORI;
        assertEquals( "A", enumType.getID());
        assertEquals( "VWAP_MORNING_EXCEPT_YORI", enumType.getName());
        assertEquals( "A - VWAP through a morning session except YORI (an opening auction)",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum419BasisPxType.VWAP_AFTERNOON_EXCEPT_YORI;
        assertEquals( "B", enumType.getID());
        assertEquals( "VWAP_AFTERNOON_EXCEPT_YORI", enumType.getName());
        assertEquals( "B - VWAP through an afternoon session except YORI (an opening auction)",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum419BasisPxType.STRIKE;
        assertEquals( "C", enumType.getID());
        assertEquals( "STRIKE", enumType.getName());
        assertEquals( "C - Strike", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum419BasisPxType.OPEN;
        assertEquals( "D", enumType.getID());
        assertEquals( "OPEN", enumType.getName());
        assertEquals( "D - Open", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        /**
         *  Z, msg types
         */
        enumType = Enum419BasisPxType.OTHER;
        assertEquals( "Z", enumType.getID());
        assertEquals( "OTHER", enumType.getName());
        assertEquals( "Z - Others", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}