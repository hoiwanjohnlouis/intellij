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

package com.hwtsllc.fixengine.tags.fix44.tags;

import com.hwtsllc.fixengine2022.fix44.enums.Enum819AvgPxIndicator;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
            assertEquals( "FIX819_ENU_AVG_PX_INDICATOR", tagData.toFIXLabelString());
            assertEquals( "819", tagData.toFIXIDString());
            assertEquals( "AVG_PX_INDICATOR", tagData.toFIXNameString());
            assertEquals( "AvgPxIndicator", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum819AvgPxIndicator oneEnum : Enum819AvgPxIndicator.values()) {
            tagData = new Tag819EnuAvgPxIndicator(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  819
         *  AvgPxIndicator
         *  int
         *  <p>    0 - No Average Pricing
         *  <p>    1 - Trade is part of an average price group identified by the TradeLinkID (820)
         *  <p>    2 - Last trade is the average price group identified by the TradeLinkID (820)
         */
        tagData = new Tag819EnuAvgPxIndicator( Enum819AvgPxIndicator.NO_PRICING );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag819EnuAvgPxIndicator(Enum819AvgPxIndicator.PART_OF_APG);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag819EnuAvgPxIndicator(Enum819AvgPxIndicator.LAST_TRADE);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


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
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
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