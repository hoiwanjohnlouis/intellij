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

import com.hwtsllc.fixengine2022.datatypes.MyEnumProduct;
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
    Tag462EnuUnderlyingProduct tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (MyEnumProduct oneEnum : MyEnumProduct.values()) {
            tagData = new Tag462EnuUnderlyingProduct(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (MyEnumProduct oneEnum : MyEnumProduct.values()) {
            tagData = new Tag462EnuUnderlyingProduct(oneEnum);
            assertEquals( "FIX462_ENU_UNDERLYING_PRODUCT", tagData.toEnumLabelString());
            assertEquals( "462", tagData.toEnumIDString());
            assertEquals( "UNDERLYING_PRODUCT", tagData.toEnumNameString());
            assertEquals( "UnderlyingProduct", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         * 0-13 msg types
         */
        tagData = new Tag462EnuUnderlyingProduct(MyEnumProduct.AGENCY);
        assertEquals( MyEnumProduct.AGENCY.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag462EnuUnderlyingProduct(MyEnumProduct.COMMODITY);
        assertEquals( MyEnumProduct.COMMODITY.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag462EnuUnderlyingProduct(MyEnumProduct.CORPORATE);
        assertEquals( MyEnumProduct.CORPORATE.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag462EnuUnderlyingProduct(MyEnumProduct.CURRENCY);
        assertEquals( MyEnumProduct.CURRENCY.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag462EnuUnderlyingProduct(MyEnumProduct.EQUITY);
        assertEquals( MyEnumProduct.EQUITY.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag462EnuUnderlyingProduct(MyEnumProduct.GOVERNMENT);
        assertEquals( MyEnumProduct.GOVERNMENT.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag462EnuUnderlyingProduct(MyEnumProduct.INDEX);
        assertEquals( MyEnumProduct.INDEX.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag462EnuUnderlyingProduct(MyEnumProduct.LOAN);
        assertEquals( MyEnumProduct.LOAN.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag462EnuUnderlyingProduct(MyEnumProduct.MONEY_MARKET);
        assertEquals( MyEnumProduct.MONEY_MARKET.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag462EnuUnderlyingProduct(MyEnumProduct.MORTGAGE);
        assertEquals( MyEnumProduct.MORTGAGE.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag462EnuUnderlyingProduct(MyEnumProduct.MUNICIPAL);
        assertEquals( MyEnumProduct.MUNICIPAL.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag462EnuUnderlyingProduct(MyEnumProduct.OTHER);
        assertEquals( MyEnumProduct.OTHER.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag462EnuUnderlyingProduct(MyEnumProduct.FINANCING);
        assertEquals( MyEnumProduct.FINANCING.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        // loop around the ENUM and process
        for (MyEnumProduct oneEnum : MyEnumProduct.values()) {
            tagData = new Tag462EnuUnderlyingProduct(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (MyEnumProduct oneEnum : MyEnumProduct.values()) {
            tagData = new Tag462EnuUnderlyingProduct(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for (MyEnumProduct oneEnum : MyEnumProduct.values()) {
            tagData = new Tag462EnuUnderlyingProduct(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (MyEnumProduct oneEnum : MyEnumProduct.values()) {
            tagData = new Tag462EnuUnderlyingProduct(oneEnum);
            assertEquals( "Tag462EnuUnderlyingProduct\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}