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
import com.hwtsllc.fixengine2022.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine2022.fix42.enums.Enum414ProgRptReqs;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  Tag414
 *  Enu
 *  ProgRptReqs
 *
 *      1-3 msg types
 *      BUY_SIDE_STATUS( "1", "BUY_SIDE_STATUS",
 *                          "1 - Buy-side explicitly requests status using Statue Request (default), " +
 *                          "the sell-side firm can, however, send a DONE status List STatus Response " +
 *                          "in an unsolicited fashion" ),
 *      SELL_SIDE_STATUS( "2", "SELL_SIDE_STATUS",
 *                          "2 - Sell-side periodically sends status using List Status. " +
 *                          "Period optionally specified in ProgressPeriod" ),
 *      REAL_TIME_EXECUTION_REPORTS( "3", "REAL_TIME_EXECUTION_REPORTS",
 *                          "3 - Real-time execution reports (to be discourage)" ),
 */
public class Log414EnuProgRptReqs extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final Enum414ProgRptReqs dataValue;

    public final static Enum414ProgRptReqs TESTA_ENU_PROG_RPT_REQS = Enum414ProgRptReqs.BUY_SIDE_STATUS;
    public final static Enum414ProgRptReqs TESTB_ENU_PROG_RPT_REQS = Enum414ProgRptReqs.REAL_TIME_EXECUTION_REPORTS;

    public Log414EnuProgRptReqs(Enum414ProgRptReqs dataValue) {
        setFixType(FIX42.FIX414_ENU_PROG_RPT_REQS);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
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
        Log414EnuProgRptReqs tagData;

        tagData = new Log414EnuProgRptReqs(TESTA_ENU_PROG_RPT_REQS);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Log414EnuProgRptReqs(TESTB_ENU_PROG_RPT_REQS);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
