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
 *  Code to represent the type of instrument attribute
 *  Valid values:
 *      1 - Flat (securities pay interest on a current basis but are traded without interest)
 *      2 - Zero coupon
 *      3 - Interest bearing (for Euro commercial paper when not issued at discount)
 *      4 - No periodic payments
 *      5 - Variable rate
 *
 *      6 - Less fee for put
 *      7 - Stepped coupon
 *      8 - Coupon period (if not semi-annual). Supply redemption date in the InstrAttribValue (872) field.
 *      9 - When [and if] issued
 *      10 - Original issue discount
 *
 *      11 - Callable, puttable
 *      12 - Escrowed to Maturity
 *      13 - Escrowed to redemption date - callable. Supply redemption date in the InstrAttribValue (872) field
 *      14 - Pre-refunded
 *      15 - In default
 *
 *      16 - Unrated
 *      17 - Taxable
 *      18 - Indexed
 *      19 - Subject To Alternative Minimum Tax
 *      20 - Original issue discount price. Supply price in the InstrAttribValue (872) field
 *
 *      21 - Callable below maturity value
 *      22 - Callable without notice by mail to holder unless registered
 *
 *      99 - Text. Supply the text of the attribute or disclaimer in the InstrAttribValue (872) field.
 *
 *      or any value conforming to the data type Reserved100Plus
 */
class Enum871InstrAttribTypeTest {
    @Test
    void EnumTest() {
        Enum871InstrAttribType enumType;

        enumType = Enum871InstrAttribType.FLAT;
        assertEquals( "1", enumType.getID() );
        assertEquals( "FLAT", enumType.getName() );
        assertEquals( "1 - Flat (securities pay interest on a current basis but are traded without interest)",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum871InstrAttribType.ZERO_COUPON;
        assertEquals( "2", enumType.getID() );
        assertEquals( "ZERO_COUPON", enumType.getName() );
        assertEquals( "2 - Zero coupon", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum871InstrAttribType.INTEREST_BEARING;
        assertEquals( "3", enumType.getID() );
        assertEquals( "INTEREST_BEARING", enumType.getName() );
        assertEquals( "3 - Interest bearing (for Euro commercial paper when not issued at discount)",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum871InstrAttribType.NO_PERIODIC_PAYMENTS;
        assertEquals( "4", enumType.getID() );
        assertEquals( "NO_PERIODIC_PAYMENTS", enumType.getName() );
        assertEquals( "4 - No periodic payments", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum871InstrAttribType.VARIABLE_RATE;
        assertEquals( "5", enumType.getID() );
        assertEquals( "VARIABLE_RATE", enumType.getName() );
        assertEquals( "5 - Variable rate", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum871InstrAttribType.LESS_FEE_FOR_PUT;
        assertEquals( "6", enumType.getID() );
        assertEquals( "LESS_FEE_FOR_PUT", enumType.getName() );
        assertEquals( "6 - Less fee for put", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum871InstrAttribType.STEPPED_COUPON;
        assertEquals( "7", enumType.getID() );
        assertEquals( "STEPPED_COUPON", enumType.getName() );
        assertEquals( "7 - Stepped coupon", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum871InstrAttribType.COUPON_PERIOD;
        assertEquals( "8", enumType.getID() );
        assertEquals( "COUPON_PERIOD", enumType.getName() );
        assertEquals( "8 - Coupon period (if not semi-annual). Supply redemption date in the InstrAttribValue (872) field", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum871InstrAttribType.WHEN_ISSUED;
        assertEquals( "9", enumType.getID() );
        assertEquals( "WHEN_ISSUED", enumType.getName() );
        assertEquals( "9 - When [and if] issued", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum871InstrAttribType.ORIGINAL_ISSUE_DISCOUNT;
        assertEquals( "10", enumType.getID() );
        assertEquals( "ORIGINAL_ISSUE_DISCOUNT", enumType.getName() );
        assertEquals( "10 - Original issue discount", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum871InstrAttribType.CALLABLE_PUTTABLE;
        assertEquals( "11", enumType.getID() );
        assertEquals( "CALLABLE_PUTTABLE", enumType.getName() );
        assertEquals( "11 - Callable, puttable", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum871InstrAttribType.ESCROWED_TO_MATURITY;
        assertEquals( "12", enumType.getID() );
        assertEquals( "ESCROWED_TO_MATURITY", enumType.getName() );
        assertEquals( "12 - Escrowed to Maturity", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum871InstrAttribType.ESCROWED_TO_REDEMPTION_DATE;
        assertEquals( "13", enumType.getID() );
        assertEquals( "ESCROWED_TO_REDEMPTION_DATE", enumType.getName() );
        assertEquals( "13 - Escrowed to redemption date - callable. Supply redemption date in the InstrAttribValue (872) field", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum871InstrAttribType.PRE_REFUNDED;
        assertEquals( "14", enumType.getID() );
        assertEquals( "PRE_REFUNDED", enumType.getName() );
        assertEquals( "14 - Pre-refunded", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum871InstrAttribType.IN_DEFAULT;
        assertEquals( "15", enumType.getID() );
        assertEquals( "IN_DEFAULT", enumType.getName() );
        assertEquals( "15 - In default", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum871InstrAttribType.UNRATED;
        assertEquals( "16", enumType.getID() );
        assertEquals( "UNRATED", enumType.getName() );
        assertEquals( "16 - Unrated", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum871InstrAttribType.TAXABLE;
        assertEquals( "17", enumType.getID() );
        assertEquals( "TAXABLE", enumType.getName() );
        assertEquals( "17 - Taxable", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum871InstrAttribType.INDEXED;
        assertEquals( "18", enumType.getID() );
        assertEquals( "INDEXED", enumType.getName() );
        assertEquals( "18 - Indexed", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum871InstrAttribType.SUBJECT_TO_AMT;
        assertEquals( "19", enumType.getID() );
        assertEquals( "SUBJECT_TO_AMT", enumType.getName() );
        assertEquals( "19 - Subject To Alternative Minimum Tax", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum871InstrAttribType.ORIGINAL_DISCOUNT_PRICE;
        assertEquals( "20", enumType.getID() );
        assertEquals( "ORIGINAL_DISCOUNT_PRICE", enumType.getName() );
        assertEquals( "20 - Original issue discount price. Supply price in the InstrAttribValue (872) field", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum871InstrAttribType.CALLABLE_BELOW_MATURITY_VALUE;
        assertEquals( "21", enumType.getID() );
        assertEquals( "CALLABLE_BELOW_MATURITY_VALUE", enumType.getName() );
        assertEquals( "21 - Callable below maturity value", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum871InstrAttribType.CALLABLE_WITHOUT_NOTICE;
        assertEquals( "22", enumType.getID() );
        assertEquals( "CALLABLE_WITHOUT_NOTICE", enumType.getName() );
        assertEquals( "22 - Callable without notice by mail to holder unless registered", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum871InstrAttribType.TEXT;
        assertEquals( "99", enumType.getID() );
        assertEquals( "TEXT", enumType.getName() );
        assertEquals( "99 - Text. Supply the text of the attribute or disclaimer in the InstrAttribValue (872) field",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}