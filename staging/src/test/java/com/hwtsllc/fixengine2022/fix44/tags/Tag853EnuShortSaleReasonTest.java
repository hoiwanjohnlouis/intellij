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

import com.hwtsllc.fixengine2022.datatypes.FIX44;
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
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX853_ENU_SHORT_SALE_REASON;
        assertEquals( "853", fixData.toFIXIDString());
        assertEquals( "SHORT_SALE_REASON", fixData.toFIXNameString());
        assertEquals( "ShortSaleReason", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0853Test() {
        Tag853EnuShortSaleReason tagData;
        Enum853ShortSaleReason oneElement;

        oneElement = Enum853ShortSaleReason.DEALER_SOLD_SHORT;
        tagData = new Tag853EnuShortSaleReason( oneElement );
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "853", tagData.toFIXIDString());
        assertEquals( "SHORT_SALE_REASON", tagData.toFIXNameString());
        assertEquals( "ShortSaleReason", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        tagData = new Tag853EnuShortSaleReason( Enum853ShortSaleReason.DEALER_SOLD_SHORT_EXEMPT );
        assertEquals( Enum853ShortSaleReason.DEALER_SOLD_SHORT_EXEMPT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag853EnuShortSaleReason( Enum853ShortSaleReason.CUSTOMER_SOLD_SHORT );
        assertEquals( Enum853ShortSaleReason.CUSTOMER_SOLD_SHORT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag853EnuShortSaleReason( Enum853ShortSaleReason.CUSTOMER_SOLD_SHORT_EXEMPT );
        assertEquals( Enum853ShortSaleReason.CUSTOMER_SOLD_SHORT_EXEMPT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag853EnuShortSaleReason( Enum853ShortSaleReason.CONTRA_SOLD_SHORT );
        assertEquals( Enum853ShortSaleReason.CONTRA_SOLD_SHORT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag853EnuShortSaleReason( Enum853ShortSaleReason.CONTRA_SOLD_SHORT_EXEMPT );
        assertEquals( Enum853ShortSaleReason.CONTRA_SOLD_SHORT_EXEMPT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag853EnuShortSaleReason tagData;

        // loop around the ENUM and process
        for ( Enum853ShortSaleReason oneEnum : Enum853ShortSaleReason.values()) {
            tagData = new Tag853EnuShortSaleReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag853EnuShortSaleReason tagData;

        // loop around the ENUM and process
        for (Enum853ShortSaleReason oneEnum : Enum853ShortSaleReason.values()) {
            tagData = new Tag853EnuShortSaleReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag853EnuShortSaleReason tagData;

        // loop around the ENUM and process
        for (Enum853ShortSaleReason oneEnum : Enum853ShortSaleReason.values()) {
            tagData = new Tag853EnuShortSaleReason(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag853EnuShortSaleReason tagData;

        // loop around the ENUM and process
        for (Enum853ShortSaleReason oneEnum : Enum853ShortSaleReason.values()) {
            tagData = new Tag853EnuShortSaleReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag853EnuShortSaleReason tagData;

        // loop around the ENUM and process
        for (Enum853ShortSaleReason oneEnum : Enum853ShortSaleReason.values()) {
            tagData = new Tag853EnuShortSaleReason(oneEnum);
            assertEquals( "Tag853EnuShortSaleReason\n" +
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