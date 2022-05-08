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

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyUTCTimestampType;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 * 	UTCTimestamp:  Time/date combination represented in UTC (Universal Time Coordinated, also known as “GMT”) in either
 *     	YYYYMMDD-HH:MM:SS (whole seconds) or
 *     	YYYYMMDD-HH:MM:SS.sss (milliseconds) format, colons, dash, and period required.
 * <p>
 * Valid values:
 *      YYYY = 0000-9999, MM = 01-12, DD = 01-31, HH = 00-23, MM = 00-59, SS = 00-60 (60 only if UTC leap second) (without milliseconds).
 *      YYYY = 0000-9999, MM = 01-12, DD = 01-31, HH = 00-23, MM = 00-59, SS = 00-60 (60 only if UTC leap second), sss=000-999 (indicating milliseconds).
 * <p>
 * Leap Seconds:  Note that UTC includes corrections for leap seconds, which are inserted to account for slowing of the rotation of the earth.
 *      Leap second insertion is declared by the International Earth Rotation Service (IERS) and has, since 1972,
 *      only occurred on the night of Dec. 31 or Jun 30.  The IERS considers March 31 and September 30 as
 *      secondary dates for leap second insertion, but has never utilized these dates.
 * <p>
 *      During a leap second insertion, a UTCTimestamp field may read "19981231-23:59:59", "19981231-23:59:60", "19990101-00:00:00".
 *      (see http://tycho.usno.navy.mil/leapsec.html)
 */
/**
 *  60
 *  TransactTime
 *  UTCTimestamp
 *  Time of execution/order creation
 *  (expressed in UTC (Universal Time Coordinated), also known as "GMT")
 */
public class Tag60UtcTransactTime extends FIX27Abstract implements FixTagValuePairString, LogStringVerbose {
    private final MyUTCTimestampType dataValue;

    public final static String TESTA_UTC_TRANSACT_TIME = "18991231-23:59:59.060";
    public final static String TESTB_UTC_TRANSACT_TIME = "19001231-23:59:59.060";

    public Tag60UtcTransactTime(MyUTCTimestampType dataValue) {
        setFixType(FIX27.FIX60_UTC_TRANSACT_TIME);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getDataValue();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toFixTagValuePairString() {
        return getID()
                .concat("=")
                .concat(dataValue.toString());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toLogStringVerbose() {
        return super.toLogStringVerbose()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag60UtcTransactTime tagData;

        tagData = new Tag60UtcTransactTime(new MyUTCTimestampType(TESTA_UTC_TRANSACT_TIME) );
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag60UtcTransactTime(new MyUTCTimestampType(TESTB_UTC_TRANSACT_TIME) );
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
