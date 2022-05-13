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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.FIX41Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyEnumCoveredOrUncovered;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  203 (same as 203, 565,)
 *  CoveredOrUncovered
 *  int
 *  <p>
 *  Used for derivative products, such as options
 *  <p></p>
 *  565
 *  LegCoveredOrUncovered
 *  int
 *  <p>
 *  CoveredOrUncovered for leg of a multileg
 *  <p>
 *  See CoveredOrUncovered (203) field for description
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Covered
 *  <p>    1 - Uncovered
 */
public class Tag203EnuCoveredOrUncovered extends FIX41Abstract implements LogValuePairString, LogVerboseString {
    private final MyEnumCoveredOrUncovered dataValue;

    public final static MyEnumCoveredOrUncovered TESTA_ENU_MISC_FEE_TYPE = MyEnumCoveredOrUncovered.COVERED;
    public final static MyEnumCoveredOrUncovered TESTB_ENU_MISC_FEE_TYPE = MyEnumCoveredOrUncovered.UNCOVERED;

    public Tag203EnuCoveredOrUncovered(MyEnumCoveredOrUncovered dataValue) {
        setFixType(FIX41.FIX203_ENU_COVERED_OR_UNCOVERED);
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
        Tag203EnuCoveredOrUncovered tagData;

        tagData = new Tag203EnuCoveredOrUncovered(TESTA_ENU_MISC_FEE_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag203EnuCoveredOrUncovered(TESTB_ENU_MISC_FEE_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
