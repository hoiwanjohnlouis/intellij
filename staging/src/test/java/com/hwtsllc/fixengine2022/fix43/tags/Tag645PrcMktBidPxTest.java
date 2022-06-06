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
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  645
 *  MktBidPx
 *  Price
 *  <p>
 *  Used to indicate the best bid in a market
 */
class Tag645PrcMktBidPxTest {
    @Test
    void FIX0645Test() {
        FIX43 fixData = FIX43.FIX645_PRC_MKT_BID_PX;
        assertEquals( "645", fixData.toFIXIDString());
        assertEquals( "MKT_BID_PX", fixData.toFIXNameString());
        assertEquals( "MktBidPx", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0645Test() {
        Tag645PrcMktBidPx tagData;
        double oneElement;

        oneElement = Tag645PrcMktBidPx.TESTA_PRC_MKT_BID_PX;
        tagData = new Tag645PrcMktBidPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag645PrcMktBidPx.TESTB_PRC_MKT_BID_PX;
        tagData = new Tag645PrcMktBidPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag645PrcMktBidPx tagData;
        double oneElement;

        oneElement = Tag645PrcMktBidPx.TESTA_PRC_MKT_BID_PX;
        tagData = new Tag645PrcMktBidPx( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag645PrcMktBidPx.TESTB_PRC_MKT_BID_PX;
        tagData = new Tag645PrcMktBidPx( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag645PrcMktBidPx tagData;
        double oneElement;

        oneElement = Tag645PrcMktBidPx.TESTB_PRC_MKT_BID_PX;
        tagData = new Tag645PrcMktBidPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag645PrcMktBidPx tagData;
        double oneElement;

        oneElement = Tag645PrcMktBidPx.TESTB_PRC_MKT_BID_PX;
        tagData = new Tag645PrcMktBidPx( new MyPriceType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag645PrcMktBidPx tagData;
        double oneElement;

        oneElement = Tag645PrcMktBidPx.TESTB_PRC_MKT_BID_PX;
        tagData = new Tag645PrcMktBidPx( new MyPriceType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag645PrcMktBidPx tagData;
        double oneElement;

        oneElement = Tag645PrcMktBidPx.TESTA_PRC_MKT_BID_PX;
        tagData = new Tag645PrcMktBidPx( new MyPriceType( oneElement ) );
        assertEquals( "Tag645PrcMktBidPx\n" +
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