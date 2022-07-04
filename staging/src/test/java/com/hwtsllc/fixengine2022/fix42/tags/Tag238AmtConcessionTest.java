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
import com.hwtsllc.fixengine2022.datatypes.MyAmtType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  238
 *  Concession
 *  Amt
 *  <p>
 *  Provides the reduction in price for the secondary market in Muncipals.
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 */
class Tag238AmtConcessionTest {
    @Test
    void FIX0238Test() {
        FIX42 fixData = FIX42.FIX238_AMT_CONCESSION;
        assertEquals( "238", fixData.toEnumIDString());
        assertEquals( "CONCESSION", fixData.toEnumNameString());
        assertEquals( "Concession", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0238Test() {
        Tag238AmtConcession tagData;
        double oneElement;

        oneElement = Tag238AmtConcession.TESTA_AMT_CONCESSION;
        tagData = new Tag238AmtConcession( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag238AmtConcession.TESTB_AMT_CONCESSION;
        tagData = new Tag238AmtConcession( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag238AmtConcession tagData;
        double oneElement;

        oneElement = Tag238AmtConcession.TESTA_AMT_CONCESSION;
        tagData = new Tag238AmtConcession( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag238AmtConcession.TESTB_AMT_CONCESSION;
        tagData = new Tag238AmtConcession( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag238AmtConcession tagData;
        double oneElement;

        oneElement = Tag238AmtConcession.TESTB_AMT_CONCESSION;
        tagData = new Tag238AmtConcession( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag238AmtConcession tagData;
        double oneElement;

        oneElement = Tag238AmtConcession.TESTB_AMT_CONCESSION;
        tagData = new Tag238AmtConcession( new MyAmtType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag238AmtConcession tagData;
        double oneElement;

        oneElement = Tag238AmtConcession.TESTB_AMT_CONCESSION;
        tagData = new Tag238AmtConcession( new MyAmtType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag238AmtConcession tagData;
        double oneElement;

        oneElement = Tag238AmtConcession.TESTA_AMT_CONCESSION;
        tagData = new Tag238AmtConcession( new MyAmtType( oneElement ) );
        assertEquals( "Tag238AmtConcession\n" +
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