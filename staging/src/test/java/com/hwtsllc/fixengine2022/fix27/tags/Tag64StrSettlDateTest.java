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
        assertEquals( "SETTL_DATE", fixData.toFIXNameString());
        assertEquals( "64", fixData.toFIXIDString());
        assertEquals( "SettlDate", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0064Test() {
        Tag64StrSettlDate tagData;

        tagData = new Tag64StrSettlDate(new MyStringType("MeriadocBrandybuck-64SettlDate") );
        assertEquals( "MeriadocBrandybuck-64SettlDate", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag64StrSettlDate tagData;

        tagData = new Tag64StrSettlDate(new MyStringType(Tag64StrSettlDate.TESTB_STR_SETTL_DATE));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag64StrSettlDate tagData;

        tagData = new Tag64StrSettlDate(new MyStringType(Tag64StrSettlDate.TESTB_STR_SETTL_DATE));
        assertEquals( Tag64StrSettlDate.TESTB_STR_SETTL_DATE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag64StrSettlDate tagData;

        tagData = new Tag64StrSettlDate(new MyStringType(Tag64StrSettlDate.TESTB_STR_SETTL_DATE));
        assertEquals( tagData.toFIXIDString() + "=" + Tag64StrSettlDate.TESTB_STR_SETTL_DATE,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag64StrSettlDate tagData;

        tagData = new Tag64StrSettlDate(new MyStringType(Tag64StrSettlDate.TESTB_STR_SETTL_DATE));
        assertEquals( Tag64StrSettlDate.TESTB_STR_SETTL_DATE,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag64StrSettlDate tagData;

        tagData = new Tag64StrSettlDate(new MyStringType(Tag64StrSettlDate.TESTA_STR_SETTL_DATE));
        assertEquals( "Tag64StrSettlDate\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag64StrSettlDate.TESTA_STR_SETTL_DATE + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag64StrSettlDate.TESTA_STR_SETTL_DATE + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}