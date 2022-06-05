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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.MyExchangeType;
import com.hwtsllc.fixengine2022.fix42.tags.Tag616ExcLegSecurityExchange;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  616
 *  LegSecurityExchange
 *  Exchange
 *  <p>
 *  Multileg instrument's individual  security’s SecurityExchange.
 *  <p>
 *  See SecurityExchange (207) field for description
 */
class Tag616ExcLegSecurityExchangeTest {
    @Test
    void FIX0616Test() {
        FIX43 fixData = FIX43.FIX616_EXC_LEG_SECURITY_EXCHANGE;
        assertEquals( "616", fixData.toFIXIDString());
        assertEquals( "LEG_SECURITY_EXCHANGE", fixData.toFIXNameString());
        assertEquals( "LegSecurityExchange", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0616Test() {
        Tag616ExcLegSecurityExchange tagData;

    }
    @Test
    void PrintFIXTagTest() {
        Tag616ExcLegSecurityExchange tagData;
        String oneElement;

        oneElement = Tag616ExcLegSecurityExchange.TESTA_EXC_MD_MKT;
        tagData = new Tag616ExcLegSecurityExchange( new MyExchangeType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag616ExcLegSecurityExchange.TESTB_EXC_MD_MKT;
        tagData = new Tag616ExcLegSecurityExchange( new MyExchangeType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag616ExcLegSecurityExchange tagData;
        String oneElement;

        oneElement = Tag616ExcLegSecurityExchange.TESTB_EXC_MD_MKT;
        tagData = new Tag616ExcLegSecurityExchange( new MyExchangeType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag616ExcLegSecurityExchange tagData;
        String oneElement;

        oneElement = Tag616ExcLegSecurityExchange.TESTB_EXC_MD_MKT;
        tagData = new Tag616ExcLegSecurityExchange( new MyExchangeType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag616ExcLegSecurityExchange tagData;
        String oneElement;

        oneElement = Tag616ExcLegSecurityExchange.TESTB_EXC_MD_MKT;
        tagData = new Tag616ExcLegSecurityExchange( new MyExchangeType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag616ExcLegSecurityExchange tagData;
        String oneElement;

        oneElement = Tag616ExcLegSecurityExchange.TESTA_EXC_MD_MKT;
        tagData = new Tag616ExcLegSecurityExchange( new MyExchangeType( oneElement ) );
        assertEquals( "Tag616ExcLegSecurityExchange\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}