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
import com.hwtsllc.fixengine2022.fix44.enums.Enum847TargetStrategy;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  847
 *  TargetStrategy
 *  int
 *  <p></p>
 *  The target strategy of the order
 *  <p></p>
 *  1000+  = Reserved and available for bi-laterally agreed upon user defined values
 *  <p></p>
 *  Valid values:
 *  <p>    1 - VWAP
 *  <p>    2 - Participate (i.e. aim to be x percent of the market volume)
 *  <p>    3 - Minimize market impact
 *  <p>    or any value conforming to the data type Reserved1000Plus
 */
class Tag847EnuTargetStrategyTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX847_ENU_TARGET_STRATEGY;
        assertEquals( "847", fixData.toFIXIDString());
        assertEquals( "TARGET_STRATEGY", fixData.toFIXNameString());
        assertEquals( "TargetStrategy", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0847Test() {
        Tag847EnuTargetStrategy tagData;
        Enum847TargetStrategy oneElement;

        oneElement = Enum847TargetStrategy.VWAP;
        tagData = new Tag847EnuTargetStrategy( oneElement );
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "847", tagData.toFIXIDString());
        assertEquals( "TARGET_STRATEGY", tagData.toFIXNameString());
        assertEquals( "TargetStrategy", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        tagData = new Tag847EnuTargetStrategy( Enum847TargetStrategy.PARTICIPATE );
        assertEquals( Enum847TargetStrategy.PARTICIPATE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag847EnuTargetStrategy( Enum847TargetStrategy.MINIMIZE_MARKET_IMPACT );
        assertEquals( Enum847TargetStrategy.MINIMIZE_MARKET_IMPACT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag847EnuTargetStrategy tagData;

        // loop around the ENUM and process
        for ( Enum847TargetStrategy oneEnum : Enum847TargetStrategy.values()) {
            tagData = new Tag847EnuTargetStrategy(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag847EnuTargetStrategy tagData;

        // loop around the ENUM and process
        for (Enum847TargetStrategy oneEnum : Enum847TargetStrategy.values()) {
            tagData = new Tag847EnuTargetStrategy(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag847EnuTargetStrategy tagData;

        // loop around the ENUM and process
        for (Enum847TargetStrategy oneEnum : Enum847TargetStrategy.values()) {
            tagData = new Tag847EnuTargetStrategy(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag847EnuTargetStrategy tagData;

        // loop around the ENUM and process
        for (Enum847TargetStrategy oneEnum : Enum847TargetStrategy.values()) {
            tagData = new Tag847EnuTargetStrategy(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag847EnuTargetStrategy tagData;

        // loop around the ENUM and process
        for (Enum847TargetStrategy oneEnum : Enum847TargetStrategy.values()) {
            tagData = new Tag847EnuTargetStrategy(oneEnum);
            assertEquals( "Tag847EnuTargetStrategy\n" +
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