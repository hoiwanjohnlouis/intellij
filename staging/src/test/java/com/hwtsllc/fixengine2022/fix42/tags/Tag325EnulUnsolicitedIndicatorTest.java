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

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.fix42.enums.Enum325UnsolicitedIndicator;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  325
 *  UnsolicitedIndicator
 *  Boolean
 *  <p>
 *  Indicates whether or not message is being sent as a result of a subscription request or not.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Message is being sent as a result of a prior request
 *  <p>    Y - Message is being sent unsolicited
 */
class Tag325EnulUnsolicitedIndicatorTest {
    @Test
    void FIX0325Test() {
        FIX42 fixData = FIX42.FIX325_ENU_UNSOLICITED_INDICATOR;
        assertEquals( "325", fixData.toFIXIDString());
        assertEquals( "UNSOLICITED_INDICATOR", fixData.toFIXNameString());
        assertEquals( "UnsolicitedIndicator", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0325Test() {
        Tag325EnulUnsolicitedIndicator tagData;

        tagData = new Tag325EnulUnsolicitedIndicator(Enum325UnsolicitedIndicator.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag325EnulUnsolicitedIndicator(Enum325UnsolicitedIndicator.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag325EnulUnsolicitedIndicator tagData;

        // loop around the ENUM and process
        for (Enum325UnsolicitedIndicator oneEnum : Enum325UnsolicitedIndicator.values()) {
            tagData = new Tag325EnulUnsolicitedIndicator(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag325EnulUnsolicitedIndicator tagData;

        // loop around the ENUM and process
        for (Enum325UnsolicitedIndicator oneEnum : Enum325UnsolicitedIndicator.values()) {
            tagData = new Tag325EnulUnsolicitedIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag325EnulUnsolicitedIndicator tagData;

        // loop around the ENUM and process
        for (Enum325UnsolicitedIndicator oneEnum : Enum325UnsolicitedIndicator.values()) {
            tagData = new Tag325EnulUnsolicitedIndicator(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag325EnulUnsolicitedIndicator tagData;

        // loop around the ENUM and process
        for (Enum325UnsolicitedIndicator oneEnum : Enum325UnsolicitedIndicator.values()) {
            tagData = new Tag325EnulUnsolicitedIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag325EnulUnsolicitedIndicator tagData;

        // loop around the ENUM and process
        for (Enum325UnsolicitedIndicator oneEnum : Enum325UnsolicitedIndicator.values()) {
            tagData = new Tag325EnulUnsolicitedIndicator(oneEnum);
            assertEquals( "Tag325EnulUnsolicitedIndicator\n" +
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