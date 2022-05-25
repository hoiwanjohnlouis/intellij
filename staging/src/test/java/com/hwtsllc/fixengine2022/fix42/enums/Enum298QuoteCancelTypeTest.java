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
 *  298
 *  QuoteCancelType
 *  int
 *  <p>
 *  Identifies the type of  quote cancel.
 *  <p></p>
 *  Valid values:
 *  <p>    1-5 msg types
 *  <p>    "1 - Cancel for Symbol(s)"
 *  <p>    "2 - Cancel for Security Type(s)"
 *  <p>    "3 - Cancel for Underlying Symbol"
 *  <p>    "4 - Cancel All Quotes"
 *  <p>    "5 - Cancel quote specified in QuoteID"
 */
class Enum298QuoteCancelTypeTest {
    @Test
    void Enum0298Test() {
        Enum298QuoteCancelType enumType;

        /*
         * 1-5 msg types
         */
        enumType = Enum298QuoteCancelType.CANCEL_FOR_SYMBOL;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "CANCEL_FOR_SYMBOL", enumType.toFIXNameString());
        assertEquals( "1 - Cancel for Symbol(s)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum298QuoteCancelType.CANCEL_FOR_SECURITY_TYPE;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "CANCEL_FOR_SECURITY_TYPE", enumType.toFIXNameString());
        assertEquals( "2 - Cancel for Security Type(s)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum298QuoteCancelType.CANCEL_FOR_UNDERLYING_SYMBOL;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "CANCEL_FOR_UNDERLYING_SYMBOL", enumType.toFIXNameString());
        assertEquals( "3 - Cancel for Underlying Symbol", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum298QuoteCancelType.CANCEL_ALL_QUOTES;
        assertEquals( "4", enumType.toFIXIDString());
        assertEquals( "CANCEL_ALL_QUOTES", enumType.toFIXNameString());
        assertEquals( "4 - Cancel All Quotes", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum298QuoteCancelType.CANCEL_QUOTEID_QUOTE;
        assertEquals( "5", enumType.toFIXIDString());
        assertEquals( "CANCEL_QUOTEID_QUOTE", enumType.toFIXNameString());
        assertEquals( "5 - Cancel quote specified in QuoteID", enumType.toFIXDescriptionString());
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