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

import com.hwtsllc.fixengine2022.fix44.enums.Enum720PriorSpreadIndicator;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag720EnuPriorSpreadIndicatorTest {
    Tag720EnuPriorSpreadIndicator tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum720PriorSpreadIndicator oneEnum : Enum720PriorSpreadIndicator.values()) {
            tagData = new Tag720EnuPriorSpreadIndicator(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum720PriorSpreadIndicator oneEnum : Enum720PriorSpreadIndicator.values()) {
            tagData = new Tag720EnuPriorSpreadIndicator(oneEnum);
            assertEquals( "FIX720_ENU_PRIOR_SPREAD_INDICATOR", tagData.toEnumLabelString());
            assertEquals( "720", tagData.toEnumIDString());
            assertEquals( "PRIOR_SPREAD_INDICATOR", tagData.toEnumNameString());
            assertEquals( "PriorSpreadIndicator", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum720PriorSpreadIndicator oneEnum : Enum720PriorSpreadIndicator.values()) {
            tagData = new Tag720EnuPriorSpreadIndicator(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  720
         *  PriorSpreadIndicator
         *  Boolean
         *  <p>    N - No Rollover
         *  <p>    Y - Rollover Prior Day's Spread
         */
        tagData = new Tag720EnuPriorSpreadIndicator( Enum720PriorSpreadIndicator.NO );
        assertEquals( "N", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag720EnuPriorSpreadIndicator(Enum720PriorSpreadIndicator.YES);
        assertEquals( "Y", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum720PriorSpreadIndicator oneEnum : Enum720PriorSpreadIndicator.values()) {
            tagData = new Tag720EnuPriorSpreadIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum720PriorSpreadIndicator oneEnum : Enum720PriorSpreadIndicator.values()) {
            tagData = new Tag720EnuPriorSpreadIndicator(oneEnum);
            assertEquals( "Tag720EnuPriorSpreadIndicator\n" +
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