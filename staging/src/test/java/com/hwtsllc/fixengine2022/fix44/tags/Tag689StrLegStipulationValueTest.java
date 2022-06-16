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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  689
 *  LegStipulationValue
 *  String
 *  <p></p>
 *  For Fixed Income, value of stipulation.
 *  <p></p>
 *  See StipulationValue (234) for description and valid values
 */
class Tag689StrLegStipulationValueTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX689_STR_LEG_STIPULATION_VALUE;
        assertEquals( "689", fixData.toFIXIDString());
        assertEquals( "LEG_STIPULATION_VALUE", fixData.toFIXNameString());
        assertEquals( "LegStipulationValue", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0689Test() {
        Tag689StrLegStipulationValue tagData;
        String oneElement;

        oneElement = Tag689StrLegStipulationValue.TESTA_STR_LEG_STIPULATION_VALUE;
        tagData = new Tag689StrLegStipulationValue( new MyStringType( oneElement ) );
        assertEquals( "689", tagData.toFIXIDString());
        assertEquals( "LEG_STIPULATION_VALUE", tagData.toFIXNameString());
        assertEquals( "LegStipulationValue", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag689StrLegStipulationValue.TESTB_STR_LEG_STIPULATION_VALUE;
        tagData = new Tag689StrLegStipulationValue( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag689StrLegStipulationValue tagData;
        String oneElement;

        oneElement = Tag689StrLegStipulationValue.TESTA_STR_LEG_STIPULATION_VALUE;
        tagData = new Tag689StrLegStipulationValue( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag689StrLegStipulationValue.TESTB_STR_LEG_STIPULATION_VALUE;
        tagData = new Tag689StrLegStipulationValue( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag689StrLegStipulationValue tagData;
        String oneElement;

        oneElement = Tag689StrLegStipulationValue.TESTB_STR_LEG_STIPULATION_VALUE;
        tagData = new Tag689StrLegStipulationValue( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag689StrLegStipulationValue tagData;
        String oneElement;

        oneElement = Tag689StrLegStipulationValue.TESTB_STR_LEG_STIPULATION_VALUE;
        tagData = new Tag689StrLegStipulationValue( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag689StrLegStipulationValue tagData;
        String oneElement;

        oneElement = Tag689StrLegStipulationValue.TESTB_STR_LEG_STIPULATION_VALUE;
        tagData = new Tag689StrLegStipulationValue(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag689StrLegStipulationValue tagData;
        String oneElement;

        oneElement = Tag689StrLegStipulationValue.TESTA_STR_LEG_STIPULATION_VALUE;
        tagData = new Tag689StrLegStipulationValue( new MyStringType( oneElement ) );
        assertEquals( "Tag689StrLegStipulationValue\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}