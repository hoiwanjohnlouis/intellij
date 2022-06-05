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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.MyEnumProduct;
import com.hwtsllc.fixengine2022.fix42.enums.Enum216RoutingType;
import com.hwtsllc.fixengine2022.fix42.tags.Tag462EnuUnderlyingProduct;
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
class Tag462EnuUnderlyingProductTest {
    @Test
    void FIX0462Test() {
        FIX43 fixData = FIX43.FIX462_ENU_UNDERLYING_PRODUCT;
        assertEquals( "462", fixData.toFIXIDString());
        assertEquals( "UNDERLYING_PRODUCT", fixData.toFIXNameString());
        assertEquals( "UnderlyingProduct", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0462Test() {
        Tag462EnuUnderlyingProduct tagData;

        /*
         * 0-13 msg types
         */
        tagData = new Tag462EnuUnderlyingProduct(MyEnumProduct.AGENCY);
        assertEquals( MyEnumProduct.AGENCY.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag462EnuUnderlyingProduct(MyEnumProduct.COMMODITY);
        assertEquals( MyEnumProduct.COMMODITY.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag462EnuUnderlyingProduct(MyEnumProduct.CORPORATE);
        assertEquals( MyEnumProduct.CORPORATE.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag462EnuUnderlyingProduct(MyEnumProduct.CURRENCY);
        assertEquals( MyEnumProduct.CURRENCY.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag462EnuUnderlyingProduct(MyEnumProduct.EQUITY);
        assertEquals( MyEnumProduct.EQUITY.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag462EnuUnderlyingProduct(MyEnumProduct.GOVERNMENT);
        assertEquals( MyEnumProduct.GOVERNMENT.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag462EnuUnderlyingProduct(MyEnumProduct.INDEX);
        assertEquals( MyEnumProduct.INDEX.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag462EnuUnderlyingProduct(MyEnumProduct.LOAN);
        assertEquals( MyEnumProduct.LOAN.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag462EnuUnderlyingProduct(MyEnumProduct.MONEY_MARKET);
        assertEquals( MyEnumProduct.MONEY_MARKET.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag462EnuUnderlyingProduct(MyEnumProduct.MORTGAGE);
        assertEquals( MyEnumProduct.MORTGAGE.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag462EnuUnderlyingProduct(MyEnumProduct.MUNICIPAL);
        assertEquals( MyEnumProduct.MUNICIPAL.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag462EnuUnderlyingProduct(MyEnumProduct.OTHER);
        assertEquals( MyEnumProduct.OTHER.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag462EnuUnderlyingProduct(MyEnumProduct.FINANCING);
        assertEquals( MyEnumProduct.FINANCING.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag462EnuUnderlyingProduct tagData;

        // loop around the ENUM and process
        for ( Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag462EnuUnderlyingProduct(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag462EnuUnderlyingProduct tagData;

        // loop around the ENUM and process
        for (Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag462EnuUnderlyingProduct(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag462EnuUnderlyingProduct tagData;

        // loop around the ENUM and process
        for (Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag462EnuUnderlyingProduct(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag462EnuUnderlyingProduct tagData;

        // loop around the ENUM and process
        for (Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag462EnuUnderlyingProduct(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag462EnuUnderlyingProduct tagData;

        // loop around the ENUM and process
        for (Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag462EnuUnderlyingProduct(oneEnum);
            assertEquals( "Tag462EnuUnderlyingProduct\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}