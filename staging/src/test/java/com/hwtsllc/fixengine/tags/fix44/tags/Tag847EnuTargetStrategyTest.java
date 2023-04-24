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

import com.hwtsllc.fixengine.tags.fix44.enums.Enum847TargetStrategy;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag847EnuTargetStrategyTest {
    Tag847EnuTargetStrategy tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum847TargetStrategy oneEnum : Enum847TargetStrategy.values()) {
            tagData = new Tag847EnuTargetStrategy(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum847TargetStrategy oneEnum : Enum847TargetStrategy.values()) {
            tagData = new Tag847EnuTargetStrategy(oneEnum);
            assertEquals( "FIX847_ENU_TARGET_STRATEGY", tagData.toFIXLabelString());
            assertEquals( "847", tagData.toFIXIDString());
            assertEquals( "TARGET_STRATEGY", tagData.toFIXNameString());
            assertEquals( "TargetStrategy", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum847TargetStrategy oneEnum : Enum847TargetStrategy.values()) {
            tagData = new Tag847EnuTargetStrategy(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  847
         *  TargetStrategy
         *  int
         *  <p>    1 - VWAP
         *  <p>    2 - Participate (i.e. aim to be x percent of the market volume)
         *  <p>    3 - Minimize market impact
         *  <p>    or any value conforming to the data type Reserved1000Plus
         */
        tagData = new Tag847EnuTargetStrategy( Enum847TargetStrategy.VWAP );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag847EnuTargetStrategy( Enum847TargetStrategy.PARTICIPATE );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag847EnuTargetStrategy( Enum847TargetStrategy.MINIMIZE_MARKET_IMPACT );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum847TargetStrategy oneEnum : Enum847TargetStrategy.values()) {
            tagData = new Tag847EnuTargetStrategy(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum847TargetStrategy oneEnum : Enum847TargetStrategy.values()) {
            tagData = new Tag847EnuTargetStrategy(oneEnum);
            assertEquals( "Tag847EnuTargetStrategy\n" +
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