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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  173
 *  SettlDepositoryCode
 *  String
 *  <p>
 *  Deprecated in FIX.4.3 Brokers account code at the depository
 *  (i.e. CEDEL ID  for CEDEL, FINS for DTC, or Euroclear ID for Euroclear) if Settlement Location is a depository
 */
// @Deprecated
class Tag173StrSettlDepositoryCodeTest {
    @Test
    void FIX0173Test() {
        FIX41 fixData = FIX41.FIX173_STR_SETTL_DEPOSITORY_CODE;
        assertEquals( "173", fixData.toFIXIDString());
        assertEquals( "SETTL_DEPOSITORY_CODE", fixData.toFIXNameString());
        assertEquals( "SettlDepositoryCode (replaced)", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0173Test() {
        Tag173StrSettlDepositoryCode tagData;

        tagData = new Tag173StrSettlDepositoryCode(
                new MyStringType(Tag173StrSettlDepositoryCode.TESTA_STR_SETTL_DEPOSITORY_CODE));
        assertEquals( Tag173StrSettlDepositoryCode.TESTA_STR_SETTL_DEPOSITORY_CODE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag173StrSettlDepositoryCode(
                new MyStringType(Tag173StrSettlDepositoryCode.TESTB_STR_SETTL_DEPOSITORY_CODE));
        assertEquals( Tag173StrSettlDepositoryCode.TESTB_STR_SETTL_DEPOSITORY_CODE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}