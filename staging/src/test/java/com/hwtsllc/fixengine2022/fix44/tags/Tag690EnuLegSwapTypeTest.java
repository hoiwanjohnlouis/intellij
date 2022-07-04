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
import com.hwtsllc.fixengine2022.fix44.enums.Enum690LegSwapType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  690
 *  LegSwapType
 *  int
 *  <p></p>
 *  For Fixed Income
 *  <p></p>
 *  Used instead of LegQty (687) or LegOrderQty (685)
 *      to request the respondent to calculate the quantity based on the
 *      quantity on the opposite side of the swap.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Par For Par
 *  <p>    2 - Modified Duration
 *  <p>    4 - Risk
 *  <p>    5 - Proceeds
 */
class Tag690EnuLegSwapTypeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX690_ENU_LEG_SWAP_TYPE;
        assertEquals( "690", fixData.toEnumIDString());
        assertEquals( "LEG_SWAP_TYPE", fixData.toEnumNameString());
        assertEquals( "LegSwapType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0690Test() {
        Tag690EnuLegSwapType tagData;
        Enum690LegSwapType oneElement;

        oneElement = Enum690LegSwapType.PAR_FOR_PAR;
        tagData = new Tag690EnuLegSwapType( oneElement );
        assertEquals( oneElement.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "690", tagData.toEnumIDString());
        assertEquals( "LEG_SWAP_TYPE", tagData.toEnumNameString());
        assertEquals( "LegSwapType", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag690EnuLegSwapType(Enum690LegSwapType.MODIFIED_DURATION);
        assertEquals( Enum690LegSwapType.MODIFIED_DURATION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag690EnuLegSwapType(Enum690LegSwapType.RISK);
        assertEquals( Enum690LegSwapType.RISK.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag690EnuLegSwapType(Enum690LegSwapType.PROCEEDS);
        assertEquals( Enum690LegSwapType.PROCEEDS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag690EnuLegSwapType tagData;

        // loop around the ENUM and process
        for ( Enum690LegSwapType oneEnum : Enum690LegSwapType.values()) {
            tagData = new Tag690EnuLegSwapType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag690EnuLegSwapType tagData;

        // loop around the ENUM and process
        for (Enum690LegSwapType oneEnum : Enum690LegSwapType.values()) {
            tagData = new Tag690EnuLegSwapType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag690EnuLegSwapType tagData;

        // loop around the ENUM and process
        for (Enum690LegSwapType oneEnum : Enum690LegSwapType.values()) {
            tagData = new Tag690EnuLegSwapType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag690EnuLegSwapType tagData;

        // loop around the ENUM and process
        for (Enum690LegSwapType oneEnum : Enum690LegSwapType.values()) {
            tagData = new Tag690EnuLegSwapType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag690EnuLegSwapType tagData;

        // loop around the ENUM and process
        for (Enum690LegSwapType oneEnum : Enum690LegSwapType.values()) {
            tagData = new Tag690EnuLegSwapType(oneEnum);
            assertEquals( "Tag690EnuLegSwapType\n" +
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