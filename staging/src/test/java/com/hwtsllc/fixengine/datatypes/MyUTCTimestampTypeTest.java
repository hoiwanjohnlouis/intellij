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

/**
 *  UTCTimestamp:  Time/date combination represented in UTC (Universal Time Coordinated, also known as “GMT”) in either
 *  <p>    YYYYMMDD-HH:MM:SS (whole seconds) or
 *  <p>    YYYYMMDD-HH:MM:SS.sss (milliseconds) format, colons, dash, and period required.
 *  <p></p>
 *  Valid values:
 *  <p></p>
 *      YYYY = 0000-9999, MM = 01-12, DD = 01-31, HH = 00-23, MM = 00-59, SS = 00-60 (60 only if UTC leap second) (without milliseconds).
 *  <p></p>
 *      YYYY = 0000-9999, MM = 01-12, DD = 01-31, HH = 00-23, MM = 00-59, SS = 00-60 (60 only if UTC leap second), sss=000-999 (indicating milliseconds).
 *  <p></p>
 *      Leap Seconds:  Note that UTC includes corrections for leap seconds,
 *      which are inserted to account for slowing of the rotation of the earth.
 *  <p></p>
 *      Leap second insertion is declared by the International Earth Rotation Service (IERS) and has, since 1972,
 *      only occurred on the night of Dec. 31 or Jun 30.
 * <p></p>
 *      The IERS considers March 31 and September 30 as secondary dates for leap second insertion,
 *      but has never utilized these dates.
 * <p></p>
 *      During a leap second insertion, a UTCTimestamp field may read
 * <p>     "19981231-23:59:59",
 * <p>     "19981231-23:59:60",
 * <p>     "19990101-00:00:00".
 * <p></p>
 *      (see http://tycho.usno.navy.mil/leapsec.html)
 */
class MyUTCTimestampTypeTest {
    MyUTCTimestampType dataType;
    String [] TestArray = {
            MyUTCTimestampType.TESTA_MY_UTC_TIMESTAMP_TYPE,
            MyUTCTimestampType.TESTB_MY_UTC_TIMESTAMP_TYPE
    };

    @Test
    void UTCTimestampTypeTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            dataType = new MyUTCTimestampType( oneElement );
            assertEquals( oneElement, dataType.toString() );
            assertNotEquals( MyTestValues.JUNK_TZT_DATA_VALUE, dataType.toString());
        }
    }
    @Test
    void PrintTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            dataType = new MyUTCTimestampType( oneElement );
            System.out.println( dataType.toVerboseString() );
        }
    }
}