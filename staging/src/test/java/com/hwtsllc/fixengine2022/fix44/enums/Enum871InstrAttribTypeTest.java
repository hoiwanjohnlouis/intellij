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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  871
 *  InstrAttribType
 *  int
 *  <p></p>
 *  Code to represent the type of instrument attribute
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Flat (securities pay interest on a current basis but are traded without interest)
 *  <p>    2 - Zero coupon
 *  <p>    3 - Interest bearing (for Euro commercial paper when not issued at discount)
 *  <p>    4 - No periodic payments
 *  <p>    5 - Variable rate
 *  <p></p>
 *  <p>    6 - Less fee for put
 *  <p>    7 - Stepped coupon
 *  <p>    8 - Coupon period (if not semi-annual). Supply redemption date in the InstrAttribValue (872) field.
 *  <p>    9 - When [and if] issued
 *  <p>    10 - Original issue discount
 *  <p></p>
 *  <p>    11 - Callable, puttable
 *  <p>    12 - Escrowed to Maturity
 *  <p>    13 - Escrowed to redemption date - callable. Supply redemption date in the InstrAttribValue (872) field
 *  <p>    14 - Pre-refunded
 *  <p>    15 - In default
 *  <p></p>
 *  <p>    16 - Unrated
 *  <p>    17 - Taxable
 *  <p>    18 - Indexed
 *  <p>    19 - Subject To Alternative Minimum Tax
 *  <p>    20 - Original issue discount price. Supply price in the InstrAttribValue (872) field
 *  <p></p>
 *  <p>    21 - Callable below maturity value
 *  <p>    22 - Callable without notice by mail to holder unless registered
 *  <p></p>
 *  <p>    99 - Text. Supply the text of the attribute or disclaimer in the InstrAttribValue (872) field.
 *  <p></p>
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
class Enum871InstrAttribTypeTest {
    @Test
    void EnumTest() {
        Enum871InstrAttribType enumType;

        enumType = Enum871InstrAttribType.FLAT;
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "FLAT", enumType.toEnumNameString() );
        assertEquals( "1 - Flat (securities pay interest on a current basis but are traded without interest)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum871InstrAttribType.ZERO_COUPON;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "ZERO_COUPON", enumType.toEnumNameString() );
        assertEquals( "2 - Zero coupon", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum871InstrAttribType.INTEREST_BEARING;
        assertEquals( "3", enumType.toFIXIDString() );
        assertEquals( "INTEREST_BEARING", enumType.toEnumNameString() );
        assertEquals( "3 - Interest bearing (for Euro commercial paper when not issued at discount)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum871InstrAttribType.NO_PERIODIC_PAYMENTS;
        assertEquals( "4", enumType.toFIXIDString() );
        assertEquals( "NO_PERIODIC_PAYMENTS", enumType.toEnumNameString() );
        assertEquals( "4 - No periodic payments", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum871InstrAttribType.VARIABLE_RATE;
        assertEquals( "5", enumType.toFIXIDString() );
        assertEquals( "VARIABLE_RATE", enumType.toEnumNameString() );
        assertEquals( "5 - Variable rate", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum871InstrAttribType.LESS_FEE_FOR_PUT;
        assertEquals( "6", enumType.toFIXIDString() );
        assertEquals( "LESS_FEE_FOR_PUT", enumType.toEnumNameString() );
        assertEquals( "6 - Less fee for put", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum871InstrAttribType.STEPPED_COUPON;
        assertEquals( "7", enumType.toFIXIDString() );
        assertEquals( "STEPPED_COUPON", enumType.toEnumNameString() );
        assertEquals( "7 - Stepped coupon", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum871InstrAttribType.COUPON_PERIOD;
        assertEquals( "8", enumType.toFIXIDString() );
        assertEquals( "COUPON_PERIOD", enumType.toEnumNameString() );
        assertEquals( "8 - Coupon period (if not semi-annual). Supply redemption date in the InstrAttribValue (872) field", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum871InstrAttribType.WHEN_ISSUED;
        assertEquals( "9", enumType.toFIXIDString() );
        assertEquals( "WHEN_ISSUED", enumType.toEnumNameString() );
        assertEquals( "9 - When [and if] issued", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum871InstrAttribType.ORIGINAL_ISSUE_DISCOUNT;
        assertEquals( "10", enumType.toFIXIDString() );
        assertEquals( "ORIGINAL_ISSUE_DISCOUNT", enumType.toEnumNameString() );
        assertEquals( "10 - Original issue discount", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum871InstrAttribType.CALLABLE_PUTTABLE;
        assertEquals( "11", enumType.toFIXIDString() );
        assertEquals( "CALLABLE_PUTTABLE", enumType.toEnumNameString() );
        assertEquals( "11 - Callable, puttable", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum871InstrAttribType.ESCROWED_TO_MATURITY;
        assertEquals( "12", enumType.toFIXIDString() );
        assertEquals( "ESCROWED_TO_MATURITY", enumType.toEnumNameString() );
        assertEquals( "12 - Escrowed to Maturity", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum871InstrAttribType.ESCROWED_TO_REDEMPTION_DATE;
        assertEquals( "13", enumType.toFIXIDString() );
        assertEquals( "ESCROWED_TO_REDEMPTION_DATE", enumType.toEnumNameString() );
        assertEquals( "13 - Escrowed to redemption date - callable. Supply redemption date in the InstrAttribValue (872) field", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum871InstrAttribType.PRE_REFUNDED;
        assertEquals( "14", enumType.toFIXIDString() );
        assertEquals( "PRE_REFUNDED", enumType.toEnumNameString() );
        assertEquals( "14 - Pre-refunded", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum871InstrAttribType.IN_DEFAULT;
        assertEquals( "15", enumType.toFIXIDString() );
        assertEquals( "IN_DEFAULT", enumType.toEnumNameString() );
        assertEquals( "15 - In default", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum871InstrAttribType.UNRATED;
        assertEquals( "16", enumType.toFIXIDString() );
        assertEquals( "UNRATED", enumType.toEnumNameString() );
        assertEquals( "16 - Unrated", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum871InstrAttribType.TAXABLE;
        assertEquals( "17", enumType.toFIXIDString() );
        assertEquals( "TAXABLE", enumType.toEnumNameString() );
        assertEquals( "17 - Taxable", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum871InstrAttribType.INDEXED;
        assertEquals( "18", enumType.toFIXIDString() );
        assertEquals( "INDEXED", enumType.toEnumNameString() );
        assertEquals( "18 - Indexed", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum871InstrAttribType.SUBJECT_TO_AMT;
        assertEquals( "19", enumType.toFIXIDString() );
        assertEquals( "SUBJECT_TO_AMT", enumType.toEnumNameString() );
        assertEquals( "19 - Subject To Alternative Minimum Tax", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum871InstrAttribType.ORIGINAL_DISCOUNT_PRICE;
        assertEquals( "20", enumType.toFIXIDString() );
        assertEquals( "ORIGINAL_DISCOUNT_PRICE", enumType.toEnumNameString() );
        assertEquals( "20 - Original issue discount price. Supply price in the InstrAttribValue (872) field", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum871InstrAttribType.CALLABLE_BELOW_MATURITY_VALUE;
        assertEquals( "21", enumType.toFIXIDString() );
        assertEquals( "CALLABLE_BELOW_MATURITY_VALUE", enumType.toEnumNameString() );
        assertEquals( "21 - Callable below maturity value", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum871InstrAttribType.CALLABLE_WITHOUT_NOTICE;
        assertEquals( "22", enumType.toFIXIDString() );
        assertEquals( "CALLABLE_WITHOUT_NOTICE", enumType.toEnumNameString() );
        assertEquals( "22 - Callable without notice by mail to holder unless registered", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum871InstrAttribType.TEXT;
        assertEquals( "99", enumType.toFIXIDString() );
        assertEquals( "TEXT", enumType.toEnumNameString() );
        assertEquals( "99 - Text. Supply the text of the attribute or disclaimer in the InstrAttribValue (872) field",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}