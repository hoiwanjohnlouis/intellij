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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  867
 *  EventPx
 *  Price
 *  <p></p>
 *  Predetermined price of issue at event, if applicable
 */
class Tag867PrcEventPxTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX867_PRC_EVENT_PX;
        assertEquals( "867", fixData.toEnumIDString());
        assertEquals( "EVENT_PX", fixData.toEnumNameString());
        assertEquals( "EventPx", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0867Test() {
        Tag867PrcEventPx tagData;
        double oneElement;

        oneElement = Tag867PrcEventPx.TESTA_PRC_EVENT_PX;
        tagData = new Tag867PrcEventPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "867", tagData.toEnumIDString());
        assertEquals( "EVENT_PX", tagData.toEnumNameString());
        assertEquals( "EventPx", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag867PrcEventPx.TESTB_PRC_EVENT_PX;
        tagData = new Tag867PrcEventPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag867PrcEventPx tagData;
        double oneElement;

        oneElement = Tag867PrcEventPx.TESTA_PRC_EVENT_PX;
        tagData = new Tag867PrcEventPx( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag867PrcEventPx.TESTB_PRC_EVENT_PX;
        tagData = new Tag867PrcEventPx( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag867PrcEventPx tagData;
        double oneElement;

        oneElement = Tag867PrcEventPx.TESTB_PRC_EVENT_PX;
        tagData = new Tag867PrcEventPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag867PrcEventPx tagData;
        double oneElement;

        oneElement = Tag867PrcEventPx.TESTB_PRC_EVENT_PX;
        tagData = new Tag867PrcEventPx( new MyPriceType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag867PrcEventPx tagData;
        double oneElement;

        oneElement = Tag867PrcEventPx.TESTB_PRC_EVENT_PX;
        tagData = new Tag867PrcEventPx( new MyPriceType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag867PrcEventPx tagData;
        double oneElement;

        oneElement = Tag867PrcEventPx.TESTA_PRC_EVENT_PX;
        tagData = new Tag867PrcEventPx( new MyPriceType( oneElement ) );
        assertEquals( "Tag867PrcEventPx\n" +
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