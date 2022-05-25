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
 *  250
 *  LegRepoCollateralSecurityType
 *  int
 *  <p>
 *  Deprecated in FIX.4.4
 *  <p>
 *  Multileg instrument's individual leg security's RepoCollateralSecurityType.
 *  <p>
 *  See RepoCollateralSecurityType (239) field for description
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 */
// @Deprecated
class Tag250IntLegRepoCollateralSecurityTypeTest {
    @Test
    void FIX0250Test() {
        FIX42 fixData = FIX42.FIX250_INT_LEG_REPO_COLLATERAL_SECURITY_TYPE;
        assertEquals( "250", fixData.toFIXIDString());
        assertEquals( "LEG_REPO_COLLATERAL_SECURITY_TYPE", fixData.toFIXNameString());
        assertEquals( "LegRepoCollateralSecurityType (Deprecated)", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0250Test() {
        Tag250IntLegRepoCollateralSecurityType tagData;

        tagData = new Tag250IntLegRepoCollateralSecurityType(new MyIntType(
                Tag250IntLegRepoCollateralSecurityType.TESTA_INT_LEG_REPO_COLLATERAL_SECURITY_TYPE));
        assertEquals( Tag250IntLegRepoCollateralSecurityType.TESTA_INT_LEG_REPO_COLLATERAL_SECURITY_TYPE,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag250IntLegRepoCollateralSecurityType(new MyIntType(
                Tag250IntLegRepoCollateralSecurityType.TESTB_INT_LEG_REPO_COLLATERAL_SECURITY_TYPE));
        assertEquals( Tag250IntLegRepoCollateralSecurityType.TESTB_INT_LEG_REPO_COLLATERAL_SECURITY_TYPE,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
}