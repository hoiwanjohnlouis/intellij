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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MyUTCTimestampTypeTest {
    @Test
    void UTCTimestampTypeTest() {
        MyUTCTimestampType dataType;
        String oneElement;

        oneElement = MyUTCTimestampType.TESTA_MY_UTC_TIMESTAMP_TYPE;
        dataType = new MyUTCTimestampType( oneElement );
        assertEquals( oneElement, dataType.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, dataType.getDataValue());

        oneElement = MyUTCTimestampType.TESTB_MY_UTC_TIMESTAMP_TYPE;
        dataType = new MyUTCTimestampType( oneElement );
        assertEquals( oneElement, dataType.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, dataType.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        MyUTCTimestampType dataType;
        String oneElement;

        oneElement = MyUTCTimestampType.TESTA_MY_UTC_TIMESTAMP_TYPE;
        dataType = new MyUTCTimestampType( oneElement );
        System.out.println( dataType.toVerboseString() );

        oneElement = MyUTCTimestampType.TESTB_MY_UTC_TIMESTAMP_TYPE;
        dataType = new MyUTCTimestampType( oneElement );
        System.out.println( dataType.toVerboseString() );
    }
}