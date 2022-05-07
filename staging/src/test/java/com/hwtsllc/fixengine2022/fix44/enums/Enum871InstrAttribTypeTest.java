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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
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
 assertEquals("", enumType.getDescription());
 assertEquals("", enumType.getDescription());
 assertEquals("", enumType.getDescription());
 assertEquals("", enumType.getDescription());
 assertEquals("", enumType.getDescription());
 *      6 - Less fee for put
 *      7 - Stepped coupon
 *      8 - Coupon period (if not semi-annual). Supply redemption date in the InstrAttribValue (872) field.
 *      9 - When [and if] issued
 *      10 - Original issue discount
 assertEquals("", enumType.getDescription());
 assertEquals("", enumType.getDescription());
 assertEquals("", enumType.getDescription());
 assertEquals("", enumType.getDescription());
 assertEquals("", enumType.getDescription());
 *      11 - Callable, puttable
 *      12 - Escrowed to Maturity
 *      13 - Escrowed to redemption date - callable. Supply redemption date in the InstrAttribValue (872) field
 *      14 - Pre-refunded
 *      15 - In default
 assertEquals("", enumType.getDescription());
 assertEquals("", enumType.getDescription());
 assertEquals("", enumType.getDescription());
 assertEquals("", enumType.getDescription());
 assertEquals("", enumType.getDescription());
 *      16 - Unrated
 *      17 - Taxable
 *      18 - Indexed
 *      19 - Subject To Alternative Minimum Tax
 *      20 - Original issue discount price. Supply price in the InstrAttribValue (872) field
 assertEquals("", enumType.getDescription());
 assertEquals("", enumType.getDescription());
 assertEquals("", enumType.getDescription());
 assertEquals("", enumType.getDescription());
 assertEquals("", enumType.getDescription());
 *      21 - Callable below maturity value
 *      22 - Callable without notice by mail to holder unless registered
 assertEquals("", enumType.getDescription());
 assertEquals("", enumType.getDescription());
 *      99 - Text. Supply the text of the attribute or disclaimer in the InstrAttribValue (872) field.
 assertEquals("", enumType.getDescription());
 *
 *      or any value conforming to the data type Reserved100Plus
 */
class Enum871InstrAttribTypeTest {
    @Test
    void EnumTest() {
        Enum871InstrAttribType enumType;

        enumType = Enum871InstrAttribType.FLAT;
        enumType = Enum871InstrAttribType.ZERO_COUPON;
        enumType = Enum871InstrAttribType.INTEREST_BEARING;
        enumType = Enum871InstrAttribType.NO_PERIODIC_PAYMENTS;
        enumType = Enum871InstrAttribType.VARIABLE_RATE;

        enumType = Enum871InstrAttribType.LESS_FEE_FOR_PUT;
        enumType = Enum871InstrAttribType.STEPPED_COUPON;
        enumType = Enum871InstrAttribType.COUPON_PERIOD;
        enumType = Enum871InstrAttribType.WHEN_ISSUED;
        enumType = Enum871InstrAttribType.ORIGINAL_ISSUE_DISCOUNT;

        enumType = Enum871InstrAttribType.CALLABLE_PUTTABLE;
        enumType = Enum871InstrAttribType.ESCROWED_TO_MATURITY;
        enumType = Enum871InstrAttribType.ESCROWED_TO_REDEMPTION_DATE;
        enumType = Enum871InstrAttribType.PRE_REFUNDED;
        enumType = Enum871InstrAttribType.IN_DEFAULT;

        enumType = Enum871InstrAttribType.UNRATED;
        enumType = Enum871InstrAttribType.TAXABLE;
        enumType = Enum871InstrAttribType.INDEXED;
        enumType = Enum871InstrAttribType.SUBJECT_TO_AMT;
        enumType = Enum871InstrAttribType.ORIGINAL_DISCOUNT_PRICE;

        enumType = Enum871InstrAttribType.CALLABLE_BELOW_MATURITY_VALUE;
        enumType = Enum871InstrAttribType.CALLABLE_WITHOUT_NOTICE;

        enumType = Enum871InstrAttribType.TEXT;



        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}