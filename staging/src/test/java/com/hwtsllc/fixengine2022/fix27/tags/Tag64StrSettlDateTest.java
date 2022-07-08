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
    void FIXTest() {
        Tag64StrSettlDate tagData;
        String oneElement;

        oneElement = Tag64StrSettlDate.TESTA_STR_SETTL_DATE;
        tagData = new Tag64StrSettlDate(new MyStringType( oneElement ) );
        verifyFIXData( tagData );

        oneElement = Tag64StrSettlDate.TESTB_STR_SETTL_DATE;
        tagData = new Tag64StrSettlDate(new MyStringType( oneElement ) );
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag64StrSettlDate tagData ) {
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
    void TagGetDataValueTest() {
        Tag64StrSettlDate tagData;
        String oneElement;

        oneElement = Tag64StrSettlDate.TESTA_STR_SETTL_DATE;
        tagData = new Tag64StrSettlDate(new MyStringType( oneElement ) );
        verifyDataValue( tagData, oneElement );

        oneElement = Tag64StrSettlDate.TESTB_STR_SETTL_DATE;
        tagData = new Tag64StrSettlDate(new MyStringType( oneElement ) );
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag64StrSettlDate tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag64StrSettlDate tagData;
        String oneElement;

        oneElement = Tag64StrSettlDate.TESTA_STR_SETTL_DATE;
        tagData = new Tag64StrSettlDate(new MyStringType( oneElement ) );
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag64StrSettlDate.TESTB_STR_SETTL_DATE;
        tagData = new Tag64StrSettlDate(new MyStringType( oneElement ) );
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag64StrSettlDate tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag64StrSettlDate tagData;
        String oneElement;

        oneElement = Tag64StrSettlDate.TESTA_STR_SETTL_DATE;
        tagData = new Tag64StrSettlDate(new MyStringType( oneElement ) );
        verifyToString( tagData, oneElement );

        oneElement = Tag64StrSettlDate.TESTB_STR_SETTL_DATE;
        tagData = new Tag64StrSettlDate(new MyStringType( oneElement ) );
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag64StrSettlDate tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag64StrSettlDate tagData;
        String oneElement;

        oneElement = Tag64StrSettlDate.TESTA_STR_SETTL_DATE;
        tagData = new Tag64StrSettlDate(new MyStringType( oneElement ) );
        verifyVerboseString( tagData, oneElement );

        oneElement = Tag64StrSettlDate.TESTB_STR_SETTL_DATE;
        tagData = new Tag64StrSettlDate(new MyStringType( oneElement ) );
        verifyVerboseString( tagData, oneElement );
    }

    private void verifyVerboseString( final Tag64StrSettlDate tagData, final String oneElement ) {
        assertEquals( "Tag64StrSettlDate\n" +
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