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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.fix42.enums.Enum388DiscretionInst;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  388
 *  DiscretionInst
 *  char
 *  <p>
 *  Code to identify the price a DiscretionOffsetValue (389) is related to and should be mathematically added to.
 *  <p></p>
 *  Valid values:
 *  <p>     0 - Related to displayed price
 *  <p>     1 - Related to market price
 *  <p>     2 - Related to primary price
 *  <p>     3 - Related to local primary price
 *  <p>     4 - Related to midpoint price
 *  <p></p>
 *  <p>     5 - Related to last trade price
 *  <p>     6 - Related to VWAP
 *  <p>     7 - Average Price Guarantee
 */
class Tag388EnuDiscretionInstTest {
    Tag388EnuDiscretionInst tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum388DiscretionInst oneEnum : Enum388DiscretionInst.values()) {
            tagData = new Tag388EnuDiscretionInst(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum388DiscretionInst oneEnum : Enum388DiscretionInst.values()) {
            tagData = new Tag388EnuDiscretionInst(oneEnum);
            assertEquals( "FIX388_ENU_DISCRETION_INST", tagData.toEnumLabelString());
            assertEquals( "388", tagData.toEnumIDString());
            assertEquals( "DISCRETION_INST", tagData.toEnumNameString());
            assertEquals( "DiscretionInst", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  0-7 msg types
         */
        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.RELATED_TO_DISPLAYED_PRICE);
        assertEquals( Enum388DiscretionInst.RELATED_TO_DISPLAYED_PRICE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.RELATED_TO_MARKET_PRICE);
        assertEquals( Enum388DiscretionInst.RELATED_TO_MARKET_PRICE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.RELATED_TO_PRIMARY_PRICE);
        assertEquals( Enum388DiscretionInst.RELATED_TO_PRIMARY_PRICE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.RELATED_TO_LOCAL_PRIMARY_PRICE);
        assertEquals( Enum388DiscretionInst.RELATED_TO_LOCAL_PRIMARY_PRICE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.RELATED_TO_MIDPOINT_PRICE);
        assertEquals( Enum388DiscretionInst.RELATED_TO_MIDPOINT_PRICE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.RELATED_TO_LAST_TRADE_PRICE);
        assertEquals( Enum388DiscretionInst.RELATED_TO_LAST_TRADE_PRICE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.RELATED_TO_VWAP);
        assertEquals( Enum388DiscretionInst.RELATED_TO_VWAP.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.AVERAGE_PRICE_GUARANTEE);
        assertEquals( Enum388DiscretionInst.AVERAGE_PRICE_GUARANTEE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( Enum388DiscretionInst oneEnum : Enum388DiscretionInst.values()) {
            tagData = new Tag388EnuDiscretionInst(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum388DiscretionInst oneEnum : Enum388DiscretionInst.values()) {
            tagData = new Tag388EnuDiscretionInst(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( Enum388DiscretionInst oneEnum : Enum388DiscretionInst.values()) {
            tagData = new Tag388EnuDiscretionInst(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum388DiscretionInst oneEnum : Enum388DiscretionInst.values()) {
            tagData = new Tag388EnuDiscretionInst(oneEnum);
            assertEquals( "Tag388EnuDiscretionInst\n" +
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