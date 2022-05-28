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
import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  382
 *  NoContraBrokers
 *  NumInGroup
 *  <p>
 *  The number of ContraBroker (375) entries.
 */
class Tag382NumNoContraBrokersTest {
    @Test
    void FIX0382Test() {
        FIX42 fixData = FIX42.FIX382_NUM_NO_CONTRA_BROKERS;
        assertEquals( "382", fixData.toFIXIDString());
        assertEquals( "NO_CONTRA_BROKERS", fixData.toFIXNameString());
        assertEquals( "NoContraBrokers", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0382Test() {
        Tag382NumNoContraBrokers tagData;
        int oneElement;

        oneElement = Tag382NumNoContraBrokers.TESTA_NUM_NO_CONTRA_BROKERS;
        tagData = new Tag382NumNoContraBrokers( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag382NumNoContraBrokers.TESTB_NUM_NO_CONTRA_BROKERS;
        tagData = new Tag382NumNoContraBrokers( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag382NumNoContraBrokers tagData;
        int oneElement;

        oneElement = Tag382NumNoContraBrokers.TESTA_NUM_NO_CONTRA_BROKERS;
        tagData = new Tag382NumNoContraBrokers( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag382NumNoContraBrokers.TESTB_NUM_NO_CONTRA_BROKERS;
        tagData = new Tag382NumNoContraBrokers( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag382NumNoContraBrokers tagData;
        int oneElement;

        oneElement = Tag382NumNoContraBrokers.TESTB_NUM_NO_CONTRA_BROKERS;
        tagData = new Tag382NumNoContraBrokers( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag382NumNoContraBrokers tagData;
        int oneElement;

        oneElement = Tag382NumNoContraBrokers.TESTB_NUM_NO_CONTRA_BROKERS;
        tagData = new Tag382NumNoContraBrokers( new MyNumInGroupType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag382NumNoContraBrokers tagData;
        int oneElement;

        oneElement = Tag382NumNoContraBrokers.TESTB_NUM_NO_CONTRA_BROKERS;
        tagData = new Tag382NumNoContraBrokers( new MyNumInGroupType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag382NumNoContraBrokers tagData;
        int oneElement;

        oneElement = Tag382NumNoContraBrokers.TESTA_NUM_NO_CONTRA_BROKERS;
        tagData = new Tag382NumNoContraBrokers( new MyNumInGroupType( oneElement ) );
        assertEquals( "Tag382NumNoContraBrokers\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}