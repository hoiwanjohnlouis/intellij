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

package com.hwtsllc.fix.tags.fix42;

import com.hwtsllc.fix.datatypes.MyIntType;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

// @Deprecated
class Tag243IntUnderlyingRepoCollateralSecurityTypeTest {
    Tag243IntUnderlyingRepoCollateralSecurityType tagData;
    int [] TestArray = {
            Tag243IntUnderlyingRepoCollateralSecurityType.TESTA_INT_UNDERLYING_REPO_COLLATERAL_SECURITY_TYPE,
            Tag243IntUnderlyingRepoCollateralSecurityType.TESTB_INT_UNDERLYING_REPO_COLLATERAL_SECURITY_TYPE
    };

    @Test
    void PrintTest() {
        // process array of tags
        for ( int oneElement : TestArray ) {
            tagData = new Tag243IntUnderlyingRepoCollateralSecurityType( new MyIntType( oneElement ));
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // process array of tags
        for ( int oneElement : TestArray ) {
            tagData = new Tag243IntUnderlyingRepoCollateralSecurityType( new MyIntType( oneElement ));
            assertEquals( "FIX243_INT_UNDERLYING_REPO_COLLATERAL_SECURITY_TYPE", tagData.toFIXLabelString());
            assertEquals( "243", tagData.toFIXIDString());
            assertEquals( "UNDERLYING_REPO_COLLATERAL_SECURITY_TYPE", tagData.toFIXNameString());
            assertEquals( "UnderlyingRepoCollateralSecurityType (Deprecated)", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // process array of tags
        for ( int oneElement : TestArray ) {
            tagData = new Tag243IntUnderlyingRepoCollateralSecurityType( new MyIntType( oneElement ));
            assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  243
         *  UnderlyingRepoCollateralSecurityType
         *  int
         */

        // process array of tags
        for ( int oneElement : TestArray ) {
            tagData = new Tag243IntUnderlyingRepoCollateralSecurityType( new MyIntType( oneElement ));
            assertEquals( String.valueOf( oneElement ), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // process array of tags
        for ( int oneElement : TestArray ) {
            tagData = new Tag243IntUnderlyingRepoCollateralSecurityType( new MyIntType( oneElement ));
            assertEquals( "Tag243IntUnderlyingRepoCollateralSecurityType\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + oneElement + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
        }
    }
}