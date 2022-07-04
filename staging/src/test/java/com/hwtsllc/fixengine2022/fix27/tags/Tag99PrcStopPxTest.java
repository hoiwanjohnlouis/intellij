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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  99
 *  StopPx
 *  Price
 *  <p>
 *  Price per unit of quantity (e.g. per share)
 */
class Tag99PrcStopPxTest {
    @Test
    void FIX0099Test() {
        FIX27 fixData = FIX27.FIX99_PRC_STOP_PX;
        assertEquals( "STOP_PX", fixData.toEnumNameString());
        assertEquals( "99", fixData.toEnumIDString());
        assertEquals( "StopPx", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void PrintFIXTagTest() {
        Tag99PrcStopPx tagData;

        tagData = new Tag99PrcStopPx(new MyPriceType(Tag99PrcStopPx.TESTB_PRC_STOP_PX));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag99PrcStopPx tagData;

        tagData = new Tag99PrcStopPx(new MyPriceType(Tag99PrcStopPx.TESTB_PRC_STOP_PX));
        assertEquals( Tag99PrcStopPx.TESTB_PRC_STOP_PX, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag99PrcStopPx tagData;

        tagData = new Tag99PrcStopPx(new MyPriceType(Tag99PrcStopPx.TESTB_PRC_STOP_PX));
        assertEquals( tagData.toEnumIDString() + "=" + Tag99PrcStopPx.TESTB_PRC_STOP_PX,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag99PrcStopPx tagData;

        tagData = new Tag99PrcStopPx(new MyPriceType(Tag99PrcStopPx.TESTB_PRC_STOP_PX));
        assertEquals( String.valueOf(Tag99PrcStopPx.TESTB_PRC_STOP_PX),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag99PrcStopPx tagData;

        tagData = new Tag99PrcStopPx(new MyPriceType(Tag99PrcStopPx.TESTA_PRC_STOP_PX));
        assertEquals( "Tag99PrcStopPx\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag99PrcStopPx.TESTA_PRC_STOP_PX + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag99PrcStopPx.TESTA_PRC_STOP_PX + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}