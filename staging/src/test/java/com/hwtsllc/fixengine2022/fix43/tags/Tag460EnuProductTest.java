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

class Tag460EnuProductTest {
    Tag460EnuProduct tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (MyEnumProduct oneEnum : MyEnumProduct.values()) {
            tagData = new Tag460EnuProduct(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (MyEnumProduct oneEnum : MyEnumProduct.values()) {
            tagData = new Tag460EnuProduct(oneEnum);
            assertEquals( "FIX460_ENU_PRODUCT", tagData.toFIXLabelString());
            assertEquals( "460", tagData.toFIXIDString());
            assertEquals( "PRODUCT", tagData.toFIXNameString());
            assertEquals( "Product", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (MyEnumProduct oneEnum : MyEnumProduct.values()) {
            tagData = new Tag460EnuProduct(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  460 (same as 460, 462, 607,)
         *  Product
         *  int
         *  462 (same as 460, 462, 607,)
         *  UnderlyingProduct
         *  int
         *  607 (same as 460, 462, 607,)
         *  LegProduct
         *  int
         *  <p>     1 - AGENCY
         *  <p>     2 - COMMODITY
         *  <p>     3 - CORPORATE
         *  <p>     4 - CURRENCY
         *  <p>     5 - EQUITY
         */
        tagData = new Tag460EnuProduct(MyEnumProduct.AGENCY);
        assertEquals( "1", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag460EnuProduct(MyEnumProduct.COMMODITY);
        assertEquals( "2", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag460EnuProduct(MyEnumProduct.CORPORATE);
        assertEquals( "3", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag460EnuProduct(MyEnumProduct.CURRENCY);
        assertEquals( "4", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag460EnuProduct(MyEnumProduct.EQUITY);
        assertEquals( "5", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>     6 - GOVERNMENT
         *  <p>     7 - INDEX
         *  <p>     8 - LOAN
         *  <p>     9 - MONEYMARKET
         *  <p>     10 - MORTGAGE
         */
        tagData = new Tag460EnuProduct(MyEnumProduct.GOVERNMENT);
        assertEquals( "6", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag460EnuProduct(MyEnumProduct.INDEX);
        assertEquals( "7", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag460EnuProduct(MyEnumProduct.LOAN);
        assertEquals( "8", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag460EnuProduct(MyEnumProduct.MONEY_MARKET);
        assertEquals( "9", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag460EnuProduct(MyEnumProduct.MORTGAGE);
        assertEquals( "10", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>     11 - MUNICIPAL
         *  <p>     12 - OTHER
         *  <p>     13 - FINANCING
         */
        tagData = new Tag460EnuProduct(MyEnumProduct.MUNICIPAL);
        assertEquals( "11", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag460EnuProduct(MyEnumProduct.OTHER);
        assertEquals( "12", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag460EnuProduct(MyEnumProduct.FINANCING);
        assertEquals( "13", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );


        // loop around the ENUM and process
        for (MyEnumProduct oneEnum : MyEnumProduct.values()) {
            tagData = new Tag460EnuProduct(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (MyEnumProduct oneEnum : MyEnumProduct.values()) {
            tagData = new Tag460EnuProduct(oneEnum);
            assertEquals( "Tag460EnuProduct\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}