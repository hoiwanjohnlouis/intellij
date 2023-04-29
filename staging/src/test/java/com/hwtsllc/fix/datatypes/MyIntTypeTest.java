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

package com.hwtsllc.fix.datatypes;

import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MyIntTypeTest {
    @Test
    void IntTypeTest() {
        MyIntType dataType;
        int oneElement;

        oneElement = MyIntType.TESTA_MY_INT_TYPE;
        dataType = new MyIntType( oneElement );
        assertEquals( oneElement, Integer.valueOf( dataType.toString() ) );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, dataType.toString());

        oneElement = MyIntType.TESTB_MY_INT_TYPE;
        dataType = new MyIntType( oneElement );
        assertEquals( oneElement, Integer.valueOf( dataType.toString() ) );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, dataType.toString());
    }
    @Test
    void PrintFIXTagTest() {
        MyIntType dataType;
        int oneElement;

        oneElement = MyIntType.TESTA_MY_INT_TYPE;
        dataType = new MyIntType( oneElement );
        System.out.println( dataType.toVerboseString() );

        oneElement = MyIntType.TESTB_MY_INT_TYPE;
        dataType = new MyIntType( oneElement );
        System.out.println( dataType.toVerboseString() );
    }
}