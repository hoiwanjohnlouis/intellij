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
 *  <p></p>
 *  Specific date of trade settlement (SettlementDate) in YYYYMMDD format.
 *  <p></p>
 *  If present, this field overrides SettlType (63).
 *  <p></p>
 *  This field is required if the value of  SettlType (63) is 6 (Future) or 8 (Sellers Option).
 *  <p></p>
 *  This field must be omitted if the value of SettlType (63) is 7 (When and If Issued)
 *  <p></p>
 *  (expressed in local time at place of settlement)
 */
class Tag64StrSettlDateTest {
    @Test
    void FIX0064Test() {
        FIX27 fixData = FIX27.FIX64_STR_SETTL_DATE;
        assertEquals( "SETTL_DATE", fixData.toEnumNameString());
        assertEquals( "64", fixData.toEnumIDString());
        assertEquals( "SettlDate", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0064Test() {
        Tag64StrSettlDate tagData;
        String oneElement;

        oneElement = "MeriadocBrandybuck-Tag64StrSettlDate";
        tagData = new Tag64StrSettlDate(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );

        oneElement = Tag64StrSettlDate.TESTA_STR_SETTL_DATE;
        tagData = new Tag64StrSettlDate(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );

        oneElement = Tag64StrSettlDate.TESTB_STR_SETTL_DATE;
        tagData = new Tag64StrSettlDate(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );
    }

    private void verifyTagInformation( Tag64StrSettlDate tagData, String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "FIX64_STR_SETTL_DATE", tagData.toEnumLabelString());
        assertEquals( "SETTL_DATE", tagData.toEnumNameString());
        assertEquals( "64", tagData.toEnumIDString());
        assertEquals( "SettlDate", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void PrintFIXTagTest() {
        Tag64StrSettlDate tagData;
        String oneElement;

        oneElement = Tag64StrSettlDate.TESTA_STR_SETTL_DATE;
        tagData = new Tag64StrSettlDate(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag64StrSettlDate.TESTB_STR_SETTL_DATE;
        tagData = new Tag64StrSettlDate(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag64StrSettlDate tagData;
        String oneElement;

        oneElement = Tag64StrSettlDate.TESTB_STR_SETTL_DATE;
        tagData = new Tag64StrSettlDate(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag64StrSettlDate tagData;
        String oneElement;

        oneElement = Tag64StrSettlDate.TESTB_STR_SETTL_DATE;
        tagData = new Tag64StrSettlDate(new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag64StrSettlDate tagData;
        String oneElement;

        oneElement = Tag64StrSettlDate.TESTB_STR_SETTL_DATE;
        tagData = new Tag64StrSettlDate(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag64StrSettlDate tagData;
        String oneElement;

        oneElement = Tag64StrSettlDate.TESTA_STR_SETTL_DATE;
        tagData = new Tag64StrSettlDate(new MyStringType( oneElement ) );
        assertEquals( "Tag64StrSettlDate\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}