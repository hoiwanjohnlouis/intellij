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
import com.hwtsllc.fixengine2022.fix44.enums.Enum852PublishTrdIndicator;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  852
 *  PublishTrdIndicator
 *  Boolean
 *  <p></p>
 *  Indicates if a trade should be reported via a market reporting service.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Do Not Report Trade
 *  <p>    Y - Report Trade
 */
class Tag852EnuPublishTrdIndicatorTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX852_ENU_PUBLISH_TRD_INDICATOR;
        assertEquals( "852", fixData.toEnumIDString());
        assertEquals( "PUBLISH_TRD_INDICATOR", fixData.toEnumNameString());
        assertEquals( "PublishTrdIndicator", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0852Test() {
        Tag852EnuPublishTrdIndicator tagData;
        Enum852PublishTrdIndicator oneElement;

        oneElement = Enum852PublishTrdIndicator.NO;
        tagData = new Tag852EnuPublishTrdIndicator( oneElement );
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "852", tagData.toEnumIDString());
        assertEquals( "PUBLISH_TRD_INDICATOR", tagData.toEnumNameString());
        assertEquals( "PublishTrdIndicator", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Enum852PublishTrdIndicator.YES;
        tagData = new Tag852EnuPublishTrdIndicator( oneElement );
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag852EnuPublishTrdIndicator tagData;

        // loop around the ENUM and process
        for ( Enum852PublishTrdIndicator oneEnum : Enum852PublishTrdIndicator.values()) {
            tagData = new Tag852EnuPublishTrdIndicator(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag852EnuPublishTrdIndicator tagData;

        // loop around the ENUM and process
        for (Enum852PublishTrdIndicator oneEnum : Enum852PublishTrdIndicator.values()) {
            tagData = new Tag852EnuPublishTrdIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag852EnuPublishTrdIndicator tagData;

        // loop around the ENUM and process
        for (Enum852PublishTrdIndicator oneEnum : Enum852PublishTrdIndicator.values()) {
            tagData = new Tag852EnuPublishTrdIndicator(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag852EnuPublishTrdIndicator tagData;

        // loop around the ENUM and process
        for (Enum852PublishTrdIndicator oneEnum : Enum852PublishTrdIndicator.values()) {
            tagData = new Tag852EnuPublishTrdIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag852EnuPublishTrdIndicator tagData;

        // loop around the ENUM and process
        for (Enum852PublishTrdIndicator oneEnum : Enum852PublishTrdIndicator.values()) {
            tagData = new Tag852EnuPublishTrdIndicator(oneEnum);
            assertEquals( "Tag852EnuPublishTrdIndicator\n" +
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