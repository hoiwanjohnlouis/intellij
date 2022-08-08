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

import com.hwtsllc.fixengine2022.fix44.enums.Enum819AvgPxIndicator;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  819
 *  AvgPxIndicator
 *  int
 *  <p></p>
 *  Average Pricing Indicator
 *  <p></p>
 *  Valid values:
 *  <p>    0 - No Average Pricing
 *  <p>    1 - Trade is part of an average price group identified by the TradeLinkID (820)
 *  <p>    2 - Last trade is the average price group identified by the TradeLinkID (820)
 */
class Tag819EnuAvgPxIndicatorTest {
    Tag819EnuAvgPxIndicator tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum819AvgPxIndicator oneEnum : Enum819AvgPxIndicator.values()) {
            tagData = new Tag819EnuAvgPxIndicator(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum819AvgPxIndicator oneEnum : Enum819AvgPxIndicator.values()) {
            tagData = new Tag819EnuAvgPxIndicator(oneEnum);
            assertEquals( "FIX819_ENU_AVG_PX_INDICATOR", tagData.toEnumLabelString());
            assertEquals( "819", tagData.toEnumIDString());
            assertEquals( "AVG_PX_INDICATOR", tagData.toEnumNameString());
            assertEquals( "AvgPxIndicator", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  <p>    0 - No Average Pricing
         *  <p>    1 - Trade is part of an average price group identified by the TradeLinkID (820)
         *  <p>    2 - Last trade is the average price group identified by the TradeLinkID (820)
         */
        tagData = new Tag819EnuAvgPxIndicator( Enum819AvgPxIndicator.NO_PRICING );
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag819EnuAvgPxIndicator(Enum819AvgPxIndicator.PART_OF_APG);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag819EnuAvgPxIndicator(Enum819AvgPxIndicator.LAST_TRADE);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( Enum819AvgPxIndicator oneEnum : Enum819AvgPxIndicator.values()) {
            tagData = new Tag819EnuAvgPxIndicator(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum819AvgPxIndicator oneEnum : Enum819AvgPxIndicator.values()) {
            tagData = new Tag819EnuAvgPxIndicator(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( Enum819AvgPxIndicator oneEnum : Enum819AvgPxIndicator.values()) {
            tagData = new Tag819EnuAvgPxIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum819AvgPxIndicator oneEnum : Enum819AvgPxIndicator.values()) {
            tagData = new Tag819EnuAvgPxIndicator(oneEnum);
            assertEquals( "Tag819EnuAvgPxIndicator\n" +
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