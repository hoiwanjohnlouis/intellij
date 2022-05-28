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

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  243
 *  UnderlyingRepoCollateralSecurityType
 *  int
 *  <p>
 *  Deprecated in FIX.4.4
 *  <p>
 *  Underlying security's RepoCollateralSecurityType.
 *  <p>
 *  See RepoCollateralSecurityType (239) field for description.
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 */
// @Deprecated
class Tag243IntUnderlyingRepoCollateralSecurityTypeTest {
    @Test
    void FIX0243Test() {
        FIX42 fixData = FIX42.FIX243_INT_UNDERLYING_REPO_COLLATERAL_SECURITY_TYPE;
        assertEquals( "243", fixData.toFIXIDString());
        assertEquals( "UNDERLYING_REPO_COLLATERAL_SECURITY_TYPE", fixData.toFIXNameString());
        assertEquals( "UnderlyingRepoCollateralSecurityType (Deprecated)", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0243Test() {
        Tag243IntUnderlyingRepoCollateralSecurityType tagData;
        int oneElement;

        oneElement = Tag243IntUnderlyingRepoCollateralSecurityType.TESTA_INT_UNDERLYING_REPO_COLLATERAL_SECURITY_TYPE;
        tagData = new Tag243IntUnderlyingRepoCollateralSecurityType( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag243IntUnderlyingRepoCollateralSecurityType.TESTB_INT_UNDERLYING_REPO_COLLATERAL_SECURITY_TYPE;
        tagData = new Tag243IntUnderlyingRepoCollateralSecurityType( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag243IntUnderlyingRepoCollateralSecurityType tagData;
        int oneElement;

        oneElement = Tag243IntUnderlyingRepoCollateralSecurityType.TESTA_INT_UNDERLYING_REPO_COLLATERAL_SECURITY_TYPE;
        tagData = new Tag243IntUnderlyingRepoCollateralSecurityType( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag243IntUnderlyingRepoCollateralSecurityType.TESTB_INT_UNDERLYING_REPO_COLLATERAL_SECURITY_TYPE;
        tagData = new Tag243IntUnderlyingRepoCollateralSecurityType( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag243IntUnderlyingRepoCollateralSecurityType tagData;
        int oneElement;

        oneElement = Tag243IntUnderlyingRepoCollateralSecurityType.TESTB_INT_UNDERLYING_REPO_COLLATERAL_SECURITY_TYPE;
        tagData = new Tag243IntUnderlyingRepoCollateralSecurityType( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag243IntUnderlyingRepoCollateralSecurityType tagData;
        int oneElement;

        oneElement = Tag243IntUnderlyingRepoCollateralSecurityType.TESTB_INT_UNDERLYING_REPO_COLLATERAL_SECURITY_TYPE;
        tagData = new Tag243IntUnderlyingRepoCollateralSecurityType( new MyIntType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag243IntUnderlyingRepoCollateralSecurityType tagData;
        int oneElement;

        oneElement = Tag243IntUnderlyingRepoCollateralSecurityType.TESTB_INT_UNDERLYING_REPO_COLLATERAL_SECURITY_TYPE;
        tagData = new Tag243IntUnderlyingRepoCollateralSecurityType( new MyIntType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag243IntUnderlyingRepoCollateralSecurityType tagData;
        int oneElement;

        oneElement = Tag243IntUnderlyingRepoCollateralSecurityType.TESTA_INT_UNDERLYING_REPO_COLLATERAL_SECURITY_TYPE;
        tagData = new Tag243IntUnderlyingRepoCollateralSecurityType( new MyIntType( oneElement ) );
        assertEquals( "Tag243IntUnderlyingRepoCollateralSecurityType\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}