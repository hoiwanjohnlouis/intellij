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
import com.hwtsllc.fixengine2022.datatypes.MyLocalMktDateType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  432
 *  ExpireDate
 *  LocalMktDate
 *  <p>
 *  Date of order expiration (last day the order can trade),
 *  always expressed in terms of the local market date.
 *  <p>
 *  The time at which the order expires is determined by the local market’s business practices
 */
class Tag432LmdExpireDateTest {
    @Test
    void FIX0432Test() {
        FIX42 fixData = FIX42.FIX432_LMD_EXPIRE_DATE;
        assertEquals( "432", fixData.toEnumIDString());
        assertEquals( "EXPIRE_DATE", fixData.toEnumNameString());
        assertEquals( "ExpireDate", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0432Test() {
        Tag432LmdExpireDate tagData;
        String oneElement;

        oneElement = Tag432LmdExpireDate.TESTA_LMD_EXPIRE_DATE;
        tagData = new Tag432LmdExpireDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag432LmdExpireDate.TESTB_LMD_EXPIRE_DATE;
        tagData = new Tag432LmdExpireDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
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
    void TagGetDataValueTest() {
        Tag432LmdExpireDate tagData;
        String oneElement;

        oneElement = Tag432LmdExpireDate.TESTB_LMD_EXPIRE_DATE;
        tagData = new Tag432LmdExpireDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag432LmdExpireDate tagData;
        String oneElement;

        oneElement = Tag432LmdExpireDate.TESTB_LMD_EXPIRE_DATE;
        tagData = new Tag432LmdExpireDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag432LmdExpireDate tagData;
        String oneElement;

        oneElement = Tag432LmdExpireDate.TESTB_LMD_EXPIRE_DATE;
        tagData = new Tag432LmdExpireDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag432LmdExpireDate tagData;
        String oneElement;

        oneElement = Tag432LmdExpireDate.TESTA_LMD_EXPIRE_DATE;
        tagData = new Tag432LmdExpireDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( "Tag432LmdExpireDate\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}