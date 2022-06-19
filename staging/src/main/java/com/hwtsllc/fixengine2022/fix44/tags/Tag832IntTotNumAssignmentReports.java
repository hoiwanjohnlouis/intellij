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
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  832
 *  TotNumAssignmentReports
 *  int
 *  <p></p>
 *  Total Number of Assignment Reports being returned to a firm
 */
public class Tag832IntTotNumAssignmentReports extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyIntType dataValue;

    public final static int TESTA_INT_TOT_NUM_ASSIGNMENT_REPORTS
            = 832;
    public final static int TESTB_INT_TOT_NUM_ASSIGNMENT_REPORTS
            = 32;

    public Tag832IntTotNumAssignmentReports(MyIntType dataValue) {
        setFixType( FIX44.FIX832_INT_TOT_NUM_ASSIGNMENT_REPORTS );
        this.dataValue = dataValue;
    }

    public int getDataValue() {
        return this.dataValue.getDataValue();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
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
                ;
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
        Tag832IntTotNumAssignmentReports tagData;

        tagData = new Tag832IntTotNumAssignmentReports(new MyIntType( TESTA_INT_TOT_NUM_ASSIGNMENT_REPORTS ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag832IntTotNumAssignmentReports(new MyIntType( TESTB_INT_TOT_NUM_ASSIGNMENT_REPORTS ) );
        System.out.println(tagData.toVerboseString());
    }
}