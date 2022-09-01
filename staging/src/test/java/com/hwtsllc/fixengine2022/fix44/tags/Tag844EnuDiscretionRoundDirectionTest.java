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

import com.hwtsllc.fixengine2022.datatypes.MyEnumRoundDirection;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag844EnuDiscretionRoundDirectionTest {
    Tag844EnuDiscretionRoundDirection tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumRoundDirection oneEnum : MyEnumRoundDirection.values()) {
            tagData = new Tag844EnuDiscretionRoundDirection(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumRoundDirection oneEnum : MyEnumRoundDirection.values()) {
            tagData = new Tag844EnuDiscretionRoundDirection(oneEnum);
            assertEquals( "FIX844_ENU_DISCRETION_ROUND_DIRECTION", tagData.toFIXLabelString());
            assertEquals( "844", tagData.toFIXIDString());
            assertEquals( "DISCRETION_ROUND_DIRECTION", tagData.toEnumNameString());
            assertEquals( "DiscretionRoundDirection", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumRoundDirection oneEnum : MyEnumRoundDirection.values()) {
            tagData = new Tag844EnuDiscretionRoundDirection(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  844 (same as 838, 844,)
         *  DiscretionRoundDirection
         *  int
         *  <p>    1 - More aggressive - on a buy order round the price up to the nearest tick;
         *                  on a sell order round down to the nearest tick
         *  <p>    2 - More passive - on a buy order round down to the nearest tick;
         *                  on a sell order round up to the nearest tick
         */
        tagData = new Tag844EnuDiscretionRoundDirection( MyEnumRoundDirection.AGGRESSIVE );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag844EnuDiscretionRoundDirection(MyEnumRoundDirection.PASSIVE);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( MyEnumRoundDirection oneEnum : MyEnumRoundDirection.values()) {
            tagData = new Tag844EnuDiscretionRoundDirection(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumRoundDirection oneEnum : MyEnumRoundDirection.values()) {
            tagData = new Tag844EnuDiscretionRoundDirection(oneEnum);
            assertEquals( "Tag844EnuDiscretionRoundDirection\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
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