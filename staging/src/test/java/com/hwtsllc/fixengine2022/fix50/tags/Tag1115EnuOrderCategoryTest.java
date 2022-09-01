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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.fix50.enums.Enum1115OrderCategory;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag1115EnuOrderCategoryTest {
    Tag1115EnuOrderCategory tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum1115OrderCategory oneEnum : Enum1115OrderCategory.values()) {
            tagData = new Tag1115EnuOrderCategory(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum1115OrderCategory oneEnum : Enum1115OrderCategory.values()) {
            tagData = new Tag1115EnuOrderCategory(oneEnum);
            assertEquals( "FIX1115_ENU_ORDER_CATEGORY", tagData.toFIXLabelString());
            assertEquals( "1115", tagData.toFIXIDString());
            assertEquals( "ORDER_CATEGORY", tagData.toFIXNameString());
            assertEquals( "OrderCategory", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum1115OrderCategory oneEnum : Enum1115OrderCategory.values()) {
            tagData = new Tag1115EnuOrderCategory(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  1115
         *  OrderCategory
         *  char
         *  <p>    1 - Order
         *  <p>    2 - Quote
         *  <p>    3 - Privately Negotiated Trade
         *  <p>    4 - Multileg order
         *  <p>    5 - Linked order
         */
        tagData = new Tag1115EnuOrderCategory( Enum1115OrderCategory.ORDER );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1115EnuOrderCategory( Enum1115OrderCategory.QUOTE );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1115EnuOrderCategory( Enum1115OrderCategory.PRIVATELY );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1115EnuOrderCategory( Enum1115OrderCategory.MULTILEG );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1115EnuOrderCategory( Enum1115OrderCategory.LINKED );
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    6 - Quote Request
         *  <p>    7 - Implied Order
         *  <p>    8 - Cross Order
         */
        tagData = new Tag1115EnuOrderCategory( Enum1115OrderCategory.QUOTE_REQUEST );
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1115EnuOrderCategory( Enum1115OrderCategory.IMPLIED_ORDER );
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1115EnuOrderCategory( Enum1115OrderCategory.CROSS_ORDER );
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum1115OrderCategory oneEnum : Enum1115OrderCategory.values()) {
            tagData = new Tag1115EnuOrderCategory(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum1115OrderCategory oneEnum : Enum1115OrderCategory.values()) {
            tagData = new Tag1115EnuOrderCategory(oneEnum);
            assertEquals( "Tag1115EnuOrderCategory\n" +
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