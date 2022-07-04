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
 *  651
 *  UnderlyingLastPx
 *  Price
 *  <p>
 *  The calculated or traded price for the underlying instrument that corresponds to a derivative.
 *  <p>
 *  Used for transactions that include the cash instrument and the derivative.
 */
class Tag651PrcUnderlyingLastPxTest {
    @Test
    void FIX0651Test() {
        FIX43 fixData = FIX43.FIX651_PRC_UNDERLYING_LAST_PX;
        assertEquals( "651", fixData.toEnumIDString());
        assertEquals( "UNDERLYING_LAST_PX", fixData.toEnumNameString());
        assertEquals( "UnderlyingLastPx", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0651Test() {
        Tag651PrcUnderlyingLastPx tagData;
        double oneElement;

        oneElement = Tag651PrcUnderlyingLastPx.TESTA_PRC_UNDERLYING_LAST_PX;
        tagData = new Tag651PrcUnderlyingLastPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag651PrcUnderlyingLastPx.TESTB_PRC_UNDERLYING_LAST_PX;
        tagData = new Tag651PrcUnderlyingLastPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag651PrcUnderlyingLastPx tagData;
        double oneElement;

        oneElement = Tag651PrcUnderlyingLastPx.TESTA_PRC_UNDERLYING_LAST_PX;
        tagData = new Tag651PrcUnderlyingLastPx( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag651PrcUnderlyingLastPx.TESTB_PRC_UNDERLYING_LAST_PX;
        tagData = new Tag651PrcUnderlyingLastPx( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag651PrcUnderlyingLastPx tagData;
        double oneElement;

        oneElement = Tag651PrcUnderlyingLastPx.TESTB_PRC_UNDERLYING_LAST_PX;
        tagData = new Tag651PrcUnderlyingLastPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag651PrcUnderlyingLastPx tagData;
        double oneElement;

        oneElement = Tag651PrcUnderlyingLastPx.TESTB_PRC_UNDERLYING_LAST_PX;
        tagData = new Tag651PrcUnderlyingLastPx( new MyPriceType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag651PrcUnderlyingLastPx tagData;
        double oneElement;

        oneElement = Tag651PrcUnderlyingLastPx.TESTB_PRC_UNDERLYING_LAST_PX;
        tagData = new Tag651PrcUnderlyingLastPx( new MyPriceType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag651PrcUnderlyingLastPx tagData;
        double oneElement;

        oneElement = Tag651PrcUnderlyingLastPx.TESTA_PRC_UNDERLYING_LAST_PX;
        tagData = new Tag651PrcUnderlyingLastPx( new MyPriceType( oneElement ) );
        assertEquals( "Tag651PrcUnderlyingLastPx\n" +
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