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

class Tag607EnuLegProductTest {
    Tag607EnuLegProduct tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (MyEnumProduct oneEnum : MyEnumProduct.values()) {
            tagData = new Tag607EnuLegProduct(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (MyEnumProduct oneEnum : MyEnumProduct.values()) {
            tagData = new Tag607EnuLegProduct(oneEnum);
            assertEquals( "FIX607_ENU_LEG_PRODUCT", tagData.toEnumLabelString());
            assertEquals( "607", tagData.toEnumIDString());
            assertEquals( "LEG_PRODUCT", tagData.toEnumNameString());
            assertEquals( "LegProduct", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (MyEnumProduct oneEnum : MyEnumProduct.values()) {
            tagData = new Tag607EnuLegProduct(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  607 (same as 460, 462, 607,)
         *  LegProduct
         *  int
         *  <p>     1 - AGENCY
         *  <p>     2 - COMMODITY
         *  <p>     3 - CORPORATE
         *  <p>     4 - CURRENCY
         *  <p>     5 - EQUITY
         */
        tagData = new Tag607EnuLegProduct(MyEnumProduct.AGENCY);
        assertEquals( "1", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag607EnuLegProduct(MyEnumProduct.COMMODITY);
        assertEquals( "2", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag607EnuLegProduct(MyEnumProduct.CORPORATE);
        assertEquals( "3", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag607EnuLegProduct(MyEnumProduct.CURRENCY);
        assertEquals( "4", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag607EnuLegProduct(MyEnumProduct.EQUITY);
        assertEquals( "5", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>     6 - GOVERNMENT
         *  <p>     7 - INDEX
         *  <p>     8 - LOAN
         *  <p>     9 - MONEYMARKET
         *  <p>     10 - MORTGAGE
         */
        tagData = new Tag607EnuLegProduct(MyEnumProduct.GOVERNMENT);
        assertEquals( "6", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag607EnuLegProduct(MyEnumProduct.INDEX);
        assertEquals( "7", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag607EnuLegProduct(MyEnumProduct.LOAN);
        assertEquals( "8", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag607EnuLegProduct(MyEnumProduct.MONEY_MARKET);
        assertEquals( "9", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag607EnuLegProduct(MyEnumProduct.MORTGAGE);
        assertEquals( "10", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>     11 - MUNICIPAL
         *  <p>     12 - OTHER
         *  <p>     13 - FINANCING
         */
        tagData = new Tag607EnuLegProduct(MyEnumProduct.MUNICIPAL);
        assertEquals( "11", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag607EnuLegProduct(MyEnumProduct.OTHER);
        assertEquals( "12", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag607EnuLegProduct(MyEnumProduct.FINANCING);
        assertEquals( "13", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );


        // loop around the ENUM and process
        for (MyEnumProduct oneEnum : MyEnumProduct.values()) {
            tagData = new Tag607EnuLegProduct(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (MyEnumProduct oneEnum : MyEnumProduct.values()) {
            tagData = new Tag607EnuLegProduct(oneEnum);
            assertEquals( "Tag607EnuLegProduct\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
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