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
 *  250
 *  LegRepoCollateralSecurityType
 *  int
 *  <p></p>
 *  Deprecated in FIX.4.4
 *  <p></p>
 *  Multileg instrument's individual leg security's RepoCollateralSecurityType.
 *  <p></p>
 *  See RepoCollateralSecurityType (239) field for description
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 */
// @Deprecated
class Tag250IntLegRepoCollateralSecurityTypeTest {
    @Test
    void PrintTest() {
        Tag250IntLegRepoCollateralSecurityType tagData;
        int oneElement;

        oneElement = Tag250IntLegRepoCollateralSecurityType.TESTA_INT_LEG_REPO_COLLATERAL_SECURITY_TYPE;
        tagData = new Tag250IntLegRepoCollateralSecurityType( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag250IntLegRepoCollateralSecurityType.TESTB_INT_LEG_REPO_COLLATERAL_SECURITY_TYPE;
        tagData = new Tag250IntLegRepoCollateralSecurityType( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag250IntLegRepoCollateralSecurityType tagData;
        int oneElement;

        oneElement = Tag250IntLegRepoCollateralSecurityType.TESTA_INT_LEG_REPO_COLLATERAL_SECURITY_TYPE;
        tagData = new Tag250IntLegRepoCollateralSecurityType( new MyIntType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag250IntLegRepoCollateralSecurityType.TESTB_INT_LEG_REPO_COLLATERAL_SECURITY_TYPE;
        tagData = new Tag250IntLegRepoCollateralSecurityType( new MyIntType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag250IntLegRepoCollateralSecurityType tagData, final int oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag250IntLegRepoCollateralSecurityType tagData ) {
        assertEquals( "FIX250_INT_LEG_REPO_COLLATERAL_SECURITY_TYPE", tagData.toEnumLabelString());
        assertEquals( "250", tagData.toEnumIDString());
        assertEquals( "LEG_REPO_COLLATERAL_SECURITY_TYPE", tagData.toEnumNameString());
        assertEquals( "LegRepoCollateralSecurityType (Deprecated)", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag250IntLegRepoCollateralSecurityType tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue() );
    }

    private void verifyValuePairString( final Tag250IntLegRepoCollateralSecurityType tagData, final int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag250IntLegRepoCollateralSecurityType tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }

    private void verifyVerboseString( final Tag250IntLegRepoCollateralSecurityType tagData ) {
        assertEquals( "Tag250IntLegRepoCollateralSecurityType\n" +
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