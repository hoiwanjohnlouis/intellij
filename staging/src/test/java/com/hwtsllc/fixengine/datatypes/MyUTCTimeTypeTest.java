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

package com.hwtsllc.fixengine.datatypes;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyUTCTimeTypeTest {
    MyUTCTimeType dataType;
    String [] TestArray = {
            MyUTCTimeType.TESTA_MY_UTC_TIME_TYPE,
            MyUTCTimeType.TESTB_MY_UTC_TIME_TYPE
    };

    @Test
    void UTCTimeTypeTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            dataType = new MyUTCTimeType( oneElement );
            assertEquals( oneElement, dataType.toString() );
            assertNotEquals( MyTestValues.JUNK_TZT_DATA_VALUE, dataType.toString());
        }
    }
    @Test
    void PrintTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            dataType = new MyUTCTimeType( oneElement );
            System.out.println( dataType.toVerboseString() );
        }
    }
}