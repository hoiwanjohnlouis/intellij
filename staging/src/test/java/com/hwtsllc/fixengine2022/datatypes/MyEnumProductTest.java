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

package com.hwtsllc.fixengine2022.datatypes;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  460 (same as 460, 462, 607,)
 *  Product
 *  int
 *  <p>
 *  Indicates the type of product the security is associated with.
 *  <p>
 *  See also the CFICode (461) and SecurityType (167)
 *  fields.
 *  <p></p>
 *  462
 *  UnderlyingProduct
 *  int
 *  <p>
 *  Underlying security’s Product.
 *  <p>
 *  See Product(460) field
 *  <p></p>
 *  607
 *  LegProduct
 *  int
 *  <p>
 *  Multileg instrument's individual  security’s Product.
 *  <p>
 *  See Product (460) field for description
 *  <p></p>
 *  Valid values:
 *  <p>     1 - AGENCY
 *  <p>     2 - COMMODITY
 *  <p>     3 - CORPORATE
 *  <p>     4 - CURRENCY
 *  <p>     5 - EQUITY
 *  <p></p>
 *  <p>     6 - GOVERNMENT
 *  <p>     7 - INDEX
 *  <p>     8 - LOAN
 *  <p>     9 - MONEYMARKET
 *  <p>     10 - MORTGAGE
 *  <p></p>
 *  <p>     11 - MUNICIPAL
 *  <p>     12 - OTHER
 *  <p>     13 - FINANCING
 */
class MyEnumProductTest {
    @Test
    void Enum0460Test() {
        MyEnumProduct enumType;

        /**
         * 1-13 msg types
         */
        enumType = MyEnumProduct.AGENCY;
        assertEquals( "1", enumType.getID());
        assertEquals( "AGENCY", enumType.getName());
        assertEquals( "1 - AGENCY", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumProduct.COMMODITY;
        assertEquals( "2", enumType.getID());
        assertEquals( "COMMODITY", enumType.getName());
        assertEquals( "2 - COMMODITY", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumProduct.CORPORATE;
        assertEquals( "3", enumType.getID());
        assertEquals( "CORPORATE", enumType.getName());
        assertEquals( "3 - CORPORATE", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumProduct.CURRENCY;
        assertEquals( "4", enumType.getID());
        assertEquals( "CURRENCY", enumType.getName());
        assertEquals( "4 - CURRENCY", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumProduct.EQUITY;
        assertEquals( "5", enumType.getID());
        assertEquals( "EQUITY", enumType.getName());
        assertEquals( "5 - EQUITY", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumProduct.GOVERNMENT;
        assertEquals( "6", enumType.getID());
        assertEquals( "GOVERNMENT", enumType.getName());
        assertEquals( "6 - GOVERNMENT", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumProduct.INDEX;
        assertEquals( "7", enumType.getID());
        assertEquals( "INDEX", enumType.getName());
        assertEquals( "7 - INDEX", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumProduct.LOAN;
        assertEquals( "8", enumType.getID());
        assertEquals( "LOAN", enumType.getName());
        assertEquals( "8 - LOAN", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumProduct.MONEY_MARKET;
        assertEquals( "9", enumType.getID());
        assertEquals( "MONEYMARKET", enumType.getName());
        assertEquals( "9 - MONEYMARKET", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumProduct.MORTGAGE;
        assertEquals( "10", enumType.getID());
        assertEquals( "MORTGAGE", enumType.getName());
        assertEquals( "10 - MORTGAGE", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumProduct.MUNICIPAL;
        assertEquals( "11", enumType.getID());
        assertEquals( "MUNICIPAL", enumType.getName());
        assertEquals( "11 - MUNICIPAL", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumProduct.OTHER;
        assertEquals( "12", enumType.getID());
        assertEquals( "OTHER", enumType.getName());
        assertEquals( "12 - OTHER", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumProduct.FINANCING;
        assertEquals( "13", enumType.getID());
        assertEquals( "FINANCING", enumType.getName());
        assertEquals( "13 - FINANCING", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}