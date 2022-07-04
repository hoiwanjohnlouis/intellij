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
import com.hwtsllc.fixengine2022.datatypes.MyExchangeType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  275
 *  MDMkt
 *  Exchange
 *  <p>
 *  Deprecated in FIX.5.0 Market posting quote / trade.
 *  <p>
 *  Valid values:
 *  <p>
 *  See "Appendix 6-C"
 */
class Tag275ExcMDMktTest {
    @Test
    void FIX0275Test() {
        FIX42 fixData = FIX42.FIX275_EXC_MD_MKT;
        assertEquals( "275", fixData.toEnumIDString());
        assertEquals( "MD_MKT", fixData.toEnumNameString());
        assertEquals( "MDMkt", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0275Test() {
        Tag275ExcMDMkt tagData;
        String oneElement;

        oneElement = Tag275ExcMDMkt.TESTA_EXC_MD_MKT;
        tagData = new Tag275ExcMDMkt( new MyExchangeType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_EXC_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag275ExcMDMkt.TESTB_EXC_MD_MKT;
        tagData = new Tag275ExcMDMkt( new MyExchangeType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_EXC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag275ExcMDMkt tagData;
        String oneElement;

        oneElement = Tag275ExcMDMkt.TESTA_EXC_MD_MKT;
        tagData = new Tag275ExcMDMkt( new MyExchangeType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag275ExcMDMkt.TESTB_EXC_MD_MKT;
        tagData = new Tag275ExcMDMkt( new MyExchangeType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag275ExcMDMkt tagData;
        String oneElement;

        oneElement = Tag275ExcMDMkt.TESTB_EXC_MD_MKT;
        tagData = new Tag275ExcMDMkt( new MyExchangeType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag275ExcMDMkt tagData;
        String oneElement;

        oneElement = Tag275ExcMDMkt.TESTB_EXC_MD_MKT;
        tagData = new Tag275ExcMDMkt( new MyExchangeType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag275ExcMDMkt tagData;
        String oneElement;

        oneElement = Tag275ExcMDMkt.TESTB_EXC_MD_MKT;
        tagData = new Tag275ExcMDMkt( new MyExchangeType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag275ExcMDMkt tagData;
        String oneElement;

        oneElement = Tag275ExcMDMkt.TESTA_EXC_MD_MKT;
        tagData = new Tag275ExcMDMkt( new MyExchangeType( oneElement ) );
        assertEquals( "Tag275ExcMDMkt\n" +
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