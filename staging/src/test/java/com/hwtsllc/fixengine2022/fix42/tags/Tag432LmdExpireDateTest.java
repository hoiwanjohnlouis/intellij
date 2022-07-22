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

import com.hwtsllc.fixengine2022.datatypes.MyLocalMktDateType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  432
 *  ExpireDate
 *  LocalMktDate
 *  <p></p>
 *  Date of order expiration (last day the order can trade),
 *  always expressed in terms of the local market date.
 *  <p></p>
 *  The time at which the order expires is determined by the local market’s business practices
 */
class Tag432LmdExpireDateTest {
    @Test
    void PrintTest() {
        Tag432LmdExpireDate tagData;
        String oneElement;

        oneElement = Tag432LmdExpireDate.TESTA_LMD_EXPIRE_DATE;
        tagData = new Tag432LmdExpireDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag432LmdExpireDate.TESTB_LMD_EXPIRE_DATE;
        tagData = new Tag432LmdExpireDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag432LmdExpireDate tagData;
        String oneElement;

        oneElement = Tag432LmdExpireDate.TESTA_LMD_EXPIRE_DATE;
        tagData = new Tag432LmdExpireDate( new MyLocalMktDateType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag432LmdExpireDate.TESTB_LMD_EXPIRE_DATE;
        tagData = new Tag432LmdExpireDate( new MyLocalMktDateType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag432LmdExpireDate tagData, final String oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag432LmdExpireDate tagData ) {
        assertEquals( "FIX432_LMD_EXPIRE_DATE", tagData.toEnumLabelString());
        assertEquals( "432", tagData.toEnumIDString());
        assertEquals( "EXPIRE_DATE", tagData.toEnumNameString());
        assertEquals( "ExpireDate", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag432LmdExpireDate tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag432LmdExpireDate tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag432LmdExpireDate tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }

    private void verifyVerboseString( final Tag432LmdExpireDate tagData ) {
        assertEquals( "Tag432LmdExpireDate\n" +
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