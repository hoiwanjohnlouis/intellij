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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  64
 *  SettlDate
 *  LocalMktDate
 *  Specific date of trade settlement (SettlementDate) in YYYYMMDD format.
 *
 *  If present, this field overrides SettlType (63).
 *  This field is required if the value of  SettlType (63) is 6 (Future) or 8 (Sellers Option).
 *  This field must be omitted if the value of SettlType (63) is 7 (When and If Issued)
 *  (expressed in local time at place of settlement)
 */
class Tag64StrSettlDateTest {
    @Test
    void FIX0064Test() {
        FIX27 fixData = FIX27.FIX64_STR_SETTL_DATE;
        assertEquals( "SETTL_DATE", fixData.getName());
        assertEquals( "64", fixData.getID());
        assertEquals( "SettlDate", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0064Test() {
        Tag64StrSettlDate tagData;

        tagData = new Tag64StrSettlDate(new MyStringType("MeriadocBrandybuck-64SettlDate") );
        assertEquals( "MeriadocBrandybuck-64SettlDate", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}