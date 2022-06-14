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
import com.hwtsllc.fixengine2022.fix44.enums.Enum720PriorSpreadIndicator;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  720
 *  PriorSpreadIndicator
 *  Boolean
 *  <p></p>
 *  Indicates if requesting a rollover of prior day’s spread submissions.
 *  <p></p>
 *  Valid values:
 *  <p>    N - No Rollover
 *  <p>    Y - Rollover Prior Day's Spread
 */
class Tag720EnuPriorSpreadIndicatorTest {
    @Test
    void FIX0720Test() {
        FIX44 fixData = FIX44.FIX720_ENU_PRIOR_SPREAD_INDICATOR;
        assertEquals( "720", fixData.toFIXIDString());
        assertEquals( "PRIOR_SPREAD_INDICATOR", fixData.toFIXNameString());
        assertEquals( "PriorSpreadIndicator", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0720Test() {
        Tag720EnuPriorSpreadIndicator tagData;

        tagData = new Tag720EnuPriorSpreadIndicator( Enum720PriorSpreadIndicator.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag720EnuPriorSpreadIndicator(Enum720PriorSpreadIndicator.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag720EnuPriorSpreadIndicator tagData;

        // loop around the ENUM and process
        for ( Enum720PriorSpreadIndicator oneEnum : Enum720PriorSpreadIndicator.values()) {
            tagData = new Tag720EnuPriorSpreadIndicator(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag720EnuPriorSpreadIndicator tagData;

        // loop around the ENUM and process
        for (Enum720PriorSpreadIndicator oneEnum : Enum720PriorSpreadIndicator.values()) {
            tagData = new Tag720EnuPriorSpreadIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag720EnuPriorSpreadIndicator tagData;

        // loop around the ENUM and process
        for (Enum720PriorSpreadIndicator oneEnum : Enum720PriorSpreadIndicator.values()) {
            tagData = new Tag720EnuPriorSpreadIndicator(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag720EnuPriorSpreadIndicator tagData;

        // loop around the ENUM and process
        for (Enum720PriorSpreadIndicator oneEnum : Enum720PriorSpreadIndicator.values()) {
            tagData = new Tag720EnuPriorSpreadIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag720EnuPriorSpreadIndicator tagData;

        // loop around the ENUM and process
        for (Enum720PriorSpreadIndicator oneEnum : Enum720PriorSpreadIndicator.values()) {
            tagData = new Tag720EnuPriorSpreadIndicator(oneEnum);
            assertEquals( "Tag720EnuPriorSpreadIndicator\n" +
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