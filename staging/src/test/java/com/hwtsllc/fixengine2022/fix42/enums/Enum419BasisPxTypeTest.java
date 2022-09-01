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
        assertEquals( "2", enumType.toEnumIDString());
        assertEquals( "CLOSING_PRICE_MORNING", enumType.toEnumNameString());
        assertEquals( "2 - Closing price at morning session", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum419BasisPxType.CLOSING_PRICE;
        assertEquals( "3", enumType.toEnumIDString());
        assertEquals( "CLOSING_PRICE", enumType.toEnumNameString());
        assertEquals( "3 - Closing price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum419BasisPxType.CURRENT_PRICE;
        assertEquals( "4", enumType.toEnumIDString());
        assertEquals( "CURRENT_PRICE", enumType.toEnumNameString());
        assertEquals( "4 - Current price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum419BasisPxType.SQ;
        assertEquals( "5", enumType.toEnumIDString());
        assertEquals( "SQ", enumType.toEnumNameString());
        assertEquals( "5 - SQ", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum419BasisPxType.VWAP_DAY;
        assertEquals( "6", enumType.toEnumIDString());
        assertEquals( "VWAP_DAY", enumType.toEnumNameString());
        assertEquals( "6 - VWAP through a day", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum419BasisPxType.VWAP_MORNING;
        assertEquals( "7", enumType.toEnumIDString());
        assertEquals( "VWAP_MORNING", enumType.toEnumNameString());
        assertEquals( "7 - VWAP through a morning session", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum419BasisPxType.VWAP_AFTERNOON;
        assertEquals( "8", enumType.toEnumIDString());
        assertEquals( "VWAP_AFTERNOON", enumType.toEnumNameString());
        assertEquals( "8 - VWAP through an afternoon session", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum419BasisPxType.VWAP_DAY_EXCEPT_YORI;
        assertEquals( "9", enumType.toEnumIDString());
        assertEquals( "VWAP_DAY_EXCEPT_YORI", enumType.toEnumNameString());
        assertEquals( "9 - VWAP through a day except YORI (an opening auction)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         *  A-D, msg types
         */
        enumType = Enum419BasisPxType.VWAP_MORNING_EXCEPT_YORI;
        assertEquals( "A", enumType.toEnumIDString());
        assertEquals( "VWAP_MORNING_EXCEPT_YORI", enumType.toEnumNameString());
        assertEquals( "A - VWAP through a morning session except YORI (an opening auction)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum419BasisPxType.VWAP_AFTERNOON_EXCEPT_YORI;
        assertEquals( "B", enumType.toEnumIDString());
        assertEquals( "VWAP_AFTERNOON_EXCEPT_YORI", enumType.toEnumNameString());
        assertEquals( "B - VWAP through an afternoon session except YORI (an opening auction)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum419BasisPxType.STRIKE;
        assertEquals( "C", enumType.toEnumIDString());
        assertEquals( "STRIKE", enumType.toEnumNameString());
        assertEquals( "C - Strike", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum419BasisPxType.OPEN;
        assertEquals( "D", enumType.toEnumIDString());
        assertEquals( "OPEN", enumType.toEnumNameString());
        assertEquals( "D - Open", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         *  Z, msg types
         */
        enumType = Enum419BasisPxType.OTHER;
        assertEquals( "Z", enumType.toEnumIDString());
        assertEquals( "OTHER", enumType.toEnumNameString());
        assertEquals( "Z - Others", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}