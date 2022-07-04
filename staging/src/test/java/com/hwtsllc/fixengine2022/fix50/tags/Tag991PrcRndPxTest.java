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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  991
 *  RndPx
 *  Price
 *  <p>
 *  Specifies average price rounded to quoted precision.
 */
class Tag991PrcRndPxTest {
    @Test
    void FIX0991Test() {
        FIX50 fixData = FIX50.FIX991_PRC_RND_PX;
        assertEquals( "991", fixData.toEnumIDString());
        assertEquals( "RND_PX", fixData.toEnumNameString());
        assertEquals( "RndPx", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0991Test() {
        Tag991PrcRndPx tagData;
        double oneElement;

        oneElement = Tag991PrcRndPx.TESTA_PRC_RND_PX;
        tagData = new Tag991PrcRndPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag991PrcRndPx.TESTB_PRC_RND_PX;
        tagData = new Tag991PrcRndPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag991PrcRndPx tagData;
        double oneElement;

        oneElement = Tag991PrcRndPx.TESTA_PRC_RND_PX;
        tagData = new Tag991PrcRndPx( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag991PrcRndPx.TESTB_PRC_RND_PX;
        tagData = new Tag991PrcRndPx( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag991PrcRndPx tagData;
        double oneElement;

        oneElement = Tag991PrcRndPx.TESTB_PRC_RND_PX;
        tagData = new Tag991PrcRndPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag991PrcRndPx tagData;
        double oneElement;

        oneElement = Tag991PrcRndPx.TESTB_PRC_RND_PX;
        tagData = new Tag991PrcRndPx( new MyPriceType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag991PrcRndPx tagData;
        double oneElement;

        oneElement = Tag991PrcRndPx.TESTB_PRC_RND_PX;
        tagData = new Tag991PrcRndPx( new MyPriceType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag991PrcRndPx tagData;
        double oneElement;

        oneElement = Tag991PrcRndPx.TESTA_PRC_RND_PX;
        tagData = new Tag991PrcRndPx( new MyPriceType( oneElement ) );
        assertEquals( "Tag991PrcRndPx\n" +
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