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
import com.hwtsllc.fixengine2022.datatypes.MyEnumRoundDirection;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  838 (same as 838, 844,)
 *  PegRoundDirection
 *  int
 *  <p>
 *  If the calculated peg price is not a valid tick price, specifies
 *  whether to round the price to be more or less aggressive
 *  <p></p>
 *  844
 *  DiscretionRoundDirection
 *  int
 *  <p>
 *  If the calculated discretionary price is not a valid tick price,
 *  specifies whether to round the price to be more or less aggressive
 *  <p></p>
 *  Valid values:
 *  <p>    1 - More aggressive - on a buy order round the price up to the nearest tick;
 *                  on a sell order round down to the nearest tick
 *  <p>    2 - More passive - on a buy order round down to the nearest tick;
 *                  on a sell order round up to the nearest tick
 */
class Tag838EnuPegRoundDirectionTest {
    @Test
    void FIX0838Test() {
        FIX44 fixData = FIX44.FIX838_ENU_PEG_ROUND_DIRECTION;
        assertEquals( "838", fixData.toFIXIDString());
        assertEquals( "PEG_ROUND_DIRECTION", fixData.toFIXNameString());
        assertEquals( "PegRoundDirection", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0838Test() {
        Tag838EnuPegRoundDirection tagData;

        tagData = new Tag838EnuPegRoundDirection(MyEnumRoundDirection.AGGRESSIVE);
        assertEquals( MyEnumRoundDirection.AGGRESSIVE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag838EnuPegRoundDirection(MyEnumRoundDirection.PASSIVE);
        assertEquals( MyEnumRoundDirection.PASSIVE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag838EnuPegRoundDirection tagData;

        // loop around the ENUM and process
        for ( MyEnumRoundDirection oneEnum : MyEnumRoundDirection.values()) {
            tagData = new Tag838EnuPegRoundDirection(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag838EnuPegRoundDirection tagData;

        // loop around the ENUM and process
        for (MyEnumRoundDirection oneEnum : MyEnumRoundDirection.values()) {
            tagData = new Tag838EnuPegRoundDirection(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag838EnuPegRoundDirection tagData;

        // loop around the ENUM and process
        for (MyEnumRoundDirection oneEnum : MyEnumRoundDirection.values()) {
            tagData = new Tag838EnuPegRoundDirection(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag838EnuPegRoundDirection tagData;

        // loop around the ENUM and process
        for (MyEnumRoundDirection oneEnum : MyEnumRoundDirection.values()) {
            tagData = new Tag838EnuPegRoundDirection(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag838EnuPegRoundDirection tagData;

        // loop around the ENUM and process
        for (MyEnumRoundDirection oneEnum : MyEnumRoundDirection.values()) {
            tagData = new Tag838EnuPegRoundDirection(oneEnum);
            assertEquals( "Tag838EnuPegRoundDirection\n" +
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