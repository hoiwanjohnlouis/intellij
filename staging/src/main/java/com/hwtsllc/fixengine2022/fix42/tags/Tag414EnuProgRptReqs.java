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
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  414
 *  ProgRptReqs
 *  int
 *  <p>
 *  Code to identify the desired frequency of progress reports.
 *  <p></p>
 *  Valid values:
 *  <p>     1-3 msg types
 *  <p>     "1 - Buy-side explicitly requests status using Statue Request (default), the sell-side firm can,
 *               however, send a DONE status List STatus Response  in an unsolicited fashion"
 *  <p>     "2 - Sell-side periodically sends status using List Status.
 *               Period optionally specified in ProgressPeriod"
 *  <p>     "3 - Real-time execution reports (to be discourage)"
 */
public class Tag414EnuProgRptReqs extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum414ProgRptReqs dataValue;

    public final static Enum414ProgRptReqs TESTA_ENU_PROG_RPT_REQS
            = Enum414ProgRptReqs.BUY_SIDE_STATUS;
    public final static Enum414ProgRptReqs TESTB_ENU_PROG_RPT_REQS
            = Enum414ProgRptReqs.REAL_TIME_EXECUTION_REPORTS;

    public Tag414EnuProgRptReqs(Enum414ProgRptReqs dataValue) {
        setFixType(FIX42.FIX414_ENU_PROG_RPT_REQS);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.toEnumIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
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
                .concat("]")
                .concat("\n\tValuePair[")
                .concat(toValuePairString())
                .concat("]")
                .concat("\n\tDataID[")
                .concat(toDataIDString())
                .concat("]")
                .concat("\n\tDataName[")
                .concat(toDataNameString())
                .concat("]")
                .concat("\n\tDataDescription[")
                .concat(toDataDescriptionString())
                .concat("]")
                ;
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return this.dataValue.toEnumIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toEnumNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toEnumDescriptionString();
    }
    /**
     * standard wrapper to return a string describing the data
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
        Tag414EnuProgRptReqs tagData;

        tagData = new Tag414EnuProgRptReqs(TESTA_ENU_PROG_RPT_REQS);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag414EnuProgRptReqs(TESTB_ENU_PROG_RPT_REQS);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum414ProgRptReqs oneEnum : Enum414ProgRptReqs.values()) {
            System.out.println( new Tag414EnuProgRptReqs(oneEnum).toVerboseString() );
        }
    }
}
