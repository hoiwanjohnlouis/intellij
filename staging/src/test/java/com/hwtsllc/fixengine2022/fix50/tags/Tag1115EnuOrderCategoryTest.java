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

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.fix50.enums.Enum1115OrderCategory;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1115
 *  OrderCategory
 *  char
 *  <p>
 *  Defines the type of interest behind a trade (fill or partial fill).
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Order
 *  <p>    2 - Quote
 *  <p>    3 - Privately Negotiated Trade
 *  <p>    4 - Multileg order
 *  <p>    5 - Linked order
 *  <p></p>
 *  <p>    6 - Quote Request
 *  <p>    7 - Implied Order
 *  <p>    8 - Cross Order
 */
class Tag1115EnuOrderCategoryTest {
    @Test
    void FIX1115Test() {
        FIX50 fixData = FIX50.FIX1115_ENU_ORDER_CATEGORY;
        assertEquals( "1115", fixData.toEnumIDString());
        assertEquals( "ORDER_CATEGORY", fixData.toEnumNameString());
        assertEquals( "OrderCategory", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1115Test() {
        Tag1115EnuOrderCategory tagData;

        tagData = new Tag1115EnuOrderCategory( Enum1115OrderCategory.ORDER );
        assertEquals( Enum1115OrderCategory.ORDER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1115EnuOrderCategory( Enum1115OrderCategory.QUOTE );
        assertEquals( Enum1115OrderCategory.QUOTE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1115EnuOrderCategory( Enum1115OrderCategory.PRIVATELY );
        assertEquals( Enum1115OrderCategory.PRIVATELY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1115EnuOrderCategory( Enum1115OrderCategory.MULTILEG );
        assertEquals( Enum1115OrderCategory.MULTILEG.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1115EnuOrderCategory( Enum1115OrderCategory.LINKED );
        assertEquals( Enum1115OrderCategory.LINKED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag1115EnuOrderCategory( Enum1115OrderCategory.QUOTE_REQUEST );
        assertEquals( Enum1115OrderCategory.QUOTE_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1115EnuOrderCategory( Enum1115OrderCategory.IMPLIED_ORDER );
        assertEquals( Enum1115OrderCategory.IMPLIED_ORDER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1115EnuOrderCategory( Enum1115OrderCategory.CROSS_ORDER );
        assertEquals( Enum1115OrderCategory.CROSS_ORDER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1115EnuOrderCategory tagData;

        // loop around the ENUM and process
        for ( Enum1115OrderCategory oneEnum : Enum1115OrderCategory.values()) {
            tagData = new Tag1115EnuOrderCategory(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag1115EnuOrderCategory tagData;

        // loop around the ENUM and process
        for (Enum1115OrderCategory oneEnum : Enum1115OrderCategory.values()) {
            tagData = new Tag1115EnuOrderCategory(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1115EnuOrderCategory tagData;

        // loop around the ENUM and process
        for (Enum1115OrderCategory oneEnum : Enum1115OrderCategory.values()) {
            tagData = new Tag1115EnuOrderCategory(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag1115EnuOrderCategory tagData;

        // loop around the ENUM and process
        for (Enum1115OrderCategory oneEnum : Enum1115OrderCategory.values()) {
            tagData = new Tag1115EnuOrderCategory(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1115EnuOrderCategory tagData;

        // loop around the ENUM and process
        for (Enum1115OrderCategory oneEnum : Enum1115OrderCategory.values()) {
            tagData = new Tag1115EnuOrderCategory(oneEnum);
            assertEquals( "Tag1115EnuOrderCategory\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}