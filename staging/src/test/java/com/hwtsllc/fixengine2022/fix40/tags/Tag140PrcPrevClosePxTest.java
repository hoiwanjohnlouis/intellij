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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  140
 *  PrevClosePx
 *  Price
 *  <p></p>
 *  Previous closing price of security.
 */
class Tag140PrcPrevClosePxTest {
    @Test
    void PrintFIXTagTest() {
        Tag140PrcPrevClosePx tagData;
        double oneElement;

        oneElement = Tag140PrcPrevClosePx.TESTA_PRC_PREV_CLOSE_PX;
        tagData = new Tag140PrcPrevClosePx(new MyPriceType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag140PrcPrevClosePx.TESTB_PRC_PREV_CLOSE_PX;
        tagData = new Tag140PrcPrevClosePx(new MyPriceType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag140PrcPrevClosePx tagData;
        double oneElement;

        oneElement = Tag140PrcPrevClosePx.TESTA_PRC_PREV_CLOSE_PX;
        tagData = new Tag140PrcPrevClosePx(new MyPriceType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag140PrcPrevClosePx.TESTB_PRC_PREV_CLOSE_PX;
        tagData = new Tag140PrcPrevClosePx(new MyPriceType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag140PrcPrevClosePx tagData ) {
        assertEquals( "FIX140_PRC_PREV_CLOSE_PX", tagData.toEnumLabelString());
        assertEquals( "PREV_CLOSE_PX", tagData.toEnumNameString() );
        assertEquals( "140", tagData.toEnumIDString() );
        assertEquals( "PrevClosePx", tagData.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag140PrcPrevClosePx tagData;
        double oneElement;

        oneElement = Tag140PrcPrevClosePx.TESTA_PRC_PREV_CLOSE_PX;
        tagData = new Tag140PrcPrevClosePx(new MyPriceType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag140PrcPrevClosePx.TESTB_PRC_PREV_CLOSE_PX;
        tagData = new Tag140PrcPrevClosePx(new MyPriceType( oneElement ));
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag140PrcPrevClosePx tagData, final double oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag140PrcPrevClosePx tagData;
        double oneElement;

        oneElement = Tag140PrcPrevClosePx.TESTA_PRC_PREV_CLOSE_PX;
        tagData = new Tag140PrcPrevClosePx(new MyPriceType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag140PrcPrevClosePx.TESTB_PRC_PREV_CLOSE_PX;
        tagData = new Tag140PrcPrevClosePx(new MyPriceType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag140PrcPrevClosePx tagData, final double oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag140PrcPrevClosePx tagData;
        double oneElement;

        oneElement = Tag140PrcPrevClosePx.TESTA_PRC_PREV_CLOSE_PX;
        tagData = new Tag140PrcPrevClosePx(new MyPriceType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag140PrcPrevClosePx.TESTB_PRC_PREV_CLOSE_PX;
        tagData = new Tag140PrcPrevClosePx(new MyPriceType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag140PrcPrevClosePx tagData, final double oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag140PrcPrevClosePx tagData;
        double oneElement;

        oneElement = Tag140PrcPrevClosePx.TESTA_PRC_PREV_CLOSE_PX;
        tagData = new Tag140PrcPrevClosePx(new MyPriceType( oneElement ));
        verifyVerboseString( tagData );

        oneElement = Tag140PrcPrevClosePx.TESTB_PRC_PREV_CLOSE_PX;
        tagData = new Tag140PrcPrevClosePx(new MyPriceType( oneElement ));
        verifyVerboseString( tagData );
    }

    private void verifyVerboseString( final Tag140PrcPrevClosePx tagData ) {
        assertEquals( "Tag140PrcPrevClosePx\n" +
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