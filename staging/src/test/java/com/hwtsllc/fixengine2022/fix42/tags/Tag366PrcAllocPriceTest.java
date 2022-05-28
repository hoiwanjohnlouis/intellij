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
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  366
 *  AllocPrice
 *  Price
 *  <p>
 *  Executed price for an AllocAccount (79) entry.
 *  <p>
 *  Used when using "executed price" vs. "average price" allocations (e.g. Japan).
 */
class Tag366PrcAllocPriceTest {
    @Test
    void FIX0366Test() {
        FIX42 fixData = FIX42.FIX366_PRC_ALLOC_PRICE;
        assertEquals( "366", fixData.toFIXIDString());
        assertEquals( "ALLOC_PRICE", fixData.toFIXNameString());
        assertEquals( "AllocPrice", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0366Test() {
        Tag366PrcAllocPrice tagData;
        double oneElement;

        oneElement = Tag366PrcAllocPrice.TESTA_PRC_ALLOC_PRICE;
        tagData = new Tag366PrcAllocPrice( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag366PrcAllocPrice.TESTB_PRC_ALLOC_PRICE;
        tagData = new Tag366PrcAllocPrice( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
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
    void TagGetDataValueTest() {
        Tag366PrcAllocPrice tagData;
        double oneElement;

        oneElement = Tag366PrcAllocPrice.TESTB_PRC_ALLOC_PRICE;
        tagData = new Tag366PrcAllocPrice( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag366PrcAllocPrice tagData;
        double oneElement;

        oneElement = Tag366PrcAllocPrice.TESTB_PRC_ALLOC_PRICE;
        tagData = new Tag366PrcAllocPrice( new MyPriceType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag366PrcAllocPrice tagData;
        double oneElement;

        oneElement = Tag366PrcAllocPrice.TESTB_PRC_ALLOC_PRICE;
        tagData = new Tag366PrcAllocPrice( new MyPriceType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag366PrcAllocPrice tagData;
        double oneElement;

        oneElement = Tag366PrcAllocPrice.TESTA_PRC_ALLOC_PRICE;
        tagData = new Tag366PrcAllocPrice( new MyPriceType( oneElement ) );
        assertEquals( "Tag366PrcAllocPrice\n" +
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