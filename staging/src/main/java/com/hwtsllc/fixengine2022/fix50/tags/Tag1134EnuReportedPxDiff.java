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
import com.hwtsllc.fixengine2022.fix50.enums.Enum1134ReportedPxDiff;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
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
public class Tag1134EnuReportedPxDiff extends FIX50Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum1134ReportedPxDiff dataValue;

    public final static Enum1134ReportedPxDiff TESTA_ENU_REPORTED_PX_DIFF
            = Enum1134ReportedPxDiff.NO ;
    public final static Enum1134ReportedPxDiff TESTB_ENU_REPORTED_PX_DIFF
            = Enum1134ReportedPxDiff.YES;

    public Tag1134EnuReportedPxDiff(Enum1134ReportedPxDiff dataValue) {
        setFixType(FIX50.FIX1134_ENU_REPORTED_PX_DIFF);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
                .concat("=")
                .concat(dataValue.toString());
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
        return dataValue.toEnumIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toEnumNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return dataValue.toEnumDescriptionString();
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag1134EnuReportedPxDiff tagData;

        tagData = new Tag1134EnuReportedPxDiff(TESTA_ENU_REPORTED_PX_DIFF);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1134EnuReportedPxDiff(TESTB_ENU_REPORTED_PX_DIFF);
        System.out.println(tagData.toVerboseString());
    }
}
