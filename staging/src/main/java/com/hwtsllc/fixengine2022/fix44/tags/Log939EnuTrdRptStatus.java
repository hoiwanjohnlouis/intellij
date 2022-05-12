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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.fix44.enums.Enum939TrdRptStatus;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  939
 *  TrdRptStatus
 *  int
 *  Trade Report Status
 *  Valid values:
 *      0 - Accepted
 *      1 - Rejected
 *      3 - Accepted with errors
 */
public class Log939EnuTrdRptStatus extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final Enum939TrdRptStatus dataValue;

    public final static Enum939TrdRptStatus TESTA_ENU_TRD_RPT_STATUS
            = Enum939TrdRptStatus.ACCEPTED;
    public final static Enum939TrdRptStatus TESTB_ENU_TRD_RPT_STATUS
            = Enum939TrdRptStatus.REJECTED;

    public Log939EnuTrdRptStatus(Enum939TrdRptStatus dataValue) {
        setFixType(FIX44.FIX939_ENU_TRD_RPT_STATUS);
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
        Log939EnuTrdRptStatus tagData;

        tagData = new Log939EnuTrdRptStatus(TESTA_ENU_TRD_RPT_STATUS);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Log939EnuTrdRptStatus(TESTB_ENU_TRD_RPT_STATUS);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
