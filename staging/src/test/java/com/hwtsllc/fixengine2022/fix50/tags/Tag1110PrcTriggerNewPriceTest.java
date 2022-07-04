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
 *  1110
 *  TriggerNewPrice
 *  Price
 *  <p>
 *  The Price that the order should have after the trigger has hit.
 *  <p>
 *  Could be applicable for any trigger type, but must be specified for Trigger Type 1.
 */
class Tag1110PrcTriggerNewPriceTest {
    @Test
    void FIX1110Test() {
        FIX50 fixData = FIX50.FIX1110_PRC_TRIGGER_NEW_PRICE;
        assertEquals( "1110", fixData.toEnumIDString());
        assertEquals( "TRIGGER_NEW_PRICE", fixData.toEnumNameString());
        assertEquals( "TriggerNewPrice", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1110Test() {
        Tag1110PrcTriggerNewPrice tagData;
        double oneElement;

        oneElement = Tag1110PrcTriggerNewPrice.TESTA_PRC_TRIGGER_NEW_PRICE;
        tagData = new Tag1110PrcTriggerNewPrice( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag1110PrcTriggerNewPrice.TESTB_PRC_TRIGGER_NEW_PRICE;
        tagData = new Tag1110PrcTriggerNewPrice( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1110PrcTriggerNewPrice tagData;
        double oneElement;

        oneElement = Tag1110PrcTriggerNewPrice.TESTA_PRC_TRIGGER_NEW_PRICE;
        tagData = new Tag1110PrcTriggerNewPrice( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag1110PrcTriggerNewPrice.TESTB_PRC_TRIGGER_NEW_PRICE;
        tagData = new Tag1110PrcTriggerNewPrice( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag1110PrcTriggerNewPrice tagData;
        double oneElement;

        oneElement = Tag1110PrcTriggerNewPrice.TESTB_PRC_TRIGGER_NEW_PRICE;
        tagData = new Tag1110PrcTriggerNewPrice( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1110PrcTriggerNewPrice tagData;
        double oneElement;

        oneElement = Tag1110PrcTriggerNewPrice.TESTB_PRC_TRIGGER_NEW_PRICE;
        tagData = new Tag1110PrcTriggerNewPrice( new MyPriceType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag1110PrcTriggerNewPrice tagData;
        double oneElement;

        oneElement = Tag1110PrcTriggerNewPrice.TESTB_PRC_TRIGGER_NEW_PRICE;
        tagData = new Tag1110PrcTriggerNewPrice( new MyPriceType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1110PrcTriggerNewPrice tagData;
        double oneElement;

        oneElement = Tag1110PrcTriggerNewPrice.TESTA_PRC_TRIGGER_NEW_PRICE;
        tagData = new Tag1110PrcTriggerNewPrice( new MyPriceType( oneElement ) );
        assertEquals( "Tag1110PrcTriggerNewPrice\n" +
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