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

import com.hwtsllc.fixengine2022.fix50.enums.Enum1107TriggerPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1107
 *  TriggerPriceType
 *  char
 *  <p>
 *  The type of price that the trigger is compared to.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Best Offer
 *  <p>    2 - Last Trade
 *  <p>    3 - Best Bid
 *  <p>    4 - Best Bid or Last Trade
 *  <p>    5 - Best Offer or Last Trade
 *  <p></p>
 *  <p>    6 - Best Mid
 */
class Tag1107EnuTriggerPriceTypeTest {
    Tag1107EnuTriggerPriceType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum1107TriggerPriceType oneEnum : Enum1107TriggerPriceType.values()) {
            tagData = new Tag1107EnuTriggerPriceType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum1107TriggerPriceType oneEnum : Enum1107TriggerPriceType.values()) {
            tagData = new Tag1107EnuTriggerPriceType(oneEnum);
            assertEquals( "FIX1107_ENU_TRIGGER_PRICE_TYPE", tagData.toEnumLabelString());
            assertEquals( "1107", tagData.toEnumIDString());
            assertEquals( "TRIGGER_PRICE_TYPE", tagData.toEnumNameString());
            assertEquals( "TriggerPriceType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  <p>    1 - Best Offer
         *  <p>    2 - Last Trade
         *  <p>    3 - Best Bid
         *  <p>    4 - Best Bid or Last Trade
         *  <p>    5 - Best Offer or Last Trade
         */
        tagData = new Tag1107EnuTriggerPriceType( Enum1107TriggerPriceType.BEST_OFFER );
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1107EnuTriggerPriceType( Enum1107TriggerPriceType.LAST_TRADE );
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1107EnuTriggerPriceType( Enum1107TriggerPriceType.BEST_BID );
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1107EnuTriggerPriceType( Enum1107TriggerPriceType.BEST_BID_OR_LAST_TRADE );
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1107EnuTriggerPriceType( Enum1107TriggerPriceType.BEST_OFFER_OR_LAST_TRADE );
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    6 - Best Mid
         */
        tagData = new Tag1107EnuTriggerPriceType( Enum1107TriggerPriceType.BEST_MID );
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        // loop around the ENUM and process
        for ( Enum1107TriggerPriceType oneEnum : Enum1107TriggerPriceType.values()) {
            tagData = new Tag1107EnuTriggerPriceType(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum1107TriggerPriceType oneEnum : Enum1107TriggerPriceType.values()) {
            tagData = new Tag1107EnuTriggerPriceType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( Enum1107TriggerPriceType oneEnum : Enum1107TriggerPriceType.values()) {
            tagData = new Tag1107EnuTriggerPriceType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum1107TriggerPriceType oneEnum : Enum1107TriggerPriceType.values()) {
            tagData = new Tag1107EnuTriggerPriceType(oneEnum);
            assertEquals( "Tag1107EnuTriggerPriceType\n" +
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