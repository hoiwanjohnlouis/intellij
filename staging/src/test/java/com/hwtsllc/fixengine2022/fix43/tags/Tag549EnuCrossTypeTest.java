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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.fix43.enums.Enum549CrossType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag549EnuCrossTypeTest {
    Tag549EnuCrossType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum549CrossType oneEnum : Enum549CrossType.values()) {
            tagData = new Tag549EnuCrossType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum549CrossType oneEnum : Enum549CrossType.values()) {
            tagData = new Tag549EnuCrossType(oneEnum);
            assertEquals( "FIX549_ENU_CROSS_TYPE", tagData.toFIXLabelString());
            assertEquals( "549", tagData.toFIXIDString());
            assertEquals( "CROSS_TYPE", tagData.toFIXNameString());
            assertEquals( "CrossType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum549CrossType oneEnum : Enum549CrossType.values()) {
            tagData = new Tag549EnuCrossType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  549
         *  CrossType
         *  int
         *  <p>    1 - Cross AON - cross tade which is executed complete or not.
         *  <p>         Both sides are treated in the same manner. This is equivalent to an "All or None".
         *  <p></p>
         *  <p>    2 - Cross IOC - cross trade which is executed partially and the rest is cancelled.
         *  <p>         One side is fully executed, the other side is partially executed with the remainder being cancelled.
         *  <p>         This is equivalent to an IOC on the other side.
         *  <p>         Note: CrossPrioritization (550) field may be used to
         *                    indicate which side should fully execute in this scenario.
         *  <p></p>
         *  <p>    3 - Cross One Side - cross trade which is partially executed with the unfilled portions remaining active.
         *  <p>         One side of the corss is fully executed (as denoted by the CrossPrioritization (550) field),
         *              but the unfilled portion remains active.
         *  <p></p>
         *  <p>    4 - Cross Same Price - cross trade is executed with existing orders with the same price.
         *  <p>         In this case other orders exist with the same price, the quantity of the Cross is
         *              executed against the existing orders and quotes, the remainder of the cross
         *              is executed against the other side of the cross.
         *  <p>         The two sides potentially have different quantities.
         */
        tagData = new Tag549EnuCrossType( Enum549CrossType.CROSS_AON );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag549EnuCrossType( Enum549CrossType.CROSS_IOC );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag549EnuCrossType( Enum549CrossType.CROSS_ONE_SIDE );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag549EnuCrossType( Enum549CrossType.CROSS_SAME_PRICE );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum549CrossType oneEnum : Enum549CrossType.values()) {
            tagData = new Tag549EnuCrossType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum549CrossType oneEnum : Enum549CrossType.values()) {
            tagData = new Tag549EnuCrossType(oneEnum);
            assertEquals( "Tag549EnuCrossType\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
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