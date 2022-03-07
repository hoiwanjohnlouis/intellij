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

import com.hwtsllc.fixengine2022.datatypes.FieldType;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * 	UTCTimestamp:  Time/date combination represented in UTC (Universal Time Coordinated, also known as “GMT”) in either
 *     	YYYYMMDD-HH:MM:SS (whole seconds) or
 *     	YYYYMMDD-HH:MM:SS.sss (milliseconds) format, colons, dash, and period required.
 *
 * Valid values:
 *      YYYY = 0000-9999, MM = 01-12, DD = 01-31, HH = 00-23, MM = 00-59, SS = 00-60 (60 only if UTC leap second) (without milliseconds).
 *      YYYY = 0000-9999, MM = 01-12, DD = 01-31, HH = 00-23, MM = 00-59, SS = 00-60 (60 only if UTC leap second), sss=000-999 (indicating milliseconds).
 *
 * Leap Seconds:  Note that UTC includes corrections for leap seconds, which are inserted to account for slowing of the rotation of the earth.
 *      Leap second insertion is declared by the International Earth Rotation Service (IERS) and has, since 1972,
 *      only occurred on the night of Dec. 31 or Jun 30.  The IERS considers March 31 and September 30 as
 *      secondary dates for leap second insertion, but has never utilized these dates.
 *
 *      During a leap second insertion, a UTCTimestamp field may read "19981231-23:59:59", "19981231-23:59:60", "19990101-00:00:00".
 *      (see http://tycho.usno.navy.mil/leapsec.html)
 */
public class Tag60TransactTime {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final FieldType fieldType = FieldType.LAST_TRADE_TIME_STAMP;
    private final String timeStamp;

    public final static String TESTA_TRANSACT_TIME = "18991231-23:59:60";
    public final static String TESTB_TRANSACT_TIME = "18991231-00:00:00";

    public Tag60TransactTime(final String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public FieldType getFieldType() {
        return fieldType;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFieldType().name());
        sb.append(":[");
        sb.append(getTimeStamp());
        sb.append("]");

        return sb.toString();
    }
}
