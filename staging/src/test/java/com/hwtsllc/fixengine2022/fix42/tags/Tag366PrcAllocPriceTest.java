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

import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  366
 *  AllocPrice
 *  Price
 *  <p></p>
 *  Executed price for an AllocAccount (79) entry.
 *  <p></p>
 *  Used when using "executed price" vs. "average price" allocations (e.g. Japan).
 */
class Tag366PrcAllocPriceTest {
    @Test
    void PrintTest() {
        Tag366PrcAllocPrice tagData;
        double oneElement;

        oneElement = Tag366PrcAllocPrice.TESTA_PRC_ALLOC_PRICE;
        tagData = new Tag366PrcAllocPrice( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag366PrcAllocPrice.TESTB_PRC_ALLOC_PRICE;
        tagData = new Tag366PrcAllocPrice( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag366PrcAllocPrice tagData;
        double oneElement;

        oneElement = Tag366PrcAllocPrice.TESTA_PRC_ALLOC_PRICE;
        tagData = new Tag366PrcAllocPrice( new MyPriceType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag366PrcAllocPrice.TESTB_PRC_ALLOC_PRICE;
        tagData = new Tag366PrcAllocPrice( new MyPriceType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( Tag366PrcAllocPrice tagData, double oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag366PrcAllocPrice tagData ) {
        assertEquals( "FIX366_PRC_ALLOC_PRICE", tagData.toEnumLabelString());
        assertEquals( "366", tagData.toEnumIDString());
        assertEquals( "ALLOC_PRICE", tagData.toEnumNameString());
        assertEquals( "AllocPrice", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag366PrcAllocPrice tagData, final double oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag366PrcAllocPrice tagData, final double oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag366PrcAllocPrice tagData, final double oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag366PrcAllocPrice tagData ) {
        assertEquals( "Tag366PrcAllocPrice\n" +
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