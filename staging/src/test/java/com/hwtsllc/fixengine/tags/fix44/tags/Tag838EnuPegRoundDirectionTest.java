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

import com.hwtsllc.fixengine.datatypes.MyEnumRoundDirection;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag838EnuPegRoundDirectionTest {
    Tag838EnuPegRoundDirection tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumRoundDirection oneEnum : MyEnumRoundDirection.values()) {
            tagData = new Tag838EnuPegRoundDirection(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumRoundDirection oneEnum : MyEnumRoundDirection.values()) {
            tagData = new Tag838EnuPegRoundDirection(oneEnum);
            assertEquals( "FIX838_ENU_PEG_ROUND_DIRECTION", tagData.toFIXLabelString());
            assertEquals( "838", tagData.toFIXIDString());
            assertEquals( "PEG_ROUND_DIRECTION", tagData.toFIXNameString());
            assertEquals( "PegRoundDirection", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumRoundDirection oneEnum : MyEnumRoundDirection.values()) {
            tagData = new Tag838EnuPegRoundDirection(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  838 (same as 838, 844,)
         *  PegRoundDirection
         *  int
         *  <p>    1 - More aggressive - on a buy order round the price up to the nearest tick;
         *                  on a sell order round down to the nearest tick
         *  <p>    2 - More passive - on a buy order round down to the nearest tick;
         *                  on a sell order round up to the nearest tick
         */
        tagData = new Tag838EnuPegRoundDirection( MyEnumRoundDirection.AGGRESSIVE );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag838EnuPegRoundDirection(MyEnumRoundDirection.PASSIVE);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( MyEnumRoundDirection oneEnum : MyEnumRoundDirection.values()) {
            tagData = new Tag838EnuPegRoundDirection(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumRoundDirection oneEnum : MyEnumRoundDirection.values()) {
            tagData = new Tag838EnuPegRoundDirection(oneEnum);
            assertEquals( "Tag838EnuPegRoundDirection\n" +
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