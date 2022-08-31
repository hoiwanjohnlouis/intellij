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

class MyCurrencyTypeTest {
    @Test
    void CurrencyTypeTest() {
        MyCurrencyType dataType;
        String oneElement;

        oneElement = MyCurrencyType.TESTA_MY_CURRENCY_TYPE;
        dataType = new MyCurrencyType( oneElement );
        assertEquals( oneElement, dataType.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, dataType.toString());

        oneElement = MyCurrencyType.TESTB_MY_CURRENCY_TYPE;
        dataType = new MyCurrencyType( oneElement );
        assertEquals( oneElement, dataType.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, dataType.toString());
    }
    @Test
    void PrintFIXTagTest() {
        MyCurrencyType dataType;
        String oneElement;

        oneElement = MyCurrencyType.TESTA_MY_CURRENCY_TYPE;
        dataType = new MyCurrencyType( oneElement );
        System.out.println( dataType.toVerboseString() );

        oneElement = MyCurrencyType.TESTB_MY_CURRENCY_TYPE;
        dataType = new MyCurrencyType( oneElement );
        System.out.println( dataType.toVerboseString() );
    }
}