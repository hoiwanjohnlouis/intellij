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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  251
 *  LegRepurchaseTerm
 *  int
 *  <p></p>
 *  Deprecated in FIX.4.4
 *  <p></p>
 *  Multileg instrument's individual leg security�s RepurchaseTerm.
 *  <p></p>
 *  See RepurchaseTerm (226) field for description
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 */
// @Deprecated
class Tag251IntLegRepurchaseTermTest {
    @Test
    void PrintTest() {
        Tag251IntLegRepurchaseTerm tagData;
        int oneElement;

        oneElement = Tag251IntLegRepurchaseTerm.TESTA_INT_LEG_REPURCHASE_TERM;
        tagData = new Tag251IntLegRepurchaseTerm( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag251IntLegRepurchaseTerm.TESTB_INT_LEG_REPURCHASE_TERM;
        tagData = new Tag251IntLegRepurchaseTerm( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag251IntLegRepurchaseTerm tagData;
        int oneElement;

        oneElement = Tag251IntLegRepurchaseTerm.TESTA_INT_LEG_REPURCHASE_TERM;
        tagData = new Tag251IntLegRepurchaseTerm( new MyIntType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag251IntLegRepurchaseTerm.TESTB_INT_LEG_REPURCHASE_TERM;
        tagData = new Tag251IntLegRepurchaseTerm( new MyIntType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag251IntLegRepurchaseTerm tagData, final int oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag251IntLegRepurchaseTerm tagData ) {
        assertEquals( "FIX251_INT_LEG_REPURCHASE_TERM", tagData.toEnumLabelString());
        assertEquals( "251", tagData.toEnumIDString());
        assertEquals( "LEG_REPURCHASE_TERM", tagData.toEnumNameString());
        assertEquals( "LegRepurchaseTerm (Deprecated)", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag251IntLegRepurchaseTerm tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue() );
    }

    private void verifyValuePairString( final Tag251IntLegRepurchaseTerm tagData, final int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag251IntLegRepurchaseTerm tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }

    private void verifyVerboseString( final Tag251IntLegRepurchaseTerm tagData ) {
        assertEquals( "Tag251IntLegRepurchaseTerm\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + tagData.getDataValue() + "]\n" +
                        "\tValuePair[" + tagData.toValuePairString() + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}