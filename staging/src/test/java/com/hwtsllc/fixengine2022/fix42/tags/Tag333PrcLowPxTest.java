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
 *  333
 *  LowPx
 *  Price
 *  <p>
 *  Represents an indication of the low end of the price range for a security prior to the open or reopen
 */
class Tag333PrcLowPxTest {
    @Test
    void FIX0333Test() {
        FIX42 fixData = FIX42.FIX333_PRC_LOW_PX;
        assertEquals( "333", fixData.toFIXIDString());
        assertEquals( "LOW_PX", fixData.toFIXNameString());
        assertEquals( "LowPx", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0333Test() {
        Tag333PrcLowPx tagData;
        double oneElement;

        oneElement = Tag333PrcLowPx.TESTA_PRC_LOW_PX;
        tagData = new Tag333PrcLowPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag333PrcLowPx.TESTB_PRC_LOW_PX;
        tagData = new Tag333PrcLowPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag333PrcLowPx tagData;
        double oneElement;

        oneElement = Tag333PrcLowPx.TESTA_PRC_LOW_PX;
        tagData = new Tag333PrcLowPx( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag333PrcLowPx.TESTB_PRC_LOW_PX;
        tagData = new Tag333PrcLowPx( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag333PrcLowPx tagData;
        double oneElement;

        oneElement = Tag333PrcLowPx.TESTB_PRC_LOW_PX;
        tagData = new Tag333PrcLowPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag333PrcLowPx tagData;
        double oneElement;

        oneElement = Tag333PrcLowPx.TESTB_PRC_LOW_PX;
        tagData = new Tag333PrcLowPx( new MyPriceType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag333PrcLowPx tagData;
        double oneElement;

        oneElement = Tag333PrcLowPx.TESTB_PRC_LOW_PX;
        tagData = new Tag333PrcLowPx( new MyPriceType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag333PrcLowPx tagData;
        double oneElement;

        oneElement = Tag333PrcLowPx.TESTA_PRC_LOW_PX;
        tagData = new Tag333PrcLowPx( new MyPriceType( oneElement ) );
        assertEquals( "Tag333PrcLowPx\n" +
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