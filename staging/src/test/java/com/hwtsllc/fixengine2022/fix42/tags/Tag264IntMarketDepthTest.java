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

import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  264
 *  MarketDepth
 *  int
 *  <p></p>
 *  Depth of market for Book Snapshot
 */
class Tag264IntMarketDepthTest {
    @Test
    void PrintTest() {
        Tag264IntMarketDepth tagData;
        int oneElement;

        oneElement = Tag264IntMarketDepth.TESTA_INT_MARKET_DEPTH;
        tagData = new Tag264IntMarketDepth( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag264IntMarketDepth.TESTB_INT_MARKET_DEPTH;
        tagData = new Tag264IntMarketDepth( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag264IntMarketDepth tagData;
        int oneElement;

        oneElement = Tag264IntMarketDepth.TESTA_INT_MARKET_DEPTH;
        tagData = new Tag264IntMarketDepth( new MyIntType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag264IntMarketDepth.TESTB_INT_MARKET_DEPTH;
        tagData = new Tag264IntMarketDepth( new MyIntType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag264IntMarketDepth tagData, final int oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag264IntMarketDepth tagData ) {
        assertEquals( "FIX264_INT_MARKET_DEPTH", tagData.toEnumLabelString());
        assertEquals( "264", tagData.toEnumIDString());
        assertEquals( "MARKET_DEPTH", tagData.toEnumNameString());
        assertEquals( "MarketDepth", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag264IntMarketDepth tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue() );
    }

    private void verifyValuePairString( final Tag264IntMarketDepth tagData, final int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag264IntMarketDepth tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }

    private void verifyVerboseString( final Tag264IntMarketDepth tagData ) {
        assertEquals( "Tag264IntMarketDepth\n" +
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