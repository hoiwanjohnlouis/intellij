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
import com.hwtsllc.fixengine2022.fix43.enums.Enum468RoundingDirection;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  468
 *  RoundingDirection
 *  char
 *  <p></p>
 *  Specifies which direction to round
 *  <p>
 *  For CIV – indicates whether or not the quantity of shares/units
 *  is to be rounded and in which direction where CashOrdQty (152)
 *  <p>
 *  or (for CIV only) OrderPercent (516) are specified on an order.
 *  <p></p>
 *  The default is for rounding to be at the discretion of
 *  the executing broker or fund manager.
 *  <p>
 *  <p>e.g. for an order specifying CashOrdQty or OrderPercent
 *  <p>if the calculated number of shares/units was 325.76 and RoundingModulus (469) was
 *  <p>0 - "round down" would give 320 units,
 *  <p>1 - "round up" would give 330 units and "round to nearest" would give 320 units.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Round to nearest
 *  <p>    1 - Round down
 *  <p>    2 - Round up
 */
class Tag468EnuRoundingDirectionTest {
    @Test
    void FIX0468Test() {
        FIX43 fixData = FIX43.FIX468_ENU_ROUNDING_DIRECTION;
        assertEquals( "468", fixData.toEnumIDString());
        assertEquals( "ROUNDING_DIRECTION", fixData.toEnumNameString());
        assertEquals( "RoundingDirection", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0468Test() {
        Tag468EnuRoundingDirection tagData;

        tagData = new Tag468EnuRoundingDirection( Enum468RoundingDirection.ROUND_TO_NEAREST );
        assertEquals( Enum468RoundingDirection.ROUND_TO_NEAREST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag468EnuRoundingDirection( Enum468RoundingDirection.ROUND_DOWN );
        assertEquals( Enum468RoundingDirection.ROUND_DOWN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag468EnuRoundingDirection( Enum468RoundingDirection.ROUND_UP );
        assertEquals( Enum468RoundingDirection.ROUND_UP.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag468EnuRoundingDirection tagData;

        // loop around the ENUM and process
        for ( Enum468RoundingDirection oneEnum : Enum468RoundingDirection.values()) {
            tagData = new Tag468EnuRoundingDirection(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag468EnuRoundingDirection tagData;

        // loop around the ENUM and process
        for (Enum468RoundingDirection oneEnum : Enum468RoundingDirection.values()) {
            tagData = new Tag468EnuRoundingDirection(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag468EnuRoundingDirection tagData;

        // loop around the ENUM and process
        for (Enum468RoundingDirection oneEnum : Enum468RoundingDirection.values()) {
            tagData = new Tag468EnuRoundingDirection(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag468EnuRoundingDirection tagData;

        // loop around the ENUM and process
        for (Enum468RoundingDirection oneEnum : Enum468RoundingDirection.values()) {
            tagData = new Tag468EnuRoundingDirection(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag468EnuRoundingDirection tagData;

        // loop around the ENUM and process
        for (Enum468RoundingDirection oneEnum : Enum468RoundingDirection.values()) {
            tagData = new Tag468EnuRoundingDirection(oneEnum);
            assertEquals( "Tag468EnuRoundingDirection\n" +
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