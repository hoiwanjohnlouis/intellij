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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.fix44.enums.Enum853ShortSaleReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  853
 *  ShortSaleReason
 *  int
 *  <p></p>
 *  Reason for short sale.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Dealer Sold Short
 *  <p>    1 - Dealer Sold Short Exempt
 *  <p>    2 - Selling Customer Sold Short
 *  <p>    3 - Selling Customer Sold Short Exempt
 *  <p>    4 - Qualified Service Representative (QSR)
 *              or Automatic Give-up (AGU) Contra Side Sold Short
 *  <p></p>
 *  <p>    5 - QSR or AGU Contra Side Sold Short Exempt
 */
class Tag853EnuShortSaleReasonTest {
    Tag853EnuShortSaleReason tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum853ShortSaleReason oneEnum : Enum853ShortSaleReason.values()) {
            tagData = new Tag853EnuShortSaleReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum853ShortSaleReason oneEnum : Enum853ShortSaleReason.values()) {
            tagData = new Tag853EnuShortSaleReason(oneEnum);
            assertEquals( "FIX853_ENU_SHORT_SALE_REASON", tagData.toEnumLabelString());
            assertEquals( "853", tagData.toEnumIDString());
            assertEquals( "SHORT_SALE_REASON", tagData.toEnumNameString());
            assertEquals( "ShortSaleReason", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  <p>    0 - Dealer Sold Short
         *  <p>    1 - Dealer Sold Short Exempt
         *  <p>    2 - Selling Customer Sold Short
         *  <p>    3 - Selling Customer Sold Short Exempt
         *  <p>    4 - Qualified Service Representative (QSR)
         *              or Automatic Give-up (AGU) Contra Side Sold Short
         */
        tagData = new Tag853EnuShortSaleReason( Enum853ShortSaleReason.DEALER_SOLD_SHORT );
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag853EnuShortSaleReason( Enum853ShortSaleReason.DEALER_SOLD_SHORT_EXEMPT );
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag853EnuShortSaleReason( Enum853ShortSaleReason.CUSTOMER_SOLD_SHORT );
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag853EnuShortSaleReason( Enum853ShortSaleReason.CUSTOMER_SOLD_SHORT_EXEMPT );
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag853EnuShortSaleReason( Enum853ShortSaleReason.CONTRA_SOLD_SHORT );
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    5 - QSR or AGU Contra Side Sold Short Exempt
         */
        tagData = new Tag853EnuShortSaleReason( Enum853ShortSaleReason.CONTRA_SOLD_SHORT_EXEMPT );
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( Enum853ShortSaleReason oneEnum : Enum853ShortSaleReason.values()) {
            tagData = new Tag853EnuShortSaleReason(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum853ShortSaleReason oneEnum : Enum853ShortSaleReason.values()) {
            tagData = new Tag853EnuShortSaleReason(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( Enum853ShortSaleReason oneEnum : Enum853ShortSaleReason.values()) {
            tagData = new Tag853EnuShortSaleReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum853ShortSaleReason oneEnum : Enum853ShortSaleReason.values()) {
            tagData = new Tag853EnuShortSaleReason(oneEnum);
            assertEquals( "Tag853EnuShortSaleReason\n" +
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