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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine2022.fix50.enums.Bool1134ReportedPxDiff;
import com.hwtsllc.fixengine2022.interfaces.BooleanString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  1134
 *  ReportedPxDiff
 *  Boolean
 *  <p>
 *  Shows that the reported price that is different from the market price
 *  <p></p>
 *  <p> YES( "Y", "YES", "Y - Reported price is different from the market price" ),
 *  <p> NO( "N", "NO", "N - Reported price is equal to market price" ),
 */
public class Tag1134BoolReportedPxDiff extends FIX50Abstract implements LogValuePairString, LogVerboseString, BooleanString {
    private final Bool1134ReportedPxDiff dataValue;

    public final static Bool1134ReportedPxDiff TESTA_BOOL_REPORTED_PX_DIFF
            = Bool1134ReportedPxDiff.NO ;
    public final static Bool1134ReportedPxDiff TESTB_BOOL_REPORTED_PX_DIFF
            = Bool1134ReportedPxDiff.YES;

    public Tag1134BoolReportedPxDiff(Bool1134ReportedPxDiff dataValue) {
        setFixType(FIX50.FIX1134_BOOL_REPORTED_PX_DIFF);
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
     * wrapper to format a simple Yes string describing the data
     */
    @Override
    public String toYesString() {
        return null;
    }
    /**
     * wrapper to format a simple No string describing the data
     */
    @Override
    public String toNoString() {
        return null;
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
        Tag1134BoolReportedPxDiff tagData;

        tagData = new Tag1134BoolReportedPxDiff(TESTA_BOOL_REPORTED_PX_DIFF);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag1134BoolReportedPxDiff(TESTB_BOOL_REPORTED_PX_DIFF);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}