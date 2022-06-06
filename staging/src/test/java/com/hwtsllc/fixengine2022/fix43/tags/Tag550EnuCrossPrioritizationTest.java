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

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.fix43.enums.Enum550CrossPrioritization;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  550
 *  CrossPrioritization
 *  int
 *  <p></p>
 *  Indicates if one side or the other of a cross order should be prioritized.
 *  <p></p>
 *  The definition of prioritization is left to the market.
 *  <p></p>
 *  In some markets, - prioritization means which side of the cross order is applied to the market first.
 *  <p></p>
 *  In other markets, - prioritization may mean that the prioritized side is fully executed
 *  (sometimes referred to as the side being protected).
 *  <p></p>
 *  Valid values:
 *  <p>    0 - None
 *  <p>    1 - Buy side is prioritized
 *  <p>    2 - Sell side is prioritized
 */
class Tag550EnuCrossPrioritizationTest {
    @Test
    void FIX0550Test() {
        FIX43 fixData = FIX43.FIX550_ENU_CROSS_PRIORITIZATION;
        assertEquals( "550", fixData.toFIXIDString());
        assertEquals( "CROSS_PRIORITIZATION", fixData.toFIXNameString());
        assertEquals( "CrossPrioritization", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0550Test() {
        Tag550EnuCrossPrioritization tagData;

        /*
         *  0-2 types
         */
        tagData = new Tag550EnuCrossPrioritization( Enum550CrossPrioritization.NONE );
        assertEquals( Enum550CrossPrioritization.NONE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag550EnuCrossPrioritization( Enum550CrossPrioritization.BUY_PRIORITY );
        assertEquals( Enum550CrossPrioritization.BUY_PRIORITY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag550EnuCrossPrioritization( Enum550CrossPrioritization.SELL_PRIORITY );
        assertEquals( Enum550CrossPrioritization.SELL_PRIORITY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag550EnuCrossPrioritization tagData;

        // loop around the ENUM and process
        for ( Enum550CrossPrioritization oneEnum : Enum550CrossPrioritization.values()) {
            tagData = new Tag550EnuCrossPrioritization(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag550EnuCrossPrioritization tagData;

        // loop around the ENUM and process
        for (Enum550CrossPrioritization oneEnum : Enum550CrossPrioritization.values()) {
            tagData = new Tag550EnuCrossPrioritization(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag550EnuCrossPrioritization tagData;

        // loop around the ENUM and process
        for (Enum550CrossPrioritization oneEnum : Enum550CrossPrioritization.values()) {
            tagData = new Tag550EnuCrossPrioritization(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag550EnuCrossPrioritization tagData;

        // loop around the ENUM and process
        for (Enum550CrossPrioritization oneEnum : Enum550CrossPrioritization.values()) {
            tagData = new Tag550EnuCrossPrioritization(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag550EnuCrossPrioritization tagData;

        // loop around the ENUM and process
        for (Enum550CrossPrioritization oneEnum : Enum550CrossPrioritization.values()) {
            tagData = new Tag550EnuCrossPrioritization(oneEnum);
            assertEquals( "Tag550EnuCrossPrioritization\n" +
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