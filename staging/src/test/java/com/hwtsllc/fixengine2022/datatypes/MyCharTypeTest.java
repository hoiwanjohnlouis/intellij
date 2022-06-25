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

package com.hwtsllc.fixengine2022.datatypes;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCharTypeTest {
    @Test
    void CharTypeTest() {
        MyCharType dataType;
        char oneElement;

        oneElement = 's';
        dataType = new MyCharType( oneElement );
        assertEquals( oneElement, dataType.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_CHA_DATA_VALUE, dataType.getDataValue());

        oneElement = '0';
        dataType = new MyCharType( oneElement );
        assertEquals( oneElement, dataType.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_CHA_DATA_VALUE, dataType.getDataValue());

        oneElement = MyCharType.TESTA_MY_CHAR_TYPE;
        dataType = new MyCharType( oneElement );
        assertEquals( oneElement, dataType.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_CHA_DATA_VALUE, dataType.getDataValue());

        oneElement = MyCharType.TESTB_MY_CHAR_TYPE;
        dataType = new MyCharType( oneElement );
        assertEquals( oneElement, dataType.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_CHA_DATA_VALUE, dataType.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        MyCharType dataType;
        char oneElement;

        oneElement = '7';
        dataType = new MyCharType( oneElement );
        System.out.println( dataType.toVerboseString() );

        oneElement = 'f';
        dataType = new MyCharType( oneElement );
        System.out.println( dataType.toVerboseString() );

        oneElement = MyCharType.TESTA_MY_CHAR_TYPE;
        dataType = new MyCharType( oneElement );
        System.out.println( dataType.toVerboseString() );

        oneElement = MyCharType.TESTB_MY_CHAR_TYPE;
        dataType = new MyCharType( oneElement );
        System.out.println( dataType.toVerboseString() );
    }
}